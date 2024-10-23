import java.util.Scanner;

public class EJ5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean palindromo = true;

        System.out.println("Inserte la frase que desee: ");
        String frase = sc.nextLine();

        frase = frase.replaceAll(" ", "") .toLowerCase();
        

        int texto = frase.length();
        
        for (int i = 0;  i < texto / 2; i++) {


        if (frase.charAt(i) != frase.charAt(texto -  i - 1)) {
            palindromo = false;
            break;
        }
        }

        if (palindromo)  {
            System.out.println("La frase es un palindromo");
        }  else {
            System.out.println("La  frase no es un palindromo");
        }



        sc.close();
   
    } // MAIN
} // MAIN  