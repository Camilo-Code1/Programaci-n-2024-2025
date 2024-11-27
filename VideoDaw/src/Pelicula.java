import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pelicula {

           private String COD;
           private String Titulo;
           private String Genero; 
           private String FechadeRegistro;
           private String FechadeBaja;
           private String FechadeAlquiler;
           private boolean IsAlquilada;

        public Pelicula(String COD, String Titulo, String Genero) {
            this.COD = COD;
            this.Titulo = Titulo;
            this.Genero = Genero;
            this.FechadeRegistro = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            this.FechadeBaja = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            this.FechadeAlquiler = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            this.IsAlquilada = false; // Estado de pelicula, si esta alquilada o no (De normal no esta por lo tanto lo puse en false)

        }










}
