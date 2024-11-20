public class Ejemplo {
  // Método público que no devuelve ningún valor
  public void mostrarMensaje() {
      System.out.println("¡Hola, mundo!");
  }

  public static void main(String[] args) {
      Ejemplo ejemplo = new Ejemplo();
      ejemplo.mostrarMensaje(); // Llama al método
  }
}