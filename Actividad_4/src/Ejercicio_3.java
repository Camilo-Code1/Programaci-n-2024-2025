import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Inserte números: ");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "/10");
            numeros[i] = sc.nextInt();
        }

        double NumMin = numeros[0]; 
        double NumMax = numeros[0]; 

        for (int i = 1; i < 10; i++) {
            NumMin = Math.min(NumMin, numeros[i]);
            NumMax = Math.max(NumMax, numeros[i]);
        }

        System.out.println("El numero maximo es: " + NumMax);
        System.out.println("El numero minimo es: " + NumMin);

        sc.close();
    }
}