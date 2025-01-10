public class Satelites extends Astros{
    private int distancia_planeta;
    private int orbita_planetaria;
    private String planeta_pertenece;

    public Satelites (double masa, int radio_ecuatorial, int rotacion_sobre_eje, int temperatura_media, int gravedad, int distancia_planeta, int orbita_planetaria, String planeta_pertenece) {
        super(radio_ecuatorial, rotacion_sobre_eje, temperatura_media, gravedad, masa);
        this.distancia_planeta = distancia_planeta;
        this.orbita_planetaria = orbita_planetaria;
        this.planeta_pertenece = planeta_pertenece;
    }

    public int getdistancia_planeta(){
        return this.distancia_planeta;
    }
    public int getorbita_planetaria(){
        return this.orbita_planetaria;
    }
    public String getplaneta_pertenece(){
        return this.planeta_pertenece;
    }


    @Override
    public String toString() {
        return String.format("\nSatelites: \nDistancia_planeta: %d \nOrbita planetaria: %s \nPlaneta al que pertenece: %s %s\n",
        distancia_planeta, orbita_planetaria, planeta_pertenece, super.toString());
    }
    }

