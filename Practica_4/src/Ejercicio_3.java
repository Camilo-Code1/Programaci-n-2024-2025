import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int contador = 0;
        

        while (contador < 10) {

            System.out.println("Por favor inserte un número (o el -999 para salir): ");
            int numero = sc.nextInt();

            if (numero == -999) {
                System.err.println("Saliendo del programa");
                break;
            }

            numeros[contador] = numero;
            contador++;
            double NumMin = Math.min(NumMin, numeros[]);
            double NumMax = Math.max(NumMax, numeros[]);
    
            System.err.println("Número introducido correctamente. Quedan " + (10 - contador) + " números por introducir.");
        }

        System.out.println("Los números introducidos son: ");
        for (int i = 0; i < contador; i++) {
            System.out.println(numeros[i] + " ");

        System.out.println("");

        

    
        }


        sc.close();
    } // MAIN
} // MAIN