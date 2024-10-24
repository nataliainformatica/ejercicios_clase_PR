
package ut04e05ordenaciondearrays;

// En una gran cantidad de escenarios, resolviendo problemas de programación, 
// necesitaremos ordenar el contenido de los arrays. En ocasiones necesitaremos 
// ordenar valores numéricos, textos u otros tipos.

// Para realizar la ordenación de nuestro array podemos usar la clase Arrays, 
// que empleamos en el ejemplo anterior, y sus métodos/funciones asociados a 
// la ordenación. Esto se realiza con métodos sobrecargados, que permiten 
// diferentes parámetros y diferentes tipos de datos.
// Con la siguiente instrucción ordenamos el array en su totalidad en sentido 
// ascendente.
// Arrays.sort(miArray);
// Con la siguiente instrucción ordenamos las posiciones de la 10 a la 20 de 
// nuestro array de forma ascendente.
// Arrays.sort(miArray, 10, 20);
// Existen más herramientas para ordenar de forma descendente, o con otros 
// patrones, que estudiaremos más adelante en el curso.

// Aparte de ordenar arrays mediante la clase Arrays, vamos a ordenarlos 
// nosotros mismos diseñando nuestros propios algoritmos. Esto nos va a 
// permitir desarrollar más nuestra capacidad para resolver problemas, así 
// como entender las dificultades que surgen y las posibles soluciones en 
// este problema clásico de la algoritmia.

// Para conocer algunos de estos algoritmos vamos a emplear el siguiente 
// recursos: https://blog.zerial.org/ficheros/Informe_Ordenamiento.pdf 

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class UT04E05OrdenacionDeArrays {

    public static void main(String[] args) {
        // Tres arrays de enteros del 1 al 100 desordenados, sin repetir
        int[] i1={22,41,82,50,14,48,85,13,38,46,49,33,16,90,74,76,12,6,60,45,96,47,92,89,11,30,43,21,44,3,9,1,78,84,53,54,32,42,28,70,87,10,36,34,64,77,8,51,17,63,88,39,97,73,93,79,23,59,5,66,29,98,4,40,67,2,37,71,24,15,25,62,27,86,26,68,91,69,19,56,99,7,57,35,18,52,72,65,83,95,81,94,20,75,31,55,80,58,100,61};
        int[] i2={8,61,6,54,25,19,40,15,90,55,51,76,36,62,72,49,74,63,13,85,70,34,30,77,98,11,23,31,3,73,88,4,69,50,1,44,16,35,67,56,92,5,89,91,46,39,26,7,84,45,17,60,9,21,28,32,97,2,57,41,64,79,42,86,71,81,94,80,82,59,20,53,48,43,93,12,68,100,29,27,78,10,38,66,83,37,47,95,65,75,18,14,33,96,22,52,87,58,99,24};
        int[] i3={89,5,63,38,94,61,41,36,39,26,28,58,98,22,76,8,10,30,19,62,70,87,45,27,66,17,80,74,14,82,6,42,73,32,40,33,86,3,64,25,52,11,81,12,16,24,71,75,99,59,47,85,4,60,43,83,7,100,97,44,13,67,50,49,68,51,79,20,57,55,23,78,34,53,31,88,65,29,1,91,21,48,2,54,84,95,15,46,96,69,37,93,35,77,56,72,90,18,92,9};
        // Tres arrays de Strings, con 20 cadenas de 5 caracteres con mayusculas y minúsculas
        String[] s1={"TzJeU","iEMxf","uFSSE","vqtLv","kimWG","GFrvz","FZEfV","XkCND","QPrHq","IkNmg","bwVEu","vcKhz","EBPGl","lIaxp","lvLoO","NDJRy","wmlvD","RQGEX","YEcnt","Qrxuz"};
        String[] s2={"pnaOQ","pVHya","iRxeU","mmxeu","BYkBX","jWUtH","VgqZy","miErW","thXgw","yDtxN","RnceT","OmDDG","LcaoI","TQZsX","mrYPZ","iDRZn","YFDUQ","PHCQG","Zogpk","WhQOG"};
        String[] s3={"qucFZ","YkKwA","KjZqP","XyRJB","LpKBr","kADli","gnDfV","lUVHm","EOKhw","QKtqK","gOCzp","DqzXx","QsMlF","ebAbA","mIUxr","ckOeO","TwgjX","QKxAc","Jstpn","WlNXw"};
        
        int[] auxInt, auxInt2, auxInt3;
        String[] auxStr;
        
        // Copiando arrays y comparandolos con la clase Arrays.
        System.out.println("-----Ordenación de enteros con Arrays.sort-----");
        //auxInt = i1; <-- OJO! esto no se puede hacer, ya que copia una referencia
        auxInt = Arrays.copyOf(i1, i1.length);
        Arrays.sort(auxInt);
        System.out.println("Sin ordenar: ");
        imprimirArrayEnteros(i1);
        System.out.println("Ordenado: ");
        imprimirArrayEnteros(auxInt);
        
        System.out.println("-----Ordenación de cadenas con Arrays.sort-----");
        auxStr = Arrays.copyOf(s1, s1.length);
        Arrays.sort(auxStr);
        System.out.println("Sin ordenar: ");
        imprimirArrayCadenas(s1);
        System.out.println("Ordenado: ");
        imprimirArrayCadenas(auxStr);
        
        // Ordenando mediante el método de la burbuja
        System.out.println("-----Ordenando mediante el método de la burbuja-----");
        Instant t1 = Instant.now();
        auxInt2 = ordenacionEnterosMetodoBurbuja(Arrays.copyOf(i2, i2.length));
        Instant t2 = Instant.now();
        System.out.println("Sin ordenar: ");
        imprimirArrayEnteros(i2);
        System.out.println("Ordenado: ");
        imprimirArrayEnteros(auxInt2);
        System.out.println("Tiempo empleado en la ordenación: " + Duration.between(t1,t2));
        
        // Ordenando mediante el método QuickSort
        System.out.println("-----Ordenando mediante el método QuickSort-----");
        Instant t3 = Instant.now();
        auxInt2 = ordenacionEnterosMetodoQuickSort(Arrays.copyOf(i2, i2.length));
        Instant t4 = Instant.now();
        System.out.println("Sin ordenar: ");
        imprimirArrayEnteros(i2);
        System.out.println("Ordenado: ");
        imprimirArrayEnteros(auxInt2);
        System.out.println("Tiempo empleado en la ordenación: " + Duration.between(t3,t4));
        
    }
    
    public static void imprimirArrayEnteros(int[] a){
        int cuenta = 0;
        for(int i = 0; i < a.length; i++){
            cuenta++;
            if(a[i]<10){System.out.print("   "+a[i]);}
            else if(a[i]==100){System.out.print(" "+a[i]);}
            else{System.out.print("  "+a[i]);}
            if(cuenta==10){
                cuenta=0;
                System.out.println("");
            }
        }
    }
    
    public static void imprimirArrayCadenas(String[] a){
        int cuenta = 0;
        for(int i = 0; i < a.length; i++){
            cuenta++;
            System.out.print("  " + a[i]);
            if(cuenta==5){
                cuenta=0;
                System.out.println("");
            }
        }
    }

    public static int[] ordenacionEnterosMetodoBurbuja(int[] arr) {
        int n = arr.length;
        boolean intercambios;
        for (int i = 0; i < n - 1; i++) {
            intercambios = false;    
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    intercambios = true;
                }
            }
            if (!intercambios) {break;}
        }
        return arr;
    }
    
    // Los tres próximos métodos son del QuickSort
    public static int[] ordenacionEnterosMetodoQuickSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
 
    String[] alumnos = {"Pepito", "Juanita", "Menganito", "Fulatina"};
    int[] notas = {3, 9, 7, 4};
    
}

// Ejercicio 1.
// Tenemos dos arrays. El primero tiene los nombres de los alumnos, y el segundo 
// tiene sus notas. Puedes usar estas declaraciones en el ejercicio:
// String[] alumnos = {"Pepito", "Juanita", "Menganito", "Fulatina"};
// int[] notas = {3, 9, 7, 4};
// Modifica el algoritmo de la burbuja para que reciba como parámetro los dos 
// arrays, no devuela nada, pero imprima por pantalla la lista de alumnos y sus 
// notas, ordenado de mayor nota a menor. Ten en cuenta que las notas y los 
// nombres deben quedar emparejados igual, por ejemplo, Pepito seguirá teniendo 
// un 3 en la lista ordenada.

// Ejercicio 2.
// Las siguientes muestras corresponden a datos de temperatura. Los datos que se 
// adjuntan contienen valores atípicos. Elimina estos valores y calcula la media 
// de temperatura, se consideran valores atípicos en esta muestra las 10 menores 
// temperaturas y las 10 mayores temperaturas.
// int[] temp= {32,24,29,11,31,28,21,28,22,7,21,23,24,24,30,24,27,7,25,36,17,36,18,22,31,27,26,28,36,36,37,28,32,27,22,27,17,26,8,29,8,23,27,31,32,23,19,37,18,31,36,17,29,17,25,32,9,31,29,27,37,27,18,31,20,16,9,37,29,25,29,29,16,37,16,17,28,36,36,29,30,22,36,22,22,8,36,8,19,30,18,25,5,16,29,19,21,19,36,29,17,19,29,18,32};

// Ejercicio 3.
// Implementa las funciones que te permitan ordenar por el método de inserción 
// y selección.

// Ejercicio 4.
// Implementa las funciones que te permitan ordenar por el método de shellsort.
