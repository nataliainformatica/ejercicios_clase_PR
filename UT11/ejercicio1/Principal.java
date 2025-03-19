package ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.Pipe.SourceChannel;
import java.nio.file.Paths;
import java.util.Scanner;

import ejemploFileReader.EscribeUsuario;
import ejemploFileReader.LeerUsuario;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String SALIR = "3";
        final String nombreFichero = "opcion.txt";

        String opcion;
        do {
            System.out.println("1. Consultar tu opción favorita");
            System.out.println("2. Escribir tu opción favorita");
            System.out.println(3.);

            opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    // Consultar tu opción favorita
                    try {
                        String valor = leerOpcion(nombreFichero);
                        System.out.println("TU OPCIÓN ES: "+ valor);

                    } catch (FileNotFoundException e) {
                        System.out.println("DEBES GUARDAR ANTES TUS OPCIONES");
                    } catch (IOException ex) {

                    }
                    break;
                case "2":
                    System.out.println("Dime cuál es tu opción ");
                    String favorita = sc.nextLine();
                    // Escribir tu opción favorita
                    escribirOpcion(nombreFichero, favorita);
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
        // menu

        // clase escribirOpcion
        // no es necesario que fuese en una clase aparte
        // podemos hacerlo como parte del método
        // clase leerOPcion

    }

    private static String leerOpcion(String nombreFichero) throws IOException {
        File fichero = Paths.get(nombreFichero).toFile();
        StringBuilder sb = new StringBuilder();

        FileReader fic = new FileReader(fichero);
        int i;
        while ((i = fic.read()) != -1) // lectura de un carácter
        {
            sb.append((char) i);
        }
        fic.close();

        return sb.toString();
    }

    private static void escribirOpcion(String nombreFichero, String valor) {
        File fichero = Paths.get(nombreFichero).toFile();
        try (FileWriter fic = new FileWriter(fichero)) {
            
            fic.append(valor);

        } catch (IOException ex) {
        }

    }

}
