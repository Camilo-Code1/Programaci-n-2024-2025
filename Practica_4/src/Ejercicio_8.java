import java.util.Scanner;

public class Ejercicio_8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double [] random =  new double [100];

        for  (int i = 0; i < 100; i++) {

        double num = Math.random()*1;
        
            random[i] = num;
        System.out.println(num);
        }


        sc.close();
    } // MAIN
} // MAIN