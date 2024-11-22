
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

    public class Movimiento {
        private int ID;
        private String Fecha;
        private String Tipo;
        private double Cantidad;
        

        public Movimiento (int ID, String Fecha, String Tipo, double Cantidad) {
            this.ID = ID;
            this.Fecha = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));;
            this.Tipo = Tipo;
            this.Cantidad = Cantidad;
        }


 


        // Posible forma de mostrar movimientos

        public String mostrarInfoMovimiento(){
            String info = String.format("Movimiento - ID: %s, Fecha: %s; Tipo: %s; Cantidad: %s"
            , this.ID, this.Fecha, this.Tipo, this.Cantidad);
            return info;
        }




    } // MAIN
