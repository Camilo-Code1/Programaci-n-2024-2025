public class Instrucciones {

    private String Nombre;
    private String Apellido;
    private int edad;

    // Constructor

    public Instrucciones(String Nombre, String Apellido){
        this.Nombre  = Nombre;
        this.Apellido = Apellido;
        this.edad =  0;
    
        }

        // Propiedades

        public String getNombre(){
            return this.Nombre;

        }

        public String getApellido(){
            return this.Apellido;
        }

        public int getedad(){
            return this.edad;
        }

        public void setedad(int edad){
            if (edad  < 0){
                System.out.println("Error, por favor inserte una edad valida");

        } 
        else  {
            this.edad = edad;

        }

        }
}
