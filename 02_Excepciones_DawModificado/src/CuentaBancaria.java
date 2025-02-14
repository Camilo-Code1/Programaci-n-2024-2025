
import java.util.ArrayList;
import java.util.List;

public class CuentaBancaria {

    private static final double saldo_minimo = -50;
    private static final double limite_hacienda = 3000;

    private String IBAN;
    Cliente cliente;
    private double Saldo;
  

    // Colección de movimientos

    private List<Movimiento> Movimientos;
    private int contadorMovimientos; 

    // CONSTRUCTROR

    public CuentaBancaria(String IBAN, Cliente cliente) { 
        if (ibanCorrec(IBAN) && cliente != null && !cliente.getNombre().isEmpty()) {        
            this.IBAN = IBAN;
            this.cliente = cliente;
            this.Saldo = 0;
            this.Movimientos = new ArrayList<>(); 
            this.contadorMovimientos = 0; 
        } else {
            System.out.println("\nDatos de cuenta invalidos.");
        }
    }




  


            
    public void mostrarDatos() {
        System.out.printf("IBAN: %s%n", IBAN);
        System.out.printf("Cliente: %s%n", cliente);
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
        Movimientos.add(new Movimiento("INGRESO", Cantidad, Saldo));
       
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
        Movimientos.add(new Movimiento("RETIRADA", cantidad, Saldo));
        // agregarMovimiento("Retirada", cantidad);

        if (Saldo <= 0) {
            System.out.println("\sAVISO: Saldo negativo.");
        }
    }
        


    // public void agregarMovimiento(String tipo, double cantidad) {
    //     if (contadorMovimientos >= 100) {
    //        System.out.println("\sNo se pueden realizar más movimientos");
    //        return;
    //     }

    //     Movimientos.add(contadorMovimientos, new Movimiento(tipo, cantidad, Saldo));
    //     contadorMovimientos++;
    // }



    public void MostrarMovimientos() {
        if (Movimientos.isEmpty()) {
            System.out.println("\sNo hay movimientos registrados.");
            return;
        }

        for (Movimiento movimiento : Movimientos) {
            System.out.println(movimiento);
        }
    }

    public double getSaldo() {
        return Saldo;
    }

    public String getIBAN() {
        return IBAN;
    }

    public Cliente getcliente() {
        return cliente;
    }





    private boolean ibanCorrec(String IBAN) {
        return IBAN != null && IBAN.matches("[A-Z]{2}\\d{22}");
    }


    

}