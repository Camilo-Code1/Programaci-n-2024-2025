import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte valor de P: ");
        int P = sc.nextInt();

        System.out.println("Inserte valor de Q: ");
        int Q  = sc.nextInt();

        int tamaño = Q - P + 1;
        int [] array = new int [tamaño];

        for (int i = 0; i < tamaño; i++) {
            array[i] = P + i;

        }

        System.out.println("Los valores del array son: ");
        for (int valor : array) {
            System.out.println(valor + " ");
        }

        sc.close();
    } // MAIN
} // MAIN