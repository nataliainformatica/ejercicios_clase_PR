package es.avellaneda.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class DAOpasajeros {

 
       // public Pasajero(String nombre, String documentoIdentidad, String asiento, CategoriaPasajero categoria) {...    }

        

 public Pasajero[] getPasajeros() {
    Pasajero[] pasajeros = {
        new Pasajero("Juan Pérez", "12345678A", "12A", Categoria.ECONOMICA),
        new Pasajero("María López", "87654321B", "5C", Categoria.PREMIUM),
        new Pasajero("Carlos García", "45678912C", "1A", Categoria.EJECUTIVA),
        new Pasajero("Ana Fernández", "65432187D", "10F", Categoria.ECONOMICA),
        new Pasajero("Luis Martínez", "98765432E", "7B", Categoria.PREMIUM)
    };
    return pasajeros;
}

}