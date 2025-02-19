
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        
        String menu = "1. Crear producto\r\n" + //
                        "2. Mostrar productos existentes\r\n" + //
                        "3. Eliminar producto por codigo\r\n" + //
                        "4. Guardar productos en el fichero\r\n" + //
                        "5. Salir";


                        System.out.println(menu);
        

        try (FileWriter Archivo = new FileWriter("C:\\Users\\daw1.COMPU-S025\\Desktop\\imagew\\Archi2.txt", true); BufferedWriter Escritor = new BufferedWriter(Archivo); ) {
            Escritor.write("Tonto el que lo lea");
            Escritor.newLine();
            

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        List<Producto> productos = new LinkedList<>();

        // Lectura de fichero

        try (FileReader Archivo = new FileReader("C:\\Users\\daw1.COMPU-S025\\Desktop\\imagew\\Archi2.txt") ; BufferedReader Lector = new BufferedReader(Archivo); ) {
            String linea = Lector.readLine();
            while (linea != null) {

                String[] espacio = linea.split(",");
                Producto p = new Producto(espacio[0], espacio[1], Integer.parseInt(espacio[2]), Integer.parseInt(espacio[3]));

                productos.add(p);

                linea = Lector.readLine();                

            }

        } catch (IOException e) { 
            System.out.println("Error 2: " + e.getMessage());
        }

        for (Producto linea : productos) {
            System.out.println(linea);
        } 



}
}
