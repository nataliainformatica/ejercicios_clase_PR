package ejercicio1;

import java.time.LocalDate;

public class SaldoException extends Exception {
    private LocalDate fecha; 


    public SaldoException(String message){
        super(message);
        this.fecha = LocalDate.now(); 
    }

    public SaldoException(){
        this.fecha = LocalDate.now(); 

    }

    public LocalDate getFecha() {
        return fecha;
    }

    

}
