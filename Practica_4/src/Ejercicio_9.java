import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int[] random = new int[100];

      
        for (int i = 0; i < 100; i++) {
            int num = (int) (Math.random() * 10);
            random[i] = num;
            System.out.println(num);
        }

   
        System.out.println("Introduzca el valor N para buscar:");
        int N = sc.nextInt(); 
        boolean encontrado = false;


        System.out.println("El valor " + N + " aparece en las posiciones: ");
        for (int i = 0; i < random.length; i++) {
            if (random[i] == N) {
                System.out.println(i + " ");
                encontrado = true;
            }
        }


        if (!encontrado) {
            System.out.println("No se encontró el valor " + N + " en el array.");
        }

       
    
    } // MAIN
} // MAIN