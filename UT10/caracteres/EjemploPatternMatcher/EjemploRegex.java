package caracteres.EjemploPatternMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EjemploRegex {
    public static void main(String[] args) {
        /*
         * La clase Pattern representa una expresión regular compilada. Es decir, un
         * patrón de texto que puedes usar para hacer coincidencias en cadenas. Se
         * utiliza para crear una expresión regular que se puede reutilizar en varias
         * búsquedas.
         */
        // Crear un patrón de expresión regular
        Pattern pattern = Pattern.compile("a\\d+");

        /*
         * La clase Matcher se utiliza para realizar la búsqueda en una cadena de texto
         * utilizando el patrón previamente compilado por el Pattern. Un Matcher permite
         * encontrar coincidencias, extraer datos y realizar reemplazos.
         */
        // Crear un Matcher a partir de una cadena
        Matcher matcher = pattern.matcher("a123 b456 a789");

        // Comprobar si hay coincidencias
        while (matcher.find()) {
            System.out.println("Encontrado: " + matcher.group()); // Muestra la coincidencia encontrada
        }
    }
    /*
    *  MÉTODOS DE MATCHER
     * find(): Devuelve true si se encuentra una coincidencia del patrón en la
     * cadena de texto.
     * 
     * group(): Devuelve la última coincidencia encontrada.
     * 
     * matches(): Devuelve true si toda la cadena coincide con el patrón.
     * 
     * replaceAll(String replacement): Reemplaza todas las coincidencias con el texto especificado
     */
}
