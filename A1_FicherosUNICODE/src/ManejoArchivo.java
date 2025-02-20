import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ManejoArchivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Inserte el nombre del archivo (sin extensión): ");
            String nombrePrue = sc.nextLine();
            String salida = "C:\\Users\\daw1.COMPU-S025\\Desktop\\imagew\\";
            String rutaArchivo = salida + nombrePrue + ".txt";

            // Crear el archivo si no existe
            File archivo = new File(rutaArchivo);
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe. Se añadirá información.");
            }

            // Pedir al usuario que ingrese información para agregar al archivo
            System.out.println("Ingrese la información que desea agregar al archivo:");
            String informacion = sc.nextLine();

            // Escribir en el archivo (anexar)
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
                writer.write(informacion);
                writer.newLine(); // Agregar una nueva línea
            }

            System.out.println("Información añadida al archivo.");

            // Leer y mostrar el contenido del archivo
            System.out.println("Contenido del archivo:");
            try (FileInputStream ficher = new FileInputStream(archivo);
                 InputStreamReader osw = new InputStreamReader(ficher);
                 BufferedReader br = new BufferedReader(osw)) {

                String lin;
                while ((lin = br.readLine()) != null) {
                    System.out.println(lin);
                }
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close(); // Cerrar el Scanner
        }
    }
}