import java.util.Scanner;

public class Ejercicio_12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String opcion = "";
        int[] numeros = new int[10];
        int contador = 0;

        do { 

            System.out.println("a - Mostrar valores");
            System.out.println("b - Introducir valores");
            System.out.println("c - Salir");
            opcion = sc.nextLine();

            

            switch (opcion) {
                
                case "a":
                    System.out.println("Los valores son: ");
                    for (int i = 0; i < contador; i++) {
                        System.out.println(numeros[i] + " ");
                    }    
                    
                    break;

                case "b":




                default:

                System.out.println("Opción inválida. Por favor, inténtelo de nuevo");
                        break;                 
            }



    } while (!opcion.equals("c"));


    } // MAIN
} // MAIN