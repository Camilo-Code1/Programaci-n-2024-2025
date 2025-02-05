
import java.util.InputMismatchException;
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // E1

        System.out.println("Por favor inserte el valor A");
        int a;
            try {
                a = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error por favor inserte un valor entero");
                System.out.println("Tipo de error: " + e.getClass().getName());
                System.out.println("Pila de llamadas: " + e.getStackTrace());
                scanner.next();
            } 
            

    }}


