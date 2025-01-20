public abstract  class Astros{
    private double  masa;
    private int radio_ecuatorial;
    private int rotacion_sobre_eje;
    private int temperatura_media;
    private int gravedad;

    public Astros(int radio_ecuatorial, int rotacion_sobre_eje, int temperatura_media, int gravedad, double masa) {
        this.radio_ecuatorial = radio_ecuatorial;
        this.rotacion_sobre_eje = rotacion_sobre_eje;
        this.temperatura_media = temperatura_media;
        this.gravedad = gravedad;
        this.masa = masa; // Inicializar la nueva variable
    }

      
        public double getmasa(){
            return masa;
        }
        public int getRadio_ecuatorial(){ 
            return radio_ecuatorial;
        }
        public int getrotacion_sobre_eje(){
            return rotacion_sobre_eje;
        }
        public int gettemperatura_media(){
            return temperatura_media;
        }
        public int getgravedad(){
            return gravedad;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
                sb.append("\nAstros: ");
                sb.append("\nMasa del cuerpo: ") .append(getmasa());
                sb.append("\nRadio ecuatorial: ") .append(getRadio_ecuatorial());
                sb.append("\nRotacion sobre su eje: ").append(getrotacion_sobre_eje());
                sb.append("\nTemperatura media: ").append(gettemperatura_media());
                sb.append("\nGravedad: ").append(getgravedad());
    
                return sb.toString();
    
        }
    
}