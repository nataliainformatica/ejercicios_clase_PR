
public class Ejercicio2 {
    public static final String ANSI_RESET = "\u001B[0m"; // Reset al color por defecto
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {

        String[][] sopa = Utilidades.devolverSopa();
        String[][] sopaResultado = copiarSopa(sopa);
        String[] palabras = Utilidades.devolverPalabras();
        System.out.println("LAS PALABRAS QUE DE LA SOPA DE LETRAS");
        mostrarPalabras(palabras);
        System.out.println("");
        mostrarSopa(sopa);

        for (String palabra : palabras) {
            if (buscarPalabra(sopa, palabra, sopaResultado)) {
                mostrarSopa(sopaResultado);
            }
        }

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            if (buscarPalabraVertical(sopa, palabra, sopaResultado)) {
                mostrarSopa(sopaResultado);
                palabras[i] = "*";
            }
        }

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            if (buscarPalabraDiagonal(sopa, palabra, sopaResultado)) {
                mostrarSopa(sopaResultado);
                palabras[i] = "*";
            }
        }

    }

    public static boolean buscarPalabra(String[][] sopa, String palabra, String[][] sopaResultado) {
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
                // System.out.println("TRAZA DE PRUEBA " + palabra.substring(posicion,
                // posicion+1));

                if (palabra.substring(posicion, posicion + 1).equalsIgnoreCase(sopa[i][j])) {
                    // si es igual continúo buscando
                    // TODO - guardar la posición de la letra i,j
                    posicion++;
                    if (posicion >= palabra.length()) {
                        // se han encontrado todas las letras de la palabra
                        // hay que cambiar de palabra
                        System.out.println("ENCONTRADA");
                        encontrada = true;
                        // antes de salir puedo modificar el color de las letras en el array
                        // EN LA FILA i, desde la posición -1 , con la longitud de la palabra

                        for (int z = j; z > (j - palabra.length()); z--) {
                            sopaResultado[i][z] = ANSI_RED + sopaResultado[i][z] + ANSI_RESET; // TODO - cambiar el *
                                                                                               // por color de consola
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

    public static boolean buscarPalabraVertical(String[][] sopa, String palabra, String[][] sopaResultado) {
        boolean encontrada = false;
        // recorremos todas las letras de la palabra
        // si encontramos letra, añadimos posición
        int posicion = 0;
        // ahora i es columna
        for (int i = 0; i < sopa[0].length; i++) {
            // para cada columna, busco en todas las columnas
            // posición de la letra en la palabra
            // j es fila
            for (int j = 0; j < sopa.length; j++) {
                // busco la letra en sopa
                // comparo strings
                // System.out.println("TRAZA DE PRUEBA " + palabra.substring(posicion,
                // posicion+1));

                if (palabra.substring(posicion, posicion + 1).equalsIgnoreCase(sopa[j][i])) {
                    // si es igual continúo buscando
                    // TODO - guardar la posición de la letra i,j
                    posicion++;
                    if (posicion >= palabra.length()) {
                        // se han encontrado todas las letras de la palabra
                        // hay que cambiar de palabra
                        System.out.println("ENCONTRADA");
                        encontrada = true;
                        // antes de salir puedo modificar el color de las letras en el array
                        // EN LA FILA i, desde la posición -1 , con la longitud de la palabra

                        for (int z = j; z >= (j - palabra.length()); z--) {

                            sopaResultado[z][i] = ANSI_BLUE + sopaResultado[z][i] + ANSI_RESET;
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

    public static boolean buscarPalabraDiagonal(String[][] sopa, String palabra, String[][] sopaResultado) {
        boolean encontrada = false;

        int posicion = 0;

        int filas = sopa.length;
        int columnas = sopa[0].length;

        // Recorrer cada celda y mostrar las diagonales en las cuatro direcciones
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int z = i;
                int k = j;
                while (z < filas && k < columnas) {

                    if (palabra.substring(posicion, posicion + 1).equalsIgnoreCase(sopa[z][k])) {
                        // si es igual continúo buscando
                        posicion++;
                        if (posicion >= palabra.length()) {
                            // se han encontrado todas las letras de la palabra
                            // hay que cambiar de palabra
                            System.out.println("ENCONTRADA");
                            encontrada = true;
                            // antes de salir puedo modificar el color de las letras en el array
                            // EN LA FILA i, desde la posición -1 , con la longitud de la palabra
                         
                            int columnaCambia = k;
                            int filaCambia = z; 
                            // k es la columna
                            // zz es la posición de columna donde empieza a cambiar las letras

                            for (int zz = k; zz > (k - palabra.length()); zz--) {
                                sopaResultado[filaCambia][columnaCambia] = ANSI_GREEN + sopaResultado[filaCambia--][columnaCambia--] + ANSI_RESET;
                            }
                            return encontrada;
                        }
                    } else {
                        posicion = 0;
                    }
                    z++;
                    k++;

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

    public static void añadirNegro(String[][] sopa) {

        // concatenamos el color negro: ANSI_BLACK a todas las letras recorriendo la
        // sopa

        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                sopa[i][j] = ANSI_BLACK + sopa[i][j] + ANSI_RESET;
            }
        }

        /**
         * Ten en cuenta que las palabras
         * // solo pueden aparecer de izquierda a derecha, de arriba a abajo y en
         * diagonal
         * // de izquierda-arriba a derecha-abajo.
         */

    }

    public static String[][] copiarSopa(String[][] sopa) {
        String[][] sopaResultado = new String[sopa.length][sopa[0].length];
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                sopaResultado[i][j] = sopa[i][j];
            }
        }
        return sopaResultado;
    }
}