package ut04e02arraysndimensionales;

// En el ejemplo anterior entendíamos qué era una array y cómo lo podíamos 
// emplear. 
// Los arrays tienen muchos casos de uso que favorecen su empleo, como veíamos 
// en el ejemplo del sensor de viento, pero, ¿qué pasa si quiero almacenar los 
// datos del viento de las 24 horas del días? Podríamos ampliar el tamaño del 
// array a 1440 (60x24) y poner en cada posición del array el valor del viento 
// para cada minuto del día.
// Otra solución es usar un array de 60 elementos y cada uno de esos arrays 
// meterlo como dato de un array de 24 elementos, uno para cada hora. Esta 
// solución es lo que se conoce como un array de dos dimensiones, y para 
// inicializarlo lo haríamos de la siguiente forma:
// int[][] velViento = new int[24][60];
// Este array estará formado por 24 arrays de tamaño 60 enteros, aunque es más 
// sencillo entenderlo como un array de dos dimensiones, en el que tenemos 24 
// filas con 60 columnas, para formar una matriz de 1440 elementos, con la 
// velocidad del viento para cada uno de los minutos que tiene un día.

// De la misma forma, podemos hacer arrays de tres dimensiones, cuatro, 
// cinco, etc. Aunque podamos hacerlo tenemos que entender si los arrays de 
// muchas dimensiones son la solución correcta para nuestro problema y si el 
// programa resultante será fácil de leer y entender.


public class UT04E02ArraysNDimensionales {

    public static void main(String[] args) {
        // Declarando arrays de múltiples dimensiones
        System.out.println("-----Declarando arrays de múltiples dimensiones-----");
        int[] a1 = new int[3];
        int[][] a2 = new int[3][3];
        int[][][] a3 = new int[3][3][3];
        int[][][][][][] aMuchidimensional = new int[3][3][3][3][3][3];
        // A partir de 4 dimensiones puede ser complejo encontrar usos
        // justificados para nuestros arrays multidimensionales
        
        System.out.println("-----Creando un array de dos dimensiones y rellenandolo-----");
        // Creando un array de dos dimensiones como el siguiente
        //    +-----+----+----+----+
        //    | ind + 0  | 1  |  2 |
        //    ++++++++++++++++++++++
        //    |   0 + 10 | 11 | 12 |
        //    |   1 + 13 | 14 | 15 |
        //    +-----+----+----+----+
        int[][] a2d = new int[2][3];
        // primera fila
        a2d[0][0] = 10;
        a2d[0][1] = 11;
        a2d[0][2] = 12;
        // segunda fila
        a2d[1][0] = 13;
        a2d[1][1] = 14;
        a2d[1][2] = 15;
        
        // Entendiendo el tamaño de nuestro array de 2 dimensiones
        System.out.println("-----Entendiendo el tamaño de nuestro array de 2 dimensiones-----");
        System.out.println("El tamaño de a2d es: "+ a2d.length);
        System.out.println("El tamaño de a2d[0] es: "+ a2d[0].length);
        
        // Recorriendo nuestra array de dos dimensiones
        System.out.println("-----Recorriendo nuestra array de dos dimensiones-----");
        for(int i = 0; i < a2d.length; i++) {
            for(int j = 0; j < a2d[0].length; j++) {
                // Este es un doble bucle que se ejecutará para 
                // cada posición de nuestro array
                System.out.println("Valor de [" + i + "][" + j + "] es: " + a2d[i][j]);
            }
        }

    }
    
}


// Ejercicio 1.
// Crea una matriz bidimensional de 3x3 e inicialízala con valores enteros. 
// Luego, calcula la suma de todos los elementos de la matriz.

// Ejercicio 2.
// Escribe un programa que encuentre el elemento más grande en un array 
// tridimensional que debe ser rellenado con números aleatorios y muestre su 
// valor junto con las coordenadas (fila y columna) donde se encuentra.

// Ejercicio 3.
// Escribe un programa que copie los elementos de una matriz bidimensional 3x3 
// a otra matriz de igual tamaño, pero volteada, y luego muestre las dos.
// Ejemplo:
// Normal
// 1 2 3
// 4 5 6
// 7 8 9
// Volteada
// 9 8 7
// 6 5 4
// 3 2 1

// Ejercicio 4.
// Crea una matriz bidimensional que represente un tablero de ajedrez, donde 'B'
// son las casillas blancas y 'N' representan las casillas negras. Imprime el 
// tablero en la consola. Recuerda que el tablero de ajedrez es 8x8 y que las 
// casillas adyacentes siempre son del color contrario.

// Ejercicio 5.
// En un array bidimensional como este a[3][3] puedes usar a.length y 
// a[0].length. ¿Por qué? Reflexiona sobre ellos, intenta usar a[0][0].length 
// y prueba con arrays de más dimensiones.
