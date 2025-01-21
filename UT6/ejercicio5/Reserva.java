package es.avellaneda.ejercicio5;
/**
 * Clase Reserva
Descripción: Representa una reserva que asocia 
un PASAJERO  a un VUELO .

Atributos:

vuelo: (Vuelo) el vuelo reservado.

pasajero: (Pasajero) el pasajero asociado.

Métodos:

Constructor para inicializar los atributos.

Métodos getters y setters.

Método toString() para mostrar los detalles de la reserva.
 */
public class Reserva {


    private Vuelo vuelo; 
    private Pasajero pasajero;
    public Reserva(Vuelo vuelo, Pasajero pasajero) {
        this.vuelo = vuelo;
        this.pasajero = pasajero;
    }
    @Override
    public String toString() {
        return "Reserva - vuelo=" + vuelo.toString() + 
        ", pasajero=" + pasajero.toString() ;
    } 

    // de momento no escribimos getters y setters
    // no hemos encontado la necesidad de ponerlos 
    // asumimos que no se puede cambiar el estado del objeto

    
    
}
