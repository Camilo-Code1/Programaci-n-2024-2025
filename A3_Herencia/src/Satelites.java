public class Satelites extends Astros{
    private int distancia_planeta;
    private int orbita_planetaria;
    private String planeta_pertenece;

    public Satelites(int distancia_planeta, int orbita_planetaria, String planeta_pertenece) {
        this.distancia_planeta = distancia_planeta;
        this.orbita_planetaria = orbita_planetaria;
        this.planeta_pertenece = planeta_pertenece;
    }

    public int distancia_planeta(){
        return this.distancia_planeta;
    }
    public int orbita_planetaria(){
        return this.orbita_planetaria;
    }
    public String planeta_pertenece(){
        return this.planeta_pertenece;
    }


    @Override
    public String toString() {
        return String.format("Satelites [distancia_planeta=%d, orbita_planetaria=%b, planeta_pertenece=%b, %s]",
        distancia_planeta, orbita_planetaria, planeta_pertenece, super.toString());
    }
    }


