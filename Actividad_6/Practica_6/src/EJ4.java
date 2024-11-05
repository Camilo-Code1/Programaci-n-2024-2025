import java.util.Scanner;


       public class EJ4 {
            public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);
                
  
                double[][] calificaciones = new double[4][5]; 
                
            
                for (int i = 0; i < calificaciones.length; i++) { 
                    for (int j = 0; j < calificaciones[i].length; j++) {
                        System.out.println("Introduce la calificación del Estudiante " + (i + 1) + " para la Materia " + (j + 1) + ": ");
                        calificaciones[i][j] = entrada.nextDouble();
                    }
                }
                

                for (int i = 0; i < calificaciones.length; i++) { 
                    double[] calificacionesEstudiante = calificaciones[i];
                    System.out.println("Estudiante " + (i + 1) + ":");
                    System.out.println("Calificación mínima: " + obtenerMinimo(calificacionesEstudiante));
                    System.out.println("Calificación máxima: " + obtenerMaximo(calificacionesEstudiante));
                    System.out.println("Promedio: " + calcularPromedio(calificacionesEstudiante));
                    System.out.println(); 
                }
                
                entrada.close(); 
            }
        
            public static double obtenerMinimo(double[] calificaciones) {
                double minimo = calificaciones[0];
                for (double calificacion : calificaciones) { 
                    if (calificacion < minimo) {
                        minimo = calificacion;
                    }
                }
                return minimo;
            }
        
            public static double obtenerMaximo(double[] calificaciones) { 
                double maximo = calificaciones[0];
                for (double calificacion : calificaciones) {
                    if (calificacion > maximo) {
                        maximo = calificacion;
                    }
                }
                return maximo;
            }
        
            public static double calcularPromedio(double[] calificaciones) { // for:each para promedio
                double suma = 0;
                for (double calificacion : calificaciones) {
                    suma += calificacion;
                }
                return suma / calificaciones.length;
            }
        }
    