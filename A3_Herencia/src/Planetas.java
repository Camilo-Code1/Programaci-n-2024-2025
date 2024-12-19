public class Planetas extends Astros{
    private int distancia_sol;
    private int orbita_sol;
    private boolean tiene_satelites;

    public Planetas(int radio_ecuatorial, int rotacion_sobre_eje, int temperatura_media, int gravedad, int distancia_sol, int orbita_sol, boolean tiene_satelites) {
        super(radio_ecuatorial, rotacion_sobre_eje, temperatura_media, gravedad);
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


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
            sb.append("Planetas{");
            sb.append("Radio ecuatorial: ") .append(super.getRadio_ecuatorial());
            sb.append("Rotacion sobre su eje: ").append(super.rotacion_sobre_eje());
            sb.append("Temperatura media: ").append(super.temperatura_media());
            sb.append("Gravedad: ").append(super.gravedad());

            sb.append("}");
            return sb.toString();

    }


}

