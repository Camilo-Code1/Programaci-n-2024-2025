
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Libro implements Serializable{

    private static final long serialVersionUID = 1L;

        public int isbn; // 13 digitos
        public String titulo;
        public String autor;
        public int fechaPublicacion;


        static List<Libro> libros = new ArrayList<Libro>(); // lista de libros
        private static Scanner sc = new Scanner(System.in);

        
        public Libro(int isbn, String titulo, String autor, int fechaPublicacion) {
            this.isbn = isbn;
            this.titulo = titulo;
            this.autor = autor;
            this.fechaPublicacion = fechaPublicacion;
        }


        public static long getSerialversionuid() {
            return serialVersionUID;
        }


        public int getIsbn() {
            return isbn;
        }


        public void setIsbn(int isbn) {
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
        StringBuilder sb = new StringBuilder();
        sb.append("Libro{");
        sb.append("isbn=").append(isbn);
        sb.append(", titulo=").append(titulo);
        sb.append(", autor=").append(autor);
        sb.append(", fechaPublicacion=").append(fechaPublicacion);
        sb.append('}');
        return sb.toString();
    }

        

    public static void crearLibro() {

        System.out.println("Inserte el ISBN del libro(No se pueden repetir): ");
        int isbn = sc.nextInt();

        System.out.println("Inserte el Titulo del libro: ");
        String titulo = sc.next();

        System.out.println("Inserte el nombre del autor del libro: ");
        String autor = sc.next();

        System.out.println("Ingrese la fecha de publicación del libro: ");
        int fechaPublicacion = sc.nextInt();

        libros.add(new Libro(isbn, titulo, autor, fechaPublicacion));
        System.out.println("Información guardada con exito");
        
    } 

    public static void guardarInfor () {
        try (FileOutputStream archi = new FileOutputStream(".\\Resources\\Biblioteca.dat", false); 
        ObjectOutputStream oos = new ObjectOutputStream(archi)) {
            for (Libro libro : libros) {
                oos.writeObject(libro.getIsbn());
                oos.writeObject(libro.getAutor());
                oos.writeObject(libro.getFechaPublicacion());             
                oos.writeObject(libro.getTitulo());
                } 
                System.out.println("Información guardada con exito");
    } catch (IOException e) {
        System.out.println("Error al guardar la información" + e.getMessage());
    }
}

    public static void lecturaArchivo () {

        boolean pasada = false;

        try (FileInputStream archi = new FileInputStream(".\\Resources\\Biblioteca.dat");
        ObjectInputStream reader = new ObjectInputStream(archi)) {
            while (!pasada){
                Libro aLibro = (Libro) reader.readObject();
                libros.add(aLibro);
            }            
    } catch (EOFException e) {
    pasada = true;
    System.out.println("Información leida con exito");
    
    } catch (IOException e) {
        System.out.println("Error al leer la información" + e.getMessage());
    } catch (ClassNotFoundException e) {
        System.out.println("Error al leer la información" + e.getMessage());
    }
    for (Libro libro : libros) {
        System.out.println(libro);
    }
 }
    
    
    }


