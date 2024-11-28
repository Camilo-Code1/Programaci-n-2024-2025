import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cliente {

         private String DNI;
         private String Nombre;
         private String NumSocio;
         private String Direccion;
         private String FechaNacimiento;
         private String FechaBaja;
         private int PeliculasAlquiladas;

            public Cliente (String DNI, String Nombre, String NumSocio, String Direccion, int PeliculasAlquiladas) {
                if  (DNICorrec(DNI) && !Nombre.isEmpty()) { 
                this.DNI = DNI;
                this.Nombre = Nombre;
                this.NumSocio = NumSocio;
                this.Direccion = Direccion;
                this.FechaNacimiento = FechaNacimiento;
                this.FechaBaja = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                this.PeliculasAlquiladas = 0;
            } else {
                System.out.println("\nDatos de cuenta invalidos.");
            }
        }
    
            private boolean DNICorrec(String DNI) {
                return DNI != null && DNI.matches("\\d{8}[A-Z]{1}");
            }
            }



