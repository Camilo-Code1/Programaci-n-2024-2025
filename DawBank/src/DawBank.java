
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DawBank {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");

        CuentaBancaria cuenta = new CuentaBancaria("ES1234567891234567891234", "Joaquin Valentin Otonello", "A", "A");
        
        String ibanCorrec = null;
        Scanner sc = new Scanner(System.in);
        
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



    }
}


