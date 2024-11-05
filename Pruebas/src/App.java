public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("");
           System.out.println("Hello, World!");
        System.out.println("");

           Instrucciones uu = new Instrucciones ("Juan", "Joaquin");

           System.out.println(uu.getNombre());
           System.out.println(uu.getApellido());
        System.out.println("");


            System.out.println("Por favor, inserte su nombre");
              int edad = uu.getedad();

              System.out.println(edad);
    }
}
