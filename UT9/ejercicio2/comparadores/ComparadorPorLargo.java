package ut9.ejercicio2.comparadores;

import java.util.Comparator;

import ut9.ejercicio2.modelo.Producto;

public class ComparadorPorLargo implements Comparator<Producto>  {

    @Override
    public int compare(Producto producto1, Producto producto2) {
          //siempre de mayor a menor.
        // largo es double - tipo primitivo
        // wrapper - envuelvo el valor en un Double
        // puedo utilizar compareTo 
        Double valor1 = producto1.getLargo(); 
        Double valor2 = producto2.getLargo();
        return valor2.compareTo(valor1);       
    }

}
