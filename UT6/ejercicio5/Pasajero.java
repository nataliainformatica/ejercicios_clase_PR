package es.avellaneda.ejercicio5;
/**
 * Descripción: Representa a un pasajero con los datos básicos y su asiento asignado.

Atributos:

nombre: (String) nombre completo del pasajero.

documentoIdentidad: (String) documento único del pasajero.

asiento: (String) asiento asignado (por ejemplo, "12A").

categoria: (enum) categoría del pasajero, con valores como:

ECONOMICA, PREMIUM, EJECUTIVA.

Métodos:

Constructor para inicializar los atributos.

Métodos getters y setters.

Método toString() para mostrar información del pasajero.
 */
public class Pasajero {

    private String nombre, DNI, asiento; 
    private Categoria categoria;
    public Pasajero(String nombre, String dNI, String asiento, Categoria categoria) {
        this.nombre = nombre;
        DNI = dNI;
        this.asiento = asiento;
        this.categoria = categoria;
    }
    @Override
    public String toString() {
        return "Pasajero nombre=" + nombre + ", DNI=" + DNI + ", asiento=" + asiento + ", categoria=" + categoria
                ;
    } 



    // de momento no escribimos getters y setters
    // no hemos encontado la necesidad de ponerlos 
    // asumimos que no se puede cambiar el estado del objeto

    

}
