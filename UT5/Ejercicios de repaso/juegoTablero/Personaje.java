

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
    public void mover(int x, int y){
       this.x = x; 
       this.y = y; 
       fuerza++;
  
     
    }

    public boolean comer(Personaje otroPersonaje){
        boolean resultado= false; 
        if(this.equals(otroPersonaje)|| this.fuerza>=otroPersonaje.fuerza)  {
       // si es el mismo avatar gana y se come al otro
       // si no es el mismo pero tiene más fuerza también gana y se come al otro
            this.fuerza = this.fuerza + otroPersonaje.fuerza;
            resultado = true;
        
        }return resultado;
    }
    @Override
    public String toString() {
        // al concatenar el char con un string lo convierto a string
        return avatar+"";
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + avatar;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Personaje other = (Personaje) obj;
        if (avatar != other.avatar)
            return false;
        return true;
    }
    public int getFuerza() {
        return fuerza;
    }
    public char getAvatar() {
        return avatar;
    }
    

}
