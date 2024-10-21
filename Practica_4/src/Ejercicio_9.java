import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int[] random = new int[100];

      
        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (1 + Math.random() * 10);
       }

   
        
        System.out.println("Ingrese un valor N (entre 1 y 10) para buscar:");
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