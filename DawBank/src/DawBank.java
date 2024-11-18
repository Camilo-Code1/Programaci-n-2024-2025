
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DawBank {
    public static void main(String[] args) throws Exception {


        String ibanCorrec = null;
        String opcion = "";
        Scanner sc = new Scanner(System.in);

        Movimiento Movi = new Movimiento("Jose", "1234567890", "1234567890", "1234567890");

        Movi.mostrarInfoMovimiento();

        
        Pattern pat = Pattern.compile("[A-Z]{2}\\d{22}$");
    

        System.out.println("Introduzca el IBAN correcto: ");
        ibanCorrec = sc.nextLine();

        Matcher mat = pat.matcher(ibanCorrec);

        while(!mat.matches()){

            System.out.println("El IBAN introducido es incorrecto, por favor "
 
                    + "introduzca un IBAN  válido.");
 
            System.out.println("Introduce un IBAN correcto:");
 
            ibanCorrec = sc.nextLine();
 
            mat = pat.matcher(ibanCorrec);
        }
 
         System.out.println("El " + ibanCorrec + " es un IBAN válido");


        // do (

            System.out.println("Bienvenido,\r\n" + //
                            "\r\n" + //
                            "Por favor realice sus tramites: \r\n" + //
                            "\r\n" + //
                            "1 - Datos de la cuenta\r\n" + //
                            "2 - IBAN\r\n" + //
                            "3 - Titular\r\n" + //
                            "4 - Saldo\r\n" + //
                            "5 - Ingreso\r\n" + //
                            "6 - Retirada\r\n" + //
                            "7 - Movimientos\r\n" + //
                            "8 - Salir");
                    switch (opcion) {
                        case "1":
                        System.out.println("Datos de la cuenta: ");
                            break;

                        case "2":
                        System.out.println("IBAN");
                            break;

                        case "3":
                        System.out.println("Titular");
                            break;

                        case "4":
                        System.out.println("Saldo");
                            break;

                        case "5":
                        System.out.println("Ingreso");
                            break;
                        
                        case "6":
                        System.out.println("Retirada");
                            break;
                                              
                        case "7":
                        System.out.println("Los movimientos que se han realizado son: ");
                     
                            break;
                        
                        case "8":
                        System.out.println("Saliendo del programa...");
                            break;
                        
                        default:
                        System.out.println("Opción inválida. Por favor, inténtelo de nuevo");
                        break;
                    }

        // )while (opcion !=8);
    }
}


