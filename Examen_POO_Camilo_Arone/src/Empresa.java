import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Empresa {
    private String nomEmpresa;
    private String CIF;
    private String fechaFundicion;
    private String maximoTra;


    private static Trabajador[] colecTraba = new Trabajador [100];
    private static int contadorT = 0;


    public Empresa(String nomEmpresa, String CIF) {
        this.nomEmpresa = nomEmpresa;
        this.CIF = CIF;
        this.fechaFundicion = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

    }

    public String getnomEmpresa(){
        return nomEmpresa;
    }
    public String getCIF(){
        return CIF; 
    }


    static String obtenerCIF (Scanner scanner){
        String CIF;
        while (true) {
            System.out.println("Ingrese el CIF de la cuenta (Formato: X0000000000): ");
            CIF = scanner.nextLine();
            if (validarCIF(CIF)) {
                return CIF;
            }
            System.out.println("CIF invalido. Por favor, vuelva a intentarlo\n");
        }
    }

    private static boolean validarCIF(String CIF) {
        return CIF.matches("[A-Z]{1}\\d{10}");
    }



    static String obtenerDNI (Scanner scanner){
        String DNI;
        while (true) {
            System.out.println("Ingrese el DNI de la cuenta (Formato: 00000000X): ");
            DNI = scanner.nextLine();
            if (validarDNI(DNI)) {
                return DNI;
            }
            System.out.println("DNI invalido. Por favor, vuelva a intentarlo\n");
        }
    }

    private static boolean validarDNI(String DNI) {
        return DNI.matches("\\d{8}[A-Z]{1}");
    }






    // No estoy muy seguro de como usar esto (Copiado de un VideoDaw)

    // public static LocalDate leerFecha(Scanner scanner){//LEEMOS UNA FECHA

    //     DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
    //     System.out.println("\nEscribe la fecha de nacimiento en formato DD/MM/AAAA");
    //     String dateString = scanner.nextLine();

    //     //convert String to LocalDate
    //     LocalDate fechaLocalDate = LocalDate.parse(dateString, formatter);
    //     return fechaLocalDate;
    // }


    // Separación (Marginado)





    static String obtenerSS (Scanner scanner){
        String numeroSS;
        while (true) {
            System.out.println("Ingrese el numero de seguridad social de la cuenta (Formato: 0000000000): ");
            numeroSS = scanner.nextLine();
            if (validarSS(numeroSS)) {
                return numeroSS;
            }
            System.out.println("Numero de seguridad social invalido. Por favor, vuelva a intentarlo\n");
        }
    }

    private static boolean validarSS(String numeroSS) {
        return numeroSS.matches("\\d{10}");
    }


        // Opcion 2

    public static void RegistrarTrabajador(Scanner sc) {
        System.out.println("Bienvenido, por favor rellene las siguientes preguntas con los datos del trabajador: ");
        System.out.println("Ingrese el nombre del trabajador: ");
        String Nombre = sc.nextLine();
        // LocalDate dateString = Empresa.leerFecha(sc);
        String DNI = Empresa.obtenerDNI(sc);
        System.out.println("Ingrese la direccion: ");
        String Direccion = sc.nextLine();
        String numeroSS = Empresa.obtenerSS(sc);
    
        Trabajador NuevoTrabajador = new Trabajador(Nombre, DNI, Direccion, numeroSS);

        if (contadorT < 100) {
            colecTraba [contadorT] = NuevoTrabajador;
            contadorT ++;
            System.out.println("Trabajador registrado con exito");
            NuevoTrabajador.mostrarInfoTrabajadores();
        } else {
            System.out.println("Error. Ya no hay espacios disponibles para más trabajadores.");
        }

    }


        // Opcion 4

        public static void mostrarNumTrabajadores (Scanner sc) {
            System.out.println("El numero actual de trabajadores es: " + contadorT);
        }





    public void mostrarInfoEmpresas(){
        System.out.println("\nNombre de la empresa: " + nomEmpresa +
        ", CIF: " + CIF + 
        ", Fecha de fundicion: " + fechaFundicion);
    }


    

} //MAAAAAAAAAAAAAAAAAAAAAAAAAAIIIIIIIIINNNNNNNNNNNNNNNNNNNNNNNN
