package ut9.Ejercicio1.excepciones;

import java.lang.reflect.Parameter;

import ut9.Ejercicio1.model.Participante;

public class ImportePositivoException extends RuntimeException{


    private Participante participante; 
    private double total; 
    public ImportePositivoException(Participante participante, double total){
        this.participante = participante;
        this.total = total; 

    }
    public Participante getParticipante() {
        return participante;
    }
    public double getTotal() {
        return total;
    }

    
    
}
