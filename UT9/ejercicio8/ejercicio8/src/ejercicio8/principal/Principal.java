package principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import model.*;


public class Principal {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de Agenda:");
            System.out.println("1. Cargar citas desde calendario compartido");
            System.out.println("2. Cargar citas desde agenda propia");
            System.out.println("3. Mostrar la agenda de citas (ORDENADAS)");
            System.out.println("4. Eliminar las citas por categoría");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agenda.agregarCitas(new CalendarioCompartidoDAO().cargarCitas());
                    System.out.println("Citas cargadas desde el calendario compartido.");
                    break;
                case 2:
                    agenda.agregarCitas(new AgendaPropiaDAO().cargarCitas());
                    System.out.println("Citas cargadas desde la agenda propia.");
                    break;
                case 3:
                    System.out.println("Citas ordenadas por fecha y hora:");
                    // TODO  - CAMBIAR PARA QUE DEVUELVE LA COLECCIÓN
                    // Y EL MÉTODO MOSTRAR ESTARÁ EN LA CLASE PRINCIPAL
                    if(agenda.devolverCitas().isEmpty()){
                        System.out.println("NO HAY CITAS");
                    }else{
                    for(Cita c: agenda.devolverCitas()){
                        System.out.println(c);
                    }}
                
                    break;
                case 4:
                System.out.print("Ingrese la categoría a buscar: ");
                String categoria = scanner.nextLine();
                Iterator<Cita> it = agenda.devolverCitas().iterator();


                ArrayList<Cita> citasPorCategoria = agenda.obtenerCitasPorCategoria(categoria);
                while(it.hasNext()){
                    Cita cita = it.next(); 
                    if(cita.getCategoria().equalsIgnoreCase(categoria)){
                        it.remove();
                        System.out.println("\u001B[31mELIMINAMOS \u001B[0m" + cita);
                    }
                }
                
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
            }
        } while (opcion != 5);
    }
}

