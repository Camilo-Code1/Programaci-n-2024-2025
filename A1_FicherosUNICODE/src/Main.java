
import java.util.InputMismatchException;
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

            try {

            System.out.println("-----------------------------------------------------------------");
            System.out.println(menu);
            System.out.println("-----------------------------------------------------------------");

            opcion = sc.nextInt();

            
        switch (opcion) {
            case 1:
            Productos.añadirProducto();
            break;

            case 2:
            Productos.leerContenido();
            break;

            case 3: 
            Productos.eliminarProducto();
            break;

            case 4:
            Productos.guardarInformación();
            break;

            case 5: 
            System.out.println("Saliendo del programa");
            break;
        }

    } catch (InputMismatchException e) {
        System.out.println("Error: Debe introducir un valor numerico");
        sc.next();
    }

    } while (opcion != 5);

    
    
}

}

