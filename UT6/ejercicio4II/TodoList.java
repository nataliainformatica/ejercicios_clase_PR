package es.avellaneda.ejercicio4II;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Clase TodoList
 * 
 * La clase TodoList debe manejar una lista de tareas de longitud fija (máximo
 * 10).
 * 
 * Incluir los siguientes métodos:
 * 
 * añadirTarea(Tarea tarea)
 * 
 * Permite añadir una nueva tarea a la lista.
 * 
 * Restricción: No se debe añadir una tarea si ya existe otra con la misma fecha
 * y hora.
 * 
 * Retornar un mensaje indicando si la tarea fue añadida correctamente o no.
 * 
 * modificarTarea(int index, Tarea tarea)
 * 
 * Permite modificar una tarea existente en una posición dada del array.
 * 
 * Validar que el índice esté dentro de los límites de la lista.
 * 
 * Restricción: Al modificar, la nueva fecha y hora no deben entrar en conflicto
 * con otras tareas.
 * 
 * listarTareasPorFecha(LocalDate fecha)
 * 
 * Devuelve todas las tareas que coincidan con una fecha específica.
 */
public class TodoList {

    private Tarea[] tareas;
    private final int MAX = 10;
    private int numTareas;

    public TodoList() {
        this.tareas = new Tarea[MAX];
        this.numTareas = 0;
    }

    public Tarea[] getTareas() {

        // VAMOS A COPIAR DE FORMA MANUAL EL ARRAY
        Tarea[] tareas_otro = new Tarea[tareas.length];
        // TENGO QUE RECORRER EL ARRAY,
        // Y COPIAR CADA ELEMENTO EN EL NUEVO ARRAY
        for (int i = 0; i < tareas.length; i++) {
            tareas_otro[i] = new Tarea(tareas[i]);
            /*
             * // equivalente al constructor de copia
             * tareas_otro[i]= new Tarea(tareas[i].getTitulo(),
             * tareas[i].getCategoria(), tareas[i].getEstado(),
             * tareas[i].getFecha(), tareas[i].getHora());
             */

        }
        return tareas_otro;
    }

    public boolean aniadirTarea(Tarea tarea) {
        boolean success = false;
        if (numTareas < MAX) {
            // HAY ESPACIO PARA AÑADIR MÁS TAREAS
            // TODO - RESTRICCIÓN FECHA Y HORA
            // comprobar si hay una tarea con esa fecha y hora
            if (comprobarTarea(tarea))
                tareas[numTareas] = tarea;
                numTareas++;
            success = true;
        }
        return success;

    }

    private boolean comprobarTarea(Tarea tarea) {
        boolean success = false;
        // recorrer el array para buscar una tarea con la misma fecha y hora
        for (Tarea t : tareas) {
            try {
                // si se lanza una exception
                if ((t.getFecha().equals(tarea.getFecha())) &&
                        t.getHora().equals(tarea.getHora())) {
                    // no se puede crear la tarea
                    return success;

                }
            } catch (Exception e) {
                // no continua el bucle
            }
        }

        success = true;

        return success;

    }

    public boolean modificarTarea(int index, Tarea tarea) {
        boolean success = false;
        // comprobamos que no existe otra tarea en el array con los valores
        // de fecha y hora de la tarea actual
        // solución 1 - elimino la tarea y cuando compruebe que no hay ninguna igual la
        // añado
        Tarea tarea_aux = tareas[index]; 
        tareas[index] = null;
            // comprobarTarea devuelve true si no hay otra tarea en la misma fecha y hora
        if (comprobarTarea(tarea)) {
            // cuidado, porque , la posición del índice no debemos
            // tenerla en cuenta, porque es la posición que vamos a utilizar
            /** solución 1 */
            tareas[index]= tarea; 

            success = true; 
        }else{
            // si no se puede añadir, vuelvo a dejar la tarea antigua
            tareas[index]= tarea_aux;
        }

        return success;

    }

    public String devolverListadoTareas(){

        StringBuilder sb = new StringBuilder(); 
        
      
        // recorrer el array
        for(int i= 0; i< tareas.length; i++){
            if(tareas[i]!= null){
                sb.append("Tarea : ");
                sb.append(i); 
                sb.append(tareas[i]);}

        }   

        return sb.toString();

    }
}
