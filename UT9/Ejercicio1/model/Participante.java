package ut9.Ejercicio1.model;

import java.util.ArrayList;

import ut9.Ejercicio1.excepciones.ImportePositivoException;

public class Participante extends Persona {

    /**
     * La clase Participante representará a cada persona involucrada en los gastos.
     * 
     * Cada Participante tendrá una lista de Transaccion (gastos e ingresos).
     * 
     * 
     */

     // constructor    COPIA

     public Participante(Participante participante){
        super(participante.getNombreApellidos(), 
            participante.getDNI(), participante.getTelefono());
     }

    private ArrayList<Transaccion> gastosIngresos;

    public Participante(String nombreApellidos, String dNI, String telefono) {
        super(nombreApellidos, dNI, telefono);
        gastosIngresos = new ArrayList<>();
    }
 
    // Se podrá agregar transacciones (gastos o ingresos) a un participante.

    public void agregarTransaccion(Transaccion transaccion) {
        // es necesario calcular el importe tota, y si es positivo 
         gastosIngresos.add(transaccion);
         devolverTotal(); 
    }
  /**
     * Se podrá consultar el importe
     * pendiente de cada participante ( ingresos - gastos ).
     */
       /*
     * Si el participante tiene mayor importe en ingresos que en gastos, se
     * propagará una excepción **ImportePositivoException**, con los datos del
     * participante y el importe resultante.
     */
    private double devolverTotal(){
        // recorre el arraylist de Transacción, si es Gasto es negativo, 
        double total=0; 
        for(Transaccion t: gastosIngresos){
            if(t instanceof Gasto){
                // el importe es negativo
                total -= t.devolverImporte();

            }else if(t instanceof Ingreso){
                // el importe es positivo
                total+= t.devolverImporte(); 

            }
            if(total>0)
                throw new ImportePositivoException(new Participante( this),total);
        }
        
        return  total;
    }

  


    // el método abstracto me lo invento
    @Override
    public String devuelveTipo() {

        return getClass().toString();
    }

}
