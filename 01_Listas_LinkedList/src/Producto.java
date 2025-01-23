import java.util.Objects;

public class Producto implements Comparable<Producto> {

    String nombre;
    int cantidad;

    public Producto(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre(){
        return nombre;
    }
    public int getCantidad(){
        return cantidad;
    }

    @Override
    public int compareTo(Producto p) {
        return Integer.compare(this.cantidad, p.getCantidad());
    }

    @Override 
    public boolean equals(Object obj) {
        if (this == obj)
        return true;
        if (obj == null || getClass() != obj.getClass())
        return false;
        Producto producto = (Producto) obj;
        return cantidad == producto.cantidad && Objects.equals(nombre, producto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, cantidad);
        }
    @Override
    public String toString() {
        return String.format("Producto: \n%s " + "\nCantidad: %d", nombre, cantidad);
    }
}
