public class Producto {

    String referencia;
    String descripcion;
    String tipo;
    int cantidad;
    double precio;
    int descuento;
    int iva;
    boolean aplicarDTO;


public Producto(String referencia, String descripcion, String tipo, int cantidad, double precio, int descuento, int iva, boolean aplicarDTO) {

    this.referencia = referencia;
    this.descripcion = descripcion;
    this.tipo = tipo;
    this.cantidad = cantidad;
    this.precio = precio;
    this.descuento = descuento;
    this.iva = iva;
    this.aplicarDTO = aplicarDTO;

}

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public boolean isAplicarDTO() {
        return aplicarDTO;
    }

    public void setAplicarDTO(boolean aplicarDTO) {
        this.aplicarDTO = aplicarDTO;
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("referencia=").append(referencia);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", tipo=").append(tipo);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", precio=").append(precio);
        sb.append(", descuento=").append(descuento);
        sb.append(", iva=").append(iva);
        sb.append(", aplicarDTO=").append(aplicarDTO);
        sb.append('}');
        return sb.toString();
    }




    


}
