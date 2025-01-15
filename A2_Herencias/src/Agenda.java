public class Agenda extends Contacto{

    private static int contarC;
            Contacto[] contactos;
            private Contacto contacto;
         
    
        public Agenda(String nombre, String telefono, int contarC) {
            super(nombre, telefono);
            this.contarC = contarC;
        }
    
            public static int getContarC() {
                return contarC;
        }

    
    
        public static void setContarC(int contarC) {
            Agenda.contarC = contarC;
        }

        public Contacto[] geContactos(){
            return contactos;
        }
     
        public void setContactos(Contacto[] contactos) {
            this.contactos = contactos;
        }
        public void setContactos (Contacto contactos) {
            this.contacto = contacto;
        }
        

        public boolean agregarContacto (){
            if (contarC <contactos.length) {
                contactos[contarC] = contacto;
                contarC++;
                return true;
        }
        else {
            System.out.println("No hay más espacio para agregar mas contactos");
            return false;
        }
    }




}   // MAIN

