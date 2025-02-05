import java.util.InputMismatchException;
import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vector [] = new double[5];
        int i = 0;

            while (i < vector.length) { 
                try {
                    System.out.println("Ingrese el " + (i + 1) + "º número: ");
                    vector[i] = scanner.nextInt();
                    i++; 
                } catch (InputMismatchException e) {
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Error: No se ingresó un número entero. Intente de nuevo.");
                    System.out.println("Tipo de error: " + e.getClass().getName());
                    System.out.println("Pila de llamadas: " + e.getStackTrace());
                    System.out.println("-----------------------------------------------------");
                    scanner.next(); 
                }   
                }

            }
        }
    
