package es.avellaneda.ejercicio5;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


// ESTA CLASE NOS SIRVE PARA DEVOLVER MEDIANTE LA LLAMADA AL MÉTODO
// getVuelos, un array con datos 

public class DAOvuelos {
      
   // formato del constructor utilizando para el DAO
        //public Vuelo(String numeroVuelo, String origen, String destino, LocalDate fecha, LocalTime hora, EstadoVuelo estado) {  .....   }

public Vuelo[] getVuelos() {
    Vuelo[] vuelos = {
        new Vuelo("V001", "Madrid", "Barcelona", LocalDate.of(2025, 1, 20), LocalTime.of(10, 30), Estado.PROGRAMADO),
        new Vuelo("V002", "Sevilla", "Bilbao", LocalDate.of(2025, 1, 21), LocalTime.of(12, 45), Estado.DEMORADO),
        new Vuelo("V003", "Valencia", "Lisboa", LocalDate.of(2025, 1, 22), LocalTime.of(14, 15), Estado.CANCELADO),
        new Vuelo("V004", "Granada", "Madrid", LocalDate.of(2025, 1, 23), LocalTime.of(9, 0), Estado.PROGRAMADO),
        new Vuelo("V005", "Barcelona", "Londres", LocalDate.of(2025, 1, 24), LocalTime.of(16, 50), Estado.PROGRAMADO)
    };
    return vuelos;
}

}