package model;

import java.time.LocalDate;
import java.time.LocalTime;


public class Cita implements Comparable<Cita> {
    private LocalDate fecha;
    private LocalTime hora;
    private String descripcion;
    private String categoria;

    public Cita(LocalDate fecha, LocalTime hora, String descripcion, String categoria) {
        this.fecha = fecha;
        this.hora = hora;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }

    public LocalDate getFecha() { return fecha; }
    public LocalTime getHora() { return hora; }
    public String getDescripcion() { return descripcion; }
    public String getCategoria() { return categoria; }

    @Override
    public int compareTo(Cita otra) {
        if (this.fecha.equals(otra.fecha)) {
            return this.hora.compareTo(otra.hora);
        }
        return this.fecha.compareTo(otra.fecha);
    }

    @Override
    public String toString() {
        return fecha + " " + hora + " - " + descripcion + " (" + categoria + ")";
    }
}
