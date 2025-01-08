public abstract  class Astros{
    private int radio_ecuatorial;
    private int rotacion_sobre_eje;
    private int temperatura_media;
    private int gravedad;

        // public Astros(int radio_ecuatorial, int rotacion_sobre_eje, int temperatura_media, int gravedad) {
        //     this.radio_ecuatorial = 0;
        //     this.rotacion_sobre_eje = 0;
        //     this.temperatura_media = 0;
        //     this.gravedad = 0;
        // }

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
                sb.append("Astros {");
                sb.append("Radio ecuatorial: ") .append(getRadio_ecuatorial());
                sb.append("Rotacion sobre su eje: ").append(rotacion_sobre_eje());
                sb.append("Temperatura media: ").append(temperatura_media());
                sb.append("Gravedad: ").append(gravedad());
    
                sb.append("}");
                return sb.toString();
    
        }
    
}
