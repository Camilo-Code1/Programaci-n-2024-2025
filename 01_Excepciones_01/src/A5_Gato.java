public class A5_Gato {

    String nombre;
    int edad;

    public A5_Gato (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getnombre(){
        return this.nombre;
    }

    public int getedad(){
        return this.edad;
    }


   



    @Override
        public String toString() {
            return "Nombre: " + nombre + ", Edad: " + edad;
        }
}
