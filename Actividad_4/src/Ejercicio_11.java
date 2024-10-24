public class Ejercicio_11 {

    public static void main(String[] args) {
        int[] array1 = new int[100];
        int[] array2 = new int[100];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1; 
        }

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[array1.length - 1 - i]; 
        }

        System.out.println("Primer array (1 al 100):");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println(); 

        System.out.println("Segundo array (100 al 1):");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println(); 
    }
}