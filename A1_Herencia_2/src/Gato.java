import java.time.LocalDateTime;

public class Gato extends Mascotas {

    private String color;
    private boolean  peloLargo;

    public Gato(String nombre, int edad, String estado, LocalDateTime FechaDeNacimiento, String color, boolean  peloLargo){
        super(nombre, edad, estado, FechaDeNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    public String getcolor(){
        return this.color;
    }

    @Override
    public String toString() {
        return String.format("\nGato: \nColor=%s \nPelo largo=%b",
                super.toString(), color, peloLargo);
    }
    




} // MAIN
