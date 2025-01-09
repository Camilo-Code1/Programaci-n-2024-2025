import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        Planetas planeta = new Planetas(50, 10, 15, 43, 0, 0, false);
            
    

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
                    System.out.println();
                    
                    break;
                case 2:
                    System.out.println(planeta.toString());
                    
                    break;
                case 3:
                    
                    
                    break;
                case 4:
                        System.out.println("Saliendo...");                    
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }



        } while (opcion != 4);




    }
}
