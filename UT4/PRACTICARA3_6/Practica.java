
package EJERCICIOS.UT4;

import java.util.Scanner;

/**
 * Menu.
 * 
 * Array de palabras.
 * Cominza el juego.
 * Si adivina 5 palabras gana la ronda. Cada palabra adivinada son 5 puntos.
 * Si adivina dos palabras seguidas multiplica por dos, y las siguientes
 * palabras valen 10.
 * Si falla, vuelven a valer 5. Si son tred palabras seguidas, multiploica por 3
 * y valen. Lo mismo con 4. Son tres rondas.
 * Siguiente ronda igual. Al terminar, muestra todas las puntuaciones.
 * Biblioteca.
 * Condicional
 * Funciones
 * Arrays.
 * 
 * Puntuacion mas alta.
 */

public class Practica {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int RONDAS = 3;
        int NUM_GANADOR = 2;
        int NUM_INTENTOS=5;
        String[] palabras = JuegoPalabras.devolverPalabras();
        // vamos a ir seleccionando las palabras de forma secuencial.
        boolean continuaRonda = true;
        String palabraPrueba;
        int palabrasAdivinadas = 0;
        int puntuacion = 0;
        int intento=0;
        int[] puncuacionesRondas = new int[RONDAS];

        System.out.println("ESTE JUEGO TIENE " + RONDAS + " RONDAS");

        int contador =0; 
        for (int i = 0; i < RONDAS; i++) {

            System.out.println("RONDA " + (i + 1));
            while (continuaRonda) {
                System.out.println("INTENTO " + (intento + 1));
                System.out.println("INTRODUCE UNA PALABRA");
          
                System.out.println("AYUDA PARA RESOLVER LA PALABRA "+ esconderCaracteres(palabras[contador]));
                
                palabraPrueba = sc.nextLine();

                if (buscarPalabra(palabraPrueba, palabras)) {
                    System.out.println("HAS ACERTADO LA PALABRA");
                    // HA ACERTADO LA PALABRA
                    palabrasAdivinadas++;                
                    puntuacion += 5;
                    if (palabrasAdivinadas == NUM_GANADOR) {
                        // GANA LA RONDA - HA ACERTADO 5 PALABRAS
                        System.out.println("HAS GANADO LA RONDA");
                        continuaRonda = false;
                    }

                } else {    
                    
                    System.out.println("NO HAS ACERTADO LA PALABRA");

                }
                intento++; 
                if (intento >= NUM_INTENTOS) {
                    System.out.println("HAS ALCANZADO EL MÁXIMO DE INTENTOS ");
                    continuaRonda = false;
                    
                }
                contador++;
            }

            continuaRonda = true;
            //indicePalabra = 0;
            palabrasAdivinadas=0;
            System.out.println("ESTA RONDA SE HA ACABADO: " );
            puncuacionesRondas[i] = puntuacion;
            puntuacion=0;
            intento =0; 

        }
        System.out.println("FINALIZADO EL JUEGO");
        mostrarPuntuaciones(puncuacionesRondas);

    }

    public static boolean buscarPalabra(String palabra, String[] palabras) {
        for (int i = 0; i < palabras.length; i++) {
            if (palabra.equalsIgnoreCase(palabras[i])) {
                return true;
            }
        }
        return false;
    }

    public static void mostrarPuntuaciones(int[] puntuaciones) {
        System.out.println("LAS PUNTUACIONES DE LAS RONDAS HAN SIDO ");
         for (int i = 0; i < puntuaciones.length; i++) {
            System.out.println("RONDA " + (i + 1) + ": " + puntuaciones[i]);
        }   
    }
     
    public static String esconderCaracteres(String palabra) {
        // vamos a quitarle dos caracteres (por ejemplo el 2 y el 4) a la palabra
        String palabraEscondida = "";
        for (int i = 0; i < palabra.length(); i++) {
            if (i == 2 || i == 4) {
                palabraEscondida += "*";
            } else {
                palabraEscondida += palabra.charAt(i);
            }
        }
        //System.out.println(palabraEscondida);
        return palabraEscondida;
    }   

}
