import java.util.Scanner;

public class Ejercicio_12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
 
        String opcion = "";
        int[] numeros = new int[6];
        int contador = 0;

        do { 

            System.out.println("a - Mostrar valores");
            System.out.println("b - Introducir valores");
            System.out.println("c - Salir");
            opcion = sc.nextLine();

            

            switch(opcion) {
                
                case "a":
                    System.out.println("Los valores son: ");
                    for (int i = 0; i < numeros.length; i++) {
                        System.out.println("Posición " + i + ": " + numeros[i]);
                    }    
                    System.out.println();

                    break;
                
                case "b":
                    System.out.println("Introduce un valor: ");
                    int valor = sc.nextInt();
                    
                    System.out.println("Introduce una posición (0-5): ");
                    int posicion = sc.nextInt();

                    if (posicion >= 0 &&  posicion < numeros.length) {
                        numeros [posicion] = valor;
                        System.out.println("El valor " + valor + " introducido en la posicion " + posicion);
                        }
                    break;

                case "c":

                     System.out.println("Saliendo del programa...");
                    break;


            }



    } while (!opcion.equals("c"));


    } // MAIN
} // MAIN