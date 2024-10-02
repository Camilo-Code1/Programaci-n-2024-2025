package src.com.decroly;

import java.util.Scanner;

public class Practica_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// PUNTO 1

		System.out.println("EJERCICIO 1");
		
		Scanner sc = new Scanner(System.in);
		

		int edadd; 
		System.out.println("Escriba su edad: ");

		
		edadd = sc.nextInt(); 
		
		if (edadd > 18) {
			
			System.out.println("Eres mayor de edad");
			
		}
		
		
		
		// PUNTO 2
		
		System.out.println("EJERCICIO 2");
		
		sc = new Scanner(System.in);
		

		int edad; 
		System.out.println("Escriba su edad: ");

		
		edad = sc.nextInt(); 
		
		if (edad < 18) {
			
			System.out.println("Menor de edad");
			
		} else if (edad > 18) {
			
			System.out.println("Eres mayor de edad");
		}
		
		
		// PUNTO 3
		
		System.out.println("EJERCICIO 3");
		
			System.out.println("Numeros del 1 al 20: ");
			int numero;
			
			for(numero=1;numero<=20;numero++)
				
				System.out.print(numero + " ");
			
			System.out.println("\n");
		
		
		// PUNTO 4
			
			System.out.println("EJERCICIO 4");
			

			
			for (int contador = 2; contador <= 200; contador +=2) {
			  
			    System.out.println(contador);
		
		
			
			}
			
		
			
		// PUNTO 5
			
			System.out.println("EJERCICIO 5");
			
			
			
			
			
			
		// PUNTO 6 
			
			System.out.println("EJERCICIO 6");
			
			
			int n;
			int i; 
			System.out.println("Inserte el número hasta que el desea contar: ");
			
			n = sc.nextInt(); 
			
			
			System.out.println("Números del 1 al " + n + ": ");
			for (i = 1; i <= n; i++)
			
				System.out.println(i);
			
			
			
		// PUNTO 7
		
		
			
			System.out.println("EJERCICIO 7");
			
			int nota;	
			
			System.out.println("Dame un número entre 0 y 10: ");
			
			nota = sc.nextInt();
			
		
			if (nota< 5) {
					System.out.println("Insuficiente");
			} else if (nota < 6) {
					System.out.println("Suficiente");
			} else if (nota < 7) {
					System.out.println("Bien");
			} else if (nota < 9) {
					System.out.println("Notable");
			} else {
					System.out.println("Sobresaliente");
			}
			
			
		// PUNTO 8
			
			System.out.println("EJERCICIO 8");	
			
			
			
			
		
			
		// PUNTO 9
			
			System.out.println("EJERCICIO 9");	
			
		
			
			
			
		// PUNTO 10
			
			System.out.println("EJERCICIO 10");
			
			
			
			
			
			
			
		// PUNTO 11
			
			System.out.println("EJERCICIO 11");
			
		
			
	
			
			
			
			
		// PUNTO 12
			
			System.out.println("EJERCICIO 12");
			
			
			
			
			
			
			
		
		// PUNTO 13	
			
			System.out.println("EJERCICIO 13");
			
			
			
			
			
			
		// PUNTO 14	
			
			System.out.println("EJERCICIO 14");
			
			
			
			
			
			
			
				}
			
			
	} // MAIN
	

 // CLASE
