package ejercicioa1;

/**
 *
 * Crea un programa con una clase llamada Punto que representará un punto de dos
 * dimensiones en un plano. Solo contendrá dos atributos enteros llamadas x e y
 * (coordenadas).
 *
 * En el main de la clase principal instancia 3 objetos Punto con las
 * coordenadas (5,0), (10,10) y (-3, 7). Muestra por pantalla sus coordenadas
 * (utiliza un println para cada punto). Modifica todas las coordenadas (prueba
 * distintos operadores como = + - += *=...) y vuelve a imprimirlas por
 * pantalla.
 *
 * @author natali
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto punto1 = new Punto(5, 0);
        Punto punto2 = new Punto(10, 10);
        Punto punto3 = new Punto(-3, 7);
        Punto miNuevoPunto = new Punto(punto1);
        
        miNuevoPunto = punto1;

        System.out.println("Las coordenadas del punto1 son : " + punto1.toString());
        System.out.println("Las coordenadas del punto3 son : " + miNuevoPunto.toString());
        System.out.println("Las coordenadas del punto2 son : " + punto2.toString());
        System.out.println("Las coordenadas del punto3 son : " + punto3.toString());
        /* 
        punto1.setX(0);
        punto1.setY(0);*/

        punto1.setX(punto1.getX() + 1);
        punto1.setY(punto1.getY() + 2);
        miNuevoPunto.setX(punto1.getX() + 5);
        miNuevoPunto.setY(punto1.getY() + 5);
        System.out.println("Las coordenadas del punto1 son : " + punto1.toString());
        System.out.println("Las coordenadas del minuevopunto son : " + miNuevoPunto.toString());
        System.out.println("Las coordenadas del punto2 son : " + punto2.toString());
        System.out.println("Las coordenadas del punto3 son : " + punto3.toString());

    }

}
