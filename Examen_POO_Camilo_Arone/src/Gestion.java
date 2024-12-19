
import java.util.Scanner;

public class Gestion {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion;

        Empresa empresa = new Empresa(null, null);
        Trabajador Mostrar= new Trabajador(null, null, null, null);


        System.out.println("¡Bienvenido a Gestores empresas!");
        System.out.println("(Por favor, presione enter para continuar)");
        sc.nextLine();

        System.out.println("Por favor, introduzca el nombre de la empresa");
        String nomEmpresa = sc.nextLine();
        String CIF = Empresa.obtenerCIF(sc);
        
        String Presentacion = "\n¿En que podemos ayudarlo hoy " + nomEmpresa + "?" + "\r\n" +  //
        "\r\n" + //
        "1. Crear persona.\r\n" + //
        "2. Registrar trabajador en empresa.\r\n" + //
        "3. Mostrar informacion general de la empresa.\r\n" + //
        "4. Mostrar el numero de trabajadores actuales.\r\n" + //
        "5. Mostrar informacion de todos los trabajadores.\r\n" + //
        "6. Eliminar trabajador de la empresa.\r\n" + //
        "7. Eliminar persona del programa.\r\n" + //
        "8. Salir de la aplicacion.\n";
       
        do { 
            System.out.println("-----------------------------------------------");
            System.out.println(Presentacion);
            System.out.println("-----------------------------------------------");

            opcion = sc.nextInt();
            sc.nextLine();


            switch (opcion) {
                case 1:
                     // Implementar          
                    break;
                case 2:
                    Empresa.RegistrarTrabajador(sc);
                    break;
                case 3:
                    empresa.mostrarInfoEmpresas(); 
                    // Error de vinculacion. No registra nombres ni CIF para la empresa (¿Optar por imprimir las variables de esta clase directamente?¿Opcion correcta?)
                    break;
                case 4:
                    Empresa.mostrarNumTrabajadores(sc);
                    break;
                case 5:
                    Mostrar.mostrarInfoTrabajadores();
                    // Error de vinculacion. No registra los datos 
                    break;
                case 6:
                    // Implementar
                    break;
                case 7:
                     // Implementar
                    break;
                case 8:
                System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion !=8);



        
    }
}   // MAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIINNNNN
