package ut04e04busquedaenarrays;

// Los arrays son útiles para una gran cantidad de casos de uso en programación, 
// uno de los casos más habituales es el de obtener información de un array de 
// cuyos datos no tenemos una trazabilidad completa, y simplemente son un 
// conjunto de datos comunes.

// Para realizar búsquedas tenemos varias herramientas a nuestra disposición. 
// La primera sería realizar una búsqueda con las herramientas que ya conocemos, 
// esto es, recorrer el array con un bucle y buscar en base a comparaciones.

// La otra forma es mediante la clase Arrays. Esta clase pertenece al paquete 
// java.utils. y puedes encontrar su documentación para Java 11 en este enlace:
// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Arrays.html

// Esta clase tiene algunos métodos (funciones) que permiten manipular y hacer 
// operaciones habituales con arrays. En este ejemplo se ilustran las operaciones 
// de búsqueda.


import java.util.Arrays;

public class UT04E04BusquedaEnArrays {

    public static void main(String[] args) {
        
        // arrays para el ejemplo
        int[] aInt = {1,2,3,4,5,6,7,8,9};
        String[] aCad = {"uno", "dos", "tres", "cuatro", "cinco", "seis"};
        int[][] aInt2d = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        // Buscando datos recorriendo el array
        System.out.println("-----Buscando datos recorriendo el array-----");
        int valorBuscadoInt = 6;
        String valorBuscadoStr = "cinco";
        int auxPos1 = -1, auxPos2 = -1;
        
        // buscando en el array de una dimensión de int
        for(int i = 0; i < aInt.length; i++){
            if(aInt[i] == valorBuscadoInt) {
                auxPos1 = i;
                break;
            }
        }
        if(auxPos1 != -1) {
            System.out.println("aInt: Encontrado " + valorBuscadoInt+ " en la posición " + auxPos1);
        }else{
            System.out.println("aInt: No se ha encontrado " + valorBuscadoInt);
        }
        
        // buscando en el array de una dimensión de String
        auxPos1 = -1;
        for(int i = 0; i < aCad.length; i++){
            if(aCad[i].equals(valorBuscadoStr)) {
                auxPos1 = i;
                break;
            }
        }
        if(auxPos1 != -1) {
            System.out.println("aCad: Encontrado " + valorBuscadoStr+ " en la posición " + auxPos1);
        }else{
            System.out.println("aCad: No se ha encontrado " + valorBuscadoStr);
        }
        
        // buscando en el array de dos dimensiones de int
        auxPos1 = -1;
        for(int i = 0; i < aInt2d.length; i++){
            for(int j = 0; j < aInt2d[0].length; j++){
                if(aInt2d[i][j] ==valorBuscadoInt) {
                    auxPos1 = i;
                    auxPos2 = j;
                    break;
                } 
            }
        }
        if(auxPos1 != -1) {
            System.out.println("aInt2d: Encontrado " + valorBuscadoInt+ " en la posición [" + auxPos1 +"]["+ auxPos2+"]");
        }else{
            System.out.println("aInt2d: No se ha encontrado " + valorBuscadoInt);
        }
        
        // buscando con la clase Array
        System.out.println("-----Buscando con la clase Array-----");
        auxPos1 = Arrays.binarySearch(aInt, 4);
        System.out.println("Encontrando 4 en aInt mediante binarySearch, posición:" +auxPos1);
        // probemos con otro array
        int[] aInt2 = {4,1,7,2,6};
        auxPos1 = Arrays.binarySearch(aInt2, 2);
        System.out.println("Encontrando 2 en aInt2 mediante binarySearch, posición:" +auxPos1);
        // -1??? No ha encontrado el 2?
        // No, para que el método binarySearch funcione debe tratarse de un array ordenado
        
    }
    
}

// Ejercicio 1.
// Crea una array con 100 elementos enteros y rellénalo con números del 1 
// al 100. Usando la clase Arrays encuentra si se ha generado el número 37.

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
//
// Realiza un programa que muestre la sopa de letras y la lista de palabras 
// contenidas. El usuario debe poder seleccionar la palabra que quiere encontrar. 
// Tras la selección se redibujará la sopa de letras con las letras de la palabra 
// seleccionada marcada en un color diferente. Ten en cuenta que las palabras 
// solo pueden aparecer de izquierda a derecha, de arriba a abajo y en diagonal 
// de izquierda-arriba a derecha-abajo.

// Ejercicio 3.
// Realiza un programa con las siguientes líneas de código:
// int[] a = {1,2,3,4,5};
// int[] b, c;
// b = a;
// c = Arrays.copyOf(a, a.length);
// Modifica algún valor del array “a” y depura para ver qué sucede con 
// los demás arrays. Investiga lo sucedido y saca conclusiones.
