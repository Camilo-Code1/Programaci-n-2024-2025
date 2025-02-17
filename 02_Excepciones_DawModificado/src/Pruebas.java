import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Pruebas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate fechaNacimiento = null;
        boolean edadValida = false;

        while (!edadValida) {
            System.out.print("Introduce tu fecha de nacimiento (YYYY-MM-DD): ");
            String fechaNacimientoStr = scanner.nextLine();

            try {
                fechaNacimiento = LocalDate.parse(fechaNacimientoStr);
                edadValida = esMayorDeEdad(fechaNacimiento);
                
                if (edadValida) {
                    System.out.println("Eres mayor de 18 años y puedes continuar.");
                } else {
                    System.out.println("No cumples con los requisitos de edad. Inténtalo de nuevo.");
                }
            } catch (Exception e) {
                System.out.println("Fecha inválida. Por favor, introduce una fecha en el formato correcto (YYYY-MM-DD).");
            }
        }

        scanner.close();
    }

    public static boolean esMayorDeEdad(LocalDate fechaNacimiento) {
        LocalDate hoy = LocalDate.now();
        int edad = Period.between(fechaNacimiento, hoy).getYears();
        
        return edad > 18 && edad <= 100;
    }
}