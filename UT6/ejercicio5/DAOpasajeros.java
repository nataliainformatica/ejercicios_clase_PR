import java.util.ArrayList;
import java.util.List;

public class DAOpasajeros {

 
       // public Pasajero(String nombre, String documentoIdentidad, String asiento, CategoriaPasajero categoria) {...    }

        

 public Pasajero[] getPasajeros() {
    Pasajero[] pasajeros = {
        new Pasajero("Juan Pérez", "12345678A", "12A", CategoriaPasajero.ECONOMICA),
        new Pasajero("María López", "87654321B", "5C", CategoriaPasajero.PREMIUM),
        new Pasajero("Carlos García", "45678912C", "1A", CategoriaPasajero.EJECUTIVA),
        new Pasajero("Ana Fernández", "65432187D", "10F", CategoriaPasajero.ECONOMICA),
        new Pasajero("Luis Martínez", "98765432E", "7B", CategoriaPasajero.PREMIUM)
    };
    return pasajeros;
}

}
