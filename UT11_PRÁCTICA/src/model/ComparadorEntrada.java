package model;

import java.util.Comparator;

public class ComparadorEntrada implements Comparator<Entrada> {

    @Override
    public int compare(Entrada o1, Entrada o2) {
        // primero comparamos la fecha de la entrada
        int comparacion = o1.getFecha().compareTo(o2.getFecha());

        if (comparacion == 0) {
            // si son iguales es necesario comparara por el siguiente atributo
            return o1.getHora().compareTo(o2.getHora());
        }
        return comparacion;

    }
}