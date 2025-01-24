
import java.util.Collections;
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
            System.out.println("\nProductos después de eliminar algunos: ");
                for (Producto n : productos) {
                    System.out.println(n.getNombre() + " " + n.getCantidad());
                    }

        // Insertar dato
            Producto p6 = new Producto("Esclavo tier 6", 70);
            productos.add(2, p6);
            System.out.println("\nProductos después de insertar un nuevo producto con iterator: ");
         
            // Muestra de datos con iterator           
            Iterator <Producto> iterar1 = productos.iterator();
            while (iterar1.hasNext()) {
                Producto cadaProducto1 = iterar1.next();
                System.out.println(cadaProducto1.getNombre() + " " + cadaProducto1.getCantidad());
            }

            // Ordenar lista por nombre
            Collections.sort(productos);
            System.out.println("\nProductos ordenados segun su nombre y su cantidad: ");
        for (Producto a : productos) {
            System.out.println(productos);
            break;
    }
    
    productos.clear();
    System.out.println("\nProductos despues de eliminar");
    if (productos.isEmpty()) {
      System.out.println("\nNo hay productos");
    } else {
      productos.clear();
      System.out.println("\nSe eliminaron los productos");
    }

    }


}
