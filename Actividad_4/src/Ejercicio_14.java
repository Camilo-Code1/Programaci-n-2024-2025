public class Ejercicio_14 {

    public static void main(String[] args) {
        int[] secuencia = new int[55];
        int index = 0;

        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                secuencia[index] = i; 
                index++;
            }
        }

       
        System.out.println("La secuencia es:");
        for (int valor : secuencia) {
            System.out.print(valor + " ");
        }
        System.out.println(); 
    }
}