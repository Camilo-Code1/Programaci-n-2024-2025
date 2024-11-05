import java.util.Scanner;

public class EJ5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de filas: ");
        int filas = sc.nextInt();
        System.out.print("Introduce el número de columnas: ");
        int columnas = sc.nextInt();

        int[][] matrizDatos = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Introduce el valor en la posición [" + i + "][" + j + "]: ");
                matrizDatos[i][j] = sc.nextInt();
            }
        }

        int contadorMayoresCero = 0;
        int contadorIgualesCero = 0;
        int contadorMenoresCero = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matrizDatos[i][j] > 0) {
                    contadorMayoresCero++;
                } else if (matrizDatos[i][j] == 0) {
                    contadorIgualesCero++;
                } else {
                    contadorMenoresCero++;
                }
            }
        }

        System.out.println("Cantidad de valores mayores que cero: " + contadorMayoresCero);
        System.out.println("Cantidad de valores menores que cero: " + contadorMenoresCero);
        System.out.println("Cantidad de valores iguales a cero: " + contadorIgualesCero);
        
        sc.close();
    }
}