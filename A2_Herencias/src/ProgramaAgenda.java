import java.util.Scanner;

public class ProgramaAgenda {
    public static void main(String[] args) throws Exception {

                    Scanner scanner = new Scanner(System.in);
        int opcion;
        String menuPri = "1. Añadir contacto.\r\n" + //
                        "2. Eliminar contacto.\r\n" + //
                        "3. Lista de contactos.\r\n" + //
                        "4. Buscar en contactos. " ;

        System.out.println("Hello, World!");
        

   

        System.out.println("-----------------------------------------------");
        System.out.println(menuPri);
        System.out.println("-----------------------------------------------");
        opcion = scanner.nextInt();
        scanner.nextLine(); 


    }
}
