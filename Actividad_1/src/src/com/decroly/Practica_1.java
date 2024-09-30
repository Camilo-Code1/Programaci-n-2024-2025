package src.com.decroly;

import java.util.Scanner;

public class Practica_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Punto 1

		System.out.println("Buenos días");
		
		
		// Punto 2
		
		System.out.println("EJERCICIO 2");
		
		
		
		System.out.println("Valor de cada lado del cuadrado: 5");
		int l1 = (int) 5;
		int l2= (int) 5;
		int l3= l1*l2;
		
		
		System.out.print("Aréa del cuadrado: ");
		System.out.println(l3);
		
		System.out.println("EJERCICIO 3");
	
		// Punto 3
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce el lado del cuadrado: ");
		char C = 'S'; 
		
		int vlc = reader.nextInt();
	

		
		System.out.println("El valor del aréa es: "+(vlc*2));
		
		
		System.out.println("EJERCICIO 4");
		
		// Punto 4
		
		
		reader = new Scanner(System.in);
		
		System.out.println("Suma: ");
		
		System.out.println("Numero 1: ");
		int sumar1 = reader.nextInt();
		
		System.out.println("Numero 2 ");
		int sumar2 = reader.nextInt();
		
		int resul1 = sumar1 +sumar2; 
		
		System.out.println("Resultado:" + (resul1));
		
	
		
		System.out.println("Resta: ");
		
		System.out.println("Número 1: ");
		int restar1 = reader.nextInt();

		System.out.println("Número 2: ");
		int restar2 = reader.nextInt();
		
		
		int resul2 = restar1 - restar2; 
		
		System.out.println("Resultado: " + (resul2));
		
		
		
		System.out.println("Multiplicar: ");
		
		System.out.println("Número 1: ");
		int mul1 = reader.nextInt();
		
		System.out.println("Número 2: ");
		int mul2 = reader.nextInt();
		
		int resul3 = mul1 * mul2; 
		
		System.out.println("Resultado: " + (resul3));
		
		
		
		System.out.println("División: ");
		
		System.out.println("Número 1: ");
		int divir1 = reader.nextInt();
		
		System.out.println("Número 2: ");
		int divir2 = reader.nextInt();
		
		int resul4 = divir1 / divir2; 
		
		System.out.println("Resultado: " + (resul4));
		
		
		
		// Punto 5
		
		System.out.println("EJERCICIO 5");
		
		
		
		System.out.println("Escriba el valor correspondente a la longitud de una radio");
		int lonR = reader.nextInt();
		
		System.out.println("Operación:");
		
		System.out.println("C = 2 * 3.14"+ lonR);
		
		int circ = lonR*2;
		
		System.out.println("Resultado:" +(circ* 3.14));
		
		
		// PUNTO 6
		
		
		System.out.println("EJERCICIO 6");
		
		
		System.out.println("Precio del articulo: ");
		double n1 = reader.nextDouble();
		
		System.out.println("Precio real de venta: ");
		double n2 = reader.nextDouble();
	
		System.out.println("Descuento:"  +(n1- n2)/n2);
		
		
		// PUNTO 7
		
		
		System.out.println("EJERCICIO 7");
	
		System.out.println("Número de millas marinas: ");
		int milla = reader.nextInt();
		
		System.out.println("Distancia en metros: " + (milla*1.852));
		
		
		
		// PUNTO 8
		
		
		System.out.println("EJERCICIO 8");
		
		System.out.println("Numero 1:");
		double num1 = reader.nextDouble();
	System.out.println("Numero 2:");
		double num2 = reader.nextDouble();
	

	
		double numMin = Math.min(num1, num2);
		double numMax = Math.max(num1, num2);
	System.out.println("El orden ascendente de los números es: " + numMin + " y " +numMax);
		
		
	
	
		// PUNTO 9
	
	
	
		System.out.println("EJERCICIO 9");
	
		System.out.print("Numero 1: ");
    	int nm1 = reader.nextInt();

    System.out.print("Numero 2: ");
    	int nm2 = reader.nextInt();

    	int resolucion = ((nm1 - nm2) >> 31) & 1;

    		String salida = (resolucion == 0) ? "Los numeros son iguales" : (resolucion == 1) ? "El Numero 1 es mayor" : "El Numero 2 es mayor";

    System.out.println(salida);
		
		
		// PUNTO 10
		
		
		System.out.println("EJERCICIO 10");
		
		
		System.out.println("Número 1 ");
		double numr1 = reader.nextDouble();
		
		System.out.println("Número 2: ");
		double numr2 = reader.nextDouble();
		
		System.out.println("Número 3: ");
		double numr3 = reader.nextDouble();
		
		double max1 = Math.max(numr1, numr2);
		double max2 = Math.max(max1, numr3);
		
		System.out.println("Número mayor: "+ max2);
		
		
		
		// PUNTO 11
		
		
		System.out.println("EJERCICIO 11");
		
		System.out.print("Introduce el primer número: ");
        double nr1 = reader.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double nr2 = reader.nextDouble();

        double suma = nr1 + nr2;
        double resta = nr1 - nr2;
        double producto = nr1 * nr2;
        double division = numr1 != 0 ? nr1 / nr2 : Double.NaN;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("El producto es: " + producto);
        System.out.println("La división es: " + (division == Double.NaN ? "Indefinido" : division));
		
		
		
	
		
		// PUNTO 12
		
		System.out.println("EJERCICIO 12");
		
		System.out.println("Número 1: ");
		double nu1 = reader.nextDouble();
		
		System.out.println("Número 2: ");
		double nu2 = reader.nextDouble();
		
		double ma3 = Math.max(nu1, nu2);
		
		System.out.println("Número mayor: " + ma3);
		
		
		
		// PUNTO 13
		
		System.out.println("EJERCICIO 13");
		
		 System.out.print("Introduce un número: ");
	        double numero = reader.nextDouble();

	        String resultado = (numero >= 0) ? "positivo" : "negativo";

	        System.out.println("El número es " + resultado);
		
		
		
	}

}