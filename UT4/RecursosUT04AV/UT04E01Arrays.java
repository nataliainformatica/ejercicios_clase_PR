package ut04e01arrays;

// Los arrays (arreglos, vector o matriz) son variables que permiten almacenar 
// múltiples valores de un mismo tipo.
// Si necesitamos crear un programa que almacene la velocidad del viento cada 
// minuto durante una hora, podríamos hacerlo de la siguiente forma;
// int velVientoMin00;
// int velVientoMin01;
// int velVientoMin02;
// int velVientoMin03;
// int velVientoMin04;
// [...]
// int velVientoMin58;
// int velVientoMin59;
// ¿Y si necesito hacerlo durante un día entero? ¿O una semana?
// Los arrays permiten abordar el problema de almacenar múltiples datos de un 
// mismo tipo de forma más sencilla.

// Existen diferentes formas de declarar un array. Comencemos con el ejemplo de 
// las muestras de la velocidad del viento.
// int[] velViento; <- así indicamos que es un array de enteros
// velViento = new int[60]; <- así indicamos el número de elementos
// Esto se puede abreviar en una sola expresión:
// int[] velViento = new int[60];
// También podemos declarar e iniciar un array en una sola expresión, lo haremos 
// de la siguiente forma:
// int[] resultados = {2, 45, 21, 1, 27};
// Este array será de tamaño 5 y tendrá los valores 2, 45, 21, 1 y 27 en cada 
// una de las cinco posiciones.

// Ten en cuenta que una vez defines el tamaño de un array este no podrá cambiar. 
// Si necesitamos una estructura de datos con un tamaño dinámico no deberíamos 
// usar un array. Más adelante, en el curso, aprenderemos a usar estructuras 
// que permitan un número dinámico de datos.

// De acuerdo, tenemos nuestro array y hemos definido el tamaño. ¿Cómo podemos 
// asignar valores y leerlos?
// Antes de asignar y leer valores es importante entender cómo funcionan los 
// índices en los arrays. Vamos a ilustrarlo con un ejemplo:
// inv[] myArray = new int[3];
// Tenemos un array de tres elementos. Vamos a representarlo gráficamente, 
// suponiendo que los valores que tiene nuestro array son 5, 10 y 15.
// +---------+---+----+----+
// | valores | 5 | 10 | 15 |
// +---------+---+----+----+
// ¿Qué posición ocupa cada elemento?
// +----------+----+----+----+
// | posición | 1ª | 2ª | 3ª |
// +----------+----+----+----+
// | valores  |  5 | 10 | 15 |
// +----------+----+----+----+
// Y ahora lo importante, ¿qué índice accede a cada posición? El índice es el 
// número que debemos emplear en Java para leer o escribir en la posición del 
// array, y este siempre comienza en 0, así el primer elemento será el de índice 
// 0, el segundo el de índice 1, el tercero el de índice 2, etc.
// Con lo cual, nuestro array de tres elementos tendrá los índices 0, 1 y 2, 
// como podemos ver en la siguiente tabla. 
// +----------+----+----+----+
// | posición | 1ª | 2ª | 3ª |
// +----------+----+----+----+
// | índice   |  0 |  1 |  2 |
// +----------+----+----+----+
// | valores  |  5 | 10 | 15 |
// +----------+----+----+----+
// Ten cuidado, si un array tiene 3 elementos nunca podrá usar 3 como índice 
// del mismo, ya que estaría fuera del rango.
// Agora sí, vamos a inciar los datos y a leerlos:
// miArray[0] = 5; <- asignación
// System.out.println("Mi array 0: " + miArray[0]); <- uso

// Para finalizar esta lección debemos saber que para conocer el tamaño de un 
// array podemos usar la propiedad length, esta nos va a decir su tamaño. No 
// necesita usar paréntesis al final, ya que no se trata de una función si no 
// de una propiedad. ¡Ten cuidado! Si el tamaño de tu array es 5 los índices 
// irán de 0 a 4.

import java.util.Scanner;

public class UT04E01Arrays {

    public static void main(String[] args) {
        // Declarando y dando tamaño a un array
        System.out.println("-----Declarando y dando tamaño a un array-----");
        // Declaración y tamaño en diferentes líneas
        int[] velViento;
        velViento = new int[60];
        // Declaración y tamaño en una sola línea
        int[] velViento2 = new int[60];
        // Declaración e inicialización directa
        int[] datos = {1, 2, 3, 4, 5};
        
        System.out.println("-----Creando arrays de diferentes tipos-----");
        int[] aInt = new int[3];
        float[] aFlo = new float[3];
        double[] aDou = new double[3];
        boolean[] aBoo = new boolean[3];
        String[] aStr = new String[3];
        Scanner[] aSca = new Scanner[3];
        
        // Asignando y leyendo datos
        System.out.println("-----Asignando y leyendo datos-----");
        int[] miArray = new int[3];
        miArray[0] = 5;
        miArray[1] = 10;
        miArray[2] = 15;
        System.out.println("Mi array 0: " + miArray[0]);
        System.out.println("Mi array 1: " + miArray[1]);
        System.out.println("Mi array 2: " + miArray[2]);
        
        // Obteniendo el tamaño de un array
        System.out.println("-----Obteniendo el tamaño de un array-----");
        System.out.println("El tamaño de mi array es: " + miArray.length);
    }
    
}

// Ejercicio 1.
// Crea un programa que almacena las notas obtenidas en los 6 módulos del 
// curso. Asigna valores a cada nota (no es necesario que sea con Scanner) 
// y saca la nota media.

// Ejercicio 2.
// Crea una array de String y en cada elemento del mismo una palabra. Imprime 
// la frase completa que forman las palabras.

// Ejercicio 3.
// Amplía el ejercicio 1 para tener un segundo array que contenga los 
// nombres de los módulos. Imprime por pantalla el nombre y la nota de 
// cada módulo, como en el siguiente ejemplo:
// Programación: 7
// Lenguajes de marcas: 6
// etc.

// Ejercicio 4.
// Amplía el ejercicio 1 para tener un segundo array con las notas de otros 7 
// módulos del segundo curso, introduce datos para este segundo curso. Crea un 
// nuevo array con los datos de ambos arrays, luego realiza un bucle que saque 
// por pantalla las notas de todos los módulos del ciclo.

// Ejercicio 5.
// Crea un programa que le permita al usuario decir cuantos números quiere 
// introducir, tras esto debe solicitar estos números y almacenarlos en un 
// array. Finalmente sacará por pantalla la suma de todos los números.

// Ejercicio 6.
// Crea el siguiente array:
// int[] miArray = new int[];
// Explora los métodos y parámetros que te propone la javadoc al escribir:
// miArray.