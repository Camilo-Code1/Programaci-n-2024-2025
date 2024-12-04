import java.util.Scanner;

public class GestionVideoDaw {


    public static void main(String[] args) {

        VideoDaw videoClub = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a VideoDaw.");
        System.out.println("(Presione enter para continuar)");
        sc.nextLine(); 

        String DNI = videoClub.obtenerDNI(sc);
        System.out.println("Por favor introduzca su nombre completo: ");
        String nombre = sc.nextLine();

        int opcion;
        do {
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

            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    // Implementar 
                    break;
                case 2:
                    videoClub.AgregarPelicula(sc);
                    break;
                case 3:
                    videoClub.AgregarCliente(sc);
                    break;
                case 4:
                    videoClub.AlquilerPelicula(sc);
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

} // MAIIIIIIINNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN