
// Subclase para contactos de empresas
public class ContactoEmpresa extends Contacto {
    private String email;

    public ContactoEmpresa(String nombre, String telefono, String email) {
        super(nombre, telefono);
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString() + ", Email: " + email + " Tipo de contacto: Empresa";
    }
}