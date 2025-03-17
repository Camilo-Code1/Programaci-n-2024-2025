import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		//path a la carpeta Recursos del proyecto
		final String pathFile = "./src/Recursos/"; 
		
		//Nombre del fichero Binario
		final String fileNameBinario = "almacen.dat";
		
		//Nombre del fichero UNICODE
		final String fileNameUnicode = "productos.csv";
		
		
		//Metodo para que se escriba el fichero binario como se necesita
		//escribirFicheroBinarioExamen(pathFile, fileNameBinario);
		
		
		LinkedList<Producto> productosLeidos = leerFicheroUnicode(pathFile, fileNameUnicode);
		
		//prueba
		
		LinkedList<Producto> productosLeidosBinarios = new LinkedList<Producto>();
		
		
		Producto[] productos = (Producto[]) productosLeidos.toArray();
		Producto[] productos2 = (Producto[]) productosLeidosBinarios.toArray();
		
		for(int i =0; i < productos.length; i++) {
			productos[i].setCantidad(productos2[i].getCantidad());
		}

		
		//prueba
		
				
		int i = 0;
		
		//Lectura de fichero binario
		
		boolean eof = false;
		
		try(FileInputStream fichero = new FileInputStream(pathFile+fileNameBinario);
				DataInputStream lector = new DataInputStream(fichero);)
		{
			while(!eof)
			{
				// OJO CUIDADO, MUY IMPORTANTE: DANGER DANGER
				//CONOCER LA ESTRUCTURA DEL FICHERO

				int cantidad = lector.readInt();
				double precio = lector.readDouble();
				int descuento = lector.readInt();
				int IVA = lector.readInt();
				boolean aplicarDto = lector.readBoolean();
				
				
				
				// productosLeidos.get(i).setCantidad(cantidad);
				productosLeidos.get(i).setPrecio(precio);
				productosLeidos.get(i).setDescuento(descuento);
				productosLeidos.get(i).setIVA(IVA);
				productosLeidos.get(i).setAplicarDto(aplicarDto);
				
				if(i < productosLeidos.size())
				{
					i++;
				}
				
			}
			
			
		}catch(EOFException e)
		{
			eof = true;

			
		}catch(IOException e)
		{
			System.out.println("Ha ocurrido un error al I/O");
			System.out.println(e.getMessage());
			
		}catch(Exception e)
		{
			System.out.println("Ha ocurrido un error inexperado");
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		//Recorro la lista y muestro todos los valores
		for(Producto p : productosLeidos)
		{
			System.out.println(p.toString());
		}

	}//main

	
	


	private static LinkedList<Producto> leerFicheroUnicode(final String pathFile, String fileName) {
		LinkedList<Producto> lineas = null;
		if(pathFile != null && fileName != null)
		{
			lineas = new LinkedList<Producto>();
			
			try (FileReader file = new FileReader(pathFile+fileName);
					BufferedReader buffer = new BufferedReader(file);)
			{
					String linea = null;
					do {
						linea = buffer.readLine();
						
						if(linea != null) {
							
							String [] elementos = linea.split("/");
							// Producto producto = new Producto(elementos[0], elementos[2], elementos[3], Integer.parseInt(elementos[3]), elementos[5], elementos[6], elementos[7], elementos[8]);
							
							
							
							
							// lineas.add(p);
							
						}

					}while(linea != null);
			
					return lineas;
					
			}catch(IOException e) {
				e.printStackTrace();
			}
		}//if

		return lineas;

	}//metodo
	
	
	private static void escribirFicheroBinarioExamen(final String pathFile, String fileNameBinario) {
		//Escritura de fichero binario
		try(FileOutputStream fichero = new FileOutputStream(pathFile+fileNameBinario, false);
				DataOutputStream escritor = new DataOutputStream(fichero);)
		{
			
			// Producto p1 = new Producto(5,25.75,15,21,false);
			// Producto p2 = new Producto(15,55.95,5,21,true);
			// Producto p3 = new Producto(100,3.25,0,21,false);
			// Producto p4 = new Producto(300,0.95,0,21,false);
			// Producto p5 = new Producto(27,5.25,13,21,true);
			
			
			LinkedList<Producto> productos = new LinkedList<Producto>();
			
			// productos.add(p1);
			// productos.add(p2);
			// productos.add(p3);
			// productos.add(p4);
			// productos.add(p5);
			
			
			for(Producto p : productos)
			{

				// escritor.writeInt(p.getCantidad());
				escritor.writeDouble(p.getPrecio());
				escritor.writeInt(p.getDescuento());
				escritor.writeInt(p.getIVA());
				escritor.writeBoolean(p.isAplicarDto());
			}
	
		}catch(IOException e) {
			System.out.println("Ha ocurrido un error al I/O");
			System.out.println(e.getMessage());
			
		}catch(Exception e)
		{
			System.out.println("Ha ocurrido un error inexperado");
			System.out.println(e.getMessage());

		}
	}
}//clase