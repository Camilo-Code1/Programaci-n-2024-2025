import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int valor;

            while (true) {
                System.out.println("Por favor ingrese un valor: ");
                try {
                    valor = scanner.nextInt(); 
                    verificarPositivo(valor);                  
                    verificarNegativo(valor);
                    break; 
                } catch (ValorInvalidoException e) {
                    System.out.println("Excepcion atrapada: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Por favor, ingrese un número válido.");
                    scanner.next(); 
                }
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