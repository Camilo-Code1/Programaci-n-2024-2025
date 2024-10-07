
import java.util.Scanner;

	// PUNTO 12

    public class pru {
    
        public static void main(String[] args) {

            System.out.println("EJERCICIO  12");

            Scanner sc = new Scanner(System.in);
            int num;
            int positivos = 0;
            int negativos = 0;
            boolean hayNegativos = false;
            boolean fin = false;
    
            System.out.println("Introduce números no nulos (0 para terminar):");
    
            while (!fin) {
                num = sc.nextInt();
    
                if (num == 0) {
                    fin = true;
                } else if (num < 0) {
                    negativos++;
                    hayNegativos = true;
                } else {
                    positivos++;
                }
            }
    
            System.out.println("Resumen:");
            if (hayNegativos) {
                System.out.println("Se han leído números negativos.");
            } else {
                System.out.println("No se han leído números negativos.");
            }
            System.out.println("Números positivos: " + positivos);
            System.out.println("Números negativos: " + negativos);


            System.out.println("EJERCICIO 13");



            int suma = 0;
        int producto = 1;

        for (int i = 1; i <= 10; i++) {
            suma += i;
            producto *= i;
        }

        System.out.println("Suma de los 10 primeros números naturales: " + suma);
        System.out.println("Producto de los 10 primeros números naturales: " + producto);

        // EJERCICIO 14

        System.out.println("EJERCICIO 14");

        System.out.println("""
            - Las primeras 35 horas se pagan a tarifa normal.
            - Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
            - Las tasas de impuestos son:
            - Los primeros 500 euros son libres de impuestos.
            - Los siguientes 400 tienen un 25% de impuestos.
            - Los restantes un 45% de impuestos.
        """);

		
        Scanner entrada = new Scanner(System.in);

        System.out.println("Nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("Horas trabajadas: ");
        int horas = entrada.nextInt();

        System.out.println("Pago por horas trabajadas: ");
        int pagoxhora = entrada.nextInt();

        double salarioBruto = calcularSalarioBruto(horas, pagoxhora);
        double impuestos = calcularImpuestos(salarioBruto);
        double salarioNeto = salarioBruto - impuestos;

        System.out.println("Empleado: " +nombre);
        System.out.println("Tu salario bruto es: " + salarioBruto);
        System.out.println("Tu salario neto es: " + salarioNeto);
        System.out.println("Los impuestos añadidos al salario bruto son: " + impuestos);
    }

    private static double calcularSalarioBruto(int horas, int pagoxhora) {
        if (horas <= 35) {
            return horas * pagoxhora;
        } else {
            return (35 * pagoxhora) + ((horas - 35) * pagoxhora * 1.5);
        }
    }

    private static double calcularImpuestos(double salarioBruto) {
        if (salarioBruto <= 500) {
            return 0;
        } else if (salarioBruto <= 900) {
            return (salarioBruto - 500) * 0.25;
        } else {
            return (400 * 0.25) + (salarioBruto - 900) * 0.45;
        }

        sc.close();

    }
}



 