package ut9.Ejercicio1;

public class Ingreso implements Transaccion {

    private double importeIngreso;
    private String descripcion; 

    
    public Ingreso(double importeIngreso, String descripcion) {
        this.importeIngreso = importeIngreso;
        this.descripcion = descripcion;
    }


    @Override
    public double devolverImporte() {
        return importeIngreso; 
        
    }

}
