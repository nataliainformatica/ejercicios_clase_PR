import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

// Clase Tarea
class Tarea {
    private String nombre;
    private String descripcion;
    private LocalDate fechaVencimiento;

    // Constructor
    public Tarea(String nombre, String descripcion, LocalDate fechaVencimiento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaVencimiento = fechaVencimiento;
    }

    // Getter para mostrar la información de la tarea
    public String getDetalle() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Tarea: " + nombre + 
               " | Descripción: " + descripcion + 
               " | Vence el: " + fechaVencimiento.format(formatter);
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
}

public class GestionTareas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_TAREAS =20; 
        int contador =0; 
       Tarea[] tareas = new Tarea[MAX_TAREAS];
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("¡Bienvenido al gestor de tareas!");

        String opcion;
        do {
            System.out.println("\n¿Qué deseas hacer?");
            System.out.println("1. Añadir una nueva tarea");
            System.out.println("2. Ver todas las tareas");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    try {
                        // Capturar los datos de la nueva tarea
                        System.out.print("Nombre de la tarea: ");
                        String nombre = scanner.nextLine();

                        System.out.print("Descripción de la tarea: ");
                        String descripcion = scanner.nextLine();

                        System.out.print("Fecha de vencimiento (dd/MM/yyyy): ");
                        String fechaStr = scanner.nextLine();
                        LocalDate fechaVencimiento = LocalDate.parse(fechaStr, dateFormatter);

                        // Crear y agregar la tarea
                        Tarea nuevaTarea = new Tarea(nombre, descripcion, fechaVencimiento);
                        tareas[contador]=nuevaTarea;
                        contador++;
                        System.out.println("¡Tarea añadida exitosamente!");
                    } catch (DateTimeParseException e) {
                        System.out.println("Formato de fecha inválido. Usa el formato dd/MM/yyyy.");
                    }
                    break;

                case "2":
                    System.out.println("\nTareas registradas:");
                    if (tareas.isEmpty()) {
                        System.out.println("No hay tareas registradas.");
                    } else {
                      
                        for (inti=0; i<contador; i++) {
                            System.out.println(tareas[i].getDetalle());
                        }
                    }
                    break;

                case "3":
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (!opcion.equals("3"));

        scanner.close();
    }
}
