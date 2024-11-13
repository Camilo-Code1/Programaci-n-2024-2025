
    // import java.time.LocalDate;

    public class CuentaBancaria {
        private String IBAN;
        private String Titular;
        private double Saldo;
        private Movimiento [] Movimientos;


    public CuentaBancaria (String IBAN, String Titular, double Saldo, int Movimientos) {
        this.IBAN = IBAN;
        this.Titular = Titular;
        this.Saldo = 0;
        this.Movimientos = new Movimiento[Movimientos];
        }

        public String getIBAN(){
            return this.IBAN;
        }

        public String getTitular(){
            return this.Titular;
        }
        public double getSaldo(){
            return this.Saldo;
        }
        
        // fecha = LocalDateTime.now()toString();
    } // MAIN

