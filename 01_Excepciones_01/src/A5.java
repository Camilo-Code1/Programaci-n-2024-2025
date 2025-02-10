import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre = "";
        int edad; 

       
        while (true) {
            System.out.println("Por favor, ingrese el nombre del gato: ");
            nombre = scanner.nextLine();
            try {
                validarNombre(nombre);
                break; 
            } catch (NombreValidadException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Tipo de error: " + e.getClass().getName());
            }
        }

      
        while (true) {
            System.out.println("Por favor, ingrese la edad del gato: ");
            try {
                edad = scanner.nextInt();
                validarEdad(edad);
                break; 
            } catch (ValorInvalidoException e) {
                System.out.println("Excepcion atrapada: " + e.getMessage());
                System.out.println("Tipo de error: " + e.getClass().getName());
            } catch (Exception e) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next(); 
            }
        }

   
        System.out.println("Nombre del gato: " + nombre);
        System.out.println("Edad del gato: " + edad);
    }

    public static void validarNombre(String nombre) throws NombreValidadException {
        if (nombre == null || nombre.isEmpty() || nombre.length() < 3) {
            throw new NombreValidadException("El nombre debe tener al menos 3 caracteres.");
        } else {
            String nombreFormateado = nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase();
            System.out.println("Nombre formateado: " + nombreFormateado);
        }
    }

    public static void validarEdad(int edad) throws ValorInvalidoException {
        if (edad < 0) {
            throw new ValorInvalidoException("La edad debe ser mayor a 0");
        }
        System.out.println("La edad es válida");
    }
}