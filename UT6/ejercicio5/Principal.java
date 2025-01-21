package es.avellaneda.ejercicio5;

import java.util.Scanner;

/**
 * Sistema de Reservas de Vuelos
 * El objetivo de este ejercicio es desarrollar un sistema
 * de reservas de vuelos que permita gestionar la información
 * de vuelos, pasajeros y reservas de forma organizada.
 * Se deben implementar las siguientes clases y funcionalidades:
 * Clase Vuelo
 */
public class Principal {
    private final static int MAX = 5;
    private static Scanner sc = new Scanner(System.in);;

    public static void main(String[] args) {

        DAOvuelos DAO = new DAOvuelos(); 
        DAOpasajeros DAOp = new DAOpasajeros(); 
        Vuelo[] vuelos = DAO.getVuelos(); 
        Pasajero[] pasajeros = DAOp.getPasajeros(); 

        Reserva[] reservas = new Reserva[MAX]; 
        int num_reserva =0; 
        int opcion; 


        mostrarVuelos(vuelos); 
        mostrarPasajeros(pasajeros);
        // comprobar si hay espacio para crear reservas
        // si hay espacio se crea la reserva, si no no se crea
       
        opcion = opcionMenu(); 
        switch (opcion) {
            case 1:
                mostrarVuelos(vuelos);
                
                break;
                case 2:
                mostrarPasajeros(pasajeros);(vuelos);
                
                break;
            case 3: 
                // pedir el pasajero al usuario y el vuelo
                Vuelo vuelo = pedirVuelo(vuelos);
                // se queda aquí 
                if(num_reserva < reservas.length){
                // llamamos al método de  crearReserva(...)
                 // incrementar el número de reserva
                 crearReserva(pasajeros[0], vuelo, reservas, num_reserva);
                 num_reserva++; 
         
            }
        
            default:
                break;
        }

        
        mostrarReservas(reservas);
        
    }

    // Descripción: Implementa un menú para interactuar con el sistema.
    /*
     * /
     * Opciones del menú:
     * 
     * a. Listar vuelos disponibles:
     * Muestra la lista de vuelos generada por el método getVuelos()
     * de la clase DAOvuelos.
     */

    private static void mostrarVuelos(Vuelo[] vuelos) {
        for (Vuelo v : vuelos) {
            System.out.println(v);
            System.out.println("\n");
        }
    }

    /*
     * b.Listar pasajeros disponibles:
     * Muestra la lista de pasajeros generada por el método
     * getPasajeros() de la clase DAOpasajeros.
     */
    private static void mostrarPasajeros(Pasajero[] pasajeros) {
        for (Pasajero p : pasajeros) {
            System.out.println(p);
            System.out.println("\n");
        }

    }

    /**
     * c.Realizar una reserva:
     * Permitir al usuario seleccionar un vuelo y
     * un pasajero de las listas.
     * Crear una nueva instancia de Reserva
     * asociando el vuelo y el pasajero seleccionados.
     */
    private static void crearReserva(Pasajero pasajero, Vuelo vuelo,
            Reserva[] reservas, int num_reserva) {

        // añade la instancia de reserva al array
        reservas[num_reserva] = new Reserva(vuelo, pasajero);

    }

    /**
     * d.Mostrar reservas realizadas: Listar todas las reservas
     * creadas.
     * 
     */

    private static void mostrarReservas(Reserva[] reservas) {
        for (Reserva r : reservas) {
            if (r != null)
                System.out.println(r);
        }
    }

    private static int opcionMenu() {

        int opcion = -1;
        do {
            System.out.println("1. Listar vuelos");
            System.out.println("""
                    1. Listar vuelos
                    2. Listar Pasajeros
                    3. Realizar una reserva
                    4. Mostrar reservas realizadas
                    5. Salir
                    """);
            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Debes volver a introducir el valor");
                opcion = -1;
            }
        } while (opcion < 1 && opcion > 5);

        return opcion;

    }

    private static Vuelo pedirVuelo(Vuelo[] vuelos) {
        // mostramos los vuelos y pedimos al usuario que nos de un valor
        Vuelo vuelo =null;
        int indice;
        mostrarVuelos(vuelos);
        System.out.println("Introduce el número de vuelo");
        try {
            indice = Integer.parseInt(sc.nextLine());
            vuelo = vuelos[indice];
        } catch (Exception e) {
            System.out.println("No es válido");

        }
        // cuidado que es posible retornar un null
        return vuelo;

    }

}
