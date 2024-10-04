package ut03e03for;

/**
 * En este ejemplo aprenderemos a usar la instrucción iterativa (for).
 * Esta instrucción nos permite ejecutar un grupo de instrucciones, 
 * de forma repetida, un número determinado de veces.
 * Por ejemplo, necesitamos hacer un programa que cuenta hasta 100.
 * Podríamos escribir 100 sentencias System.out.println, pero sería
 * muy tedioso y repetitivo.
 * La sentencia for nos va a permitir escribir el System.out.println
 * una sola vez e indicar que se ejecute las 100 veces.
 */
public class UT03E03for {

    public static void main(String[] args) {
        // Ejemplo básico de bucle for
        System.out.println("-----Ejemplo básico de for-----");
        for (int i = 1; i < 5; i++) {
            System.out.println(i);
        }
        
        // Observa el interior del paréntesis tras el for
        // tiene esta estructura:
        // for (cosa1; cosa2; cosa3;)
        // ¿Qué es cada cosa?
        // - cosa1: Es una instrucción de código que se
        //          ejecutará antes de comenzar el bucle
        // - cosa2: es la condición lógica (true o false)
        //          que se evaluará en cada iteración del
        //          bucle, si es true se ejecuta de nuevo,
        //          si es false termina el bucle.
        // - cosa3: es una instrucción que se ejecuta al teminar
        //          cada ejecución del bloque de código que hay
        //          dentro de las llaves {} del for.
        
        // Entonces, nuestro ejemplo anterior, declara una variable
        // entera llamada i con valor 1, luego evalua la exprexión
        // lógica i <5, como esta condición es true, entra en las {}
        // y ejecuta todo su contenido, al finalizar la ejecución del
        // contenido de las {} ejecuta i++. En ese momento vuelve a
        // evaluar la expresión lógica i < 5, cuando esta condición
        // sea true, entrará de nuevo en las llaves {}, fuando sea
        // false terminará el bucle.
        
        // Ejemplo poco ortodoxo de for
        System.out.println("-----Ejemplo poco ortodoxo de for-----");
        int p = 3;
        for(System.out.println("Yo me llamo Ralph"); p != 37; p = 37) {
            System.out.println("¡Corre plátano!");
        }
        
        // No debes ceñirte al uso del for del primer ejemplo
        // es una herramienta muy potente que puede dar rienda
        // suelta a la creatividad.
        // Aprende de estos ejemplos.
        System.out.println("-----Lanzando un cohete-----");
        for (int i = 5; i != 0; i--) {
            System.out.println("Despegue en " + i);
        }
        
        System.out.println("-----Hmmm....-----");
        for (int i = 33; i < 43; i=i+2){
            for (int j = 0; j < 8; j++){
                System.out.print("\033[3" + j + "m" + Character.toString(j + i));
            }
            System.out.print("\n");
        }

        // Las variables i que estamos declarando dentro de los paréntesis
        // de los for, "nacen" y "mueren" en cada for. No se pueden usar
        // fuera de ellos. Más adelante en el curso se explicará esto
        // con más detalle.
    }
    
}

/**
 * Ejercicio 1.
 * Escribe de nuevo el ejercicio de calcular una tabla de mutiplicar
 * empleando un bucle for.
 */

/**
 * Ejercicio 2.
 * Escribe un programa que recorra con un bucle los números del 1 al 100
 * y saque por pantalla los que sean múltiplo de 7 de la siguiente forma:
 * Los números múltiplos de 7 son: 7, 14, 21...
 */

/**
 * Ejercicio 3.
 * ¿Recuerdas qué pasaba si escribias un char en un System.out.print?
 * ¡Bien! Me alegro de que lo recuerdes.
 * Crea un programa en el que declares esta línea:
 * String frase = "Zubat es mejor que Charmander.";
 * luego escribe frase.charAt... y familiarízate con ese método
 * qué hace?, qué parámetros recibe?, qué parámetros devuelve?
 * ¡Bien! ¡Bien!, vas bien.
 * En el programa debes calcular la suma de todos los caractéres
 * de la frase.
 */

/**
 * Ejercicio 4.
 * Realiza un programa que deje hace log in. Para ello el usuario debe
 * introducir una contraseña. Si la acierta, entrará, si la falla debe
 * generar un mensaje diciendo que le quedan X intentos, si la falla
 * en todos los intentos debe decir que la cuenta ha quedado bloqueada.
 */

/**
 * Ejercicio 5.
 * Escribe un programa que saque por pantalla un cuadrado, el tamaño
 * del cuadrado y el caracter empleado para dibujarlo debe ser introducido
 * por el usuario.
 * Ejemplo de ejecución:
 * Tamaño del cuadrado: 4
 * Caracter empleado: @
 * Aquí tiene su cuadrado:
 * @@@@
 * @  @
 * @  @
 * @@@@
 * Si quieres amplíalo pidiendo un color y un caracter para el relleno.
 * Si quieres seguir ampliándolo que además de un cuadrado, pueda ser 
 * un triangulo, o un círculo.
 */


