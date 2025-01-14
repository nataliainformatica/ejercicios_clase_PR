package es.avellaneda.ejercicio3;


/*
 * Clase Nota:

Atributos: tipo (Enum): Tipo de evaluación (Primera, Segunda, Tercera, Ordinaria, Extraordinaria).

calificacion (double): Nota obtenida.

Métodos:

Constructor para inicializar los atributos.

Valores: PRIMERA, SEGUNDA, TERCERA, ORDINARIA, EXTRAORDINARIA.
 */
public class Nota {

    private TipoNota tipo; 
    private double calificacion; 

    public Nota(TipoNota tipo, double calificacion){
        this.tipo = tipo; 
        this.calificacion = calificacion; 
    }

    public String  getTipo() {
        // tipo.name();
        return tipo.toString();
    }

    public void setTipo(TipoNota tipo) {
        this.tipo = tipo;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Nota [tipo=" + tipo + ", calificacion=" + calificacion + "]";
    }

    
    




}
