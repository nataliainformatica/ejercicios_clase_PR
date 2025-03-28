package ejercicio5.Utilidades;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CrearAhorcado {
    /**
     * Al inicio del juego, el usuario podrá elegir entre diferentes estilos de
     * dibujos del ahorcado. (los dibujos, estarán en un fichero en la carpeta
     * "dibujos", en la ruta de la aplicación, de forma que se mostrará el nombre de
     * todos los ficheros que haya en esta carpeta, para que el usuario elija uno),
     * por ejemplo
     * 
     * @param args
     */

    public static void main(String[] args) {
        final String RUTA = "dibujos";
        final String NOMBRE_FICHERO = "dibujo1.txt";
        final String NOMBRE_FICHERO2 = "dibujo2.txt";
        Path directorio = Paths.get("dibujos");
        try {
            Files.createDirectories(directorio);
            System.out.println("Directorio creado o ya existente: " + directorio);
        } catch (Exception e) {
            System.err.println("Error al crear el directorio: " + e.getMessage());
        }

        Path rutaFichero = Path.of(RUTA, NOMBRE_FICHERO);
        Path rutaFichero2 = Path.of(RUTA, NOMBRE_FICHERO2);
        

        List<String> lineas = new ArrayList<>(Arrays.asList(
                "  +----+",
                "  |    |",
                "  (x_x) |",
                "  /|\\  |",
                "  / \\  |",
                "       |",
                "========="));

                List<String> lineas2 = new ArrayList<>(Arrays.asList(
                    " +----+-\\",
                    "         |",
                    "         |",
                    "         |",
                    "    |    |",
                    "   ( )   |",
                    "   /|\\   |",
                    "   / \\   |",
                    "         |",
                    "         |",
                    "========="));

        try {
            Files.write(rutaFichero, lineas,StandardCharsets.UTF_8);
            Files.write(rutaFichero2, lineas2,StandardCharsets.UTF_8);
                   System.out.println("Dibujos guardados correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
