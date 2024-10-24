package ut03e02switch;

/**
 * En este ejemplo aprenderemos a usar la sentencia condicional switch.
 * Esta sentencia no será útil cuando queramos comparar una variable
 * con una serie de valores concretos. Si bien esta operación la podemos
 * realizar con una serie de else if, el uso de switch tiene algunas leves
 * diferencias y puede generar código más limpio.
 */
public class UT03E02switch {

    public static void main(String[] args) {
        // Ejemplo de uso de switch
        System.out.println("-----Ejemplo básico de switch-----");
        int dia = 3;
        String nombreDia;
        
        switch (dia) {
            case 1:
                nombreDia = "lunes";
                break;
            case 2:
                nombreDia = "martes";
                break;
            case 3:
                nombreDia = "miércoles";
                break;
            case 4:
                nombreDia = "jueves";
                break;
            case 5:
                nombreDia = "viernes";
                break;
            default:
                nombreDia = "no existe ese día";
        }
        
            System.out.println("El día seleccionado es: " + nombreDia);
            
            
        // Comprobando el uso opcional de break y default
        System.out.println("-----Ejemplo switch con ausencia de break-----");
        int a = 2, b = 1;
        switch (a) {
            case 1:
                b = 5;
                break;
            case 2:
                b = 10;
            case 3:
                b = 20;
                break;
            default:
                b = 3;
        }
        System.out.println("El valor de b es: " + b);
        
        System.out.println("-----Ejemplo switch con ausencia de default-----");
        a = 4;
        b = 1;
        switch (a) {
            case 1:
                b = 5;
                break;
            case 2:
                b = 10;
                break;
            case 3:
                b = 20;
                break;
        }
        System.out.println("El valor de b es: " + b);
    }
    
}

/**
 * Ejercicio 1.
 * Reescribe el ejercicio del precio del billete del autobús de (UT03E01if)
 * empleando la instrucción switch.
 */

/**
 * Ejercicio 2.
 * Escribe un programa que genere un menú de opciones para el usuario. El
 * usuario debe pulsar una de las opciones y el programa responder con la
 * opción pulsada.
 */

/**
 * Ejercicio 3.
 * Escribe un programa que pregunte por el día de la semana que quiere
 * reservar pista de tenis. Tras seleccionar el día debe decir que pista
 * quiere reservar, y si quiere contratar luz artificial.
 * Las pistas disponibles por días son:
 * Lunes (1, 2 y 3), Martes (4, 5 y 6) y Miércoles (1, 4 y 7).
 * La luz se puede contratar todos los días.
 * El programa debe mostrar la secuencia de operaciones del usuario y guiarle,
 * por ejemplo si decide reservar martes, el programa debe decir qué pistas
 * están libres ese día para que él pueda decidir.
 * Al final debe mostrarse el resultado de la reserva
 * Ejemplo: Ha reservado La pista 4 el miércoles sin luz artificial.
 */

/**
 * Ejercicio 4.
 * Escribe un programa que a partir de tres números introducidos por el
 * teclado, los muestre ordenados de mayor a menor.
 */

/**
 * Ejercicio 5.
 * Escribe un programa que salude al usuario, pero el usuario debe poder
 * seleccionar en qué color quiere ser saludado.
 */