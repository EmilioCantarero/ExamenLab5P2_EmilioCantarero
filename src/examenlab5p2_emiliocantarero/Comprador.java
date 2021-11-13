package examenlab5p2_emiliocantarero;

import java.util.ArrayList;


public class Comprador extends Usuario{
    private CuentaBancaria cuenta;
    private double dineroDisp;
    ArrayList<Videojuego>juegos=new ArrayList();

    public Comprador() {
        super();
    }

    public Comprador(CuentaBancaria cuenta, double dineroDisp, String nombre, String nUsuario, String contraseña, int edad) {
        super(nombre, nUsuario, contraseña, edad);
        this.cuenta = cuenta;
        this.dineroDisp = dineroDisp;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    public double getDineroDisp() {
        return dineroDisp;
    }

    public void setDineroDisp(double dineroDisp) {
        this.dineroDisp = dineroDisp;
    }

    public ArrayList<Videojuego> getJuegos() {
        return juegos;
    }

    public void setJuegos(ArrayList<Videojuego> juegos) {
        this.juegos = juegos;
    }
    
}
