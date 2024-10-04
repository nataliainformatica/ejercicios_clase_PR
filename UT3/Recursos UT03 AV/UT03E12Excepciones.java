package ut03e12excepciones;

// Las excepciones en Java son errores que se producen mientras nuestro 
// código se está ejecutando. Es importante entender que estos errores son 
// diferentes a los errores de compilación, estos no nos permiten ejecutar 
// el programa, pero los errores generados por excepciones se producen a 
// mitad de la ejecución de nuestro programa.

// En este ejemplo vamos a entender de forma básica qué es una excepción 
// y cómo gestionarla dentro de nuestros programas, más adelante en el 
// curso trataremos las excepciones en más profundidad.
//
// Existen diferentes tipos de excepciones, estas excepciones intentan 
// definir la causa del error en tiempo de ejecución, algunas son: IOException, 
// NullPointerException, ArithmeticException o IndexOutOfBoundException. 
// No es necesario entenderla de momento, tan solo saber que existen 
// diferentes tipos de excepciones, y que Java, en tiempo de ejecución, 
// puede informarnos de estas incidencias en nuestros programas.

// Cuando ocurre una excepción en nuestros programas se plantean dos 
// escenarios:
// - No gestionarla. Esto provoca que la aplicación entera deja de funcionar.
// - Gestionarla, informando al usuario si es necesario, pero continuando 
// con la ejecución del programa, pese al error.

// Es nuestra decisión, como diseñadores y programadores de la aplicación, 
// decidir qué excepciones queremos tratar y cuales no, el conocimiento de 
// las causas que las generan, la repercusión de estas en la ejecución de 
// los programas, y la experiencia nos permitirán tomar las mejores decisiones 
// de diseño al respecto.

// Un escenario en el que es correcto tratar la excepción, puede ser un 
// programa que deba conectarse remotamente a un recurso mediante la red, 
// en cierta ocasiones la red no estará funcionando de forma correcta debido 
// a problemas externos a nuestro programa. Podemos indicar este error como 
// un fallo en la conexión de red, en lugar de interrumpir de forma abrupta 
// nuestro programa.

// Un escenario en el que es correcto no tratar la excepción, es aquel en 
// el que un mal diseño de la codificación o el diseño de la solución está 
// provocando los errores, por ejemplo, si estoy intentando hacer divisiones 
// por cero en nuestro programa, este generará una excepción Aritmética, 
// si esta división puedo evitarla con un mejor diseño del código, en lugar 
// de gestionar la excepción puedo rediseñar mi código para que no ocurra 
// este problema en tiempo de ejecución.

// Para gestionar las excepciones usamos una estructura de código en Java 
// conocida como try-catch-finally. Y tiene la siguiente forma:
// try {
//    Código que potencialmente genera una excepción
// } catch (Exception e) {
//     Código que solo se ejecuta si se produce una excepción, podemos usar 
//     información de la excepción “e”
// } finally {
//     Bloque OPCIONAL. Código que se ejecuta siempre, tanto si se produce 
//     la excepción como si no. Suele usarse para liberar recursos.
// }

public class UT03E12Excepciones {


    public static void main(String[] args) {
        System.out.println("-----Usando el bloque try-catch-finally-----");
        try {
            System.out.println("Try sin posibles excepciones.");
        } catch(Exception e) {
            System.out.println("Catch sin posibles excepciones.");
        } finally {
            System.out.println("Finally sin posibles excepciones.");
        }
        
        System.out.println("-----Gestionando una excepción-----");
        int n1 = 5, n2 = 0;
        try {
            System.out.println("Intentamos dividir por 0.");
            n1 = n1 / n2;
        } catch(Exception e) {
            System.out.println("Catch división por 0.");
            System.out.println("Información de e:" + e);
        } finally {
            System.out.println("Finally división por 0.");
        }
        
        //n1 = n1 / n2; // y si lo hago sin un bloque try-catch?
        
        System.out.println("-----El bloque finally es opcional-----");
        try {
            System.out.println("Intentamos dividir por 0.");
            n1 = n1 / n2;
        } catch(Exception e) {
            System.out.println("Catch división por 0.");
            System.out.println("Información de e:" + e);
        }
        
    }
    
}

// Ejercicio 1.
// Realiza un programa que pida un número por el teclado, si el usuario 
// introduce algo que no sea un número, el programa debe decirle al usuario 
// que el dato no es válido y que introduzca un número. Usa gestión de 
// excepciones.

// Ejercicio 2.
// Investiga qué implican los siguientes tipos de excepciones: 
// IndexOutOfBoundsExpection y NullPointerException.
