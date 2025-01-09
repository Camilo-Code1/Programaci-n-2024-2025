public abstract  class Astros{
    private int radio_ecuatorial;
    private int rotacion_sobre_eje;
    private int temperatura_media;
    private int gravedad;

      

        public int getRadio_ecuatorial(){
            return radio_ecuatorial;
        }
        public int rotacion_sobre_eje(){
            return rotacion_sobre_eje;
        }
        public int temperatura_media(){
            return temperatura_media;
        }
        public int gravedad(){
            return gravedad;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
                sb.append("\nAstros: ");
                sb.append("\nRadio ecuatorial: ") .append(getRadio_ecuatorial());
                sb.append("\nRotacion sobre su eje: ").append(rotacion_sobre_eje());
                sb.append("\nTemperatura media: ").append(temperatura_media());
                sb.append("\nGravedad: ").append(gravedad());
    
                return sb.toString();
    
        }
    
}
