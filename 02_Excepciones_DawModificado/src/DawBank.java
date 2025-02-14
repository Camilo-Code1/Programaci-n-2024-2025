import java.util.Scanner;

public class DawBank {
    public static void main(String[] args) throws Exception {


        int opcion;
        Scanner sc = new Scanner(System.in);
        CuentaBancaria cuenta;


        System.out.println("Bienvenido a DawBank");
        System.out.println("(Presione intro para continuar)");

        
        String IBAN = obtenerIbanValido(sc);
        

        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();

        
        String DNI = obtenerDNIValido(sc);

        System.out.println("Inserte la fecha de nacimiento:");
        String fechaNacimiento = sc.nextLine();

        
        String telefono = obtenerTelefonoValido(sc);

        System.out.println("Inserte la dirección: ");
        String direccion = sc.nextLine();

        String email = obtenereEmailValido(sc);

        Cliente cliente = new Cliente(nombre, DNI, fechaNacimiento, telefono, direccion, email);

        CuentaBancaria c1 = new CuentaBancaria(IBAN, cliente);
        

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
                            "3 - Cliente\r\n" + //
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
                            System.out.println("Cliente: " + cuenta.getcliente());
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




        

        // Validadores


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




        private static String obtenerDNIValido(Scanner scanner){
            String DNI = scanner.nextLine();
            while (true) {
                System.out.println("Ingrese el DNI de la cuenta (Formato: XXXXXXXX-@): ");
                DNI = scanner.nextLine();
                if (validarDNI (DNI)) {
                    return DNI;
                    }
                    System.out.println("DNI inválido. Por favor, inténtelo de nuevo");
                    }
        }

        private static boolean validarDNI(String DNI) {
            return DNI.matches("\\d{8}[A-Z]");
            }

 



        private static String obtenereEmailValido(Scanner scanner){
            String email = scanner.nextLine();
            while (true) {
                System.out.println("Ingrese el email de la cuenta (Formato: ejemplo@dominio: ");
                email = scanner.nextLine();
                if (validarEmail(email)) {
                    return email;
                    }
                    System.out.println("Email inválido. Por favor, inténtelo de nuevo");
                    }
            }


        private static boolean validarEmail(String email) {
            return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
            }





        private static String obtenerTelefonoValido (Scanner scanner){
            String telefono = scanner.nextLine();
            while (true) {
                System.out.println("Ingrese el telefono de la cuenta (Formato: XXXXXXXXXX): ");
                telefono = scanner.nextLine();
                if (validarTelefono(telefono)) {
                    return telefono;
                }
                System.out.println("Telefono inválido. Por favor, inténtelo de nuevo");
            }
        }


        private static boolean validarTelefono(String telefono) {
            return telefono.matches("\\d{9}");
            }

                }

        



