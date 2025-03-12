package ut9.ejercicio2.comparadores;

import java.util.Comparator;

import ut9.ejercicio2.modelo.Producto;

public class ComparadorPorAncho implements Comparator<Producto> {

    // siempre de mayor a menor.
    @Override
    public int compare(Producto producto1, Producto producto2) {
        return Double.compare(producto2.getAlto(), 
            producto1.getAlto());
    }


   

}
