package ejercicio4;
public class AppCine {

    public static void main(String[] args) { 
        GestorCine gestor=new GestorCine(new Cine()); 
        gestor.gestionarMenu(); 
        } 
}
