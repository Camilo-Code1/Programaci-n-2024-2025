public class Producto {

    String referencia;
    String nombre;
    String descripcion;
    String cantidad;
    String tipo;

    double precio;
    int descuento;
    int IVA;
    boolean aplicarDto;




    public Producto(String referencia, String nombre, String descripcion, String cantidad, String tipo, double precio,
            int descuento, int iVA, boolean aplicarDto) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.precio = precio;
        this.descuento = descuento;
        IVA = iVA;
        this.aplicarDto = aplicarDto;
    }




    public String getReferencia() {
        return referencia;
    }




    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }




    public String getNombre() {
        return nombre;
    }




    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




    public String getDescripcion() {
        return descripcion;
    }




    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




    public String getCantidad() {
        return cantidad;
    }




    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }




    public String getTipo() {
        return tipo;
    }




    public void setTipo(String tipo) {
        this.tipo = tipo;
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




    public int getIVA() {
        return IVA;
    }




    public void setIVA(int iVA) {
        IVA = iVA;
    }




    public boolean isAplicarDto() {
        return aplicarDto;
    }




    public void setAplicarDto(boolean aplicarDto) {
        this.aplicarDto = aplicarDto;
    }


    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("referencia=").append(referencia);
        sb.append(", nombre=").append(nombre);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", tipo=").append(tipo);
        sb.append(", precio=").append(precio);
        sb.append(", descuento=").append(descuento);
        sb.append(", IVA=").append(IVA);
        sb.append(", aplicarDto=").append(aplicarDto);
        sb.append('}');
        return sb.toString();
    }

    
    

    


}
