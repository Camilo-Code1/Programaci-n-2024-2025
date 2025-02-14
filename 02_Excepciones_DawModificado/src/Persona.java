

public class Persona {
    
    String nombre;
    String DNI;
    String fechaNacimiento;

    public Persona(String nombre, String DNI, String fechaNacimiento) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

  

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    
}