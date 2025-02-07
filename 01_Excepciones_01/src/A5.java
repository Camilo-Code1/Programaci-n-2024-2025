import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        int edad;

        

        System.out.println("Por favor, ingrese el nombre del gato: ");
        nombre = scanner.nextLine();
        try {
            validarNombre(nombre);
        } catch (Exception e) {
        }





        System.out.println("Por favor, ingrese la edad del gato: ");
        edad = scanner.nextInt();

        try {
            validarEdad(edad);
        } catch (ValorInvalidoException e) {
            System.out.println("Excepcion atrapada: " + e.getMessage());
        }




    }

    public static void validarNombre(String nombre) throws ValorInvalidoException {
        if (nombre == null || nombre.isEmpty()) {
            throw new ValorInvalidoException("El nombre no puede estar vacio");
        }
    }

    public static void validarEdad(int edad) throws ValorInvalidoException {
    if (edad < 0) {
        throw new ValorInvalidoException("La edad debe ser mayor a 0");
    } System.out.println("La edad es válida");
    }
}