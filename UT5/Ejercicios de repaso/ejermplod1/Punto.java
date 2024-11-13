
package ejemplod1;

/**
 * Punto: representa un punto de dos dimensiones en un plano
 * 
•        public void imprime() // Imprime por pantalla las coordenadas. Ejemplo: “(7, -5)”

•        public void setXY(int x, int y) // Modifica ambas coordenadas. 
* Es como un setter doble.

•        public void desplaza(int dx, int dy) // 
* Desplaza el punto la cantidad (dx,dy) indicada. 
* Ejemplo: Si el punto (1,1) se desplaza (2,5) entonces estará en (3,6).

•        public double distancia(Punto p) // 
* Calcula y devuelve la distancia entre el propio objeto (this) y otro objeto (Punto p) 
* que se pasa como parámetro: distancia entre dos coordenadas.
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
    
    /**Constructor que incializa el objeto mediante una copia de otro objeto
     * 
     * @param punto 
     */
    public Punto(Punto punto){
        
       
        this.x = punto.getX();
        this.y = punto.getY();
        
    }
    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }
    
    public String imprime(){
        return "Coordenadas del punto{" + "x=" + x + ", y=" + y + '}';
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
 
    public void setXY(int x, int y ){
        this.x=x;
        this.y=y;
    }
    
    
    public double distancia(Punto puntoRecibido){
        // d = sqrt((x2-x1)² + (y2-y1)²)
        
        // x2 son las coordenadas del puntoRecibido
        // pow(double a, double b)
        
        double valorIntermedio;
        valorIntermedio= Math.pow((puntoRecibido.getX()- this.x),2)
                + Math.pow((puntoRecibido.getY()- this.y ),2);
        return Math.sqrt(valorIntermedio);
        
        
    }
    public void desplaza(Punto punto){
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
