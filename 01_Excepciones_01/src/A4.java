import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
          
            int valor; 

            System.out.println("Por favor ingrese un valor: ");
            valor = scanner.nextInt();

            try {
                verificarPositivo(valor);
            } catch (ValorInvalidoException e) {
                System.out.println("Excepcion atrapada: " + e.getMessage());
            }
            
            try {
                verificarNegativo(valor);
            } catch (ValorInvalidoException e) {
                System.out.println("Excepcion atrapada: " + e.getMessage());
            }
        }

    }


    
    public static void verificarPositivo(int valor) throws ValorInvalidoException {
        if (valor < 0) {
            throw new ValorInvalidoException("El " + valor + " no es positivo");
            }
            System.out.println("El " + valor + " es positivo");

    }
    public static void verificarNegativo(int valor) throws ValorInvalidoException {
        if (valor > 0) {
            throw new ValorInvalidoException("El " + valor + " no es negativo");
            }
            System.out.println("El " + valor + " es negativo");
            }
}

