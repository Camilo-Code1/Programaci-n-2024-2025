
import java.time.LocalDate;

public class Trabajador {
        private String Nombre;
        private LocalDate fechaNacimiento;
        private String DNI;
        private String Direccion;
        private String numeroSS;

        public Trabajador(String Nombre, String DNI, String Direccion, String numeroSS){
            this.Nombre = Nombre;
            this.DNI = DNI;
            this.Direccion = Direccion;
            this.numeroSS = numeroSS;

        }

        public String getNombre(){
            return Nombre;
        }
        public LocalDate getfechaNacimiento(){
            return fechaNacimiento;
        }

        public String getDNI(){
            return DNI; 
        }

        public String getDireccion(){
            return Direccion;
        }

        public String getnumeroSS(){
            return numeroSS;
        }


        public void mostrarInfoTrabajadores() {
            System.out.println("\nNombre: " + Nombre +
            ", DNI: " + DNI + 
            ", Direccion: " + Direccion + 
            ", Numero de seguridad social: " + numeroSS);
        }

}
