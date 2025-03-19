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

/**
 * 1. Sintaxis Básica de Expresiones Regulares
. (punto): Coincide con cualquier carácter excepto un salto de línea.

\\d: Coincide con cualquier dígito (equivalente a [0-9]).

\\D: Coincide con cualquier carácter que no sea un dígito.

\\w: Coincide con cualquier carácter alfanumérico (letras y números) y el guion bajo _.

\\W: Coincide con cualquier carácter que no sea alfanumérico.

\\s: Coincide con cualquier espacio en blanco (espacios, tabulaciones, saltos de línea).

\\S: Coincide con cualquier carácter que no sea un espacio en blanco.

2. Cuantificadores
*: Coincide con 0 o más repeticiones del patrón anterior.

+: Coincide con 1 o más repeticiones del patrón anterior.

?: Coincide con 0 o 1 repetición del patrón anterior.

{n}: Coincide con exactamente n repeticiones del patrón anterior.

{n,}: Coincide con n o más repeticiones del patrón anterior.

{n,m}: Coincide con entre n y m repeticiones del patrón anterior.

3. Anclas
^: Coincide con el inicio de la cadena.

$: Coincide con el final de la cadena.

4. Grupos y Alternancia
(): Define un grupo de captura.

|: Alternancia (similar a un OR), por ejemplo: abc|def coincide con "abc" o "def".
 */
// ejemplo
//        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
/*
 * 1. ^:
Este símbolo indica el inicio de la cadena. Se asegura de que la coincidencia comience desde el principio de la cadena.

2. [a-zA-Z0-9_+&*-]+:
Este es un conjunto de caracteres que describe los caracteres permitidos para la parte local del correo (antes del @).

a-zA-Z: Letras en minúsculas y mayúsculas.

0-9: Números del 0 al 9.

_+&*-: Caracteres especiales como el guion bajo (_), más (+), y (&), asterisco (*), y guion (-).

El + al final indica que debe haber al menos un carácter en esta parte del correo.

Ejemplo válido: usuario, user_123, abc+xyz

3. (?:\\.[a-zA-Z0-9_+&*-]+)*:
Este es un grupo no capturante (denotado por (?:...)) que describe la posibilidad de tener puntos (.) seguidos de caracteres válidos en la parte local.

\\.: El punto debe ser escapado con \\ porque en las expresiones regulares, el punto tiene un significado especial (cualquier carácter). Aquí, estamos diciendo "un punto literal".

[a-zA-Z0-9_+&*-]+: Lo mismo que antes, caracteres alfanuméricos y algunos símbolos especiales.

El * al final indica que esto puede repetirse 0 o más veces, lo que significa que puede haber varios segmentos de la forma .algo en la parte local del correo, pero no necesariamente.

Ejemplo válido: user.name, user.name.surname

4. @:
Este es simplemente el símbolo @, que separa la parte local de la dirección de correo electrónico de la parte del dominio.

5. (?:[a-zA-Z0-9-]+\\.)+:
Otro grupo no capturante que describe la parte del dominio del correo (después del @).

[a-zA-Z0-9-]+: Los caracteres permitidos para las etiquetas de dominio. Pueden ser letras (mayúsculas o minúsculas), números, y guiones (-).

\\.: Un punto literal que separa las partes del dominio (por ejemplo, en example.com, el . separa example y com).

El + al final indica que debe haber al menos una parte del dominio, como example. o sub.domain..

Ejemplo válido: gmail. example. co.uk.

6. [a-zA-Z]{2,7}:
Esto define la extensión del dominio (como .com, .org, etc.).

[a-zA-Z]: Las letras en minúsculas o mayúsculas.

{2,7}: Indica que deben ser entre 2 y 7 letras. Esto cubre la mayoría de las extensiones de dominio válidas (como .com, .org, .net, .info, etc.).

Ejemplo válido: .com, .org, .net

7. $:
Este símbolo indica el final de la cadena. Se asegura de que la coincidencia termine al final de la cadena, lo que significa que la dirección de correo electrónico no puede tener caracteres extra después de la extensión del dominio.
 */