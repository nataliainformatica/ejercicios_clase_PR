package caracteres.ejemploNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EjemploBasico {
    public static void main(String[] args) {
        try {
            EscrituraArchivoFiles.escribirLineas();
            System.out.println(LecturaArchivoFiles.leerLineas());

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}

class LecturaArchivoFiles {
    public static List<String> leerLineas() throws IOException {
        Path ruta = Path.of("archivo_salida.txt");

        List<String> lineas = Files.readAllLines(ruta);
        lineas.forEach(linea -> System.out.println(linea));
        /*
         * for(String l: lineas){
         * System.out.println(l);
         * }
         */

        // lineas.forEach(System.out::println);
        return lineas;

    }
}

class EscrituraArchivoFiles {
    public static void escribirLineas() throws IOException {
        Path ruta = Path.of("archivo_salida.txt");
        List<String> lineas = List.of("Línea 1", "Línea 2", "Línea 3");

        Files.write(ruta, lineas);
        System.out.println("Líneas escritas en el archivo.");

    }
}
/**
 * LO VEREMOS MÁS ADELANTE
 * El método forEach en las colecciones de Java acepta un objeto que implementa
 * la interfaz Consumer, y puedes crear una implementación de esa interfaz de
 * forma explícita sin usar una expresión lambda.
 * List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
 * 
 * // Usando una clase anónima para implementar Consumer
 * numeros.forEach(new Consumer<Integer>() {
 * 
 * @Override
 *           public void accept(Integer n) {
 *           System.out.println(n);
 *           }
 *           });
 *           }
 */
