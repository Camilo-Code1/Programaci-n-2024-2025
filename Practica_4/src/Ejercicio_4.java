import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[20];

        System.out.println("Inserte números: ");
        for (int i = 0; i < 20; i++) {
            System.out.println((i + 1) + "/20");
            numeros[i] = sc.nextInt();
        }

        double sumaPositivos = 0;
        double sumaNegativos = 0;

        for  (int i = 0; i < 20; i++) {
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];

            } else  if (numeros[i] < 0) {

                    sumaNegativos  += numeros[i];

            }
            }
                    System.out.println("La suma de los números positivos es: " + sumaPositivos);
                    System.out.println("La suma de los números negativos es: " + sumaNegativos);


        sc.close();
    } // MAIN
} // MAIN