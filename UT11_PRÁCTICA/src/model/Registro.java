package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
/*
 * Registro:
fecha (LocalDate) 
 hora (LocalTime) . Persona

Entrada y Salida, heredan de Registro

Entrada tendrá el atributo : motivoEntrada

Salida, tendrá los atributos fechaEntrada, horaEntrada.

ExcepcionDeValidacion: Excepción personalizada para errores de validación.
 */
public class Registro implements Serializable {
    private LocalDate fecha; 
    private LocalTime hora; 
    private Persona persona;
    public Registro(LocalDate fecha, LocalTime hora, Persona persona) {
        this.fecha = fecha;
        this.hora = hora;
        // me aseguro que la referencia de la persona del registro es una copia
        this.persona = new Persona(persona.getNombreApellidos(), persona.getNumeroEmpleado(), persona.getPassword());
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public LocalTime getHora() {
        return hora;
    }
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    public Persona getPersona() {
        // devuelvo una copia, no la referencia al objeto
        return new Persona(persona.getNombreApellidos(), persona.getNumeroEmpleado(), persona.getPassword());
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
        result = prime * result + ((hora == null) ? 0 : hora.hashCode());
        result = prime * result + ((persona == null) ? 0 : persona.hashCode());
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
        Registro other = (Registro) obj;
        if (fecha == null) {
            if (other.fecha != null)
                return false;
        } else if (!fecha.equals(other.fecha))
            return false;
        if (hora == null) {
            if (other.hora != null)
                return false;
        } else if (!hora.equals(other.hora))
            return false;
        if (persona == null) {
            if (other.persona != null)
                return false;
        } else if (!persona.equals(other.persona))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Registro [fecha=" + fecha + ", hora=" + hora + ", persona=" + persona + "]";
    } 

    

}
