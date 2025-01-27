
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Taller taller = new Taller();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        String menu = "Bienvenido, por favor elija una opcion: \r\n" + //
                        "1. Añadir coche.\r\n" + //
                        "2. Eliminar coche.\r\n" + //
                        "3. Salir.";
        
        do { 
            System.out.println(menu);
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcion) {
                case 1:
                    taller.añadeElemento();
                    break;

                case 2:
                    taller.eliminarElemento();
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion no valida. Vuelva a intentarlo");
            }
            
        } while (opcion != 3);


        taller.visualMatricula();
        taller.visualCoches();
        taller.visualMatricula();


    }
}
