import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class VideoDaw {

        private String CIF;
        private String Direccion;
        private String FechaAlta;



        private static Cliente[] clientes = new Cliente[100];
        private static int numClientes = 0;
    
        private static Pelicula[] Pelis = new Pelicula[100];
        private static int numPelis = 0;


        static String obtenerDNI(Scanner scanner) {
        String DNI;
        while (true) {
            System.out.println("Ingrese el DNI de la cuenta (Formato: 00000000X): ");
            DNI = scanner.nextLine();
            if (validarDNI(DNI)) {
                return DNI;
            }
            System.out.println("DNI inválido. Por favor, intentelo de nuevo\n");
        }
    }

    private static boolean validarDNI(String DNI) {
        return DNI.matches("\\d{8}[A-Z]{1}");
    }


    

    // Opcion 3 Crear y registrar cliente en el videoclub
    public static void AgregarCliente(Scanner sc) {
        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el DNI del cliente: ");
        String DNI = sc.nextLine();
        System.out.println("Ingrese el número de socio: ");
        String numSocio = sc.nextLine();
        System.out.println("Ingrese la dirección del cliente: ");
        String direccion = sc.nextLine();
        System.out.println("Ingrese la fecha de nacimiento del cliente: ");
        String fechaNacimiento = sc.nextLine();
        System.out.println("Ingrese la fecha de baja del cliente (si aplica): ");
        String fechaBaja = sc.nextLine();
        System.out.println("Ingrese el número de películas alquiladas: ");
        int peliculasAlquiladas = sc.nextInt();
        sc.nextLine(); 

        Cliente nuevoCliente = new Cliente(DNI, nombre, numSocio, direccion, peliculasAlquiladas);

        if (numClientes < 100) {
            clientes[numClientes] = nuevoCliente;
            numClientes++;
            System.out.println("Cliente agregado con éxito");
            nuevoCliente.MostrarinfoClientes();
        } else {
            System.out.println("No hay espacio para agregar más clientes");
        }
    }



    public static void AgregarPelicula(Scanner sc) {

        System.out.println("Ingrese el codigo de la pelicula: ");
        String COD = sc.nextLine();
        System.out .println("Inserte el titulo de la pelicula: ");
        String Titulo = sc.nextLine();
        System.out.println("Inserte el genero de la pelicula: ");
        String Genero = sc.nextLine(); // Averiguar como hacer el enum y todo eso
        System.out.println("Inserte la fecha de registro: ");
        String FechadeRegistro = sc.nextLine();
        System.out.println("Inserte la fecha de baja: ");
        String FechadeBaja = sc.nextLine();
        System.out.println("Inserte la fecha del ultimo alquiler: ");
        String FechadeAlquiler = sc.nextLine();
        System.out.println("Por favor, indique si la pelicula esta alquilada o no: ");
        String IsAlquilada = sc.nextLine(); // Hacer un if y luego lea la respuesta como un true o false

        Pelicula Pelisstas = new Pelicula(COD, Titulo, null);

        if (numPelis < 100) {
            Pelis[numPelis] = Pelisstas;
            numPelis++;
            System.out.println("Película agregada con éxito.");
            Pelisstas.mostrarInfoPelicula();
        } else {
            System.out.println("No hay espacio para agregar más películas.");
        }
    }



    public static void AlquilerPelicula (Scanner sc) {

    for (int i = 0; i < Pelis.length; i++) {
        System.out.println("Peliculas: " + Pelis[i]);
    }
    }





            public VideoDaw(String CIF, String Direccion) {
                    this.CIF = CIF;
                    this.Direccion = Direccion;
                    this.FechaAlta = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    // this.PeliculasRegistradas = new PeliculasRegistradas[100];


            }

            public String getCIF() {
                return CIF;
            }

            public String getDireccion() {
                return Direccion;
            }


            public void MostrarVideoClub() {
                System.out.println("\nCIF: " + CIF + "\nDireccion" + Direccion + "\nFecha de alta: " + FechaAlta);
            }



            
}