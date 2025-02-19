

public class Producto {

    String cod;
    String nombre;
    int cantidad;
    int precio;


    public Producto(String cod, String nombre, int cantidad, int precio) {
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


    public void setPrecio(int precio) {
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

    

    

}
