
package es.avellaneda;

import es.avellaneda.utils.Utilidades;

// Ejercicio 2.
// A partir de estos dos arrays:
// String[][] sopa = {
// {"A", "E", "Y", "I", "V", "Y", "S", "A", "U", "R", "C", "W", "N", "M", "N", "N", "I", "H"},
// {"X", "H", "C", "N", "B", "X", "D", "D", "W", "M", "A", "H", "H", "D", "U", "R", "B", "J"},
// {"J", "K", "X", "I", "G", "E", "Z", "B", "Y", "K", "K", "O", "R", "E", "V", "K", "C", "V"},
// {"S", "O", "A", "V", "O", "J", "L", "U", "G", "L", "C", "O", "Q", "F", "W", "W", "T", "Y"},
// {"Q", "F", "L", "E", "L", "N", "F", "L", "D", "R", "Q", "R", "Y", "I", "W", "R", "K", "Q"},
// {"D", "F", "D", "N", "B", "H", "O", "B", "S", "C", "I", "T", "O", "I", "G", "E", "B", "O"},
// {"W", "I", "D", "U", "A", "Z", "O", "A", "M", "P", "I", "M", "B", "B", "C", "H", "Y", "B"},
// {"M", "N", "X", "S", "T", "Z", "U", "S", "Q", "J", "R", "U", "E", "A", "A", "Q", "C", "Z"},
// {"J", "G", "N", "A", "N", "O", "D", "A", "O", "F", "D", "O", "F", "R", "U", "T", "Y", "V"},
// {"X", "H", "T", "U", "G", "A", "R", "U", "J", "H", "P", "N", "U", "G", "R", "H", "E", "C"},
// {"C", "Z", "X", "R", "Q", "E", "B", "R", "Z", "U", "B", "A", "T", "T", "R", "J", "Z", "K"},
// {"J", "S", "H", "Z", "U", "Y", "U", "D", "Z", "C", "D", "W", "R", "P", "L", "K", "Y", "B"}};
// String[] palabras = {"BELLSPROUT", "BULBASAUR", "CROBAT", "GOLBAT", "GRIMER", "IVYSAUR", "KOFFING", "MUK", "VENUSAUR", "ZUBAT"};
// Realiza un programa que muestre la sopa de letras y la lista de palabras 
// contenidas. El usuario debe poder seleccionar la palabra que quiere encontrar. 
// Tras la selección se redibujará la sopa de letras con las letras de la palabra 
// seleccionada marcada en un color diferente. Ten en cuenta que las palabras 
// solo pueden aparecer de izquierda a derecha, de arriba a abajo y en diagonal 
// de izquierda-arriba a derecha-abajo.

public class Ejercicio2 {

    public static void main(String[] args) {
        String[][] sopa = Utilidades.devolverSopa();
        String[] palabras = Utilidades.devolverPalabras();
        System.out.println("LAS PALABRAS QUE DE LA SOPA DE LETRAS");
        mostrarPalabras(palabras);
        mostrarSopa(sopa);

        for (String palabra : palabras) {
            buscarPalabra(sopa, palabra);
            mostrarSopa(sopa);
        }

    }

    public static void buscarPalabra(String[][] sopa, String palabra) {

        // recorremos todas las letras de la palabra
        // si encontramos letra, añadimos posición
        int posicion = 0;
        for (int i = 0; i < sopa.length; i++) {
            // para cada fila, muestro todas las columnas
            // posición de la letra en la palabra
            for (int j = 0; j < sopa[i].length; j++) {
                // busco la letra en sopa
                // comparo strings
               //System.out.println("TRAZA DE PRUEBA " + palabra.substring(posicion, posicion+1));

                if (palabra.substring(posicion, posicion+1).equalsIgnoreCase(sopa[i][j])) {
                    // si es igual continúo buscando
                    // TODO - guardar la posición de la letra i,j
                    posicion++;
                    if(posicion >= palabra.length()){
                        // se han encontrado todas las letras de la palabra
                        // hay que cambiar de palabra
                        System.out.println("ENCONTRADA");
                        // antes de salir puedo modificar el color de las letras en el array
                        // EN LA FILA i, desde la posición -1 , con la longitud de la palabra

                        for(int z=j ; z>= 0;z++){
                            sopa[i][z] = "*"; // TODO - cambiar el * por color de consola
                        }
                         return; 
                           
                    }
                } else {
                    posicion = 0;
                }

            }
           
        }

    }

    public static void mostrarSopa(String[][] sopa) {
        // muestro las filas
        for (int i = 0; i < sopa.length; i++) {
            // para cada fila, muestro todas las columnas
            for (int j = 0; j < sopa[i].length; j++) {
                System.out.print(sopa[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void mostrarPalabras(String[] palabras) {
        // muestro las filas
        for (int i = 0; i < palabras.length; i++) {

            System.out.print(palabras[i]);
            System.out.print(" ");
        }
    }

    /**
     * Ten en cuenta que las palabras
     * // solo pueden aparecer de izquierda a derecha, de arriba a abajo y en
     * diagonal
     * // de izquierda-arriba a derecha-abajo.
     */
    public static void buscarIzquierdaDerecha(String[][] sopa) {

    }

}
