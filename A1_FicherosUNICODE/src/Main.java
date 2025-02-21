
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        String menu = "1. Crear producto\r\n" + //
                        "2. Mostrar productos existentes\r\n" + //
                        "3. Eliminar producto por codigo\r\n" + //
                        "4. Guardar productos en el fichero\r\n" + //
                        "5. Salir";
      
        int opcion = 0;

        

        do { 

            System.out.println("-----------------------------------------------------------------");
            System.out.println(menu);
            System.out.println("-----------------------------------------------------------------");

            opcion = sc.nextInt();

            
        switch (opcion) {
            case 1:
            agregarInformación();
            break;

            case 2:
            leerContenido();
            break;

            case 3:
            System.out.println("Saliendo del programa");
            break;
        }


        

    } while (opcion != 3);

    
    
}

    static Scanner sc = new Scanner(System.in); 
    
    public static void agregarInformación() throws IOException {
    
            System.out.println("Ingrese la información que desea agregar: ");
            String datosNuevos = sc.nextLine();
        
        try (FileWriter Archivo = new FileWriter("C:\\Users\\daw1.COMPU-S025\\Desktop\\imagew\\Archi2.txt", true); 
        BufferedWriter Escritor = new BufferedWriter(Archivo); ) {

            for (Producto producto : producto) {

            }

            // Escritor.write(datosNuevos);
            // Escritor.newLine();
            
        } System.out.println("Información añadida con exito");
    }


    public static  void leerContenido() throws IOException {

        String Archivo = "C:\\Users\\daw1.COMPU-S025\\Desktop\\imagew\\Archi2.txt";


        try (
            // FileReader Archivo = new FileReader("C:\\Users\\daw1.COMPU-S025\\Desktop\\imagew\\Archi2.txt");
        FileInputStream ficher = new FileInputStream(Archivo);
        InputStreamReader lector = new InputStreamReader(ficher);
        BufferedReader Leer = new BufferedReader(lector); ) {
            System.out.println("Contenido del archivo: ");

           
                String lin;
                while ((lin = Leer.readLine()) != null) {
                    System.out.println(lin);
            }

    }

    }

    public void añadirProducto(){
    System.out.println("Ingrese el codigo del producto: ");
    String cod = sc.nextLine();
    System.out.println("Nombre del producto: ");
    String nombre = sc.nextLine();
    System.out.println("Cantidad del producto: ");
    int cantidad = sc.nextInt();
    System.out.println("Precio del producto: ");
    int precio = sc.nextInt();

    Producto productos = new Producto(cod, nombre, cantidad, precio);
    // Producto.add(productos);
    }
}

