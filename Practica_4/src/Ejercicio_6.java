
import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
       int M = 0;

        System.out.println("Inserte el tamaño del Array: ");
        M  = sc.nextInt();
 
        int[] N = new int[M];
        
        System.out.println("Por favor inserte los valores de cada cajon del Array: ");
        for (int i = 0; i < M; i++) {
            System.out.println((i + 1) + "/" + M);
            N[i] = sc.nextInt();
        }


        for  (int i =  0; i < N.length; i++) {
            System.out.println("El valor del cajon " + N[i]);

        }


        sc.close();
    } // MAIN
} // MAIN