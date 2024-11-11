import java.util.Scanner;

public class Examen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String opcion = "";
        int tamaño = 0; 

        // Inicio pidiendo el tamaño del array

        System.out.println("Por favor inserte el tamaño del Array: ");
        tamaño = sc.nextInt();
        System.out.println("");

        // Espacio de variables

        int errores;
        int[] numeros = new int[tamaño];
        int suma = 0;
        int media = 0;
        double NumMin = numeros[0]; 
        double NumMax = numeros[0]; 


        do { 

                 // Se duplica 
                 // Menu principal
 
            System.out.println("---------------------");      
            System.out.println("");     

            System.out.println("a - Modificar colección");
            System.out.println("b - Estadisticas de la colección: ");
            System.out.println("c - Ampliar el valor de la colección");
            System.out.println("d - Salir");  

            System.out.println("");
            System.out.println("---------------------");
            opcion = sc.nextLine();

            sc = new Scanner(System.in);

            switch (opcion) {



                case "a": // Submenu en la primera opcion
                    // Error general de submenus es que si se presiona una opcion que no esta incorporada te lleva al menu principal

                    System.out.println("---------------------");      
                    System.out.println("");  
                    
                    System.out.println("1 - Insertar numero");
                    System.out.println("2 - Borrar numero de una posicion especifica");
                    System.out.println("3 - Salir");

                    System.out.println("");
                    System.out.println("---------------------");
                    opcion = sc.nextLine();

                    // Botoncingos

                    switch (opcion) {
                        case "1":

                        System.err.println("---------------------");      
                        System.out.println("");  
                                System.out.println("Por favor, introduzca un valor no nulo: ");
                                int valor = sc.nextInt();
                                System.out.println("");
            
                                System.out.println("Por favor, introduzca la posición que desea asignarle: ");
                                int posicion = sc.nextInt();
                                System.out.println("");
            
                                if (posicion >= 0 &&  posicion < numeros.length) {
                                    numeros [posicion] = valor;
                                    System.out.println("El valor " + valor + " introducido en la posicion " + posicion);
                                    }

                                    for (int i = 0; i < numeros.length; i++) {
                                        System.out.println(numeros[i]);
                                    }
                                    break;


                            case "2":
                                System.out.println("Por favor, introduzca el valor 0 para eliminarlo: ");
                                valor = sc.nextInt();
                                System.out.println("");
            
                                System.out.println("Por favor, introduzca la posición a la que desee borrar: ");
                                posicion = sc.nextInt();
                                System.out.println("");
            
                                if (posicion >= 0 &&  posicion < numeros.length) {
                                    numeros [posicion] = valor;
                                    System.out.println("El valor " + valor + " introducido en la posicion " + posicion);
                                    }
                                    break;
                                
                                }
                                     
                    break;

                case "b": 

                // Segundo submenu de la opcion b


                    System.out.println("---------------------");      
                    System.out.println("");  

                    System.out.println("1 - Media de todos lo valores: ");
                    System.out.println("2 - Suma de todos lo valores: ");
                    System.out.println("3 - Maximo de todos lo valores: ");
                    System.out.println("4 - Minimo de todos lo valores: ");
                   

                    System.out.println("");
                    System.out.println("---------------------");



                    opcion = sc.nextLine();
                    
                            switch (opcion) {
                                case "1":

                                for (int i = 0; i < tamaño; i++) {
                                    suma +=  numeros[i];
                                    media = suma/tamaño;
                                }

                                System.err.println("La media de los números del Array: " + media);
                                    break;

                                case "2":

                                for (int i = 0; i < tamaño; i++) {
                                    suma +=  numeros[i];
                                    media = suma/tamaño;
                                }
                        
                                System.err.println("La suma de los números del Array: " + suma);
                                    break;

                                case "3":
                                    for (int i = 0; i < numeros.length; i++) {
                                    NumMax = Math.max(NumMax, numeros[i]);
                                }
                        
                                    System.out.println("El numero maximo es: " + NumMax);
                                    break;

                                case "4":

                                    // No funciona y ni siquiera sé porque, seguramente algo estupido. 
                                    
                                    for (int i = 0; i < numeros.length; i++) {
                                    NumMin = Math.min(NumMin, numeros[i]);
                                }
                        
                                System.out.println("El numero minimo es: " + NumMin);
                                    break;

                                }

                            
                case "c":

                                // No tengo mucha de idea de como hacer esto

                                System.out.println("Por favor inserte el nuevo tamaño del Array: ");
                                tamaño = sc.nextInt();
                                
                                for (int i = 0; i < numeros.length; i++) {
                                    System.out.println(numeros[i]);
                                }
                                

                    break;

                case "d":

                        System.out.println("Saliendo del menu...");
                        break; 


                }
                 } while (!opcion.equals("d"));

                 // Apartado de la comedia de mi vida

                 System.out.println("Contador de problemas encontrados por mi mismo: 4");
        
                 System.out.println("Cantidad de errores encontrados por usted" );
                 errores = sc.nextInt();

        
    

    




            sc.close();
    } // MAIN
} // MAIN