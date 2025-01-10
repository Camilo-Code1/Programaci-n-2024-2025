import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

            Scanner scanner = new Scanner(System.in);
    
            Planetas planeta = null; // Inicializamos como null
            Satelites satelite = null;
    
            String menuPri = "\nPor favor, elija una opción:\r\n" +
                             "1) Planetas\r\n" +
                             "2) Satélites.\r\n" +
                             "3) Salir.\n";
    
            int opcion;
    
            System.out.println("\n¡Bienvenido!");
    
            System.out.print("Radio ecuatorial: ");
            int radioEcuatorial = scanner.nextInt();
    
            System.out.print ("Rotación sobre su eje: ");
            int rotacionSobreEje = scanner.nextInt();
    
            System.out.print("Temperatura media: ");
            int temperaturaMedia = scanner.nextInt();
    
            System.out.print("Gravedad: ");
            int gravedad = scanner.nextInt();
    
            System.out.print("Masa: ");
            double masa = scanner.nextDouble(); 
    
            do {
                System.out.println("-----------------------------------------------");
                System.out.println(menuPri);
                System.out.println("-----------------------------------------------");
                opcion = scanner.nextInt();
                scanner.nextLine(); 
    
                switch (opcion) {
                    case 1:
                        
                        System.out.println("Por favor, introduzca todos los datos del planeta:");
    
               
    
                        System.out.print("Distancia al sol: ");
                        int distanciaSol = scanner.nextInt();
    
                        System.out.print("Órbita al sol: ");
                        int orbitaSol = scanner.nextInt();
    
                        System.out.print("¿Tiene satélites? (true/false): ");
                        boolean tieneSatelites = scanner.nextBoolean();
    
                        planeta = new Planetas(masa, radioEcuatorial, rotacionSobreEje, temperaturaMedia, gravedad, distanciaSol, orbitaSol, tieneSatelites);
    
                        System.out.println(planeta.toString());
                        scanner.nextLine(); 
                        break;
    
                    case 2:
                        
                        System.out.println("Distancia con el planeta: ");
                        int distancia_planeta = scanner.nextInt();
    
                        System.out.println("Orbita planetaria: ");
                        int orbita_planetaria = scanner.nextInt();
                        scanner.nextLine(); 

                        System.out.println("Planeta al que pertenece: ");
                        String planeta_pertenece = scanner.nextLine();
    
                        satelite = new Satelites(masa, radioEcuatorial, rotacionSobreEje, temperaturaMedia, gravedad, distancia_planeta, orbita_planetaria, planeta_pertenece);

                        System.out.println(satelite.toString());
                        break;
    
                    case 3:
                        System.out.println("Saliendo...");
                        break;
    
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                }
    
            } while (opcion != 3);
    
          
        }
    }