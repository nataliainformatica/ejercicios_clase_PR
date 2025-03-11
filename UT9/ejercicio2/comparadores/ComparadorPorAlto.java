package ut9.ejercicio2.comparadores;

import java.util.Comparator;
import ut9.ejercicio2.modelo.*;;


public class ComparadorPorAlto implements Comparator<Producto>{

    @Override
    public int compare(Producto producto1, Producto producto2) {
       return Double.compare(producto1.getAlto(), producto2.getAlto());

    }

}
