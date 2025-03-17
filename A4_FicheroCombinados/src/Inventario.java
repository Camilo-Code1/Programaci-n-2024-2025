
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Inventario {

    LinkedList <Producto> nuevosPro = new LinkedList<>();
    public static void main(String[] args) {

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


    public void registrarProducto () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte la referencia del producto: ");
        String referencia = sc.nextLine();

        System.out.println("Inserte la descripcion del producto: ");
        String descripcion = sc.nextLine();

        System.out.println("Inserte el tipo de producto: ");
        String tipo = sc.nextLine();

        System.out.println("Inserte la cantidad del producto: ");
        int cantidad = sc.nextInt();

        System.out.println("Inserte el precio del producto: ");
        double precio = sc.nextDouble();

        System.out.println("Inserte el descuento del producto: ");
        int descuento = sc.nextInt();

        System.out.println("Insert el IVA del producto: ");
        int iva = sc.nextInt();

        System.out.println("¿Aplicar descuento?");
        boolean aplicarDTO = sc.nextBoolean();

        nuevosPro.add (new Producto(referencia, descripcion, tipo, cantidad, precio, descuento, iva, aplicarDTO));
    }
}
