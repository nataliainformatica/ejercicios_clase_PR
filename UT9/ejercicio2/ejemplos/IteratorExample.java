package ut9.ejercicio2.ejemplos;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("Kotlin");

        Iterator<String> iterador = lista.iterator();

        while (iterador.hasNext()) {
            String elemento = iterador.next();
            System.out.println(elemento);

            // Eliminando un elemento específico
            if (elemento.equals("Python")) {
                iterador.remove();
            }
        }

        System.out.println("Lista después de la eliminación: " + lista);
    }
}