
import java.util.HashMap;
import java.util.Scanner;

public class Taller {
    private HashMap<String, Coche> coches;


        public Taller() {
            coches = new HashMap<>();
        }


        private boolean validarMatricula(String matricula) {
            if (matricula.length() != 7) {
                return false;
            }
            for (int i = 0; i < 4; i++) {
                if (!Character.isDigit(matricula.charAt(i))) {
                    return false;
                }
                }

            for (int i = 4; i < 7; i++) {
                if (!Character.isLetter(matricula.charAt(i))) {
                    return false;
            }
        }
            return true;
    }

            public void añadeElemento() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Introduce la matricula del coche: ");
                String matricula = scanner.nextLine().toUpperCase();

                if (!validarMatricula(matricula)) {
                    System.out.println("Matricula invalida. El formato de la matricula 1111AAA es obligatorio");
                    return;
                }
                if (coches.containsKey(matricula)) {
                    System.out.println("El coche con matricula " + matricula + " ya existe");
                    return;
                }

                System.out.println("Introduce el color del coche");
                String color = scanner.nextLine();

                System.out.println("Introduce el marca del coche");
                String marca = scanner.nextLine();

                Coche coche = new Coche(color, marca);
                coches.put(matricula, coche);
                System.out.println("Coche añadido con exito");

                
            }

            public void eliminarElemento() {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Introduce la matricula del coche que deseas eliminar: ");
                String matricula = scanner.nextLine().toUpperCase();

                if (coches.remove(matricula) !=null) {
                    System.out.println("Coche eliminado con exito");
                }

                else {
                    System.out.println("No existe un coche con la matricula " + matricula);
                    }
                }

            public void visualMatricula() {
                System.out.println("Lista de Matriculas: ");
                for (String matricula : coches.keySet()) {
                    System.out.println(matricula);
                }
            }

            public void visualCoches(){
                System.out.println("Lista de Coches");
                for (Coche coche : coches.values()){
                    System.out.println(coche);
                }
            }
            public void visualTaller() {
                System.out.println("Detalles de los coches en el taller: ");
                for (var entry : coches.entrySet()) {
                    System.out.println(entry.getKey() + " " + entry.getValue());
            }            
        }
    }
    

