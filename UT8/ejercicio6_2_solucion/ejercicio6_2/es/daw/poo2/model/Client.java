package ejercicio6_2.es.daw.poo2.model;

import java.time.LocalDate;

/**
 * Debes tener en cuenta que para dar de alta un cliente se puede hacer de dos
 * formas:
 * 
 * Con el código, nombre, número de teléfono y fecha de registro.
 * Con el código, nombre y fecha de registro
 */
public class Client {

    private String codigo, nombre, numeroTelefono;
    private LocalDate fechaRegistro;

    public Client(String codigo, String nombre, String numeroTelefono, LocalDate fechaRegistro) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * En el caso de que un cliente se de de alta
     * sin número de teléfono deberá indicarse "WITHOUT_PHONE" en dicho atributo.
     */
    public Client(String codigo, String nombre, LocalDate fechaRegistro) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaRegistro = fechaRegistro;
        this.numeroTelefono = "WITHOUT_PHONE";
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }
    // Solo el número de teléfono podrá modificarse una vez creado el cliente en el
    // sistema.

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numeroTelefono == null) ? 0 : numeroTelefono.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Client other = (Client) obj;
        if (numeroTelefono == null) {
            if (other.numeroTelefono != null)
                return false;
        } else if (!numeroTelefono.equals(other.numeroTelefono))
            return false;
        return true;
    }

    // SOBREESCRIBIR EQUALS PARA QUE FUNCIONE CONTAINS DE ARRAYLIST

    /**
     * En el método validatePhone de la clase PhoneNumberRegisterService implementa
     * el código para comprobar si el número existe un cliente con un teléfono en
     * cuestión. La firma del método será:
     */
 

}
