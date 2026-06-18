package entity;


public class Producto {


    private long idProducto;
    private String nombre;
    private int cantidad;
    private double precio;
    private long idDategoria;

    public Producto(){}

    public Producto(long idProducto, String nombre, int cantidad, double precio, long categoria) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.idDategoria = categoria;
    }

    public Producto(String nombre, int cantidad, double precio, long categoria) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.idDategoria = categoria;
    }

    public long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(long idProducto) {
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

    public long getIdDategoria() {
        return idDategoria;
    }

    public void setIdDategoria(long idDategoria) {
        this.idDategoria = idDategoria;
    }
}
