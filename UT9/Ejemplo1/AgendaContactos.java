package mapas.Ejemplo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AgendaContactos {
    private static Scanner sc = new Scanner(System.in);
    private static Map<Integer,String> agenda = new HashMap();
    public static void main(String[] args) {
    

        menu();

    }

    private static void menu() {
        String opcion;
     
        do {
            System.out.println("1. Insertar contacto");
            System.out.println("2. Consultar contacto");
            System.out.println("3. Mostrar todos los contactos");
            System.out.println("4.Salir");

            opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    try{
                    insertarContacto();
                }catch(IllegalArgumentException ex){
                    System.out.println("El número introducido no es válido");
                }
                    break;
                case "2":
                try{
                    consultarContacto();
                }catch(IllegalArgumentException ex){
                    System.out.println("El número introducido no es válido");
                }
                    break;
                case "3":
                    mostrarTodos();
                    break;
                case "4":
                System.out.println("FIN DE LA APLICACIÓN");
                    break;

                default:
                System.out.println("NO es un valor válido");
                    break;
            }

        } while (!opcion.equals("4"));

    }
    private static void insertarContacto(){
        String nombre; 
        int numero; 

        System.out.println("Número de contacto" );
        numero = Integer.parseInt(sc.nextLine()); 
        System.out.println("Nombre del contacto ");
        nombre = sc.nextLine(); 

        // ojo que si el número existe, directamente va a cambiar el número
        // después añadiremos código para asegurar que se quiere modificar
        agenda.put(numero, nombre);
        //
    }
    /*
     * CONSULTAR POR NÚMERO
     */
    private static void consultarContacto(){
        String nombre; 
        int numero; 
        System.out.println("Número a consultar ");
        numero = Integer.parseInt(sc.nextLine()); 
        nombre =  agenda.get(numero); 
        System.out.println("El nombre es:  " + nombre);


    }
    private static void mostrarTodos(){

        for(Integer numero : agenda.keySet()){
            System.out.println("NÚMERO "+ numero + " ---  NOMBRE "+ agenda.get(numero));
        }
    }

}
