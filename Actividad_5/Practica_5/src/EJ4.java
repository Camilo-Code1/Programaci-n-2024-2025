import java.util.Scanner;

public class EJ4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String frase;
        int a, e, i, o, u, cont;
        char c;
        a = 0;
        e = 0;
        i = 0;
        o = 0;
        u = 0;

        System.out.println("Por favor inserte su frase: ");
        frase = sc.nextLine();

        frase = frase.toLowerCase(); 

        for (cont = 0; cont < frase.length(); cont++) {
            switch (frase.charAt(cont)) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
            }
        }

        System.out.println("El número de 'a' es: " + a);
        System.out.println("El número de 'e' es: " + e);
        System.out.println("El número de 'i' es: " + i);
        System.out.println("El número de 'o' es: " + o);
        System.out.println("El número de 'u' es: " + u);

    
    } // MAIN
} // MAIN