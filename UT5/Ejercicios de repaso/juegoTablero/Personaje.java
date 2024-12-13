package es.avellaneda.juegoTablero;

import java.util.Random;

/**
 * Tendrá un avatar (que en realidad es un carácter).
 * Tendrá un atributo fuerza, que al crear el Personaje es 0.
 * Tendrá un método mover, que se invocará al mover el personaje por el tablero,
 * lo que hace es incrementar la fuerza en uno.
 * Tendrá un método cambiarAvatar, que solo permitirá cambiar
 * el avatar si la fuerza es >3, porque el cambio de avatar implica
 * perder 3 puntos de fuerza
 * 
 * 
 */
public class Personaje {

    private int fuerza;
    private char avatar;
    private int x, y;

    public Personaje(char avatar) {
        this.avatar = avatar;
        // en realidad, estas tres líneas no son necesarias
        this.x = 0;
        this.y = 0;
        this.fuerza = 0;
    }
    public Personaje(char[] AVATARES, int max){
        // personaje por defecto, avatar random
        Random rd = new Random();
        this.avatar = AVATARES[rd.nextInt(AVATARES.length)];
        this.fuerza = rd.nextInt(max);

    }

    /**
     * Tendrá un método cambiarAvatar, que solo permitirá cambiar
     * el avatar si la fuerza es >3, porque el cambio de avatar implica
     * perder 3 puntos de fuerza
     * 
     * @return
     */
    public boolean cambiarAvatar(char avatar) {
        boolean resultado = false;
        if(fuerza>3){
            this.avatar=avatar; 
            this.fuerza = fuerza -3; 
            resultado = true; 
        }
        return resultado;

    }
 // Tendrá un método mover, que se invocará al mover el personaje por el tablero, 
 //  lo que hace es incrementar la fuerza en uno. 
    public void mover(){ 

        // TODO , pendiente ver si le paso tipo de movimiento para cambiar las coordenadas
        fuerza ++;


        //

    }
    @Override
    public String toString() {
        // al concatenar el char con un string lo convierto a string
        return avatar+"";
    }
    

}
