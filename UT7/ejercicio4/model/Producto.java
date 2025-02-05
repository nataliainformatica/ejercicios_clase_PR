package es.avellaneda.model;

public  abstract class Producto {
    // modificadores Protected

    // las clases hijas tengan visibilidad de los atributos
    // de la superclase
    

    protected String nombre;
    protected double peso; 
    protected double alto, ancho, profundidad; 


   

    public Producto(String nombre, 
        double peso, double alto, 
        double ancho, double profundidad) {
        this.nombre = nombre;
        this.peso = peso;
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }
    

    public abstract double calcularCosteEnvio();
/**
 * Método concreto double volumen():
 *  calcula el volumen del producto usando 
 * sus dimensiones. 
 * V = ALTO × ANCHO × PROFUNDIDAD
 * @return volumen
 */
    public double volumen(){
        double resultado =  alto * ancho * profundidad; 
        return resultado; 
    }


@Override
public String toString() {
    return "Producto [nombre=" + nombre + ", peso=" + peso + ", alto=" + alto + ", ancho=" + ancho + ", profundidad="
            + profundidad + "]";
}

// TODO getters y setters 
    

}
