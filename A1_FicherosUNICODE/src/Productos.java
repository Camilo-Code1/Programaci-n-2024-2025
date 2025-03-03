import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Productos {

    String cod;
    String nombre;
    int cantidad;
    double precio; 

    static List<Productos> productos = new LinkedList<>();
    private static Scanner sc = new Scanner(System.in);

    public Productos(String cod, String nombre, int cantidad, double precio) { // Cambiado de int a double
        this.cod = cod;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio; 
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() { 
        return precio;
    }

    public void setPrecio(double precio) { 
        this.precio = precio; 
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Productos: ");
        sb.append("Cod: ").append(cod).append("\n");
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Cantidad: ").append(cantidad).append("\n");
        sb.append("Precio: ").append(precio).append("\n"); 
        return sb.toString();
    }

    public static void guardarInformación() throws IOException {
        try (FileWriter Archivo = new FileWriter(".\\resources\\almacen.dat", true);
             BufferedWriter Escritor = new BufferedWriter(Archivo);) {

            for (Productos envio : productos) {
                String envioDatos = envio.getCod() + ", " + envio.getNombre() + ", " + envio.getCantidad() + ", " + envio.getPrecio();
                Escritor.write(envioDatos);
                Escritor.newLine();
            }
            System.out.println("Información guardada con éxito");
        } catch (IOException e) {
            System.out.println("Error al escribir datos: " + e.getMessage());
        }
    }

    public static void leerContenido() throws IOException {
        String Archivo = ".\\resources\\almacen.dat";

        try (
                FileInputStream ficher = new FileInputStream(Archivo);
                InputStreamReader lector = new InputStreamReader(ficher);
                BufferedReader Leer = new BufferedReader(lector);) {
            System.out.println("Contenido del archivo: ");

            String lin;
            while ((lin = Leer.readLine()) != null) {
                System.out.println(lin);
            }
        }
    }

    public static void añadirProducto() {
        System.out.println("Ingrese el codigo del producto: ");
        String cod = sc.nextLine();
        System.out.println("Nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.println("Cantidad del producto: ");
        int cantidad = sc.nextInt();
        System.out.println("Precio del producto: ");
        double precio = sc.nextDouble(); 

        productos.add(new Productos(cod, nombre, cantidad, precio)); 
    }

    public static void eliminarProducto() {
        System.out.println("Ingrese el codigo del producto a eliminar: ");
        String cod = sc.nextLine();

        boolean prodEncontrado = false;

        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCod().equals(cod)) {
                productos.remove(i);
                prodEncontrado = true;
                System.out.println("Producto eliminado con éxito");
                break;
            }
        }

        if (!prodEncontrado) {
            System.out.println("No se encontró el producto");
        }
    }
}