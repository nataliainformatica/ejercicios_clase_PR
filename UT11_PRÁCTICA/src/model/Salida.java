package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Salida extends Registro {
    private LocalDate fechaEntrada; 
    private LocalTime horaEntrada; 

    public Salida(LocalDate fecha, LocalTime hora, Persona persona,  LocalDate fechaEntrada, LocalTime horaEntrada) {
        super(fecha, hora, persona);
        this.fechaEntrada = fechaEntrada;
        this.horaEntrada= horaEntrada;
       
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    

}
