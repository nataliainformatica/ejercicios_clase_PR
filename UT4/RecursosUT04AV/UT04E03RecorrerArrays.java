package ut04e03recorrerarrays;

// En la exposición de los arrays n-dimensionales recorremos un array 

import java.util.Arrays;

// bidimensional mediante un doble bucle. Para recorrer este array hacemos dos 
// índices, que son los elementos inicializados en cada bucle, ‘i’ y ‘j’, con 
// estos índices podemos recorrer la matriz, haciendo que el índice del primer 
// bucle representa las filas y el índice del segundo bucle representa las 
// columnas.
// Este tipo de bucles nos da un gran control sobre los elementos con los que 
// queremos trabajar, pero requiere establecer inicialmente estos elementos y 
// gestionarlos en cada iteración.
// Cuando no necesitamos usar este índice, y tan solo queremos recorrer todos 
// los elementos del array podemos usar una nueva versión del bucle, conocida 
// como forEach. Con esta notación podemos recorrer todos los elementos del 
// array sin necesidad de emplear un índice.
// Este tipo de bucle se emplea con objetos que emplean la interfaz iterable, 
// esta interfaz y su uso la veremos más adelante en el curso, pero de momento 
// usaremos esta notación con arrays para los que no necesitemos un índice 
// cuando los queramos recorrer.

// La sintaxis es:
// for(tipo elemento_en_el_bucle : mi_array) {}
// Donde:
// “tipo” es el tipo de dato de cada elemento del array.
// “elemento_en_el_bucle” es el nombre con el que voy a referenciar a cada la 
// variable obtenida en cada interacción de array.
// “mi_array” es el array que quiero recorrer.


public class UT04E03RecorrerArrays {

    public static void main(String[] args) {
        // Creando un array para el ejemplo
        int[] a1 = {1, 2, 3, 4, 5};
        int[][] a2a = new int[3][3];
        
        System.out.println("-----Recorriendo arrays con for convencional-----");
        // recorremos a2a para rellenarlo con for convencional
        for(int i = 0; i < a2a.length; i++){ // i índice de filas
            for(int j = 0; j < a2a[0].length; j++){ // j índice de columnas
                a2a[i][j] = (int)(Math.random()*20+1);
            }
        }
        // recorremos a2a para leerlo con un for convencional
        for(int i = 0; i < a2a.length; i++){ // i índice de filas
            for(int j = 0; j < a2a[0].length; j++){ // j índice de columnas
                System.out.println("a2a["+i+"]["+j+"] = " + a2a[i][j]);
            }
        }
        
        // Ejemplo de forEach con array de una dimensión
        System.out.println("-----Ejemplo de forEach con array de una dimensión-----");
        for(int elem : a1){
            System.out.println("Elemento de a1: " + elem);
        }
        
        // Ejemplo de forEach para rellenar y leer a2a
        for(int[] fila : a2a) {
            System.out.println("Fila: " + fila); // ???
            for(int elem : fila) {
                System.out.println("Elemento: " + elem);
            }
        }
        
    }
    
}

// Para los siguientes ejercicios puedes emplear el tipo de bucle que quieras
// pero es recomendable que intentes hacer algún bucle en formato forEach,
// para que te familiarices con su uso.

// Ejercicio 1.
// Crea un array de enteros de 100 elementos. Rellena este array con números 
// aleatorios del 1 al 10. Crea un segundo array con la cantidad de veces que 
// el array de elementos aleatorios tiene cada uno de los números. Imprime el 
// resultado de este segundo array por pantalla.
//
// Ejercicio 2.
// Crea un array de Strings en el que cada elemento del array sea un String con 
// cada uno de los enunciados de los ejercicios propuestos. Crea un segundo 
// array bidimensional de tipo char en el que cada elemento es un carácter de 
// cada enunciado de ejercicio.
//
// Ejercicio 3.
// Crea un array de 5x5x5x5, rellénalos de números aleatorios entre 100 y 600. 
// Obtén el número mayor, el menor y la media.

// Ejercicio 4.
// Al imprimir el array en el ejemplo con la siguiente línea de código salen 
// letras raras. Investiga qué es eso que sale.
// System.out.println("Fila: " + fila); // ???

// Ejercicio 5.
// Busca qué es “Iterable” en Java. Es normal que no entiendas del todo qué es 
// o para qué se emplea, pero intenta entender lo máximo que puedas con tus 
// conocimientos actuales.
