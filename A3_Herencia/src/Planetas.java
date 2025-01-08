public class Planetas extends Astros{
    private int distancia_sol;
    private int orbita_sol;
    private boolean tiene_satelites;

    public Planetas(String radio_ecuatorial, String rotacion_sobre_eje, String temperatura_media, String gravedad, int distancia_sol, int orbita_sol, boolean tiene_satelites) {
        
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

// @Override
// public String MostrarInfoPla() {
//     info += "Expediente: " + this.getdistancia_sol() + "\nOrbita sol" + this.orbita_sol + "\nTiene satelites: " + this.tiene_satelites + "\n";
//     return info;

@Override
public String toString() {
    return String.format("Planetas [distancia_sol=%d, orbita_sol=%b, tiene_satelites=%b, %s]",
    distancia_sol, orbita_sol, tiene_satelites, super.toString());
}


}

