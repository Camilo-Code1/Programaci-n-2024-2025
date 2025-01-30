
import java.util.LinkedList;


public class Agenda {
    private LinkedList <Contacto> linkeado = new LinkedList<>();
    Contacto contacto;

    public boolean añadirContacto (Contacto c) {
        if (linkeado.add(c)) {
            return false;
        }
        linkeado.add(c);
        return true;
    }

    public boolean eliminarContacto (String nombre) {
        for (Contacto contacto : linkeado) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                linkeado.remove(contacto);
                return true;
                }
            }
            return false;
         }


    public void numeroContactos () {
        System.out.println("El número de contactos es: " + linkeado.size());
     }    

     public void listaContactos() {
        if (linkeado.isEmpty()) {
            System.out.println("No hay contactos en la agenda");
            return;
        }
        for (Contacto contacto : linkeado) {
            System.out.println("Nombre: " + contacto.getNombre() + ", Teléfono: " + contacto.getTelefono() + ", Correo: " + contacto.getCorreo());
     }
    }



        public int buscarContacto (String nombre) {
            int index = 0;
            for (Contacto contacto : linkeado) {
                if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                    return index;
                    }
                    index++;
                    }
                    return -1;
                }
            }



