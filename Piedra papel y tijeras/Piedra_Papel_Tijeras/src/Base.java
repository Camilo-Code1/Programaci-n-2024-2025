import java.util.Scanner;

public class Base {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /// JUGADOR


        String Opcion = "";
        String Piedra = "";
        String Papel = "";
        String Tijeras = "";

        String Presentacion = "Bienvenido, jugador\r\n" + //
                        "\r\n" + //
                        "Este juego se llama piedra, papel y tijeras. Las reglas son las siguientes:\r\n" + //
                        "\r\n" + //
                        "- Piedra rompe tijeras: Piedra gana.\r\n" + //
                        "- Papel envuelve piedra: Papel gana.\r\n" + //
                        "- Tijeras corta papel: Tijeras gana."; 

        System.out.println("");

        System.out.println(Presentacion);

        System.out.println("");
        System.out.println("Por favor eliga que jugar: ");
        System.out.println("");

       
            System.out.println("P - Piedra");
            System.out.println("L - Papel");
            System.out.println("T - Tijeras");
            Opcion = sc.nextLine();
            
      
        switch (Opcion) {
            case "P":
                break;
                
            case "L":  
                break;

            case "T":
                break;
            
            default:
            System.out.println("Opcion invalida. Por favor, intentelo de nuevo");
                break;
        }

        System.out.println("");
        System.out.println("Usted ha elegido: " + Opcion);
        System.out.println("");


        /// COMPUTADORA



        int[] options = {1, 2, 3};
        int randomNum = options[(int) (Math.random() * options.length)];
        String decisionUs;

        switch (randomNum) {
            case 1: decisionUs = "Piedra"; break;
            case 2: decisionUs = "Papel"; break;
            case 3: decisionUs = "Tijeras"; break;        
            default: decisionUs = "";
        }

        System.out.println("");
        System.out.println(decisionUs + " ha sido elegido por la computadora.");
        System.out.println("");


        /// JUGADAS ENFRENTADAS

            
        



        sc.close();
    } // MAIN
} // MAIN