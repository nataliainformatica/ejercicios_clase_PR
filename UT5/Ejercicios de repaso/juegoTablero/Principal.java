package es.avellaneda.juegoTablero;

import java.util.Random;

/*
 * Vamos a escribir un juego en el que nos mostrará un tablero de 5 x 5 posiciones 
 * 
 * Avatares disponibles: (?, *, ¿, +, %) 
 */

public class Principal {
    private static final int FIL = 5;
    private static final int COL = 5;
    private static final int MAX = 5;
    private static Personaje[][] tablero = new Personaje[FIL][COL];
    static final char[] AVATARES = { '?', '*', '¿', '+', '%' };

    public static void main(String[] args) {
        Personaje miPersonaje; 
        Random rd = new Random();
        // crear los tres personajes
        // tablero está relleno de null
        // TODO , hacer el mismo caso utilizando un Personaje '-' que significa vacío
        int x, y,contador =0;

        do{
            x = rd.nextInt(tablero.length);
            // es un tablero regular, es decir todas las filas tienen las mismas columnas
            y = rd.nextInt(tablero[0].length);

            if (tablero[x][y] == null) {
                // crear personaje aleatorio
                tablero[x][y]= crearPersonaje();
                contador++; 
            }

        }while(contador<=3);

        // TODO añadir el menú para pedir al usuario qué avatar quiere. 
        // de momento vamos a usar '*'

        tablero[0][0]=miPersonaje = new Personaje('*');
        mostrarTablero();

        

    }
    public static void mostrarTablero(){
        for(int i=0; i< tablero.length; i++){
            for(int j=0; j<tablero[i].length; j++){
                if(tablero[i][j] !=null)
                    System.out.print(tablero[i][j]+ " ");
                else 
                    System.out.print("-"+ " ");

            }
            System.out.println();
        }
    }


    public static Personaje crearPersonaje(char avatar) {
        // personaje con avatar, fuerza 0, y posición 0,0

        return new Personaje(avatar);
    }

    public static Personaje crearPersonaje() {
        // avatar aleatorio
        // fuerza aleatoria
        return new Personaje(AVATARES, MAX);
    }

}
