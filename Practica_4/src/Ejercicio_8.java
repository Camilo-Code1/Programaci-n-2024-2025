import java.util.Scanner;

public class Ejercicio_8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el valor real para saber si son iguales o superiores a los valores: ");
        float R = sc.nextFloat();

        double [] random =  new double [100];

        for  (int i = 0; i < 100; i++) {

        double num = Math.random();
        
        random[i] = num;
        System.out.println(num);

        }
        for (int i = 0; i < random.length; i++) {
            if (random[i] >= R) {
                System.out.println("El número aleatorio " + random[i] + " es igual o superior a " + R);
            } else {
                System.out.println("El número aleatorio " + random[i] + " es menor que " + R);
            }
        }
        
    
    } // MAIN
} // MAIN