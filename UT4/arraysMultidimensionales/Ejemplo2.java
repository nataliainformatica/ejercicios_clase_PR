package es.avellaneda.repasoArrays;

import java.util.Arrays;

public class Ejemplo2 {

/**
 * Haz un ejercicio que tenga una función para sumar las filas del array bidimensional
 * Y otra para sumar las columnas
 * Muestra los resultados
 * @param args
 */
 public static void main(String[] args) {
    int[][] array = {
                     {1,1},
                     {1,1},
                     {1,1}};

                   
                     //mostrasArray(sumarArrayFilas(array));
                     System.out.println(Arrays.toString(sumarArrayFilas(array)));



 }

 public static int[] sumarArrayFilas(int[][] array){
    int[] resultado =new int[array.length]; 
    int filas =0; 
    for(int i=0; i< array.length; i++){
        for(int j=0; j<array[i].length;j++){
            filas += array[i][j]; 
        }
        resultado[i] = filas; 
        filas =0; 

    }
    return resultado ;   
           
    }
    public static int[] sumarArrayColunas(int[][] array){
        int[] resultado =new int[array.length]; 
        int columnas =0;

        for(int col =0; col < array[0].length; col++){
            for(int fila =0; fila<array.length; fila++){
                columnas  += array[fila][col];
            }
            resultado[col] = columnas; 
        }

        return resultado; 
    }
    public static void mostrasArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
           
                System.out.print(array[i]);

         
            System.out.println();
        }

    }
    
}

