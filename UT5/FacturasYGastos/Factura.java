package facturasyGastos;

import javax.imageio.stream.FileCacheImageOutputStream;

public class Factura {

    // ATRIBUTOS
    private int numGastos;
    private double[] gastos;

    // CONSTRUCTOR
    /**
     * En el momento de crear la instancia, se definirán el número de gastos que
     * tiene la factura.
     * Después será posible almacenar los gastos en la factura.
     * 
     * @param numGastos
     */

    public Factura(int numGastos) {
        this.numGastos = numGastos;
        this.gastos = new double[numGastos];
    }

    /**
     * Factura tendrá un método que permitirá conocer el total de la factura.
     * 
     * 
     * @return
     */

    public double devolverTotal() {
        double total = 0;
        // for(int i=0; i<numGastos; i++)
        for (int i = 0; i < gastos.length; i++) {
            total = total + gastos[i];
        }

        return total;
    }
    /*
     * Factura tendrá un método que permitirá conocer cualquiera de los gastos, si
     * se pasa un número de gasto que no existe, devolverá cero.
     */

    public double devolverGasto(int indice) {

        try {
            return gastos[indice];
        } catch (Exception ex) {
            return 0;
        }

    }

    public void aniadirGasto(double gasto, int indice) {
        // gastos es el array
        gastos[indice] = gasto;

    }

    public int getNumGastos() {
        return numGastos;
    }

    public void setNumGastos(int numGastos) {
        this.numGastos = numGastos;
    }

    public double[] getGastos() {
        return gastos;
    }

    public void setGastos(double[] gastos) {
        this.gastos = gastos;
    }

}
