import java.util.Scanner;

public class GestionVideoDaw {
    private static Cliente[] clientes = new Cliente[100];
    private static int numClientes = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a VideoDaw.");
        System.out.println("(Presione enter para continuar)");
        sc.nextLine(); 

        String DNI = obtenerDNI(sc);
        System.out.println("Por favor introduzca su nombre completo: ");
        String nombre = sc.nextLine();

        System.out.println("-----------------------------------------------");
        System.out.println("\nBienvenido, " + nombre + ",\r\n" +
                "\r\n" +
                "por favor realice sus operaciones seleccionando las siguientes opciones: \r\n" +
                "\r\n" +
                "1. Crear y registrar Videoclub en la franquicia.\r\n" +
                "2. Registrar pelicula en videoclub.\r\n" +
                "3. Crear y registrar cliente en videoclub.\r\n" +
                "4. Alquilar pelicula.\r\n" +
                "5. Devolver pelicula.\r\n" +
                "6. Dar de baja cliente.\r\n" +
                "7. Dar de baja pelicula.\r\n" +
                "8. Salir.\n ");
        System.out.println("-----------------------------------------------");

        int opcion;
        do {
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    // Implementar 
                    break;
                case 2:
                    // Implementar 
                    break;
                case 3:
                    AgregarCliente(sc);
                    break;
                case 4:
                    // Implementar 
                    break;
                case 5:
                    // Implementar
                    break;
                case 6:
                    // Implementar 
                    break;
                case 7:
                    // Implementar
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 8);

        sc.close(); 
    }

    private static String obtenerDNI(Scanner scanner) {
        String DNI;
        while (true) {
            System.out.println("Ingrese el DNI de la cuenta (Formato: 00000000X): ");
            DNI = scanner.nextLine();
            if (validarDNI(DNI)) {
                return DNI;
            }
            System.out.println("DNI inválido. Por favor, intentelo de nuevo\n");
        }
    }

    private static boolean validarDNI(String DNI) {
        return DNI.matches("\\d{8}[A-Z]{1}");
    }




        // Opcion 3 Crear y registrar cliente en el videoclub

    public static void AgregarCliente(Scanner sc) {
        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el DNI del cliente: ");
        String DNI = sc.nextLine();
        System.out.println("Ingrese el número de socio: ");
        String numSocio = sc.nextLine();
        System.out.println("Ingrese la dirección del cliente: ");
        String direccion = sc.nextLine();
        System.out.println("Ingrese la fecha de nacimiento del cliente: ");
        String fechaNacimiento = sc.nextLine();
        System.out.println("Ingrese la fecha de baja del cliente (si aplica): ");
        String fechaBaja = sc.nextLine();
        System.out.println("Ingrese el número de películas alquiladas: ");
        int peliculasAlquiladas = sc.nextInt();
        sc.nextLine(); 

        Cliente nuevoCliente = new Cliente(DNI, nombre, numSocio, direccion, peliculasAlquiladas);

        if (numClientes < 100) {
            clientes[numClientes] = nuevoCliente;
            numClientes++;
            System.out.println("Cliente agregado con éxito");
            nuevoCliente.MostrarinfoClientes();
        } else {
            System.out.println("No hay espacio para agregar más clientes");
        }
    }






}