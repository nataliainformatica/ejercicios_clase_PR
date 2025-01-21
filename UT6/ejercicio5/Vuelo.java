package es.avellaneda.ejercicio5;

import java.time.LocalDate;
import java.time.LocalTime;

/*
 * Descripción: Representa un vuelo con la información básica necesaria.

Atributos:

numeroVuelo: (String) número único del vuelo.

origen: (String) ciudad de origen.

destino: (String) ciudad de destino.

fecha: (LocalDate) fecha de salida.

hora: (LocalTime) hora de salida.

estado: (enum) estado del vuelo, con valores como:

PROGRAMADO, DEMORADO, CANCELADO.

Métodos:

Constructor para inicializar los atributos.

Métodos getters y setters.

Método toString() para mostrar información del vuelo.
 */
public class Vuelo {

    private String numeroVuelo, origen, destino; 
    private LocalDate fechaSalida; 
    private LocalTime horaSalida; 
    private Estado estado;
    public Vuelo(String numeroVuelo, String origen, String destino, LocalDate fechaSalida, LocalTime horaSalida,
            Estado estado) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.estado = estado;
    }
    @Override
    public String toString() {
        return "Vuelo: numeroVuelo=" + numeroVuelo + ", origen=" + origen + ", destino=" + destino + ", fechaSalida="
                + fechaSalida + ", horaSalida=" + horaSalida + ", estado=" + estado;
    } 

    // de momento no escribimos getters y setters
    // no hemos encontado la necesidad de ponerlos 
    // asumimos que no se puede cambiar el estado del objeto

    
    
    
}
