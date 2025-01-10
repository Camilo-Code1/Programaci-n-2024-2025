public class Planetas extends Astros{
    private int distancia_sol;
    private int orbita_sol;
    private boolean tiene_satelites;

    public Planetas(double masa, int radio_ecuatorial, int rotacion_sobre_eje, int temperatura_media, int gravedad, int distancia_sol, int orbita_sol, boolean tiene_satelites) {
        
        super(radio_ecuatorial, rotacion_sobre_eje, temperatura_media, gravedad, masa);
        this.distancia_sol = distancia_sol;
        this.orbita_sol = orbita_sol;
        this.tiene_satelites = tiene_satelites;
    }

    public int getdistancia_sol() {
        return distancia_sol;
    }
    public int getorbita_sol() {
        return orbita_sol;
    }
    public boolean settiene_satelites() {
        return tiene_satelites;
    }


@Override
public String toString() {
    return String.format("\nPlanetas: \nDistancia del sol: %d \nOrbita del sol: %s \nTiene satelites: %b, %s\n",
    distancia_sol, orbita_sol, tiene_satelites, super.toString());
}


}
