public class Coche {
    String color;
    String marca;

    public Coche(String color, String marca) {
        this.color = color;
        this.marca = marca;
    }

    public String getcolor(){
        return color;
    }
    public String getmarca(){
        return marca;
    }

    @Override
    public String toString() {
        return String.format("Marca: %s, Color: %s", marca, color);
    }





}  // MAIN
