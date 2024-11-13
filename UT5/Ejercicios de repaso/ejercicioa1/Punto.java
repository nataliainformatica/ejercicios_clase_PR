
package ejercicioa1;

/**
 * Punto: representa un punto de dos dimensiones en un plano
 * 
 * 
 * @author natali
 */
public class Punto {
    
    
    private int x;
    private int y;
    
    public Punto(int x, int y){
        this.x =x;
        this.y =y;
    }

    
    //sobrecarga
    
    public Punto(Punto punto){
        
       
        this.x = punto.getX();
        this.y = punto.getY();
        
    }
    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
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
 
    public void setCoordenadas(int x, int y ){
        this.x=x;
        this.y=y;
    }
    public void sumarCoordenadas(Punto punto){
        this.x=this.x + punto.getX();
        this.y+= punto.getY();
    }
    public void invertirCoordenadas(){
        int aux;
        aux =x;
        x=y;
        y=aux;
    }
}
