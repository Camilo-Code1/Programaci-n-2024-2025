public class CuentaBancaria {

    private static final double saldo_minimo = -50;
    private static final double limite_hacienda = 3000;

    private String IBAN;
    private String Titular;
    private double Saldo;

    // Colección de movimientos
    private Movimiento[] Movimientos;
    private int contadorMovimientos; 

    public CuentaBancaria(String IBAN, String Titular) { 
        if (ibanCorrec(IBAN) && !Titular.isEmpty()) {        
            this.IBAN = IBAN;
            this.Titular = Titular;
            this.Saldo = 0;
            this.Movimientos = new Movimiento[100]; 
            this.contadorMovimientos = 0; 
        } else {
            System.out.println("\nDatos de cuenta invalidos.");
        }
    }

    private boolean ibanCorrec(String IBAN) {
        return IBAN != null && IBAN.matches("[A-Z]{2}\\d{22}");
    }
            
    public void mostrarDatos() {
        System.out.printf("IBAN: %s%n", IBAN);
        System.out.printf("Titular: %s%n", Titular);
        System.out.printf("Saldo: %s%n", Saldo);
    }	

    public void Ingreso(double Cantidad) {
        if (Cantidad <= 0) {
            System.out.println("\sLa cantidad ingresada debe ser mayor a 0");
            return;
        }
        
        if (Cantidad > limite_hacienda) {
            System.out.println("\sAVISO: El ingreso supera el limite de la hacienda");
        }

        Saldo += Cantidad;
        agregarMovimiento("Ingreso", Cantidad);
    }

    public void Retirada(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("\sLa cantidad debe ser mayor a 0.");
            return;
        }
        if (Saldo - cantidad < saldo_minimo) {
            System.out.println("\sMovimiento no permitido. No hay suficiente saldo en la cuenta.");
            return;
        }
        
        Saldo -= cantidad;
        agregarMovimiento("Retirada", cantidad);

        if (Saldo <= 0) {
            System.out.println("\sAVISO: Saldo negativo.");
        }
    }
        
    public void agregarMovimiento(String tipo, double cantidad) {
        if (contadorMovimientos >= 100) {
           System.out.println("\sNo se pueden realizar más movimientos");
           return;
        }

        Movimientos[contadorMovimientos] = new Movimiento(tipo, cantidad);
        contadorMovimientos++;
    }

    public void MostrarMovimientos() {
        if (contadorMovimientos == 0) {
            System.out.println("\sNo hay movimientos registrados.");
            return;
        }

        for (int i = 0; i < contadorMovimientos; i++) {
            Movimientos[i].mostrarInfoMovimiento();
        }
    }

    public double getSaldo() {
        return Saldo;
    }

    public String getIBAN() {
        return IBAN;
    }

    public String getTitular() {
        return Titular;
    }
}