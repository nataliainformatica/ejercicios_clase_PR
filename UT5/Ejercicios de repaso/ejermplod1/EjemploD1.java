package ejemplod1;

import java.util.Scanner;

/**
 *
 * @author natali
 */
public class EjemploD1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // punto(int x, int y)
        Scanner sc = new Scanner(System.in);
        Punto[] cuatroPuntos = new Punto[4];
           Cuadrado cuadrado = new Cuadrado(cuatroPuntos);
        int x, y;
        String coordenadas;

        // int[] enteros = new int[4];
        // MENU
        /*
        System.out.println("COORDENADAS PARA PINTAR UN CUADRADO");
        for (int i = 0; i < cuatroPuntos.length; i++) {
            System.out.println("Introduce las coordenadas del punto " + i);
            System.out.println("X");
            x= sc.nextInt();
            System.out.println("Y");
            y= sc.nextInt();
            cuatroPuntos[i] = new Punto(x,y);
              
        }
        */
         for (int i = 0; i < cuatroPuntos.length; i++) {
            System.out.println("Introduce las coordenadas del punto " + i);
             System.out.println("EN FORMATO X,Y");
      
            coordenadas = sc.nextLine();
            String[] coor = coordenadas.split(",");            
            cuatroPuntos[i] = new Punto(Integer.parseInt(coor[0]),Integer.parseInt(coor[1]));
              
        }
/*   CÓDIGO ALTERNATIVO PARA CREAR EL ARRAY UTILIZANDO CUATRO INSTANCIAS DE PUNTO
        Punto punto1 = new Punto(0, 0);
        Punto punto2 = new Punto(2, 0);
        Punto punto3 = new Punto(2, 2);
        Punto punto4 = new Punto(0, 2);

        cuatroPuntos[0] = punto1;
        cuatroPuntos[1] = punto2;
        cuatroPuntos[2] = punto3;
        cuatroPuntos[3] = punto4;*/

     

        System.out.println("Perímetro del cuadrado = " + cuadrado.calcularPerimetro());
        System.out.println("Área del cuadrado = " + cuadrado.calcularArea());

        System.out.println("Los cuatro puntos del cuadrado son:  " + cuadrado);

    }

}
