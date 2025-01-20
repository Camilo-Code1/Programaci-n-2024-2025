
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList <Producto> productos = new ArrayList<>(10); 


        productos.add(new Producto("\nMostaza", 20));
        productos.add(new Producto("Mayonesa", 30));
        productos.add(new Producto("Ketchup", 40));
        productos.add(new Producto("Aceite", 20));
        productos.add(new Producto("Sal", 40));
        productos.add(new Producto("Pimienta", 30));
        Producto p6 = new Producto("Pimienta", 30);


        Iterator <Producto> iterar = productos.iterator();  
        Producto cadaProducto;
        while (iterar.hasNext()) {
            cadaProducto = iterar.next();
            System.out.println(cadaProducto.getNombre() + " " + cadaProducto.getCantidad());

            if (cadaProducto.getNombre().equals("Pimienta")) {
                iterar.remove();
                }
            if (cadaProducto.getNombre().equals("Sal")) {
                    iterar.remove();
                    }
        }
                System.out.println("\nRecorrido después del borración");
                    for(Producto n : productos
                    ) {
                        System.out.println(n.getNombre() + " " + n.getCantidad());
            } 


            productos.add(1, p6);
            
        Iterator <Producto> iterar1 = productos.iterator();  
            while (iterar1.hasNext()) {
                cadaProducto = iterar1.next();
                System.out.println(cadaProducto.getNombre() + " " + cadaProducto.getCantidad());
            }
    }
}
