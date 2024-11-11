import java.util.Scanner;

public class Completo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String opcionJugador;
        String decisionComputadora;
        int Victorias = 0,  Empates = 0, Derrotas = 0;
        String presentacion = "Bienvenido, jugador\n" +
                "\n" +
                "Este juego se llama piedra, papel y tijeras. Las reglas son las siguientes:\n" +
                "\n" +
                "- Piedra rompe tijeras: Piedra gana.\n" +
                "- Papel envuelve piedra: Papel gana.\n" +
                "- Tijeras corta papel: Tijeras gana.";

        System.out.println(presentacion);

        do {
            System.out.println("\nPor favor elija qué jugar: ");
            System.out.println("P - Piedra");
            System.out.println("L - Papel");
            System.out.println("T - Tijeras");
            System.out.println("S - Salir");
            opcionJugador = sc.nextLine().toUpperCase(); // Convertir a mayúsculas para evitar problemas de comparación

            // Opción de salir

            if (opcionJugador.equals("S")) {
                System.out.println("Gracias por jugar. ¡Hasta luego!");
                break; // Salir del bucle
            }

            // Validar la opción del jugador
            if (!opcionJugador.equals("P") && !opcionJugador.equals("L") && !opcionJugador.equals("T")) {
                System.out.println("Opción inválida. Por favor, inténtelo de nuevo.");
                continue; // Volver al inicio del bucle
            }

            System.out.println("\nUsted ha elegido: " + (opcionJugador.equals("P") ? "Piedra" : opcionJugador.equals("L") ? "Papel" : "Tijeras"));

            // Computadora
            int[] options = {1, 2, 3};
            int randomNum = options[(int) (Math.random() * options.length)];

            switch (randomNum) {
                case 1: decisionComputadora = "Piedra"; break;
                case 2: decisionComputadora = "Papel"; break;
                case 3: decisionComputadora = "Tijeras"; break;
                default: decisionComputadora = "";
            }

            System.out.println("\n" + decisionComputadora + " ha sido elegido por la computadora.");
            System.out.println("");

            // JUGADAS ENFRENTADAS
            if (opcionJugador.equals("P") && decisionComputadora.equals("Piedra")) {
                System.out.println("¡Empate!");
                Empates++;
            } else if (opcionJugador.equals("P") && decisionComputadora.equals("Tijeras")) {
                System.out.println("¡Usted gana!");
                Victorias++;
            } else if (opcionJugador.equals("P") && decisionComputadora.equals("Papel")) {
                System.out.println("¡La computadora gana!");
                Derrotas++;
            } else if (opcionJugador.equals("L") && decisionComputadora.equals("Papel")) {
                System.out.println("¡Empate!");
                Empates++;
            } else if (opcionJugador.equals("L") && decisionComputadora.equals("Piedra")) {
                System.out.println("¡Usted gana!");
                Victorias++;
            } else if (opcionJugador.equals("L") && decisionComputadora.equals("Tijeras")) {
                System.out.println("¡La computadora gana!");
                Derrotas++;
            } else if (opcionJugador.equals("T") && decisionComputadora.equals("Tijeras")) {
                System.out.println("¡Empate!");
                Empates++;
            } else if (opcionJugador.equals("T") && decisionComputadora.equals("Papel")) {
                System.out.println("¡Usted gana!");
                Victorias++;
            } else if (opcionJugador.equals("T") && decisionComputadora.equals("Piedra")) {
                System.out.println("¡La computadora gana!");
                Derrotas++;
            }

            System.out.println("");
            System.out.println("Contador de victorias: " + Victorias);


                System.out.println("--------------------------------");

            System.out.println("Contador de empates: " + Empates);

                System.out.println("--------------------------------");


            System.out.println("Contador de derrotas: " + Derrotas);
            System.out.println("");

            System.out.println("Si desea salir del programa presione S");
        } while (true); // Bucle infinito hasta que el jugador decida salir

        sc.close();
    } // MAIN
} // CLASS