package es.avellaneda.model;

public class Electrodomestico extends Producto {

    private Tipo tipo;
    private boolean esFragil;
    private double consumo; 

    public Electrodomestico(String nombre, double peso,
            double alto, double ancho, double profundidad, Tipo tipo, boolean esFragil) {
        super(nombre, peso, alto, ancho, profundidad);
        this.tipo = tipo;
        this.esFragil = esFragil;
    }

    /**
     * El costo base se calcula como: (peso * 10) + (volumen() * 50).
     * 
     * Si el electrodoméstico es frágil
     * (esFragil == true), agregar un 20% extra al costo total.
     */
    @Override
    public double calcularCosteEnvio() {
        if (esFragil) {
            return ((peso * 10) + (volumen() * 50)) * 1.20;
        } else
            return ((peso * 10) + (volumen() * 50));
    }

    @Override
    public String toString() {
        return "Electrodomestico [tipo=" + super.toString()+ " "
          + tipo + ", esFragil=" + esFragil + "]";
    }

    public double calcularConsumo(){
        return consumo; 
    }

}
