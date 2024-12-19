public class Satelites extends Astros{
    private int distancia_planeta;
    private int orbita_planetaria;
    private String planeta_pertenece;

    public Satelites(int distancia_planeta, int orbita_planetaria, String planeta_pertenece) {
        super(orbita_planetaria, distancia_planeta, orbita_planetaria, orbita_planetaria);
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
