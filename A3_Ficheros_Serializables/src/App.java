import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


         Scanner sc = new Scanner(System.in);

        int opcion = 0;
        
        String menu = "1. Crear libro y registrarlo en la biblioteca\r\n" + //
                        "2. Mostrar libros existentes\r\n" + //
                        "3. Eliminar libro \r\n" + //
                        "4. Guardar libro \r\n" + //
                        "5. Guardar y salir";

        do { 
            
            try {

                System.out.println("-----------------------------------------------------------------");
                System.out.println(menu);
                System.out.println("-----------------------------------------------------------------");
    
                opcion = sc.nextInt();
    
                
            switch (opcion) {
                case 1:
                Libro.crearLibro();
                break;
    
                case 2:
                Libro.lecturaArchivo();
                break;
    
                case 3: 
                // Implementar
                break;
    
                case 4:
                Libro.guardarInfor();
                break;
    
                case 5: 
                System.out.println("Saliendo del programa");
                break;
            }
    
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe introducir un valor numerico");
            sc.next();
        }
    
        } while (opcion != 5);
    
    
    }
    
    }