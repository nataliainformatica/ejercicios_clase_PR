package ut03e09funciones;

// En este ejemplo vamos a entender qué son las funciones y qué rol desempeñan 
// en los lenguajes de programación. Debido a las características de Java y su 
// diseño vinculado a la programación orientada a objetos es posible que no 
// entendamos todos los matices de las funciones para este lenguaje, ese 
// entendimiento llegará cuando tratemos más en profundidad la programación 
// orientada a objetos. En esta lección el objetivo es entender qué son las 
// funciones desde un punto de vista generalista de cualquier lenguaje de 
// programación.
//
// Las funciones son fragmentos de código que permiten desempeñar una tarea muy 
// concreta, por ejemplo, podríamos querer una función que calcule la nota 
// media del curso en base a las notas obtenidas, una función que calcule los 
// impuestos de una compra, una función que genere un menú, etc.
//
// Las funciones ganan mucho valor en la reutilización de código y en mantener 
// una base de código simple y fácil de mantener. Si descomponemos nuestro 
// programa en fragmentos simples e implementamos estos en diferentes funciones 
// con un propósito claro y limitado, el programa final será más claro y las 
// funciones obtenidas podrán ser reutilizadas en distintas partes del programa 
// o en otro programa.
//
// Además, las funciones pueden tener parámetros de entrada y de salida 
// opcionalmente. Por ejemplo, una función que realiza la suma de dos números 
// se podrá llamar “suma”, esta función recibirá dos números como entrada 
// (los dos números que queremos sumar) y nos devolverá un número con el 
// resultado.
//
// La declaración de esa función sería int suma(int a, int b). Esto nos 
// indica que recibe dos int, a y b, y devuelve otro int (el que pone delante 
// de su nombre).
//
// No es necesario que las funciones reciban o devuelvan parámetros, es 
// opcional. Podríamos tener la función saludo, que imprima por pantalla 
// un saludo, pero no reciba ni devuelva parámetros, o la función esperar, 
// que al llamarla detenga la ejecución de nuestro programa durante un segundo.
//
// Para declarar nuestras funciones lo haremos así:
//
// public static TIPO_RETORNADO miFuncion(TIPO_ENTRADA entrada1, TIPO_ENTRADA entrada2…) {
//
//     ...
//
//     Aquí irá todo el código de nuestra función, podremos usar las variables entrada
//
//     ...
//
//    return valor;    Este valor debe ser de TIPO_RETORNADO
//
// }
//
// Si no queremos que nuestra función devuelva nada en TIPO_RETORNADO 
// podremos void.
//
// Para llamar a las funciones desde el código lo haremos de la siguiente forma:
//
// variable = miFuncion(3, 7);
//
// En caso de que no devuelva nada o no queramos guardar el valor de salida 
// podremos usarla sin asignar:
//
// miFuncion(3, 7);

public class UT03E09Funciones {

    public static void main(String[] args) {
        // Ejemplo de código que puede emplear una función
        System.out.println("-----Ejemplo de código candidato a ser una función-----");
        double nota1 = 7.84, nota2 = 0.35, nota3 = 6.32, nota4 = 4.67;
        int notaFinal;
        
        // Calculamos la nota1
        if(nota1 < 1) {
            notaFinal = 1;
        } else if (nota1 > 4 && nota1 < 5) {
            notaFinal = 4;
        } else {
            notaFinal = (int)Math.round(nota1);
        }
        System.out.println("La nota final para " + nota1 + " es: " + notaFinal);
        
        // Calculamos la nota2
        if(nota2 < 1) {
            notaFinal = 1;
        } else if (nota2 > 4 && nota2 < 5) {
            notaFinal = 4;
        } else {
            notaFinal = (int)Math.round(nota2);
        }
        System.out.println("La nota final para " + nota2 + " es: " + notaFinal);
        
        // Calculamos la nota3
        if(nota3 < 1) {
            notaFinal = 1;
        } else if (nota3 > 4 && nota3 < 5) {
            notaFinal = 4;
        } else {
            notaFinal = (int)Math.round(nota3);
        }
        System.out.println("La nota final para " + nota3 + " es: " + notaFinal);
        
        // Calculamos la nota4
        if(nota4 < 1) {
            notaFinal = 1;
        } else if (nota4 > 4 && nota4 < 5) {
            notaFinal = 4;
        } else {
            notaFinal = (int)Math.round(nota4);
        }
        System.out.println("La nota final para " + nota4 + " es: " + notaFinal);
        
        // Alternativa usando funciones (ver funcion calcularNota abajo)
        System.out.println("-----Mismo ejemplo usando una función-----");
        System.out.println("La nota final para " + nota1 + " es: " + calcularNota(nota1) );
        System.out.println("La nota final para " + nota2 + " es: " + calcularNota(nota2) );
        System.out.println("La nota final para " + nota3 + " es: " + calcularNota(nota3) );
        System.out.println("La nota final para " + nota4 + " es: " + calcularNota(nota4) );
        
        // Ejemplo de función que no devuelve ni recibe nada
        System.out.println("-----Ejemplo de función que no devuelve ni recibe nada-----");
        saluda();
        
        // Ejemplo de función que no devuelve nada
        System.out.println("-----Ejemplo de función que no devuelve nada pero si recibe-----");
        saludaA("Pepe");
        
        // Ejemplo de función con varios parámetros de entrada
        System.out.println("Ejemplo de función con varios parámetros de entrada");
        int valorSuma4Numeros;
        valorSuma4Numeros = sumaCuatroNumeros(1, 2, 3, 4);
        System.out.println("La suma de los cuatro número es " + valorSuma4Numeros);
        
        contadorInverso(5);
    
    
    }
    
    
    // Función para calcula la nota de boletín a partir de la nota decimal
    public static int calcularNota(double nota) {
        int resultado;
        if(nota < 1) {
            resultado = 1;
        } else if (nota > 4 && nota < 5) {
            resultado = 4;
        } else {
            resultado = (int)Math.round(nota);
        }
        return resultado;
    }
    
    // Función que saluda a todo el mundo
    public static void saluda(){
        System.out.println("Hola a todos");
    }
    
    // Función que saluda por un nombre
    public static void saludaA(String nombre){
        System.out.println("Hola " + nombre);
    }
    
    // Función para sumar cuatro números
    public static int sumaCuatroNumeros(int a, int b, int c, int d){
        return a + b + c + d;
    }
    
    public static void contadorInverso(int cuenta) {
        if (cuenta > 1) {
            System.out.println(cuenta);
            contadorInverso(--cuenta);
        } else {
            System.out.println(cuenta);
        }
    }
    
}


// Ejercicio 1.
// De todos los programas que has realizado en el curso hasta este momento, 
// seguro que se te ocurre alguno que se beneficiaría de la capacidad de 
// reutilización de las funciones. Reescribe un ejercicio anterior usando 
// funciones.

// Ejercicio 2.
// Crea un programa en el que introduzcas cinco números por el teclado y 
// diga cuál de ellos es el mayor. Toda la gestión de la obtención de los 
// números por el teclado debe hacerse en una función con esta declaración: 
// public static int lecturaNumeroTeclado().

// Ejercicio 3.
// Crea una función que lance N dados de M caras y muestre el resultado 
// impreso por pantalla (N y M son parámetros de la función).

// Ejercicio 4.
// Escribe un programa que transforme números decimales a binario empleando 
// funciones.

// Ejercicio 5.
// Crea un programa que use la siguiente función. Depúrala paso a paso para 
// entender su funcionamiento.
// public static void contadorInverso(int cuenta) {
//     	if (cuenta > 1) {
//         	System.out.println(cuenta);
//         	contadorInverso(--cuenta);
//     	} else {
//         	System.out.println(cuenta);
//     	}
// }


