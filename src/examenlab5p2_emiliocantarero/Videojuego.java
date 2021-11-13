package examenlab5p2_emiliocantarero;


public class Videojuego {
    private String nombre;
    private int año;
    private int cantidad;
    private float precio;

    public Videojuego(String nombre, int año, int cantidad, float precio) {
        this.nombre = nombre;
        this.año = año;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Videojuego() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}
