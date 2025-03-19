package model;

import java.util.ArrayList;
import java.util.List;

public class DAOlibros {

    public static List<Libro> getLibros() {
        List<Libro> listaLibros = new ArrayList<>();

        // Agregamos algunos libros de ejemplo
        listaLibros.add(new LibroFisico("Cien años de soledad", "García Márquez", "123", 471, "863"));
        listaLibros.add(new LibroDigital("El Quijote", "Cervantes", "456", 5.2, "860"));
        listaLibros.add(new LibroFisico("1984", "Orwell", "789", 328, "823"));
        listaLibros.add(new LibroFisico("Los miserables", "Victor Hugo", "321", 1488, "840"));
        listaLibros.add(new LibroDigital("Crimen y castigo", "Dostoyevski", "654", 3.8, "891"));

        return listaLibros;
    }
}
