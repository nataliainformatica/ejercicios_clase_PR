package ejercicio4;

import java.util.Scanner;

/*
 * GestionCine, encargado de crear y gestionar el menú en pantalla y de la comunicación con la clase Cine. Recibirá un objeto de la clase Cine en su constructor, que será precisamente el Cine que deba gestionar. Al comenzar se encargará de que se lean las ventas desde el archivo “entradasVendidas.txt”.
 * Se mostrará un menú en pantalla que permita las siguientes opciones:

Mostrar butacas

Comprar entrada

Devolver una entrada

Salir


 */
public class GestorCine {

    private Scanner sc;

    public GestorCine() {
        sc = new Scanner(System.in);

    }

    public void gestionarMenu() {

        String opcion;

        do {
            System.out.println("1. Mostrar butacas");
            System.out.println("2. Comprar entrada");
            System.out.println("3. Devolver una entrada");
            opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    // método para recorrer el array de cine y mostrar su contenido
                    break;
                case "2":
                    /**
                     * Comprar la entrada de una fila y asiento concreto. Se muestra la entrada en
                     * pantalla y actualiza el array si está disponible o se comunica al cliente que
                     * ya está ocupada.
                     */
                    // pedir datos de la entrada al usuario
                    // TODO EN CINE: "comprar"
                    break;
                case "3":
                    // pedir datos de la entrada al usuario
                    // Devolver una entrada, sólo si ha sido antes vendida.
                    // TODO EN CINE: "devolver"
                    break;
                case "4":
                    /*
                     * Al salir de la aplicación, se deberá guardar en el archivo
                     * “entradasVendidas.txt” los nuevos asientos vendidos
                     */
                    break;
                default:
                    break;
            }
        } while (!opcion.equals("4"));

    }

}
