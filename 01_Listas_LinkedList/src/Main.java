
import java.util.Iterator;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args) throws Exception {

        LinkedList<Producto> productos = new LinkedList<>();

        productos.add(new Producto("Esclavo tier 4", 60));
        productos.add(new Producto("Esclavo tier 1", 10));
        productos.add(new Producto("Esclavo tier 3", 20));
        productos.add(new Producto("Esclavo tier 5", 50));
        productos.add(new Producto("Esclavo tier 2", 30));

      

        Iterator <Producto> iterar = productos.iterator();
        Producto cadaProducto;
        System.out.println("Productos iniciales: ");


        // Mostrar datos con Iterator
        while (iterar.hasNext()) {
            cadaProducto = iterar.next();
            System.out.println(cadaProducto.getNombre() + " " + cadaProducto.getCantidad());

         // Eliminar datos

            if (cadaProducto.getNombre().equals("Esclavo tier 4")) {
                iterar.remove();
                }
            if (cadaProducto.getNombre().equals("Esclavo tier 2")) {
                iterar.remove();
                }
            }
        // Muestra
            System.out.println("Productos después de eliminar algunos: ");
                for (Producto n : productos) {
                    System.out.println(n.getNombre() + " " + n.getCantidad());
                    }

        // Insertar dato
            productos.add(new Producto("Esclavo tier 6", 70));
            for (Producto n : productos) {
                System.out.println(n.getNombre() + " " + n.getCantidad());
                }

        }

    }

