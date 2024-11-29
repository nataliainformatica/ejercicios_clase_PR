package es.avellaneda;

import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {
        // Permitir al usuario realizar las siguientes acciones:
        Scanner sc = new Scanner(System.in);

        Habitacion habitaciones[];

        boolean continua = true;
        habitaciones = crearHabitaciones();
        String opcion = "0";
        while (continua) {

            System.out.println("1. Mostrar el estado del hotel");
            System.out.println("2. Reservar una habitación: Asignar un huésped a la primera habitación disponible.");
            System.out.println("3. Cancelar una reserva: Indicar el número de habitación a liberar");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    mostrarEstado(habitaciones);
                    break;
                case "2":
                    System.out.println("Nombre del huésped ");
                    if (reservarHabitacion(habitaciones, sc.nextLine())) {
                        System.out.println("Se ha reservado la habitación");
                    } else
                        System.out.println("No se ha podido reservar");
                    break; 
                case "0":
                    continua = false;
                    break;
                default:
                    break;
            }

        }
    }

    private static boolean reservarHabitacion(Habitacion[] habitaciones, String huesped) {

        // buscar la primera habitación libre
        for (Habitacion h : habitaciones) {
            if (!h.mostrarEstado()) {
                h.reservarHabitacion(huesped);
                return true;
            }
        }
        return false;

    }

    private static void mostrarEstado(Habitacion habitaciones[]) {
        // recorreremos el array de habitaciones, mostrando el estado
        for (Habitacion habitacion : habitaciones) {

            System.out.println(habitacion);
        }

    }

    private static Habitacion[] crearHabitaciones() {
        final int MAX = 10;
        Habitacion[] habitaciones = new Habitacion[MAX];
        // el número de la habitación (1 a 10).
        for (int i = 0; i < MAX; i++) {
            habitaciones[i] = new Habitacion((i + 1));
        }
        return habitaciones;

    }

}
