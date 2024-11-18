
    // import java.time.LocalDate;

    public class CuentaBancaria {
        private String IBAN;
        private String Titular;
        private double Saldo;

        // Coleccion de movimientos 
        private Movimiento [] Movimientos;


    public CuentaBancaria (String IBAN, String Titular, double Saldo, int nMovimientos) {
        this.IBAN = IBAN;
        this.Titular = Titular;
        this.Saldo = 0;
        this.Movimientos = new Movimiento[nMovimientos];
        }

            // A

        public String getIBAN(){
            return this.IBAN;
        }

        public String getTitular(){
            return this.Titular;
        }
        public double getSaldo(){
            return this.Saldo;
        }



        public void setSaldo (double cantidad){
            this.Saldo = cantidad;
        }


        public void depositar (double cantidad){
            this.Saldo += cantidad;
        }

        


        
        
    // fecha = LocalDateTime.now()toString();
    } // MAIN

