package es.avellaneda.ejercicio4II;
/*
 * Cada tarea estará representada por una clase Tarea con los siguientes atributos:

titulo: (String) el título de la tarea.

categoria: (enum) la categoría de la tarea, con valores como:

TRABAJO, ESTUDIO, PERSONAL, OTRO.

estado: (enum) el estado de la tarea, con valores como:

PENDIENTE, EN_PROGRESO, COMPLETADA, CANCELADA.

fecha: (LocalDate) la fecha asignada a la tarea.

hora: (LocalTime) la hora asignada a la tarea.

En la clase principal, crearemos un array de tareas, y realizaremos la carga con la llamada a la clase facilitada.

Probaremos a listar en la consola todas las tareas.
 */

import java.time.LocalDate;
import java.time.LocalTime;

public class Tarea {

private String titulo; 
private Categoria categoria; 
private Estado estado; 
private LocalDate fecha; 
private LocalTime hora; 


public Tarea(String titulo, 
    Categoria categoria, Estado estado, 
    LocalDate fecha, LocalTime hora){
    this.titulo= titulo; 
    this.categoria = categoria; 
    this.estado = estado; 
    this.fecha = fecha; 
    this.hora= hora; 
}
public Tarea(Tarea tarea){
    this.titulo= tarea.getTitulo(); 
    this.categoria = tarea.getCategoria(); 
    this.estado = tarea.getEstado(); 
    this.fecha = tarea.getFecha(); 
    this.hora= tarea.getHora(); 
} 

public String getTitulo() {
    return titulo;
}


public void setTitulo(String titulo) {
    this.titulo = titulo;
}


public Categoria getCategoria() {
    return categoria;
}


public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
}


public Estado getEstado() {
    return estado;
}


public void setEstado(Estado estado) {
    this.estado = estado;
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


@Override
public String toString() {
    return "Tarea [titulo=" + titulo 
    + ", categoria=" + categoria 
    + ", estado=" + estado 
    + ", fecha=" + fecha
    + ", hora=" + hora + "]"+ "\n";
}




}

