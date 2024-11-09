
package ejemplod1;

import java.util.Arrays;

/**
 *   El objeto Cuadrado se crea mediante un array de 4 objetos del tipo punto
 * 
 *  Métodos públicos serán calcularPerimetro y calcularArea
 * 
 * 
 * @author natali
 */
public class Cuadrado {
    
    private Punto cuatroPuntos[];
    
    public Cuadrado (Punto[] cuatroPuntos) {
        
        this.cuatroPuntos = cuatroPuntos;
    }

    public Punto[] getCuatroPuntos() {
        return cuatroPuntos;
    }

    public void setCuatroPuntos(Punto[] cuatroPuntos) {
        this.cuatroPuntos = cuatroPuntos;
    }
    
    public double calcularLado(){
         return (cuatroPuntos[0].distancia(cuatroPuntos[1]));
    }
    
    public double calcularPerimetro(){
        // para calcular el perímetro necesito conocer cualquiera de los lados 
        // la primera forma, es haciendo el cálculo sabiendo que los dos puntos están
        // en el mismo eje - voy a utilizar la posición0 y la posición 1 
        /*
        double distanciaEntrePuntos= cuatroPuntos[0].getX() - cuatroPuntos[1].getY();
        double perimetro = distanciaEntrePuntos * 4; 
        
        return distanciaEntrePuntos2;*/
        // la segunda forma es calcular la distancia entre los dos puntos
        // utilizando el método distancia(Punto puntoRecibido)
        //   
        double distanciaEntrePuntos2 = (cuatroPuntos[0].distancia(cuatroPuntos[1]))*4;
        
      
        return distanciaEntrePuntos2;
    }
    
    public double calcularArea(){
        return Math.pow(calcularLado(),2);
        
    }

    @Override
    public String toString() {
        return   Arrays.toString(cuatroPuntos );
    }
    
    
     
    
     
}
