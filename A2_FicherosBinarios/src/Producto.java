import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Producto {

    int cod;
    String nombre;
    int cantidad;
    double precio;

    static List<Producto> productos = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    
    public Producto(int cod, String nombre, int cantidad, double precio) {
        this.cod = cod;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }


    public int getCod() {
        return cod;
    }


    public void setCod(int cod) {
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



    public static void guardarInformación(){
        try (FileOutputStream archivo = new FileOutputStream(".\\resources\\almacen.dat"); 
        DataOutputStream datos = new DataOutputStream(archivo)) {
            for (Producto producto : productos) {
                datos.writeInt(producto.getCod());
                datos.writeUTF(producto.getNombre());  
                datos.writeInt(producto.getCantidad());
                datos.writeDouble(producto.getPrecio());
        } 
        System.out.println("Informacion guardada correctamente.");

    } catch (Exception e) {
        System.out.println("Error al guardar la información: " + e.getMessage());
    }
    }


    public static void agregarProducto() {

        sc.nextLine();
        System.out.println("Ingrese el codigo del producto: ");
        int cod = sc.nextInt();

        System.out.println("Nombre del producto: ");
        String nombre = sc.next();

        System.out.println("Cantidad del producto: ");
        int cantidad = sc.nextInt();

        System.out.println("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        productos.add(new Producto(cod, nombre, cantidad, precio));
        System.out.println("Producto añadido con exito.");
    }

    public static void eliminarProducto() {
        System.out.println("Ingrese el codigo del producto a eliminar: ");
        int cod = sc.nextInt();

        boolean prodEncontrado = false;

        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCod() == cod) {
                productos.remove(i);
                prodEncontrado = true;
                System.out.println("Producto eliminado con exito");
                break;
            }
        }

        if (!prodEncontrado) {
            System.out.println("No se encontró el producto");
        }
    }

    public static void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos disponibles.");
            return;
        }
    
        for (Producto producto : productos) {
            System.out.println("Codigo: " + producto.getCod() +
                               ", Nombre: " + producto.getNombre() +
                               ", Cantidad: " + producto.getCantidad() +
                               ", Precio: " + producto.getPrecio());
        }
    }

    public static void cargarInformacion() {
        try (FileInputStream archivo = new FileInputStream(".\\resources\\almacen.dat");
             DataInputStream datos = new DataInputStream(archivo)) {
             
            while (true) {
                int cod = datos.readInt();
                String nombre = datos.readUTF();
                int cantidad = datos.readInt();
                double precio = datos.readDouble();
                
            
                productos.add(new Producto(cod, nombre, cantidad, precio));
            }
        } catch (Exception e) {
            // Captura la excepción de fin de archivo
            if (!(e instanceof java.io.EOFException)) {
                System.out.println("Error al leer la información: " + e.getMessage());
            }
        }
    }

} /// MAIIINNN
    



