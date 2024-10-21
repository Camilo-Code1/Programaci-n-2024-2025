import java.util.Scanner;

public class Ejercicio_10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] N = new double[5];

        System.out.println("Inserte las alturas de las 5 personas: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Persona " + (i + 1) + ": "); 
            N[i] = sc.nextDouble();
        }
        
        double suma = 0;
        double media = 0;
        double NumMin = N[0]; 
        double NumMax = N[0]; 
        int PEncimMedia = 0; 
        int PDebaMedia = 0;  

  
        for (int i  = 0; i < N.length; i++) {
            suma += N[i];
            NumMin = Math.min(NumMin, N[i]);
            NumMax = Math.max(NumMax, N[i]);
        }
        
        media = suma / N.length; 

        for (int i = 0; i < N.length; i++) {
            if (N[i] > media) {
                PEncimMedia++;
            } else if (N[i] < media) {
                PDebaMedia++;
            }
        }

        System.out.println("La media de las alturas es: " + media);
        System.out.println("El número máximo es: " + NumMax);
        System.out.println("El número mínimo es: " + NumMin);
        System.out.println("Personas que miden por encima de la media: " + PEncimMedia);
        System.out.println("Personas que miden por debajo de la media: " + PDebaMedia);


    } 
} 