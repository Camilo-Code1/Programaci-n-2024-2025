// Subclase para contactos de personas

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ContactoPersona extends Contacto {
    private LocalDate cumpleanos;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public ContactoPersona(String nombre, String telefono, LocalDate cumpleanos) {
        super(nombre, telefono);
        this.cumpleanos = cumpleanos;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cumpleaños: " + cumpleanos + " Tipo de contacto: Personal"; 
    }
}

