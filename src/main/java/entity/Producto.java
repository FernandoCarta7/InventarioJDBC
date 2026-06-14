package entity;

import java.util.UUID;

public class Producto {


    private UUID idProducto;
    private String nombre;
    private int cantidad;
    private double precio;
    private UUID categoria;

    public Producto(){}

    public Producto(UUID idProducto, String nombre, int cantidad, double precio, UUID categoria) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.categoria = categoria;
    }

    public Producto(String nombre, int cantidad, double precio, UUID categoria) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.categoria = categoria;
    }

    public UUID getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(UUID idProducto) {
        this.idProducto = idProducto;
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

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public UUID getCategoria() {
        return categoria;
    }

    public void setCategoria(UUID categoria) {
        this.categoria = categoria;
    }
}
