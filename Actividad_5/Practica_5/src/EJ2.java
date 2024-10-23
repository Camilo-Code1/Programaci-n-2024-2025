import java.util.Scanner;

public class EJ2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor inserte dos palabras, esta es la primera parte: ");
        String palabra1 =  sc.nextLine();

        System.out.println("Por favor inserte, esta es la segunda parte: ");
        String palabra2 =  sc.nextLine();


        if (palabra1.equalsIgnoreCase(palabra2)) {
            System.out.println("Son iguales");
        }   else {
            System.out.println("No son iguales");
        }



        sc.close();
    } // MAIN
} // MAIN