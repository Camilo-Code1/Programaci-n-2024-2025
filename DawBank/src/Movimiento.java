    public class Movimiento {
        private int ID;
        private int Fecha;
        private String Tipo;
        private double Cantidad;
        

        public Movimiento (int ID, int Fecha, String Tipo, double Cantidad) {
            this.ID = ID;
            this.Fecha = 0;
            this.Tipo = Tipo;
            this.Cantidad = 0;
        }

        public int getID() {
            return ID;
        }

        public int getFecha() {
            return Fecha;
        }

        public String getTipo() {
            return Tipo;
        }

        public double getCantidad() {
            return Cantidad;
        }
        


        // Posible forma de mostrar movimientos

        public String mostrarInfoMovimiento(){
            String info = String.format("Movimiento - ID: %s, Fecha: %s; Tipo: %s; Cantidad: %s"
            , this.ID, this.Fecha, this.Tipo, this.Cantidad);
            return info;
        }




    } // MAIN
