package com.decroly.daw;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido al mundo, alma perdida");
		System.out.println("¿Cual es tu nombre?");
	
		int num = 0; // Vale 0
		int a = 23;
		
		int suma = a + num;
		
		double numR = 33.33;
		
		
		
		String text1 = "¿O recuerdas quien eres?";
		String text2 = "... ";
		String text3 = "No lo recuerdo";
		
		System.out.println(text1);
		System.out.println(text2+text3);
		
		System.out.println("Fin del comunicidado");
		
		boolean isEnable = false; 
		
		char C = 'S'; 
		
		System.out.println((a != numR));
		
		System.out.println("Introduce tu edad");
		
		
		
		Scanner reader = new Scanner(System.in);
		
		String dni = reader.next();
		String edad = reader.next();
		
		
	}

}
