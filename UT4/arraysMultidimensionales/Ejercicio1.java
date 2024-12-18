package es.avellaneda.repasoArrays;

import java.util.Arrays;

/**
 * Haz el código que cree un array bidimensional de 5x5
 * que se rellenará en las filas pares con un 1 
 * y en las filas impares con un 2
 * Muestra el array completo
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        final int NUM = 5;
        int[][] array = new int[NUM][NUM];
        final int NUM1 = 1;
        final int NUM2 = 2;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0) {
                    array[i][j] = NUM1;
                } else
                    array[i][j] = NUM2;
            }
        }
        mostrasArray(array);
        System.out.println();
        mostrasArray(copiarArray(array));
        System.out.println();
        mostrasArray(copiarArrayII(array));
    }

    public static void mostrasArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);

            }
            System.out.println();
        }

    }

    public static int[][] copiarArrayII(int[][] array) {
        int[][] copia = Arrays.copyOf(array, array.length);
        return copia;
    }

    public static int[][] copiarArray(int[][] array) {

        int[][] copia = new int[array.length][array[0].length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                   copia[i][j]=array[i][j];

            }
        }
        return copia;

    }


    public static void sumarArray(int[][] array){

       
    }
}


/*
[][]
1 3 4 5 7 10 12
1 3 4 5 7 10 12
1 3 4 6 7 10 12
1 2 4 5 7 10 11
1 8 4 5 8 10 12
 
resultado de la suma de las filas

[42, 42 ... ]
[5,19...]
resultado de la suma de las columnas




 */

