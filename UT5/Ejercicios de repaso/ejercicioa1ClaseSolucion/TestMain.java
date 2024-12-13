package es.avellaneda.EjercicioA1;

public class TestMain {
    /**
     * En el main de la clase principal instancia 3 objetos Punto con las
     * coordenadas (5,0), (10,10) y (-3, 7). Muestra por pantalla sus coordenadas
     * (utiliza un println para cada punto). Modifica todas las coordenadas (prueba
     * distintos operadores como = + - += *=...) y vuelve a imprimirlas por
     * pantalla.
     * 
     * @param args
     */
    public static void main(String[] args) {

        Punto punto1 = new Punto(5, 0);
        Punto punto2 = new Punto(10, 10);
        Punto punto3 = new Punto(-3, 7);


        System.out.println("COORDENADAS DEL PUNTO1 " + punto1.getCoordenadaX()
         + "," + punto1.getCoordenadaY());
        System.out.println("COORDENADAS DEL PUNTO2" + punto2.getCoordenadaX() 
        + "," + punto2.getCoordenadaY());
        System.out.println("COORDENADAS DEL PUNTO3 " + punto3.getCoordenadaX() 
        + "," + punto3.getCoordenadaY());

        punto1.setCoordenadaX((punto1.getCoordenadaX())+1);
        punto1.setCoordenadaY((punto1.getCoordenadaY())+1);

        System.out.println("COORDENADAS DEL PUNTO1 " + punto1.getCoordenadaX()
        + "," + punto1.getCoordenadaY());

        punto1.incrementarUnidadXY();
        System.out.println("COORDENADAS DEL PUNTO1 " + punto1.getCoordenadaX()
        + "," + punto1.getCoordenadaY());
    }

}
