package com.decroly.daw;

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
		
		
		// Punto 6
		
		
		System.out.println("EJERCICIO 6");
		
		
		System.out.println("Precio del articulo: XXXXX");
		int arti = reader.nextInt();
		
		System.out.println("Descuento a aplicar: XxXXX");
		int desc = reader.nextInt();
	 	int descf= desc;  
		
		int vf = arti - desc;
		
		System.out.println("Coste final: " + vf);
		
		/// XXXXXXXXXXXXXXXXXXXXXXX
		
		
		System.out.println("EJERCICIO 7");
	
		System.out.println("Número de millas marinas: ");
		int milla = reader.nextInt();
		
		System.out.println("Distancia en metros: " + (milla*1.852));
		
		
		
		
		System.out.println("EJERCICIO 8");
		
		double numer1; 
		double numer2;
		
	
		System.out.println("Escriba el primer numero:: ");
		
		numer1 = reader.nextInt();
		
		
		System.out.println("Escriba el segundo número: ");
		numer2 = reader.nextInt();
		
		
		if (numer1 > numer2)
		{
			System.out.println(numer2 + ";" + numer1);
		} else {
		
			if (numer1 < numer2)
				
			{
		} 
		}
		
		System.out.println("EJERCICIO 9");
	
		
		
		
		System.out.println("EJERCICIO 10");
		
	}

}
