package es.avellaneda.repasoArrays;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tarea {

    private String nombre;
    private String descripcion;
    private LocalDate fechaVencimiento;

    public Tarea(String nombre, String descripcion, LocalDate fechaVencimiento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Tarea: " + nombre +
                " | Descripción: " + descripcion +
                " | Vence el: " + fechaVencimiento.format(formatter);
    }

}
