package ut03e06ternarioesperar;

// El operador ternario es un operador de uso poco frecuente en el lenguaje 
// java, debido a que los desarrolladores no están muy familiarizados con 
// su uso o que reduce la legibilidad del código.
//
// Este operador que hace lo mismo que una sentencia if/else de carácter 
// simple. La sintaxis de este operador es la siguiente:
//
// condicion ? valor_si_true : valor_si_false
//
// Donde condición es una expresión lógica que devolverá true/false, el 
// primer valor será el retornado en caso de true y el segundo valor será 
// el retornado en caso de false, los caracteres “?” y “:” se emplean como 
// separadores en esta instrucción.
//
// Ten en cuenta que el valor retornado debe recogerse en alguna variable o 
// emplearse directamente en un contexto dado, con la siguiente estructura:
//
// valor = condicion ? valor_si_true : valor_si_false;
//
// Por otra parte, en esta sesión de trabajo vamos a ver dos instrucciones 
// que nos permiten hacer esperar a nuestro programa. Estas instrucciones 
// se emplean para generar retardos, o en programas más complejos que 
// requieren la sincronización de diferentes procesos. En este ejemplo 
// lo usaremos para producir retardos en la ejecución de nuestro código. 
// Esta funcionalidad no está muy vinculada con la unidad de trabajo, 
// pero nos va a permitir dar profundidad y versatilidad a los ejercicios 
// y ejemplos que realicemos, además de comenzar a familiarizarnos con la 
// gestión del tiempo en nuestros programas.
//
// Los dos métodos que emplearemos será mediante las clases Thread y 
// TimeUnits. Para usarlas vamos a tener que gestionar sus potenciales 
// excepciones, este es un concepto más avanzado del curso, de momento 
// si necesitas emplearlo copia la estructura y no es necesario que 
// entiendas con precisión qué hacen las instrucciones try y catch.

import java.util.concurrent.TimeUnit;

public class UT03E06TernarioEsperar {

    public static void main(String[] args) {
        // En este ejemplo usamos el operador ternario para hacer
        // lo mismo que podemos hacer con una estructura if/else
        System.out.println("-----Ejemplo ternario comparado con ifelse-----");
        int x = 3, y = 7, mayor;
        
        if (x > y) {
            mayor = x;
        } else {
            mayor = y;
        }
        System.out.println("Con ifesle, el número mayor es: " + mayor);
        
        mayor = (x > y) ? x : y;
        System.out.println("Con ternario, el número mayor es: " + mayor);
        
        // Incluso lo podríamos resolver en una sola línea sin la variable mayor
        System.out.println("El mayor es " + ((x > y) ? x : y));
        
        // Ejemplo espera con Thread.sleep(x)
        System.out.println("-----Ejemplo de espera con Thread-----");
        System.out.println("Escóndete, te dos 2 segundos!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            // Aquí se maneja una excepción
            // esto lo vemos más adelante en el curos
        }
        System.out.println("Que voy!");
        
        // Ejemplo espera con TimeUnit
        System.out.println("-----Ejemplo de espera con TimeUnit-----");
        System.out.println("Escóndete, te dos 2 segundos!");
        try {
            TimeUnit.SECONDS.sleep(2);
            // Ojo! TimeUnit requiere importar la librería.
        } catch (InterruptedException e){
            // Aquí se maneja una excepción
            // esto lo vemos más adelante en el curos
        }
        System.out.println("Que voy!");
    }
    
}

// Ejercicio 1.
// Escribe un programa que lea un número por el teclado y diga si el 
// número es par o impar. Emplea operador ternario.

// Ejercicio 2.
// Escribe un programa que a partir de una variable con el número de 
// alumnos diga si cuántos han aprobado. Para cualquier valor entero y 
// positivo la sentencia debe hacer un uso correcto del plural/singular. 
// Emplear operador ternario para construir dinámicamente la oración sin 
// necesidad de almacenar en una variable.
// Ejemplos de resultados:
// Han aprobado 3 alumnos.
// Ha aprobado 1 alumno.

// Ejercicio 3.
// Escribe un programa que simule la cuenta atrás del lanzamiento de un 
// cohete. Las indicaciones por pantalla deben ser segundos reales.

// Ejercicio 4.
// Escribe un programa que simule una barra de carga del 0 al 100% dibujada 
// progresivamente con saltos temporales.
