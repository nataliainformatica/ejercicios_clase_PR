
public class Ejercicio2 {

    public static void main(String[] args) {
        String[][] sopa = Utilidades.devolverSopa();
        String[] palabras = Utilidades.devolverPalabras();
        System.out.println("LAS PALABRAS QUE DE LA SOPA DE LETRAS");
        mostrarPalabras(palabras);
        System.out.println("");
        mostrarSopa(sopa);

        for (String palabra : palabras) {
            if(buscarPalabra(sopa, palabra)){
                
        
            mostrarSopa(sopa);    }
        }
    }

    public static boolean buscarPalabra(String[][] sopa, String palabra) {
boolean encontrada = false; 
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
                        encontrada=true; 
                        // antes de salir puedo modificar el color de las letras en el array
                        // EN LA FILA i, desde la posición -1 , con la longitud de la palabra

                        for(int z=j ; z>= (j- palabra.length()) ;z--){
                            sopa[i][z] = "*"; // TODO - cambiar el * por color de consola
                        }
                         return encontrada;                           
                    }
                } else {
                    posicion = 0;
                }
            }         
        }
return encontrada; 
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
