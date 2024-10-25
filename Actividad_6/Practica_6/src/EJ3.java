import java.util.Scanner;

public class EJ3 {

    public static void main(String[] args) {

                Scanner entrada = new Scanner(System.in);
                
                System.out.println("Introduce el número total de personas: ");
                int totalPersonas = entrada.nextInt();
                
                int atributos = 2; 
                // matriz
                double[][] datosPersonas = new double[totalPersonas][atributos]; 
                
                for (int i = 0; i < datosPersonas.length; i++) { // introducir datos
                    for (int j = 0; j < datosPersonas[i].length; j++) {
                        System.out.print("Introduce el género de la persona " + (i + 1) + " (0 para varón y 1 para mujer): ");
                        datosPersonas[i][0] = entrada.nextInt();
                        System.out.print("Introduce el sueldo de la persona " + (i + 1) + ": ");
                        datosPersonas[i][1] = entrada.nextDouble();
                    }
                }
                
                // variables a usar
                double sueldoPromedioVarones = 0;
                double sueldoPromedioMujeres = 0;
                int contadorVarones = 0;
                int contadorMujeres = 0;
        
                for (int i = 0; i < totalPersonas; i++) { // for para recorrer la matriz
                    if (datosPersonas[i][0] == 0) {
                        sueldoPromedioVarones += datosPersonas[i][1];
                        contadorVarones++;
                    } else {
                        sueldoPromedioMujeres += datosPersonas[i][1];
                        contadorMujeres++;
                    }
                }
        
                if (contadorVarones > 0) {
                    sueldoPromedioVarones /= contadorVarones;
                    System.out.println("Sueldo promedio varones: " + sueldoPromedioVarones);
                } else {
                    System.out.println("No hay varones registrados.");
                }
        
                if (contadorMujeres > 0) {
                    sueldoPromedioMujeres /= contadorMujeres;
                    System.out.println("Sueldo promedio mujeres: " + sueldoPromedioMujeres);
                } else {
                    System.out.println("No hay mujeres registradas.");
                }    
                
                entrada.close(); // Cerrar el escáner
            }
        }