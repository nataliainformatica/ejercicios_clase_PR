import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistroEventos {
    public static void main(String[] args) {
        int contador =0; 
        Scanner scanner = new Scanner(System.in);
        String[]  eventos = new String[20];
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.println("¡Bienvenido al registro de eventos!");
        String opcion;

        do {
            System.out.println("\n¿Qué deseas hacer?");
            System.out.println("1. Registrar un nuevo evento");
            System.out.println("2. Ver eventos registrados");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Ingresa la descripción del evento: ");
                    String descripcion = scanner.nextLine();
                    
                    // Obtener la fecha y hora actual
                    LocalDate fechaActual = LocalDate.now();
                    LocalTime horaActual = LocalTime.now();
                    
                    // Formatear la fecha y hora
                    String fechaFormateada = fechaActual.format(dateFormatter);
                    String horaFormateada = horaActual.format(timeFormatter);
                    
                    // Registrar el evento
                    eventos[contador] = "Evento: " + descripcion + " | Fecha: " + fechaFormateada + " | Hora: " + horaFormateada;
                    contador ++; 
                    System.out.println("¡Evento registrado exitosamente!");
                    break;

                case "2":
                    System.out.println("\nEventos registrados:");
                    if (eventos.isEmpty()) {
                        System.out.println("No hay eventos registrados.");
                    } else {
                        for (int i=0; i<(contador-1); i++) {
                            System.out.println(evento);
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
