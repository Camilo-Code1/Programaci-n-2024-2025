
import java.util.Scanner;

public class Principal {  
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Agenda agenda = new Agenda();


            String menu = "\nSeleccione una opcion:\r\n" + //
                                "\n1. Añadir contacto.\r\n" + //
                                "2. Buscar contacto.\r\n" + //
                                "3. Eliminar contacto.\r\n" + //
                                "4. Listar contactos.\r\n" + //
                                "5. Numero de contactos\r\n" + //
                                "6. Salir.";
            String opcion = "";
            String nombreFormateado = "";


            System.out.println("");
            System.out.println("----- Bienvenido -----");
                
            do {
               
             
                System.out.println("\n-------------------------------");
                System.out.println(menu);
                System.out.println("-------------------------------");
                opcion = scanner.nextLine();
    
                switch (opcion) {
                    case "1": 
                    String nombre = "";                                  
                    do {
                        System.out.print("Ingrese el nombre del contacto: ");
                        nombre = scanner.nextLine();
                        nombreFormateado = Contacto.formatearNombre(nombre);
                    } while (nombreFormateado == null);
                                      
                        String telefono = "";
                        do {
                            System.out.print("Ingrese el teléfono: (Solo se admiten numeros personales, de servicios y numeros fijos) ");
                            telefono = scanner.nextLine(); 
                        } while (!Contacto.validarMovilER(telefono) == true);
                        
                       String correo = "";
                        do {
                           System.out.println("Ingrese el correo: (Formato: XXXXXXXXXX@XXXXXXX.XXXX) ");
                            correo = scanner.nextLine();
                        } while (!Contacto.validaEmail(correo) == true);    
                        
                        Contacto c = new Contacto(nombreFormateado, telefono, correo);
                        agenda.añadirContacto(c);
                        break;
                    case "2":
                    scanner = new Scanner(System.in);
                    agenda.listaContactos();
                        System.out.print("Ingrese el nombre del contacto a buscar: ");
                        nombre = scanner.nextLine();
                        agenda.buscarContacto(nombre);
                        break;
                    case "3":
                    agenda.listaContactos();
                    System.out.print("Ingrese el nombre del contacto a eliminar: ");
                    nombre = scanner.nextLine();
                    if (agenda.eliminarContacto(nombre)) {
                        System.out.println("Contacto eliminado con éxito.");
                    } else {
                        System.out.println("No se encontró el contacto.");
                    }
                    break;
                    case "4":
                   agenda.listaContactos();
                    case "5":
                    agenda.numeroContactos();
                        break;
                    case "6":
                    System.out.println("Espere por favor, cerrando agenda.");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                    break;
                    }
            } while (!opcion.equals("6"));
    
        }
    }
