package ut9.ejercicio2;

import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import ut9.ejercicio2.comparadores.ComparadorPorAlto;
import ut9.ejercicio2.comparadores.ComparadorPorAncho;
import ut9.ejercicio2.comparadores.ComparadorPorLargo;
import ut9.ejercicio2.modelo.DAOproductos;
import ut9.ejercicio2.modelo.Ordenable;
import ut9.ejercicio2.modelo.Producto;

public class Ordenaciones {

    public static void main(String[] args) {
        ArrayList<Producto> productos = DAOproductos.getProductos();
        ArrayList<Producto> copia;
        // sin ordenar
        System.out.println("COLECCIÓN SIN ORDENAR");
        mostrarColeccion(productos);

        System.out.println("*************");
        copia = copiarProductos(productos);
        // ordenado por Alto
        System.out.println("COLECCIÓN  ORDENADA POR ALTO");
        mostrarColeccion(ordenarAltoProducto(copia));
        // sin ordenar
        System.out.println("COLECCIÓN SIN ORDENAR");
        mostrarColeccion(productos);

        System.out.println("*************+");
        // ordenado por Ancho
        System.out.println("*************+");
        System.out.println("COLECCIÓN  ORDENADA POR ANCHO");

        mostrarColeccion(ordenarAnchoProducto(copia));
        // sin ordenar
        System.out.println("COLECCIÓN SIN ORDENAR");
        mostrarColeccion(productos);
        System.out.println("COLECCIÓN  ORDENADA POR LARGO");

        // ordenado por Largo
        mostrarColeccion(ordenarLargoProducto(copia));

    }

    public static ArrayList<Producto> ordenarAltoProducto(ArrayList<Producto> coleccion) {

        Collections.sort(coleccion, new ComparadorPorAlto());

        return coleccion;
    }

    public static ArrayList<Producto> ordenarAnchoProducto(ArrayList<Producto> coleccion) {
        Collections.sort(coleccion, new ComparadorPorAncho());
        return coleccion;
    }

    public static ArrayList<Producto> ordenarLargoProducto(ArrayList<Producto> coleccion) {
        Collections.sort(coleccion, new ComparadorPorLargo());
        return coleccion;
    }

    private static void mostrarColeccion(ArrayList<Producto> coleccion) {

        Iterator<Producto> it = coleccion.iterator();

        while (it.hasNext()) {
            // el siguiente elemento
            Producto p = it.next();
            System.out.println(p);

        }

    }

    private static ArrayList<Producto> copiarProductos(ArrayList<Producto> productos) {
        ArrayList<Producto> copia = new ArrayList<>();
        // copia = new ArrayList<>(productos);
        for (Producto p : productos) {
            copia.add(p);
        }
        return copia;
    }

}
