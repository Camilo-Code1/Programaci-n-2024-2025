public class Agenda extends Contacto {

    private String anadirContacto;
    private String eliminarContacto;
    private String existeContacto;
    private String buscarContacto;

    public Agenda(String nombre, int telefono, String anadirContacto, String eliminarContacto, String existeContacto, String buscarContacto) {
        super(nombre, telefono);
        this.anadirContacto = "AnadirContacto";
        this.eliminarContacto = "EliminarContacto";
        this.existeContacto = "ExisteContacto";
        this.buscarContacto = "BuscarContacto";
    }

        public String getanadirContacto(){
            return anadirContacto;
        }
        public String geteliminarContacto(){
            return eliminarContacto;
        }
        public String getexisteContacto(){
            return existeContacto;
        }
        public String buscarContacto(){
            return buscarContacto;
        }



}   // MAIN

