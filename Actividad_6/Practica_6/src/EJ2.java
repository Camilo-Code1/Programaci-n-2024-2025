import java.util.Scanner;

public class EJ2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 1;

        int matriz [][] = new int[10][10];

        for (int i = 0; i < matriz.length; i++) {
            for (int x = 0; x < matriz[i].length; x++) {
                matriz[i][x] = n++;
            }
        }

        // Imprimir la matriz

        System.err.println("");

        System.out.println("Tabla de multiplicación de 1 a 10 (Multiplos ejecutados verticalmente y empieza desde el multiplo 1)");

        System.err.println("");

        for (int i = 1; i <= 10; i++) { 
            System.out.print(" "); 

            for (int x = 1; x <= 10; x++) {
                int resultado = i * x;

                if (resultado < 10) {
                    System.out.print(" " + resultado + " |");
                } else {
                    System.out.print(resultado + " |");
                }
            }
            System.out.println(); 
        }

        sc.close();
    } // MAIN
} // EJ2