import java.util.Scanner;
public class Agenda extends Contacto{

    private static int contarC;
            static Contacto[] contactos;
                        private Contacto contacto;
                        Scanner sc = new Scanner(System.in);
                
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
                    
            
                public static void agregarContacto (Scanner sc){
                        System.out.println("Ingrese el nombre de la persona: ");
                        String nombre = sc.nextLine();
                        System.out.println("Ingrese el numero telefonico de la persona: ");
                        String telefono = sc.nextLine();
                        sc.nextLine();
                        Contacto contacto = new Contacto(nombre, telefono);
            
                    if (contarC < 10) {
                            contactos[contarC] = contacto;
                contarC++;
                System.out.println("Persona agregada con exito");
                contacto.toString();
        }
        else {
            System.out.println("No hay espacio para agregar mas contactos");

        }
    }

            


}   // MAIN

