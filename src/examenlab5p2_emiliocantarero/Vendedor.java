package examenlab5p2_emiliocantarero;

import java.util.ArrayList;


public class Vendedor extends Usuario{
    private double dineroGanado;
    private float estrellas;
    ArrayList<Videojuego> juegos=new ArrayList();
    ArrayList<Videojuego> vendidos=new ArrayList();
    private CuentaBancaria cuenta=new CuentaBancaria();

    public Vendedor() {
        super();
    }

    public Vendedor(double dineroGanado, float estrellas, CuentaBancaria cuenta, String nombre, String nUsuario, String contraseña, int edad) {
        super(nombre, nUsuario, contraseña, edad);
        this.dineroGanado = dineroGanado;
        this.estrellas = estrellas;
        this.cuenta=cuenta;
    }

    

    public double getDineroGanado() {
        return dineroGanado;
    }

    public void setDineroGanado(double dineroGanado) {
        this.dineroGanado = dineroGanado;
    }

    public float getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(float estrellas) {
        this.estrellas = estrellas;
    }

    public ArrayList<Videojuego> getJuegos() {
        return juegos;
    }

    public void setJuegos(ArrayList<Videojuego> juegos) {
        this.juegos = juegos;
    }

    public ArrayList<Videojuego> getVendidos() {
        return vendidos;
    }

    public void setVendidos(ArrayList<Videojuego> vendidos) {
        this.vendidos = vendidos;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }
    
    
}
