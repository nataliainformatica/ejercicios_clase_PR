package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Entrada extends Registro{
    private String motivoEntrada; 

    public Entrada(LocalDate fecha, LocalTime hora, Persona persona,String motivoEntrada) {
        super(fecha, hora, persona);
        this.motivoEntrada = motivoEntrada; 
        
    }

    public String getMotivoEntrada() {
        return motivoEntrada;
    }

    @Override
    public String toString() {
        return "Entrada -  Nombre: " + getPersona().getNombreApellidos() +" motivoEntrada: " + motivoEntrada + ", Fecha =" + getFecha() + ", Hora =" + getHora()
                ;
    }
    
    

}
