import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static List<Libro> libros = new ArrayList<>(); // lista de libros
    Scanner sc = new Scanner(System.in);

    

    public static void main(String[] args) {
        int opcion = 0;

        String menu = "1. Crear libro y registrarlo en la biblioteca\r\n" +
                      "2. Mostrar libros existentes\r\n" +
                      "3. Eliminar libro \r\n" +
                      "4. Guardar libro \r\n" +
                      "5. Guardar y salir";

        do {            
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("-----------------------------------------------------------------");
                System.out.println(menu);
                System.out.println("-----------------------------------------------------------------");

                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        crearLibro();
                        break;

                    case 2:
                        lecturaArchivo();
                        break;

                    case 3:
                        eliminarLibro();
                        break;

                    case 4:
                        guardarInfor();
                        break;

                    case 5:
                        guardarInfor();
                        System.out.println("Saliendo del programa");
                        break;

                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }

            } catch (InputMismatchException e) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Error: Debe introducir un valor numérico");
                sc.next(); // Limpiar el buffer
            }
        } while (opcion != 5);
    }

    public static void crearLibro() {
        Scanner sc = new Scanner(System.in);
        String isbn;
        boolean isbnUnico;
        LocalDate fechaPublicacion = null;
        
                do {
                    System.out.println("Inserte el ISBN del libro (No se pueden repetir, formato x-xxxxxx-xxxxxx): ");
                   isbn = sc.next(); 
                    isbnUnico = validarISBN(isbn) && !isbnExistente(isbn); 
    
            if (!isbnUnico) {
                System.out.println("ISBN no aceptado o ya existe. Intente de nuevo.");
            }
        } while (!isbnUnico);
    
        System.out.println("Inserte el Titulo del libro: ");
        String titulo = sc.next();
    
        System.out.println("Inserte el nombre del autor del libro: ");
        String autor = sc.next();


        
        while (fechaPublicacion == null) {
    
        System.out.println("Ingrese la fecha de publicación del libro (dd/MM/yyyy): ");
        String fechaSinProcesar = sc.next();
        try {
            fechaPublicacion = LocalDate.parse(fechaSinProcesar, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    } catch (DateTimeParseException e) {
        System.out.println("Fecha invalida");
    }
    }
        libros.add(new Libro(isbn, titulo, autor, fechaPublicacion)); 
        System.out.println("\n¡Información guardada con éxito!");
    }
    

    public static void guardarInfor() {
        try (FileOutputStream archi = new FileOutputStream(".\\Resources\\Biblioteca.dat", false);
             ObjectOutputStream oos = new ObjectOutputStream(archi)) {
            for (Libro libro : libros) {
                oos.writeObject(libro);
            }
            System.out.println("\n¡Información guardada con éxito!");
        } catch (IOException e) {
            System.out.println("Error al guardar la información: " + e.getMessage());
        }
    }

    public static void lecturaArchivo() {
        libros.clear(); // Limpiar la lista antes de leer
        try (FileInputStream archi = new FileInputStream(".\\Resources\\Biblioteca.dat");
             ObjectInputStream reader = new ObjectInputStream(archi)) {
            while (true) { // Bucle infinito, se romperá con EOFException
                Libro aLibro = (Libro) reader.readObject();
                libros.add(aLibro);
            }
        } catch (EOFException e) {
            System.out.println("\nLeyendo archivo...");
            System.out.println("");
        } catch (IOException e) {
            System.out.println("Error al leer la información: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error al leer la información: " + e.getMessage());
        }

        // Mostrar los libros leídos
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public static void eliminarLibro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el ISBN del libro a eliminar: ");
        String isbn = sc.next();

        boolean libroEncontrado = false;

        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getIsbn().equals(isbn)) {
            
                libros.remove(i);
                libroEncontrado = true;
                System.out.println("\n¡El libro ha sido eliminado con exito!");
                break;
            }
        }

        if (!libroEncontrado) {
            System.out.println("No se encontró el libro");
        }
        guardarInfor();
    }

    public static boolean validarISBN(String isbn) {
        final String validarISBN = "^[0-9]{1}-[0-9]{6}-[0-9]{6}$";
        return Pattern.matches(validarISBN, isbn);
    }

    public static boolean isbnExistente(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) { // Comparar ISBN como String
                return true; // ISBN ya existe
            }
        }
        return false; // ISBN no existe
    }
    

}