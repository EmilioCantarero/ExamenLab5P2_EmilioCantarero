package examenlab5p2_emiliocantarero;


public class CuentaBancaria {
    private double dinero;
    private int numeroCuenta;
    public CuentaBancaria() {
    }

    public CuentaBancaria(double dinero, int numeroCuenta) {
        this.dinero = dinero;
        this.numeroCuenta=numeroCuenta;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
}
