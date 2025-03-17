
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Inventario {

    static LinkedList <Producto> nuevosPro = new LinkedList<>();


            final static String pathFile = ".\\src\\Recursos\\";

            final static String fileNameBinario = "almacen.dat";

            final static String fileNameUnicode = "productos.csv";


            
    public static void main(String[] args) {


        cargarProductosCSV();
        cargarInventario();

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        String menu = "1. Mostrar productos en el inventario.\r\n" + //
                        "2. Eliminar productos por referencia.\r\n" + //
                        "3. Guardar y salir. \r\n" + //
                        "4. Registrar productos en el Inventario.";
        
        
        do { 
            try {

            System.out.println("---------------------------------------------------------------");
            System.out.println(menu);
            System.out.println("---------------------------------------------------------------");

            opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        mostrarTodo();
                        break;
                   
                    case 2:
                        
                        break;

                    case 3:
                        
                        break;

                    case 4:
                        
                        break;

                    default:
                        System.out.println("Opción no válida. Intentelo de nuevo.");
                }


            } catch (InputMismatchException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Pila de llamadas: " + e.getStackTrace());
            }
        } while (true);





    }


    // public void registrarProducto () {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Inserte la referencia del producto: ");
    //     String referencia = sc.nextLine();

    //     System.out.println("Inserte la descripcion del producto: ");
    //     String descripcion = sc.nextLine();

    //     System.out.println("Inserte el tipo de producto: ");
    //     String tipo = sc.nextLine();

    //     System.out.println("Inserte la cantidad del producto: ");
    //     int cantidad = sc.nextInt();

    //     System.out.println("Inserte el precio del producto: ");
    //     double precio = sc.nextDouble();

    //     System.out.println("Inserte el descuento del producto: ");
    //     int descuento = sc.nextInt();

    //     System.out.println("Insert el IVA del producto: ");
    //     int iva = sc.nextInt();

    //     System.out.println("¿Aplicar descuento?");
    //     boolean aplicarDTO = sc.nextBoolean();

    //     nuevosPro.add (new Producto(referencia, descripcion, tipo, cantidad, precio, descuento, iva, aplicarDTO));
    // }


    private static void cargarProductosCSV() {
        try (BufferedReader br = new BufferedReader(new FileReader(pathFile + fileNameUnicode))) {
            String linea; 
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("/");

                    Producto producto = new Producto(datos[0], datos[1], datos[2], datos[3], datos[4], Double.parseDouble(datos[5]), Integer.parseInt(datos[6]), Integer.parseInt(datos[7]), Boolean.parseBoolean(datos[8]));
                    nuevosPro.add(producto);
            }   
            } catch (FileNotFoundException e) {
                System.out.println("El archivo no encontrado: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
                e.printStackTrace();
            } 
        } // fin del metodo cargarProductosCSV



    private static void cargarInventario() {
        try (ObjectInputStream lector = new ObjectInputStream(new FileInputStream(pathFile + fileNameBinario))) {
            while (true) {
                Producto producto = (Producto) lector.readObject();
                nuevosPro.add(producto);
            }
            } catch (EOFException e) {
                System.out.println("Fin del archivo");
                } catch (FileNotFoundException e) {
                    System.out.println("El archivo binario no se encontro: " + e.getMessage());
                    } catch (IOException e) {
                        System.out.println("Error al leer el archivo: " + e.getMessage());
                        } catch (ClassNotFoundException e) {
                            System.out.println("Error al leer el archivo: " + e.getMessage());
                            } catch (Exception e) {
                                System.out.println("Error inesperado: " + e.getMessage());
                                e.printStackTrace();
                                }
            }
        
    private static void mostrarTodo() {
        if (nuevosPro.isEmpty()) {
            System.out.println("No hay productos en la lista");
        }

        for (Producto producto : nuevosPro) {
            System.out.println(producto.toString());
            }
        }

        }
    
    
    
    
    

    

    