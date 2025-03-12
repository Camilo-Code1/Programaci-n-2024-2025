import java.io.Serializable;
import java.time.LocalDate;

 public class Libro implements Serializable {
    private static final long serialVersionUID = 1L;
    private String isbn; // 13 digitos
    private String titulo;
    private String autor;
    private LocalDate fechaPublicacion;

    public Libro(String isbn, String titulo, String autor, LocalDate fechaPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
    }



    
    public String getIsbn() {
        return isbn;
    }




    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }




    public String getTitulo() {
        return titulo;
    }




    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }




    public String getAutor() {
        return autor;
    }




    public void setAutor(String autor) {
        this.autor = autor;
    }




    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }



    @Override
    public String toString() {
        return "Libro: " +
                "ISBN: " + isbn +
                ", Titulo: '" + titulo + '\'' +
                ", Autor: '" + autor + '\'' +
                ", Fecha de publicacion: " + fechaPublicacion;
    }
}