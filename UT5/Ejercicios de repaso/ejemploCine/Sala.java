package es.avellaneda.ejercicioCine;


/**
 * 
 * Sala con X filas y Y asientos por fila.
 * Debes crear la clase Sala,
 * que tendrá un array bidimensional para representar los asientos.
 * 
 * 
 * Se te pide implementar un programa que permita gestionar una sala que indique
 * el usuario. Con las siguientes opciones:
 * 
 * Permita al usuario visualizar el estado de la sala.
 * 
 * Permita al usuario reservar un asiento indicando la fila y el número del
 * asiento. Debe verificar si un asiento está libre antes de reservarlo. Si el
 * asiento ya está ocupado, muestre un mensaje adecuado.
 * 
 * El programa debe repetirse hasta que el usuario decida salir.
 */
public class Sala {

    private boolean[][] asientos;

    private int numeroSala;
    public Sala (boolean[][] asientos){
        this.asientos = asientos; 
    }

    public Sala(int numeroSala, int filas, int columnas) {
        this.numeroSala = numeroSala;
        this.asientos = new boolean[filas][columnas];
    }

    public String mostrarEstado() {
        // voy a mostrar el estado con x y -
        // x significa ocupado
        // - significa libre
        // por ejemplo la sala 3 que tiene 4 filas con 4 asientos
        // x x x x
        // - x - x
        // - - - -
        // x x x x

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                sb.append(asientos[i][j] ? "x" : "-");
                sb.append(" ");
            }
            sb.append("\n");
        }

        return sb.toString();

    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public boolean  reservarAsiento(int fila, int columna){
        boolean resultado = false; 
        // en nuestro código hemos definido true como ocupado 
        if(!asientos[fila][columna]){
            // reservo el asiento
            asientos[fila][columna]= true; 
            resultado = true;

        }
        return resultado; 
    }


    

}
