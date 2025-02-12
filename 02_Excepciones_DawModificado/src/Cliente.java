import java.time.LocalDate;

public class Cliente extends Persona{

    String telefono;
    String direccion;
    String email;

    public Cliente(String nombre, String DNI, LocalDate fechaNacimiento, String telefono, String direccion,
            String email) {
        super(nombre, DNI, fechaNacimiento);
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente [telefono=" + telefono + ", direccion=" + direccion + ", nombre=" + nombre + ", email=" + email
                + ", DNI=" + DNI + ", fechaNacimiento=" + fechaNacimiento + "]";
    }

    

    

}
