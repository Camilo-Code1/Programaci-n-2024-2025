import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[20];

        System.out.println("Inserte números: ");
        for (int i = 0; i < 20; i++) {
            System.out.println((i + 1) + "/20");
            numeros[i] = sc.nextInt();
        }

        int suma = 0;
        int media = 0;

        for (int i = 0; i < 20; i++) {
            suma +=  numeros[i];
            media = suma/20;
        }

        System.err.println("La suma de los números del Array: " + suma);
        System.err.println("La media de la suma de los números es: " + media);

        sc.close();
    } // MAIN
} // MAIN

