
import java.util.Scanner;

public class DawBank {
    public static void main(String[] args) throws Exception {


        int opcion;
        Scanner sc = new Scanner(System.in);
        CuentaBancaria cuenta;


        System.out.println("Bienvenido a DawBank");
        System.out.println("(Presione intro para continuar)");

        String IBAN = obtenerIbanValido(sc);
        System.out.println("Ingrese el titular de la cuenta: ");
        String titular = sc.nextLine();

        CuentaBancaria c1 = new CuentaBancaria(IBAN, titular);
        

        do {
            opcion = MostrarMenu(sc);
            procesarOpcion(opcion, c1, sc);
        } while (opcion != 8);

        sc.close();

    }


    private static int MostrarMenu(Scanner scanner) {

        System.out.println("-----------------------------------------------");

            System.out.println("\nBienvenido,\r\n" + //
                            "\r\n" + //
                            "Por favor realice sus tramites: \r\n" + //
                            "\r\n" + //
                            "1 - Datos de la cuenta\r\n" + //
                            "2 - IBAN\r\n" + //
                            "3 - Titular\r\n" + //
                            "4 - Saldo\r\n" + //
                            "5 - Ingreso\r\n" + //
                            "6 - Retirada\r\n" + //
                            "7 - Movimientos\r\n" + //
                            "8 - Salir\n");

        System.out.println("-----------------------------------------------");


                            return scanner.nextInt();

    }

    private static void procesarOpcion(int opcion, CuentaBancaria cuenta, Scanner scanner) {
            scanner.nextLine();
                    switch (opcion) {
                        case 1:
                            System.out.println("");
                        System.out.println("Datos de la cuenta: ");
                            System.out.println("");
                            
                        cuenta.mostrarDatos();
                            System.out.println("");

                            break;

                        case 2:
                            System.out.println("");
                            System.out.println("IBAN: " + cuenta.getIBAN());
                            System.out.println("");

                            break;

                        case 3:
                            System.out.println("");
                            System.out.println("Titular: " + cuenta.getTitular());
                            System.out.println("");

                            break;

                        case 4:
                            System.out.println("");
                            System.out.println("Saldo: " + cuenta.getSaldo());
                            System.out.println("");

                            break;

                        case 5:
                            System.out.println("");
                            realizarIngreso(cuenta, scanner);
                            System.out.println("");

                            break;
                        
                        case 6:
                            System.out.println("");
                            realizarRetirada(cuenta, scanner);
                            System.out.println("");
                            break;
                                              
                        case 7:
                            System.out.println("");
                        System.out.println("Los movimientos que se han realizado son: ");
                            cuenta.MostrarMovimientos();
                            System.out.println("");
                            break;
                        
                        case 8:
                        System.out.println("\nSaliendo del programa...\n");
                            break;
                        
                        default:
                        System.out.println("\nOpción inválida. Por favor, inténtelo de nuevo\n");
                        break;
                    }
        }

        private static void realizarIngreso(CuentaBancaria cuenta, Scanner scanner) {
            System.out.println("Inserte la cantidad a ingresar: ");
            double cantidadIngreso = scanner.nextDouble();
            cuenta.Ingreso(cantidadIngreso);
        }


        private static void realizarRetirada(CuentaBancaria cuenta, Scanner scanner) {
            System.out.println("Inserte la cantidad a retirar: ");
            double cantidadRetirada = scanner.nextDouble();
            cuenta.Retirada(cantidadRetirada);
        }

        private static String obtenerIbanValido(Scanner scanner){
            String IBAN = scanner.nextLine();
            while (true) {
                System.out.println("Ingrese el IBAN de la cuenta (Formato: XX0000000000000000000000): ");
                IBAN = scanner.nextLine();
                if (validarIBAN (IBAN)) {
                   return IBAN;
                }
                System.out.println("IBAN inválido. Por favor, inténtelo de nuevo");
            }
        }

        private static boolean validarIBAN(String IBAN) {
            return IBAN.matches("[A-Z]{2}\\d{22}");
        }

 

    }




