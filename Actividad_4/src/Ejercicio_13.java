import java.util.Scanner;

public class Ejercicio_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor inicial (V): ");
        int V = sc.nextInt();
        
        System.out.print("Introduce el incremento (I): ");
        int I = sc.nextInt();
        
        System.out.print("Introduce el número de valores a crear (N): ");
        int N = sc.nextInt();

        int[] secuencia = new int[N];

        for (int i = 0; i < N; i++) {
            secuencia[i] = V + (i * I); 
        }

        System.out.println("La secuencia aritmética es:");
        for (int valor : secuencia) {
            System.out.print(valor + " ");
        }
        System.out.println(); 

        sc.close(); 
    }
}