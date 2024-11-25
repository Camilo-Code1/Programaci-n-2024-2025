
import java.util.ArrayList;
import java.util.List;


    // import java.time.LocalDate;

    public class CuentaBancaria {

        private static final double saldo_minimo = -50;
        private static final double limite_hacienda = 3000;

        private String IBAN;
        private String Titular;
        private double Saldo;

        // Coleccion de movimientos 

        private List<Movimiento> Movimientos;


    public CuentaBancaria (String IBAN, String Titular) { 
        
    if (ibanCorrec(IBAN) && !Titular.isEmpty()) {        
        this.IBAN = IBAN;
        this.Titular = Titular;
        this.Saldo = 0;
        this.Movimientos = new ArrayList<>();
        } else {
        System.out.println("Datos de cuenta invalidos.");

            }
        }

        private boolean ibanCorrec(String IBAN) {
            return IBAN != null && IBAN.matches("ES\\d{22}");
        }
            
        public void mostrarDatos() {
                    System.out.printf("IBAN: %s%n", IBAN);
                    System.out.printf("Titular: %s%n", Titular);
                    System.out.printf("Saldo: %s%n", Saldo);
        }	



        public void Ingreso(double Cantidad){
            if (Cantidad <= 0){
                System.out.println("");
                System.out.println("La cantidad ingresada debe ser mayor a 0");
                return;
            }
            Saldo += Cantidad;
            Movimientos.add(new Movimiento("Ingreso", Cantidad));

            if (Cantidad > limite_hacienda){
                System.out.println("");
                System.out.println("AVISO: El ingreso supera el limite de la hacienda");
                }
        }

   public void Retirada(double cantidad){
        if (cantidad <=0) {
                System.out.println("La cantidad debe ser mayor a 0.");
        }
        if (Saldo - cantidad < saldo_minimo) {
            System.out.println("Movimiento no permitido. No hay suficiente saldo en la cuenta.");
            return;
        }
        
        Saldo -= cantidad;
        Movimientos.add(new Movimiento("Retirada", cantidad));

        if (Saldo <= 0) {
            System.out.println("AVISO: Saldo negativo.");
            }
        }
        
    public void MostrarMovimientos(){
        if (Movimientos.isEmpty()){
            System.out.println("No hay movimientos registrados.");
            return;
        }

        for (Movimiento movimiento : Movimientos) {
            movimiento.mostrarInfoMovimiento();
        }
    }

    public double getSaldo(){
        return Saldo;
    }

    public String getIBAN(){
        return IBAN;
    }
    public String getTitular(){
        return Titular;
    }


    } // MAIN
