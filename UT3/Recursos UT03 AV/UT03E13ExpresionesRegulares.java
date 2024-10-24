package ut03e13expresionesregulares;

// Las expresiones regulares son secuencias de caracteres que se emplean 
// como patrones de búsqueda para comprobar el contenido o formato de una 
// cadena de texto. Estas expresiones no son exclusivas de Java, se trata 
// de una herramienta común en el desarrollo de software y en la informática 
// en general.

// Puedes aprender más sobre las expresiones regulares en los siguientes 
// enlaces:
// https://es.wikipedia.org/wiki/Expresión_regular
// https://regexr.com/
// https://regex101.com/

// Una vez entiendas bien qué son las expresiones regulares y cómo se emplean,
// vamos a ver cómo usarlas en Java.

// La funcionalidad para trabajar con expresiones regulares en java se 
// encuentra en la librería java.util.regex. Esta librería incluye tres 
// clases: Pattern, Matcher y PatternSyntaxException. Que se emplean para 
// definir patrones, para buscar patrones y para gestionar errores de sintaxis 
// de patrones respectivamente.


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UT03E13ExpresionesRegulares {

    public static void main(String[] args) {
        // Encontrando patrones con compile sin flags
        System.out.println("-----Encontrando patrones con compile sin flags-----");
        // así indicamos el patrón
        Pattern pattern = Pattern.compile("Zubat");
        // así buscamos el patrón en una cadena de texto
        Matcher matcher = pattern.matcher("El mejor Pokemon es Zubat");
        // así podemos saber con un booleano si el patrón ha sido encontrado
        boolean matchFound = matcher.find();
        if(matchFound) {
          System.out.println("Patrón encontrado.");
        } else {
          System.out.println("Patrón no encontrado.");
        }
        matcher = pattern.matcher("El mejor Pokemon es zubat");
        matchFound = matcher.find();
        if(matchFound) {
          System.out.println("Patrón encontrado.");
        } else {
          System.out.println("Patrón no encontrado.");
        }
        
        // Encontrando partones con compile usando flags
        System.out.println("-----Encontrando partones con compile usando flags-----");
        pattern = Pattern.compile("zubat", Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher("El mejor Pokemon es Zubat");
        matchFound = matcher.find();
        if(matchFound) {
          System.out.println("Patrón encontrado.");
        } else {
          System.out.println("Patrón no encontrado.");
        }
        // Explora el resto de flags de la clase Pattern por tu cuenta.
        
        // Ejemplo de validación de formato de matrícula
        System.out.println("-----Ejemplo de validación de formato de matrícula-----");
        pattern = Pattern.compile("^[0-9]{4}[A-Z]{3}"); // suponemos que las vocales son válidas
        matcher = pattern.matcher("2134DFG");
        matchFound = matcher.find();
        if(matchFound) {
          System.out.println("Formato de matrícula correcto.");
        } else {
          System.out.println("Formato de matrícula incorrecto.");
        }
    }
    
}

// Ejercicio 1.
// Valida si un texto contiene la letra s en mitad de alguna palabra, no 
// al principio o al final.
//
// Ejercicio 2.
// Valida si un texto es una dirección de correo electrónico válida.
//
// Ejercicio 3.
// Valida una dirección IPv4 en notación CIDR.
//
// Ejercicio 4.
// Valida si un texto contiene alguna etiqueta XML.
