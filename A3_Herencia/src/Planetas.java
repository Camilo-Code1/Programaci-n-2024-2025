public class Planetas extends Astros{
    private int distancia_sol;
    private int orbita_sol;
    private boolean tiene_satelites;

    public Planetas(int distancia_sol, int orbita_sol, boolean tiene_satelites, int rad) {
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
    public boolean  gettiene_satelites() {
        return tiene_satelites;
    }





}

