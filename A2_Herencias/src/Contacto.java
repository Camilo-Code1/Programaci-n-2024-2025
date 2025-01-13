public class Contacto{

        private String nombre;
        private int telefono;

public Contacto(String nombre, int telefono) {
    this.nombre = nombre;
    this.telefono = telefono;
}

    public String getnombre(){
        return nombre;
    }
    public int gettelefono(){
        return telefono;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nContacto"); 
        sb.append("\nNombre: ").append(getnombre());
        sb.append("\nTelefono:").append(gettelefono());
        
        return sb.toString();
    }


}           // MAIN
