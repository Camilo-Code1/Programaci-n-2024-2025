import java.util.Scanner;

public class ProgramaAgenda {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Agenda[] agenda = new Agenda[10];
        int opcion;
        String menuPri = "1. Añadir contacto.\r\n" + //
                        "2. Eliminar contacto.\r\n" + //
                        "3. Lista de contactos.\r\n" + //
                        "4. Buscar en contactos. " ;

        System.out.println("Hello, World!");
        

   

        System.out.println("-----------------------------------------------");
        System.out.println(menuPri);
        System.out.println("-----------------------------------------------");
        opcion = sc.nextInt();
        sc.nextLine(); 

        do { 
            switch (opcion) {
                case 1:
                    Agenda.agregarContacto(sc);
                    break;
                case 2:
                    
                    break;
          
                case 3:
                    
                    break;

                case 4:
                    
                    break;

                default:
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (true);
    }
}
