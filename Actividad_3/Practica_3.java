import java.util.Scanner;


    public class Practica_3 {
    
        public static void main(String[] args) {

            Scanner reader = new Scanner(System.in);
            
            int cantidad; 

            do {
                System.out.println("Buenos días, inserte el dinero (Solo se admiten billetes de 5)");
                cantidad = reader.nextInt();

                if (cantidad % 5 != 0) {
                    System.out.println("Solo se admiten billetes de 5");
                } break;
        } while (cantidad % 5 != 0);

        int bill50 = cantidad / 50;

        

            // EJERCICIO 2


 

            String opcion =  "";

        
            do{

                System.out.println("1 - Sumar");
                System.out.println("2 - Restar");
                System.out.println("3 - Multiplicar");
                System.out.println("4 - Dividir");
                System.out.println("5 - Salir");
                opcion = reader.nextLine();
    
                switch (opcion) {

                    case "1":
                        reader = new Scanner(System.in);
                        System.out.println("Introduzca el primer número: ");
                        int n1 = reader.nextInt();

                        System.out.println("Introduzca el segundo número: ");
                        int n2 = reader.nextInt();
                        int suma = n1 + n2;

                        System.out.println("Resultado: " +  suma);
                        reader.nextLine();


                        break;


                    case "2":

                        reader = new Scanner(System.in);
                        System.out.println("Introduzca los números: ");
                        int nr1 = reader.nextInt();;
                        System.out.println("Introduzca el segundo número: ");
                        int nr2 = reader.nextInt();
                        int restar = nr1 - nr2;
                        System.out.println("Resultado: " +  restar);
                        reader.nextLine();

                        break;

                    case "3":

                        reader = new Scanner(System.in);
                        System.out.println("Introduzca los números: ");
                        int nx1 = reader.nextInt();
                        System.out.println("Introduzca el segundo número: ");
                        int nx2 = reader.nextInt();
                        int Multiplicar = nx1 * nx2;

                        System.out.println("Resultado: " +  Multiplicar);
                        reader.nextLine();

                        break;


                        case "4":
                        System.out.println("Introduzca el primer número: ");
                        int nd1 = reader.nextInt();
                        System.out.println("Introduzca el segundo número: ");
                        int nd2 = reader.nextInt();
                        if (nd2 == 0) {
                            System.out.println("Error: No se puede dividir por cero.");
                        } else {
                            double dividir = (double) nd1 / nd2;
                            System.out.println("Resultado: " + dividir);
                        }
                        reader.nextLine();
                        break;
    
                    case "5":
                        System.out.println("Saliendo del programa. Hasta pronto");
                        break;


                    default:

                        System.out.println("Opción inválida. Por favor, inténtelo de nuevo");
                        break;
                }
            } while (!opcion.equals("5"));

        }
    }


