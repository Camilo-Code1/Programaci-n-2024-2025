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

            public String getCOD(){
            return COD; 
            }
            public String getTitulo(){
            return Titulo; 
            }
            public String getGenero(){
            return Genero; 
            }
            public String getFechadeRegistro(){
            return FechadeRegistro; 
            }
            public String getFechadeBaja(){
            return FechadeBaja; 
            }
            public String getFechadeAlquiler(){
            return FechadeAlquiler; 
            }
            public boolean getIsAlquilada(){
            return IsAlquilada; 
            }
            public void setFechadeBaja(String FechadeBaja){
            this.FechadeBaja = FechadeBaja; 
            }
            public void setFechadeAlquiler(String FechadeAlquiler){
            this.FechadeAlquiler = FechadeAlquiler; 
            }
            public void setIsAlquilada(boolean IsAlquilada){
            this.IsAlquilada = IsAlquilada; 
            }


            public void mostrarInfoPelicula() {
                System.out.println("\nCodigo: " + COD + 
                ", Titulo: " + Titulo + 
                ", Genero: " + Genero + 
                ", Fecha de registro: " + FechadeRegistro + 
                ", Fecha de baja: " + FechadeBaja + 
                ", Fecha de Alquiler: " + FechadeAlquiler + 
                ", Estado: " + IsAlquilada);            }
        
    }

        









