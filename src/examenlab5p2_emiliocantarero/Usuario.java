package examenlab5p2_emiliocantarero;


public class Usuario {
    private String nombre, nUsuario, contraseña;
    private int edad;

    public Usuario(String nombre, String nUsuario, String contraseña, int edad) {
        this.nombre = nombre;
        this.nUsuario = nUsuario;
        this.contraseña = contraseña;
        this.edad = edad;
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnUsuario() {
        return nUsuario;
    }

    public void setnUsuario(String nUsuario) {
        this.nUsuario = nUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", nUsuario=" + nUsuario + ", contrase\u00f1a=" + contraseña + ", edad=" + edad + '}';
    }
    
}
