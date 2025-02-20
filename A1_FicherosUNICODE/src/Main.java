
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        String menu = "1. Crear producto\r\n" + //
                        "2. Mostrar productos existentes\r\n" + //
                        "3. Eliminar producto por codigo\r\n" + //
                        "4. Guardar productos en el fichero\r\n" + //
                        "5. Salir";


                       





        // INSERTAR INFORMACION

        // try (FileWriter Archivo = new FileWriter("C:\\Users\\daw1.COMPU-S025\\Desktop\\imagew\\Archi2.txt", true); BufferedWriter Escritor = new BufferedWriter(Archivo); ) {
        //     Escritor.write("Tonto el que lo lea");
        //     Escritor.newLine();
        //     Escritor.write("addddddddddddddddddddddddddddddaaaaaaaaaaaaaaaaaa");
            

        // } catch (IOException e) {
        //     System.out.println("Error: " + e.getMessage());
        // }

        // List<Producto> productos = new LinkedList<>();

        // // Lectura de fichero

        // try (FileReader Archivo = new FileReader("C:\\Users\\daw1.COMPU-S025\\Desktop\\imagew\\Archi2.txt") ; BufferedReader Lector = new BufferedReader(Archivo); ) {
        //     String linea = Lector.readLine();
        //     while (linea != null) {

        //         String[] espacio = linea.split(",");
        //         Producto p = new Producto(espacio[0], espacio[1], Integer.parseInt(espacio[2]), Integer.parseInt(espacio[3]));

        //         productos.add(p);

        //         linea = Lector.readLine();                

        //     }

        // } catch (IOException e) { 
        //     System.out.println("Error 2: " + e.getMessage());
        // }

        // for (Producto linea : productos) {
        //     System.out.println(linea);
        // } 


    try {
        System.out.println("Insete nsdk fkadsn el mnbonawern: ");
        String nombrePrue = sc.nextLine();
        String salida = "C:\\Users\\daw1.COMPU-S025\\Desktop\\imagew\\Archivo.txt";
        FileInputStream ficher = new FileInputStream(salida + nombrePrue + ".txt");
        InputStreamReader osw = new InputStreamReader(ficher);
        BufferedReader br = new BufferedReader(osw);
        while (br.ready()) {
            String lin = br.readLine();
            System.out.println(lin);
        }

    } catch (FileNotFoundException e) {
        System.out.println("Error 3: " + e.getMessage());
    }
    catch (IOException e) {
        System.out.println("Error 4: " + e.getMessage());
    }

}
}
