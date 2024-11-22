
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


    // import java.time.LocalDate;

    public class CuentaBancaria {

        private static final double saldo_minimo = -50;
        private static final double limite_hacienda = 3000;

        private String IBAN;
        private String Titular;
        private double Saldo;

        // Coleccion de movimientos 

        private List<Movimiento> Movimientos;


    public CuentaBancaria (String IBAN, String Titular, double Saldo) { // Posible fallo double
        
if (ibanCorrec(IBAN) && !Titular.isEmpty() && Saldo >= saldo_minimo) {        this.IBAN = IBAN;
        this.Titular = Titular;
        this.Saldo = 0;
        this.Movimientos = new ArrayList<>();
        } else {
        System.out.println("Datos de cuenta invalidos.");

        }
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

        public List<Movimiento> getMovimientos(){
            return this.Movimientos;
        }


        public void Ingreso(double Cantidad){
            if (Cantidad <= 0){
                System.out.println("La cantidad ingresada debe ser mayor a 0");
                return;
            }
            Saldo += Cantidad;
            Movimientos.add(new Movimiento("Ingreso", Cantidad));
            if (Cantidad > limite_hacienda){
                System.out.println("AVISO: El ingreso supera el limite de la hacienda");
                }
        }

   

        
        
    // fecha = LocalDateTime.now()toString();


    } // MAIN

