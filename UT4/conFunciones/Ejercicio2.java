package ejercicios_clase_PR.UT4.conFunciones;
/**
 * 
 *   Reparto de premios. 
 *   Escribe una función que  pida al usuario hasta 5 premios y los guardará en un array de strings.
 * 
 *  Una segunda función  que introduzca una lista de 10 participantes y los guardará en un array de strings.
 * Los participantes se introducen en orden. Es decir el primero es el ganador y después el segundo, etc.
 * 
 *  Desde la función principal  tendremos que mostrar los ganadores con su premio correspondiente: 
 * 
 * ejemplo: 
 * El participante NOMBRE APELLIDOS ha  ganado el premio  PREMIO
 * 
 * 
 */


/**
 * /** *

Reparto de premios.
Escribe una función que pida al usuario hasta 5 premios y los guardará en un array de strings.
Una segunda función que introduzca una lista de 10 participantes y los guardará en un array de strings.
Los participantes se introducen en orden. Es decir el primero es el ganador y después el segundo, etc.
Desde la función principal tendremos que mostrar los ganadores con su premio correspondiente:
ejemplo:
El participante NOMBRE APELLIDOS ha ganado el premio PREMIO
*/

import java.util.Scanner;

public class Ejercicio2 {

    public static final int NUM_PREMIOS = 5;
    public static final int NUM_PARTICIPANTES = 10;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] premios = introducirPremios();
        String[] participantes = introducirParticipantes();

        // ahora vamos a mostrar el premio que le toca
        // a cada participantes
        mostrarPremios(participantes, premios);

    }

    public static void mostrarPremios(String[] participantes, String[] premios) {

        System.out.println("ESTA ES LA LISTA DE GANADORES CON SU PREMIO");
        for (int i = 0; i < NUM_PREMIOS; i++) {
            System.out.print("EL participante  " + (i + 1));
            System.out.println(participantes[i]);
            System.out.print("Ha obtenido el premio ");
            System.out.println(premios[i]);
        }

    }

    public static String[] introducirPremios() {
        String[] premios = new String[NUM_PREMIOS];
        System.out.println("INTRODUCE A CONTINUACIÓN 5 PREMIOS");
        for (int i = 0; i < NUM_PREMIOS; i++) {
            System.out.println("premio " + (i + 1));
            premios[i] = sc.nextLine();

        }
        return premios;

    }

    public static String[] introducirParticipantes() {
        String[] participantes = new String[NUM_PARTICIPANTES];
        System.out.println("INTRODUCE A CONTINUACIÓN " + NUM_PARTICIPANTES + " PARTICIPANTES");
        for (int i = 0; i < NUM_PARTICIPANTES; i++) {
            System.out.println("participantes  " + (i + 1));
            participantes[i] = sc.nextLine();

        }
        return participantes;

    }
}
