package ejercicios_clase_PR.UT3.funciones;

import java.util.Scanner;

/**
 * 
 * En este ejercicio además de crear funciones vamos a repasar los métodos de
 * String. Para ello hacer una función que será la encargada de pedir al usuario
 * por consola que introduzca un carácter. ¿Existe un método de Scanner que
 * permita recoger el tipo char ?. La función devolverá el char que ha
 * introducido el usuario. Después completa una función que compruebe si el el
 * carácter es una vocal, la función devolverá un booleano. En el método main,
 * realizarás la llamada a la función de pedirCaracter, y con su resultado
 * comprobarás si es una vocal o no.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        char caracter;
        System.out.println("COMPROBAREMOS SI UN CARACTER ES VOCAL O NO");
        caracter = pedirCaracter();
        System.out.println(caracter+  "¿Es vocal? "+ esVocal(caracter));
       
    }
    public static char pedirCaracter() {
        Scanner sc = new Scanner(System.in);
        String cadena;
        char c = '0';
        /*
         * cadena = sc.nextLine();
         * if (cadena.length() == 1) {
         * c = cadena.charAt(0);
         * return c;
         * } else {
         * System.out.println("Introduce un solo caracter");
         * }
         */

        do {
            System.out.println("Introduce un caracter");
            cadena = sc.nextLine();
            if (cadena.length() == 1) {
                c = cadena.charAt(0);
                return c;
            } else {
                System.out.println("Introduce un solo caracter");
            }

        } while (cadena.length() != 1);
        return c;
    }

    static boolean esVocal(char c) {
        boolean resultado;

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

}
