
import java.util.Iterator;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        LinkedList<Producto> productos = new LinkedList<>();

        productos.add(new Producto("P4", 40));
        productos.add(new Producto("P1", 10));
        productos.add(new Producto("P2", 20));
        productos.add(new Producto("P5", 50));
        productos.add(new Producto("P3", 30));

        // for (Producto n : productos) {
        //     System.out.println(n.getNombre() + " " + n.getCantidad());
        // }

        Iterator <Producto> iterar = productos.iterator();
        Producto cadaProducto;
        System.out.println("Productos iniciales: ");

        while (iterar.hasNext()) {
            cadaProducto = iterar.next();
            System.out.println(cadaProducto.getNombre() + " " + cadaProducto.getCantidad());

            // if (cadaProducto.getNombre().equals(productos));



        }






    }
}
