
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
       
        Saldo += Cantidad;
        Movimientos.add(new Movimiento("INGRESO", Cantidad, Saldo));
       
    }



    public void Retirada(double cantidad) throws SaldoNegativoException {
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

        if (Saldo < 0) {
           throw new SaldoNegativoException ("\sAVISO: Saldo negativo");
        }
    }
        


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


    



        /// EXCEPCIONES
        

        public void verificarLimite(double Cantidad) throws AvisarHaciendaException {
            if (Cantidad >= limite_hacienda) {
                throw new AvisarHaciendaException("La cantidad supera el límite establecido por Hacienda");
        }
    }


    //     public void verificarCantidadMinima(double Cantidad) throws SaldoNegativoException {
    //         if (Cantidad < 0) {
                
    //             if (Saldo - Cantidad < -50) {
    //                 throw new SaldoNegativoException("\sMovimiento no permitido. No hay suficiente saldo en la cuenta.");
                
    //             }
           
    // }
              
    
    //     }


}