/**
 * Ejercicio 2
 * Crea un programa, que tendrá un menú
 * 
 * Consultar tus opciones favoritas
 * Escribir tus opciones favoritas
 * Salir
 * Si pulsa la opción 1, intentará leer el fichero opciones.txt. El fichero
 * existirá si el usuario en algún momento ha ejecutado la aplicación y ha
 * escrito sus opciones favoritas.
 * 
 * Si el fichero no exciste, mostrará un mensaje al usuario: "DEBES GUARDAR ANTES
 * TUS OPCIONES" Si el fichero existe, mostrará al usuario su opción guardada.
 * 
 * Si pulsa la opción 2, preguntará al usuario cuál es su opción favorita, y la
 * guardará en el fichero opciones.txt. Continuará preguntando al usuario por su
 * opción favorita, hasta que el usuario escriba SALIR (o salir).
 */

package ejercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.nio.file.Paths;
import java.util.Scanner;


public class EJercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String SALIR = "3";

        final String nombreFichero = "opcionBUFFERED.txt";

        String opcion;
        do {
            System.out.println("1. Consultar tu opción favorita");
            System.out.println("2. Escribir tu opción favorita");
            System.out.println(3.);

            opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    // Consultar tu opción favorita
                  
                        String valor = leerOpcion(nombreFichero);
                        System.out.println("TU OPCIÓN ES: " + valor);

                    
                    break;
                case "2":

                    escribirOpcion(nombreFichero);
                    break;
                case "3":
                    // salir
                    System.out.println("FIN DE LA APLICACIÓN");
                    break;
                default:
                    System.out.println("TU SELECCIÓN NO ES VÁLIDA");
                    break;
            }

        } while (!opcion.equals(SALIR));

    }

    private static String leerOpcion(String nombreFichero) {
        File fichero = Paths.get(nombreFichero).toFile();
        StringBuilder sb = new StringBuilder();

        String linea;
        try (BufferedReader fic = new BufferedReader(new FileReader(fichero))) {
            while ((linea = fic.readLine()) != null) // lectura de una línea
            {
                sb.append(linea);
                
                sb.append("\n");
            }
        } catch (IOException ex) {
            System.out.println("ERROR");
        }

        return sb.toString();
    }

    private static void escribirOpcion(String nombreFichero) {
        Scanner sc = new Scanner(System.in);
        File fichero = Paths.get(nombreFichero).toFile();
        final String SALIR = "salir";
        String favorita;
        boolean continua = true;

        // Escribir tu opción favorita
        try (BufferedWriter fic = new BufferedWriter(new FileWriter(fichero,true))) {
            do {
                System.out.println("Dime cuál es tu opción ");
                favorita = sc.nextLine();
                // escribe la línea
                if (!favorita.equalsIgnoreCase(SALIR)) {
                    fic.write(favorita);
                    fic.newLine();
                } else {
                    continua = false;
                }
            } while (continua);
        } catch (IOException ex) {
            System.out.println("Error");
        }

    }

}
