import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProgramaAgenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcion;

        do {
            
            String menuPri = "1. Añadir contacto.\r\n" +
                             "2. Eliminar contacto.\r\n" +
                             "3. Listar contactos.\r\n" +
                             "4. Buscar contacto.\r\n" +
                             "5. Salir.\r\n" +
                             "------------------------------------------------\n" +
                             "Seleccione una opción:\n ";

            System.out.println("-----------------------------------------------");
            System.out.print(menuPri);
           
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                        System.out.print("¿El contacto es una persona o una empresa? (p/e): ");
                        String tipo = scanner.nextLine();
                            
                        System.out.print("Ingrese el nombre del contacto: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese el teléfono del contacto: ");
                        String telefono = scanner.nextLine();
                            
                            if (tipo.equalsIgnoreCase("p")) {
                                System.out.print("Ingrese el cumpleaños del contacto (DD/MM/YYYY): ");
                             
                                String cumpleañosStr = scanner.nextLine();
                                LocalDate cumpleaños = LocalDate.parse(cumpleañosStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                                ContactoPersona persona = new ContactoPersona(nombre, telefono, cumpleaños);
                                if (agenda.añadirContacto(persona)) {
                                    System.out.println("El contacto fue añadido con éxito.");
                                } else {
                                    System.out.println("El contacto ya existe.");
                                }
                            } else if (tipo.equalsIgnoreCase("e")) {
                                System.out.print("Ingrese el email del contacto: ");
                                String email = scanner.nextLine();
                                ContactoEmpresa contactoEmpresa = new ContactoEmpresa(nombre, telefono, email);
                                if (agenda.añadirContacto(contactoEmpresa)) {
                                    System.out.println("Contacto de empresa añadido con éxito.");
                                } else {
                                    System.out.println("El contacto ya existe.");
                                }
                            } else {
                                System.out.println("Tipo de contacto no válido.");
                            }
                            break;
                case 2:
                    System.out.print("Ingrese el nombre del contacto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    if (agenda.eliminarContacto(nombreEliminar)) {
                        System.out.println("Contacto eliminado con éxito.");
                    } else {
                        System.out.println("No se encontró el contacto.");
                    }
                    break;
                case 3:
                    agenda.listarContactos();
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del contacto a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    int posicion = agenda.buscaContacto(nombreBuscar);
                    if (posicion != -1) {
                        System.out.println("Contacto encontrado en la posición: " + posicion);
                    } else {
                        System.out.println("No se encontró el contacto.");
                    }
                    break;
             
                  
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}