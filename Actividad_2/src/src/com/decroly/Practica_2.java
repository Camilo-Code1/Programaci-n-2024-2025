package src.com.decroly;

import java.util.Scanner;

public class Practica_2 {

    public static void main(String[] args) {

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

        for (numero = 1; numero <= 20; numero++)
            System.out.print(numero + " ");

        System.out.println("\n");

        // PUNTO 4

        System.out.println("EJERCICIO 4");

        for (int contador = 2; contador <= 200; contador += 2) {
            System.out.println(contador);
        }

        // PUNTO 5

        System.out.println("EJERCICIO 5");

        for (int contar = 1; contar <= 200; contar += 1) {
            System.out.println(contar);
        }

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

        if (nota < 5) {
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

        System.out.print("Ingrese un número positivo: ");
        int p = sc.nextInt();

        if (p < 0) {
            System.out.println("Error: El número debe ser positivo.");
        } else {
            long factorial = calcularFactorial(p);
            System.out.println("El factorial de " + p + " es: " + factorial);
        }

        // PUNTO 9

        System.out.println("EJERCICIO 9");

        System.out.print("Introducir hora: ");
        int hour = sc.nextInt();

        System.out.print("Introducir minuto: ");
        int minu = sc.nextInt();

        System.out.print("Introducir segundo: ");
        int seco = sc.nextInt();

        seco++;

        if (seco == 60) {
            seco = 0;
            minu++;
        }

        if (minu == 60) {
            minu = 0;
            hour++;
        }

        if (hour == 24) {
            hour = 0;
        }

        System.out.println("Tiempo despúes de un segundo: " + hour + ":" + minu + ":" + seco);

        // PUNTO 10

        System.out.println("EJERCICIO 10");

        int con = 0;
        int numt;

        while (con < 10) {
            System.out.println("Introduce 10 números no nulos: ");
            numt = sc.nextInt();

            if (numt == 0) {
                System.out.println("Error: Número nulo, por favor reinicie el programa.");
                continue;
            }

            if (numt < 0) {
                System.out.println("Número negativo encontrado");
            }

            con++;
            System.out.println("Números " + con + ": " + numt);
        }

        // PUNTO 11

        System.out.println("EJERCICIO 11");

        int hcon = 0;
        int hnumt;
        int hposi = 0;
        int hnega = 0;

        while (hcon < 10) {
            System.out.println("Inserte 10 números no nulos: ");
            hnumt = sc.nextInt();

            if (hnumt == 0) {
                System.out.println("Error: Número nulo, por favor reinicie el programa.");
                continue;
            }

            if (hnumt < 0) {
                hnega++;
            } else {
                hposi++;
            }

            hcon++;
            System.out.println("Números " + hcon + ": " + hnumt);
        }

        System.out.println("Resumen:");
        System.out.println("Números positivos: " + hposi);
        System.out.println("Números negativos: " + hnega);

        // PUNTO 14

        // ...

    } // MAIN

    public static long calcularFactorial(int p) {
        long factorial = 1;

        for (int i = 1; i <= p; i++) {
            factorial *= i;
        }

        return factorial;

        
      
    }

} // CLASE