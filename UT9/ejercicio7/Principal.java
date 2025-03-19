import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import model.ComparadorTitulo;
import model.DAOclasificaciones;
import model.DAOlibros;
import model.Libro;

public class Principal {
    private static DAOclasificaciones daoClasificaciones = new DAOclasificaciones();

    public static void main(String[] args) {

        // HashSet: sin orden específico
        Set<Libro> librosHashSet = new HashSet<>(DAOlibros.getLibros());

        // TreeSet:  orden natural definido en compareTo()
        Set<Libro> librosTreeSet = new TreeSet<>();
        // otra forma de crear  un set
        librosTreeSet.addAll(librosHashSet);

        // TreeSet: colección ordenada por título
        Set<Libro> librosTreeSetTitulo = new TreeSet<>(new ComparadorTitulo());
        librosTreeSetTitulo.addAll(DAOlibros.getLibros());

        // Mostramos los resultados
        System.out.println("Libros en HashSet (sin orden específico):");
        mostrarLibros(librosTreeSetTitulo);
        
        System.out.println("\nLibros en TreeSet (ordenados por título automáticamente):");
        mostrarLibrosIterator(librosTreeSetTitulo);

        System.out.println("*********************");
        mostrarLibrosConClasificacion(librosHashSet);

    }
    private static void mostrarLibros(Set<Libro> libros){
        for (Libro libro : libros) {
            System.out.println(libro);
        }

    }

    private static void mostrarLibrosIterator(Set<Libro> libros) {
        Iterator<Libro> iteradorLibros = libros.iterator();
        while (iteradorLibros.hasNext()) {
            System.out.println(iteradorLibros.next());
        }

    }

    private static void mostrarLibrosConClasificacion(Set<Libro> libros) {

        for (Libro libro : libros) {
            String clasificacion = daoClasificaciones.getClasificacion(libro.getCodigoBiblioteca().split(" ")[0]);
            System.out.println(libro + " Categoría: " + clasificacion);
        }
    }
}
