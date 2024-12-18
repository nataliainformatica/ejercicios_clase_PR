package es.avellaneda.repasoArrays;

import java.time.LocalDate;
import java.util.Scanner;

/*
Crearemos una clase llamada Tarea, 
donde cada tarea tiene un nombre, 
una descripción y una fecha de vencimiento 
(utilizando LocalDate). 

Para crear la fecha se puede utilizar el método: 
static LocalDate	
LocalDate.of(int year, int month, int dayOfMonth)

Obtains an instance of LocalDate from a year, month and day.
*/
public class EjemploClase {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean continua = true;
        int contador =0; 
        Tarea[] tareas = new Tarea[20];
        String opcion;
        do {
            System.out.println("1.Introduce una tarea");
            System.out.println("2. Muestra las tareas");
            opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    // pedir los datos al usuario, para crear la tarea
                    tareas[contador] = crearTarea(); 
                    contador ++; 
                    System.out.println("Se ha creado la tarea");
                    break;
                case "2":
                    mostrarTareas(tareas, contador);

                    break;
                default:
                    break;
            }

        } while (continua);

    }
public static void mostrarTareas(Tarea[] tareas, int contador){

    for(int i = 0 ; i< contador; i++){
        System.out.println(tareas[i]);
    }
    // alternativa

    for(Tarea t: tareas){
        if(t!= null){
               System.out.println(t); 
        }
    }
}
    public static Tarea crearTarea() {

        Tarea tarea;
        int dia, mes, anio;
        String nombre, descripcion;
        LocalDate fecha= null; 
        boolean error = false;

        System.out.println("Dime el nombre");
        nombre = sc.nextLine();
        System.out.println("Dame la decripción");
        descripcion = sc.nextLine();
        do {
            try {
                System.out.println("Dame el día de vencimiento");
                dia = Integer.parseInt(sc.nextLine());
                System.out.println("Dame el mes de vencimiento");
                mes = Integer.parseInt(sc.nextLine());
                System.out.println("Dame el año de vencimiento");
                anio = Integer.parseInt(sc.nextLine());
                fecha = LocalDate.of(anio,mes,dia);
                error = false; 
            } catch (Exception ex) {
                error = true;
                System.out.println("Los datos introducidos no son válidos");
            }
        } while (error);
        tarea =new Tarea(nombre, descripcion, fecha); 

        return tarea;

    }

}
