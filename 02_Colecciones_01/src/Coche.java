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
    public String setmarca(){
        return marca;
    }



    public void setcolor(String color){
        this.color=color;
    }
    public void setMarca (String marca){
        this.marca=marca;
    }
    

    @Override
    public String toString() {
        return ("\nCoche:" + "\nSu Color es: " + color + "\nSu Marca es: " + marca);
    }




}  // MAIN
