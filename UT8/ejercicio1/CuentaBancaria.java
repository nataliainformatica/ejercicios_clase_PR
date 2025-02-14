package ejercicio1;

/**
 * Ejercicio 1: Propagación de excepción con throws
Crear una clase que simule una operación bancaria 

en la que se intenta realizar un retiro de dinero de una cuenta. Si el saldo es insuficiente, se debe lanzar una excepción que se propaga.

 */
public class CuentaBancaria implements Registrable{


    private double saldo; 
    private String titular; 
    private String IBAN; 

    public CuentaBancaria(double saldo, String titular, String IBAN){

        this.saldo = saldo; 
        this.titular = titular; 
        this.IBAN = IBAN; 
        
    }

    public double retirarSaldo(double importeRetirar) throws SaldoException{
       
        if(importeRetirar>saldo){
            // no se puede retirar
            throw new SaldoException("No hay saldo suficiente"); 
        }
        // retirar dinero
        saldo = saldo - importeRetirar; 
        

        return saldo; 

    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getIBAN() {
        return IBAN;
    }

    @Override
    public String mostrarRegistro() {

        return "REG1_"+IBAN; 
        
        
    }
    





}
