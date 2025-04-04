import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static LinkedList<Producto> productos = new LinkedList<>();

    public static void main(String[] args) {
        cargarProductosDesdeCSV();
        cargarProductosDesdeDAT();
        mostrarProductos(); 
        mostrarMenu();
    }

    private static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenu: ");
            System.out.println("1. Mostrar Productos en el Inventario");
            System.out.println("2. Eliminar Producto por referencia - Ejemplo(ref-001)");
            System.out.println("3. Guardar y Salir");
            System.out.print("\nSelecciona una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    mostrarProductos();

                    break;
                case 2:
                    System.out.print("\nIntroduce la referencia del producto para eliminarlo: ");
                    String referencia = scanner.nextLine();
                    eliminarProductoPorReferencia(referencia);

                    break;
                case 3:
                    guardarProductos(); 
                    System.out.println("\nProductos guardados \nSaliendo del Menu");

                    break;
                default:
                    System.out.println("\nOpcion no valida, Intentalo de nuevo");
            }
        } 
        while (opcion != 3);
    }

    private static void cargarProductosDesdeCSV() {
        try (BufferedReader reader = new BufferedReader(new FileReader("./resource/productos.csv"))) {
            String linea;
            
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(","); 
                
                if (datos.length == 4) {  
                    Producto p = new Producto(datos[0], datos[1], datos[2], datos[3], 0, 0.0, 0, 0, false);
                    productos.add(p);
                    System.out.println("\nProducto cargado desde el CSV: " + p); 
                }    
            }
        } catch (IOException e) {
            System.out.println("\nError al leer el archivo CSV: " + e.getMessage());
        }
    }

    private static void cargarProductosDesdeDAT() {
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("./resource/almacen.dat"))) {
            int index = 0; 
            
            while (true) {
                int cantidad = dataInputStream.readInt();
                double precio = dataInputStream.readDouble();
                int descuento = dataInputStream.readInt();
                int iva = dataInputStream.readInt();
                boolean aplicarDto = dataInputStream.readBoolean();

                if (index < productos.size()) {
                    Producto p = productos.get(index); 
                    p.setCantidad(cantidad);
                    p.setPrecio(precio);
                    p.setDescuento(descuento);
                    p.setIva(iva);
                    p.setAplicarDto(aplicarDto);
                    index++; 
                } 
            }
        } 
        catch (IOException e) {
            System.out.println("\nError al leer el archivo DAT: " + e.getMessage());
        }
    }

    private static void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("\nNo hay productos en el inventario");
        } 
        
        else {
            System.out.println("\nProductos en el Inventario:");
            for (Producto p : productos) {
                System.out.println(p);
            }
        }
    }

    private static void eliminarProductoPorReferencia(String referencia) {
        boolean eliminado = productos.removeIf(p -> p.getReferencia().equals(referencia));
        if (eliminado) {
            System.out.println("\nProducto eliminado");
        } 
        
        else {
            System.out.println("\nProducto no encontrado");
        }
    }

    private static void guardarProductos() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./resource/productos.csv"))) {
            for (Producto p : productos) {
                writer.write(p.getReferencia() + "," + p.getNombre() + "," + p.getDescripcion() + "," + p.getTipo());
                writer.newLine();
            }
            System.out.println("Productos guardados en productos.csv");
        } 
        catch (IOException e) {
            System.out.println("Error al guardar el archivo CSV: " + e.getMessage());
        }

        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("./resource/almacen.dat"))) {
            for (Producto p : productos) {
                dataOutputStream.writeInt(p.getCantidad());
                dataOutputStream.writeDouble(p.getPrecio());
                dataOutputStream.writeInt(p.getDescuento());
                dataOutputStream.writeInt(p.getIva());
                dataOutputStream.writeBoolean(p.isAplicarDto());
            }
            System.out.println("Productos guardados en almacen.dat");
        } 
        catch (IOException e) {
            System.out.println("Error al guardar el archivo DAT: " + e.getMessage());
        }
    }
}