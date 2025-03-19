<<<<<<< HEAD
package model;

import java.util.Comparator;

// Comparator para ordenar por título en TreeSet
public class ComparadorTitulo implements Comparator<Libro> {
    @Override
    public int compare(Libro l1, Libro l2) {
        return l1.getTitulo().compareTo(l2.getTitulo());
    }
=======
package model;

import java.util.Comparator;

// Comparator para ordenar por título en TreeSet
public class ComparadorTitulo implements Comparator<Libro> {
    @Override
    public int compare(Libro l1, Libro l2) {
        return l1.getTitulo().compareTo(l2.getTitulo());
    }
>>>>>>> 64fdd31ea5eda85d3d0c6cc985be4734134e5a11
}