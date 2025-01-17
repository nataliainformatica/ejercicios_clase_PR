package es.avellaneda.ejercicio4II;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

/**
 * lase Principal
 * 
 * Implementar un menú interactivo en la consola con las siguientes opciones:
 * 
 * Añadir tarea: Solicitar al usuario los datos de la tarea y añadirla a la
 * lista.
 * 
 * Modificar tarea: Solicitar el índice de la tarea a modificar y los nuevos
 * datos.
 * 
 * Listar tareas por fecha: Solicitar una fecha y mostrar las tareas
 * correspondientes.
 * 
 * Salir: Finaliza el programa.
 * 
 * Restricciones adicionales
 * 
 * La lista de tareas debe tener un tamaño fijo de 10.
 * 
 * Manejar excepciones para entradas inválidas (por ejemplo, índices fuera de
 * rango o conflictos de fecha y hora).
 * 
 * Mostrar mensajes claros al usuario cuando las operaciones no puedan
 * realizarse (como lista llena o conflictos al añadir/modificar).
 */
public class Principal {
    private static Scanner sc = new Scanner(System.in);
    public static int contador;

    public static void main(String[] args) {

        int opcion = 0;
        int index; 

        TodoList td = new TodoList();
        Tarea tarea;
        do{
            System.out.println("MENÚ");
            System.out.println("1. Añadir tarea");
            System.out.println("2.Modificar tarea");
            System.out.println("3. Listar tareas por fecha");
            System.out.println("0.Salir");
            System.out.println("*************************");
            System.out.println("Introduce una opción ");
            opcion = pedirOpcion();
            switch (opcion) {
                case 1:

                    tarea = pedirDatosTarea();

                    if (tarea != null) {

                        if (td.aniadirTarea(tarea))
                            System.out.println("Se ha añadido la tarea correctamente");
                        ;
                    } else
                        System.out.println("No se ha podido añadir la tarea");
                    break;
                    case 2: 
                        System.out.println("Dime el número de tarea que quieres modificar");
                        // TODO capturar la posible excepción 
                        index = Integer.parseInt(sc.nextLine()); 
                        tarea = pedirDatosTarea();
                    if (tarea != null) {

                        if (td.modificarTarea(index,tarea))
                            System.out.println("Se ha añadido la tarea correctamente");
                        ;
                    } else
                        System.out.println("No se ha podido añadir la tarea");
                    break; 
                    case 3: 
                        // mostrar la lista de tareas
                        System.out.println(td.devolverListadoTareas());
                      
                    break;
            }
        } while (opcion != 0);

    }
    

    private static Tarea pedirDatosTarea() {
        Tarea tarea = null;
        try {
            String titulo, categoria, estado, anio, mes, dia, horas, minutos;
            LocalDate fecha;
            LocalTime hora;

            // pedir datos de tarea y llamar al método de TodoList
            System.out.println("Título");
            titulo = sc.nextLine();
            System.out.println("Categoría (TRABAJO, ESTUDIO, PERSONAL, OTRO)");
            categoria = sc.nextLine();
            System.out.println("Estado (PENDIENTE, EN_PROGRESO, COMPLETADA, CANCELADA)");
            estado = sc.nextLine();
            System.out.println("Fecha - Año");
            anio = sc.nextLine();
            System.out.println("Fecha - Mes");
            mes = sc.nextLine();
            System.out.println("Fecha - Día");
            dia = sc.nextLine();
            System.out.println("Hora - HH");
            horas = sc.nextLine();
            System.out.println("Hora: Minutos ");
            minutos = sc.nextLine();
            fecha = LocalDate.of(Integer.parseInt(anio),
                    Integer.parseInt(mes), Integer.parseInt(dia));
            hora = LocalTime.of(Integer.parseInt(horas),
                    Integer.parseInt(minutos));
            // intancia de la tarea
            tarea = new Tarea(titulo, Categoria.valueOf(categoria),
                    Estado.valueOf(estado), fecha, hora);
            // se añade la tarea a TodoList mediante el método

        } catch (Exception e) {
            System.out.println("Algún valor no es válido");
        }
        return tarea;
    }

    private static int pedirOpcion() {
        int opcion = -1; // valor no válido
        do {
            try {
                opcion = Integer.valueOf(sc.nextLine());

            } catch (Exception e) {
                System.out.println("No es válido el valor introducido");
                System.out.println("Por favor vuelve a introducir una opción del 0 al 3 ");
            }
        } while (opcion < 0 && opcion > 3);
        return opcion;
    }

    

}
