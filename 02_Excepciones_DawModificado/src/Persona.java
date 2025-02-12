
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona {
    
    String nombre;
    String DNI;
    LocalDate fechaNacimiento;

    public Persona(String nombre, String DNI, LocalDate fechaNacimiento) {
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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd:MM:yyyy");
        return fechaNacimiento.format(formatter);
    }

    
}
