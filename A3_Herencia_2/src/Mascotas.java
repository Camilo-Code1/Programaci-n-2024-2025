import java.time.LocalDateTime;

public abstract  class Mascotas {

    private String nombre; 
    int edad;
    private String estado;        
    private LocalDateTime FechaDeNacimiento;

    public Mascotas(String nombre, int edad, String estado, LocalDateTime FechaDeNacimiento){
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.FechaDeNacimiento = FechaDeNacimiento;
    }

    public String getnombre(){
        return nombre;
    }

    public int getedad(){
        return edad;
    }

    public String getestado(){
        return estado;
    }

    public LocalDateTime getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }


    @Override
    public String toString() {  // Muestra
        StringBuilder sb = new StringBuilder();
        sb.append("\nMascotas: \n");
        sb.append("\nNombre de la mascota: ").append(getnombre());
        sb.append("\nEdad de la mascota: ").append(getedad());
        sb.append("\nEstado de la mascota: ").append(getestado());
        sb.append("\nFecha de nacimiento de la mascota: ").append(getFechaDeNacimiento());
        
        return sb.toString();
    }




}       // Main 