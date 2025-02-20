package ejercicio8.es.daw.poo.excepciones;

import ejercicio8.es.daw.poo.DiaSemana;

/**
 * que capturará el mes y dia de la semana.
 */
public class MesLargoException  extends RuntimeException {

    private int mes;
    private DiaSemana dia;

    public MesLargoException(int mes, DiaSemana dia) {
        this.mes= mes; 
        this.dia = dia;  
    }

    public int getMes() {
        return mes;
    }

    public DiaSemana getDia() {
        return dia;
    } 




}
