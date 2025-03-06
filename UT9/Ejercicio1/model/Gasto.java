package ut9.Ejercicio1.model;

import ut9.Ejercicio1.excepciones.GastoInvalidoException;
import ut9.Ejercicio1.excepciones.ImportePositivoException;

/*
 * La clase Gasto representará un gasto 
 * con un importeGasto(double), 
 * categoría (tipo enumerado) 
 * y detalle(String).
 */

public class Gasto implements Transaccion {

    private double importeGasto;
    private Categoria categoria; 
    private String detalle; 

    //Gasto lanzará una excepción personalizada 
    //(GastoInvalidoException) si el monto es negativo 
    // (tanto desde el constructor, como desde el setter)

    
    @Override
    public double devolverImporte() {
        
        return importeGasto;
    }

    public Gasto(double importeGasto, Categoria categoria, String detalle) {
        
        if (importeGasto <0){
            throw new GastoInvalidoException("El importe es negativo"); }
        this.importeGasto = importeGasto;
        this.categoria = categoria;
        this.detalle = detalle;
    }

    public double getImporteGasto() {
        return importeGasto;
    }

    public void setImporteGasto(double importeGasto) {

        // comprobar el importe y si es negativo lanza la excepción
        if(importeGasto<0){
            throw new GastoInvalidoException("El importe es negativo"); 
        }
        this.importeGasto = importeGasto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    

}
