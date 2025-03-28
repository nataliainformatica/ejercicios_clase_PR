package ejercicio5.Utilidades;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CrearPalabras {
public static void main(String[] args) {
        final String RUTA = "recursos";
        final String NOMBRE_FICHERO = "palabras.txt";
       
        Path directorio = Paths.get(RUTA);
        try {
            Files.createDirectories(directorio);
            System.out.println("Directorio creado o ya existente: " + directorio);
        } catch (Exception e) {
            System.err.println("Error al crear el directorio: " + e.getMessage());
        }

        Path rutaFichero = Path.of(RUTA, NOMBRE_FICHERO);
        String[] palabrasArray = {
            "sol", "luz", "nube", "cielo", "camino", "ratón", "computadora",
            "perro", "gato", "avión", "casa", "puerta", "ventana", "juego"
        };
        // Convertir el array a ArrayList y filtrar palabras de 4 a 7 letras
        List<String> palabras= Arrays.asList(palabrasArray);
        try {
            Files.write(rutaFichero, palabras,StandardCharsets.UTF_8);
            
                   System.out.println("Palabras guardadas correctamente"); 
        }catch(IOException ex){
            ex.printStackTrace();
        }
        }

       
    

}


