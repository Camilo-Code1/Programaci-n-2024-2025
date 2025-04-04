package com.decroly;

public class Producto {
    private int id;
    private String referencia;
    private String nombre;
    private String descripcion;
    private int tipoId; // ID de la tabla de tipos
    private int cantidad;
    private double precio;
    private int descuento;
    private int iva;
    private boolean aplicarDto;

    // Constructor por defecto
    public Producto() {
    }

    // Constructor con todos los parámetros
    public Producto(int id, String referencia, String nombre, String descripcion, int tipoId, 
                    int cantidad, double precio, int descuento, int iva, boolean aplicarDto) {
        this.id = id;
        this.referencia = referencia;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoId = tipoId;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descuento = descuento;
        this.iva = iva;
        this.aplicarDto = aplicarDto;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getTipoId() {
        return tipoId;
    }

    public void setTipoId(int tipoId) {
        this.tipoId = tipoId;
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

    public boolean isAplicarDto() {
        return aplicarDto;
    }

    public void setAplicarDto(boolean aplicarDto) {
        this.aplicarDto = aplicarDto;
    }

    @Override
    public String toString() {
        return "\nProducto[" +
                "ID: " + id +
                " Referencia:'" + referencia + '\'' +
                " Nombre: '" + nombre + '\'' +
                " Descripcion: '" + descripcion + '\'' +
                " Tipo ID: " + tipoId +
                " Cantidad: " + cantidad +
                " Precio: " + precio +
                " Descuento: " + descuento +
                " IVA: " + iva +
                " Aplicar Descuento: " + aplicarDto +
                ']';
    }
}