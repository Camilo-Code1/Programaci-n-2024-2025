import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        String menuPri = "\nPor favor, elija una opcion:\r\n" + //
                        "1) Astros.\r\n" + //
                        "2) Planetas.\r\n" + //
                        "3) Satelites.\r\n" + //
                        "4) Salir.\n";
        
        int opcion;


        System.out.println("¡Bienvenido!");

        do { 
            System.out.println("-----------------------------------------------");
            System.out.println(menuPri);
            System.out.println("-----------------------------------------------");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:

                    
                    break;
                case 2:

                    
                    break;
                case 3:

                    
                    break;
                case 4:
                        System.out.println("Saliendo...");                    
                    break;
                default:
                    throw new AssertionError();
            }



        } while (opcion != 4);




    }
}
