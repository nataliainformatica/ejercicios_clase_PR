package es.avellaneda.ejercicioCine;

import java.util.Scanner;

public class Principal {
    private static Sala[] salas = new Sala[3];
   
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       

        salas[0] = new Sala(3, 4, 4);
        salas[1] = new Sala(2, 6, 6);
        salas[2] = new Sala(1, 5, 8);
        mostrarMenuSalas( );
        // System.out.println(sala[0].mostrarEstado());
    }

    private static void mostrarMenuSalas( ) {
        int  opcion ; 
        Sala sala; 
        boolean continua = true; 

        while(continua){
        System.out.println("¿Qué sala quieres gestionar");
        // TODO , falta capturar posibles exepciones
        opcion = Integer.parseInt(sc.nextLine()); 
        sala =  buscarSala(opcion);


        // mostramos las opciones 
        System.out.println("1. Mostrar el estado de la sala");
        System.out.println("2. Reservar un asiento, indicando fila y número de asiento");
        System.out.println("0.Salir");
        opcion = Integer.parseInt(sc.nextLine()); 
  
        switch (opcion) {
            case 1:
                System.out.println(sala.mostrarEstado()); 
                break;
            case 2:

            // TODO capturar las posibles excepciones
            System.out.println("Indica fila para reservar, de fila  ");
            int fila = Integer.valueOf(sc.nextLine());
            System.out.println("Indica número de asiento");  
            int columna = Integer.valueOf(sc.nextLine());
            
            if(sala.reservarAsiento(fila, columna)){
                System.out.println("El asiento se ha reservado");
            }
                break;
            case 0: 
                continua=false; 
            default:
                break;
        }
    }
        }


    
    
    private static Sala buscarSala(int opcion){

        // foreach   for (tipo nombrevariable : array)
        for(Sala s: salas){
            if (s.getNumeroSala() == opcion){
                return s; 
                // TODO , falta gestionar si el número no es válido 
            }
        }
        return null; 
    }
}

