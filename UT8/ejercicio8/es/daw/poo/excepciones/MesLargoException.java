package ejercicio8.es.daw.poo.excepciones; 

/**
 * que capturará el mes y dia de la semana.
 */
public class MesLargoException  extends RuntimeException {

    private int mes, dia;

    public MesLargoException(int mes, int dia) {
        this.mes= mes; 
        this.dia = dia;  
    } 




}
