package ut03e01if;

/**
 * En este ejemplo aprenderemos a usar la sentencia condicional if,
 * junto con las expresiones else y else if.
 * If es una sentencia condicional que nos va a permitir ejecutar
 * un bloque de código solo si se cumple determinada condición.
 * Las sentencias if, valoran esta condición en base a true/false.
 * Podemos indicar este true o false con una variable de tipo boolean
 * o con una expresión que arroje como resultado true/false
 * 5 + 7 arroja como resultado 12, no es válido
 * 5 == 7 arroja como resultado false, es válido.
 * Las operaciones que arrojan resultados booleanos son:
 *  == != < > <= >=
 * Además, podemos realizar varias operaciones de este tipo con
 * los operadores lógicos:
 *  && || !
 * Esta herramienta es muy poderosa y se usa en todos los niveles
 * de la programación y el desarrollo para infinidad de tareas.
 * 
 */
public class UT03E01if {

    public static void main(String[] args) {
        // Ejemplos de uso de la ejecución condicional if
        System.out.println("-----Sentencia if-----");
        
        int a = 3;
        if (a < 5) {
            System.out.println("AAA");
        }
        
        System.out.println("Esto se ejecuta siempre, no está dentro de un if.");
        
        boolean z;
        z = true;
        if (z) {
            System.out.println("BBB");
        }
        
        int b = 7;
        int c = 6;
        // usamos varias operaciones pero el resultado final será true o false
        if (!(((a < b) && (c > b)) || (b == a))) {
            System.out.println("CCC");
        }
        
        z = !(((a < b) && (c > b)) || (b == a));
        if (z) {
            System.out.println("DDD");
        }
        
        // De esta forma podemos comparar un string
        String cadena = "Hola", cadena2 = "Hola";
        if (cadena.equals(cadena2)) {
            System.out.println("EEE");
        }
        if ("Hola".equals(cadena2)) {
            System.out.println("FFF");
        }
        if (cadena.equals("Hola")) {
            System.out.println("GGG");
        }
        
        // Ejemplo de uso de la sentencia else asociada a un if
        System.out.println("-----Sentencia else-----");
        a = 2;
        if (a > 5) {
            System.out.println("HHH");
        } else {
            System.out.println("III");
        }
        
        // Ejemplo de uso de else if
        System.out.println("-----Sentencia else if-----");
        a = 5;
        if (a == 4) {
            System.out.println("JJJ");
        } else if (a == 5) {
            System.out.println("KKK");
        } else {
            System.out.println("LLL");
        }       
        
    }
    
}

/**
 * Ejercicio 1.
 * Escribe un programa que lea un número por el teclado y diga
 * si el número es par o impar.
 */

/**
 * Ejercicio 2.
 * Escribe un programa que solicite una contraseña (con mayusculas, minúsculas,
 * signos de puntuación y números), si la contraseña es correcta tendrá 
 * acceso al sistema, si es incorrecta no.
 */

/**
 * Ejercicio 3.
 * Escribe un programa que solicite la edad del comprador de un billete
 * de autobús y le muestr el precio del billete. Si es menor de 7 años 
 * el precio será gratuito, menor de 26 será un euro, hasta 65 años 2 euros 
 * y mayor de 65 gratuito.
 */

/**
 * Ejercicio 4.
 * Escribe un programa que calcule el coste de un parking. El programa
 * pedirá las horas y minutos que ha estado estacionado el vehículo.
 * El precio es: 
 * - 10 céntimos el minuto los primeros 60 minutos
 * - 7 céntimos el minuto los siguientes 120 minutos
 * - 5 céntimos los minutos restantes.
 * Si el tiempo total es mayor a 3000 minutos, en lugar de sacar el
 * précio sacará un mensaje diciendo "El coche se encuentra en el
 * depósito. Recibirá una multa en su domicilio.".
 */
