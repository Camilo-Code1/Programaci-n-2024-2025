import java.time.LocalDateTime;

public class Perros extends Mascotas{

private String raza;
boolean pulgas;

public Perros(String nombre, int edad, String estado, LocalDateTime FechaDeNacimiento, String raza, boolean pulgas){

    super(nombre, edad, estado, FechaDeNacimiento);
    this.raza = raza;
    this.pulgas= false;

}

    public String getraza(){
        return raza;

 
    }

    @Override
    public String toString() {
        return String.format("\nPerros: \nRazas: %s \nTiene pulgas: %b\n",
        raza, pulgas, super.toString());
    }

}