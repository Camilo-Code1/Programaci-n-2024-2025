public class Satelites {
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

}
