package es.avellaneda.ejercicioCine;

import java.util.Scanner;

public class Principal {
    private static Sala[] salas = new Sala[3];

    Sala sala = new Sala(new boolean[3][3]);
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       

        salas[0] = new Sala(3, 4, 4);
        salas[1] = new Sala(2, 6, 6);
        salas[2] = new Sala(1, 5, 8);

        // System.out.println(sala[0].mostrarEstado());
    }

    private void mostrarMenuSalas( ) {
        int  opcion ; 
        Sala sala; 
        System.out.println("¿Qué sala quieres gestionar");
        // TODO , falta capturar posibles exepciones
        opcion = Integer.parseInt(sc.nextLine()); 
        sala =  buscarSala(opcion);
        // mostramos las opciones 
        System.out.println("1. Mostrar el estado de la sala");
        System.out.println("2. Reservar un asiento, indicando fila y número de asiento");
        opcion = Integer.parseInt(sc.nextLine()); 

        switch (opcion) {
            case 1:
                sala.mostrarEstado(); 
                break;
            case 2:
                
                break;
        
            default:
                break;
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
