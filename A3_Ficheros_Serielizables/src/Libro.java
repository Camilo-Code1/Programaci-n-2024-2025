import java.io.Serializable;

 public class Libro implements Serializable {
    private static final long serialVersionUID = 1L;
    private String isbn; // 13 digitos
    private String titulo;
    private String autor;
    private int fechaPublicacion;

    public Libro(String isbn2, String titulo, String autor, int fechaPublicacion) {
        this.isbn = isbn2;
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




    public int getFechaPublicacion() {
        return fechaPublicacion;
    }




    public void setFechaPublicacion(int fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
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