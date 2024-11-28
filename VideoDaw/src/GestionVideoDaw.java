import java.util.Scanner;

public class GestionVideoDaw {
    public static void main(String[] args) throws Exception {

        int opcion;

                Scanner sc = new Scanner(System.in);

                System.out.println("Bienvenido a VideoDaw.");
                System.out.println("(Presione enter para continuar)");


                String DNI = obtenerDNI(sc);

                System.out.println("Por favor introduzca su nombre completo: ");
                String Nombre = sc.nextLine();





        System.out.println("-----------------------------------------------");


            System.out.println("\nBienvenido, " + Nombre + ",\r\n" + //
                            "\r\n" + //
                            "por favor realice sus operaciones seleccionando las siguientes opciones: \r\n" + //
                            "\r\n" + //
                            "1. Crear y registrar Videoclub en la franquicia.\r\n" + //
                            "2. Registrar pelicula en videoclub.\r\n" + //
                            "3. Crear y registrar cliente en videoclub.\r\n" + //
                            "4. Alquilar pelicula.\r\n" + //
                            "5. Devolver pelicula.\r\n" + //
                            "6. Dar de baja cliente.\r\n" + //
                            "7. Dar de baja pelicula.\r\n" + //
                            "8. Salir.\n ");

        System.out.println("-----------------------------------------------");

                                opcion = sc.nextInt(); // Por el memonti
                    switch (opcion) {
                        case 1:
                            break;

                        case 2:
                            break;

                        case 3:
                            break;

                        case 4:
                            break;

                        case 5:
                            break;

                        case 6:
                            break;

                        case 7:
                            break;

                        case 8:
                            break;
                            
                    }

                    





    }

    private static String obtenerDNI(Scanner scanner){
        String DNI = scanner.nextLine();
        while (true) {
            System.out.println("Ingrese el DNI de la cuenta (Formato: 00000000X): ");
            DNI = scanner.nextLine();
            if (validarDNI (DNI)) {
               return DNI;
            }
            System.out.println("DNI inválido. Por favor, intentelo de nuevo\n");
        }
    }
    private static boolean validarDNI(String DNI) {
        return DNI.matches("\\d{8}[A-Z]{1}");
    }

}
