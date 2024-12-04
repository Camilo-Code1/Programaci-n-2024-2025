import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VideoDaw {

        private String CIF;
        private String Direccion;
        private String FechaAlta;
        // private PeliculasRegistradas[] Pelicula;
        // private ClientesRegistrados[] Cliente;

            public VideoDaw(String CIF, String Direccion) {
                    this.CIF = CIF;
                    this.Direccion = Direccion;
                    this.FechaAlta = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    // this.PeliculasRegistradas = new PeliculasRegistradas[100];


            }

            public String getCIF() {
                return CIF;
            }

            public String getDireccion() {
                return Direccion;
            }


            public void MostrarVideoClub() {
                System.out.println("\nCIF: " + CIF + "\nDireccion" + Direccion + "\nFecha de alta: " + FechaAlta);
            }



            
}
