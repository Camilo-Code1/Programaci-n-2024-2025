import java.util.InputMismatchException;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;

        try {
            System.out.println("Por favor inserte el valor A");
            a = scanner.nextInt();
            System.out.println("Por favor inserte el valor B (Tiene que ser 0)");
            b = scanner.nextInt();
            int div = a/b;
        } catch (InputMismatchException e) {
            System.out.println("Error por favor inserte un valor entero");
            System.out.println("Tipo de error: " + e.getClass().getName());
            System.out.println("Pila de llamadas: " + e.getStackTrace());
            scanner.next();
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero");
            System.out.println("Tipo de error: " + e.getClass().getName());
            System.out.println("Pila de llamadas: " + e.getStackTrace());   
            scanner.next(); 
        }

    }
}
