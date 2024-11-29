package es.avellaneda;

/*
 * Cada habitación estará representada por un objeto de la clase Habitacion, 
    que tendrá los siguientes atributos:

    numero (entero): el número de la habitación (1 a 10).

    huesped (cadena): el nombre del huésped que ocupa la habitación, o null si está vacía.
 */
public class Habitacion {

    private int numero; 
    private String huesped; 
    private boolean ocupada; 


    public Habitacion(int numero){
        this.numero = numero;
        // escribo los requisitos del enunciado, si no tiene huesped debe ser null, no vacío 
        this.huesped = null; 
        ocupada = false; 
    }


    // Reservar una habitación asignándole un huésped.
    public boolean reservarHabitacion(String huesped){
        boolean resultado =  false; 
          if(ocupada){
            return resultado; 
        }
        this.huesped = huesped;
        resultado = true; 
        ocupada=true; 
        return resultado;
    }
    // Cancelar una reserva, dejando la habitación vacía.

    public boolean cancelarHabitacion(){
        boolean resultado = false; 
        if(!ocupada){
            return resultado;
        }
        huesped = null; 
        ocupada=false; 
        return resultado; 
    }
    
    public int getNumero() {
        return numero;
    }


    public String getHuesped() {
        return huesped;
    }


    public boolean consultarOcupacion() {
        return ocupada;
    }


    @Override
    public String toString() {
        String valor = "LIBRE";
        if(ocupada){
            valor = "OCUPADA";}

        return "Habitacion numero= " + numero + "está "+ valor ;
    }   


    



}
