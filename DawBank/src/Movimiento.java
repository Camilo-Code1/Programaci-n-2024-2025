
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

    public class Movimiento {
        private static int contadorMovimientos = 0;
        private int ID;
        private String Fecha;
        private String Tipo;
        private double Cantidad;
        

        public Movimiento (String Tipo, double Cantidad) {
            this.ID = ++contadorMovimientos;
            this.Fecha = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));;
            this.Tipo = Tipo;
            this.Cantidad = Cantidad;
        }



        // Posible forma de mostrar movimientos

        public void mostrarInfoMovimiento() {
            System.out.println("ID: " + ID + ", Fecha: " + Fecha + ", Tipo: " + Tipo + ", Cantidad: " + Cantidad);
        }




    } // MAIN