package ut9.ejercicio2.modelo;

import java.util.ArrayList;

public class DAOproductos {

        //  public Producto(String nombre) {
    //     public Producto(double alto, double ancho, double largo, String nombre) {

    private static ArrayList<Producto>  productos; 
    
    public static ArrayList<Producto> getProductos(){

        if(productos == null){
            // instancio el array, y lo completo

            productos  = new ArrayList();
            productos.add(new Producto("Champú")); 
            productos.add(new Producto(1,1,1,"Jabón")); 
            productos.add(new Producto(31,11,11,"Pasta de dientes")); 
            productos.add(new Producto(15,15,15,"Suavizante")); 
            productos.add(new Producto(15,15,15,"Zapatos")); 

        }


        return productos; 
    }


}
