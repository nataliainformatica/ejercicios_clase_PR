package es.avellaneda.model;

public class Mueble extends Producto{

 
    private Material material;
    private boolean requiereMontaje; 
    
    public Mueble(String nombre, double peso, 
      double alto, double ancho, 
            double profundidad, Material material, 
            boolean requiereMontaje) {
        super(nombre, peso, alto, ancho, profundidad);
        this.material = material;
        this.requiereMontaje = requiereMontaje; 
    }

    @Override
    public double calcularCosteEnvio() {
        if (requiereMontaje) {
            return ((peso * 5) + (volumen() * 30)) + 15;
        } else
            return ((peso * 5) + (volumen() * 30));
    }

    @Override
    public String toString() {
        return "Mueble [material=" + super.toString() + " " + material + ", requiereMontaje=" + requiereMontaje + "]";
    }

    

}
