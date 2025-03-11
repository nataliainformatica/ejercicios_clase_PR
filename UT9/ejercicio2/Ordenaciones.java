package ut9.ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import ut9.ejercicio2.comparadores.ComparadorPorAlto;
import ut9.ejercicio2.modelo.DAOproductos;
import ut9.ejercicio2.modelo.Ordenable;
import ut9.ejercicio2.modelo.Producto;

public class Ordenaciones  {

    public static void main(String[] args) {
        ArrayList<Producto> productos = DAOproductos.getProductos(); 

        mostrarColeccion(productos);
        
        System.out.println("*************+");
        Collections.sort(productos); 
        mostrarColeccion(productos);
        mostrarColeccion(ordenarAltoProducto(productos));
        System.out.println("*************+");
        mostrarColeccion(productos);


        
    }
  
    public static ArrayList<Producto> ordenarAltoProducto(ArrayList<Producto> coleccion) {
     
        Collections.sort(coleccion,new ComparadorPorAlto());

        return coleccion; 
    }

    
   
    public static ArrayList<Producto> ordenarAnchoProducto(ArrayList<Producto> coleccion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ordenarAnchoProducto'");
    }

  
    public ArrayList<Producto> ordenarLargoProducto(ArrayList<Producto> coleccion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ordenarLargoProducto'");
    }

    private static void mostrarColeccion(ArrayList<Producto> coleccion){

        Iterator<Producto> it = coleccion.iterator();

        while(it.hasNext()){
            // el siguiente elemento
            Producto p = it.next(); 
            System.out.println(p);


        }

    }

    private ArrayList<Producto> copiarProductos(ArrayList<Producto> productos){
        ArrayList<Producto>  copia = new ArrayList<>(); 
        //copia = new ArrayList<>(productos); 
        for(Producto p: productos){
            copia.add(p); 
        }
        return copia; 
    }


    }

    

}
