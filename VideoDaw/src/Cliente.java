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

                this.DNI = DNI;
                this.Nombre = Nombre;
                this.NumSocio = NumSocio;
                this.Direccion = Direccion;
                this.FechaNacimiento = FechaNacimiento;
                this.FechaBaja = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                this.PeliculasAlquiladas = 0;
            
            }


}
