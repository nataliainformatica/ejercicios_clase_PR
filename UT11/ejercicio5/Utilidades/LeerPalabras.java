package ejercicio5.Utilidades;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

public class LeerPalabras {
 public static ArrayList<String> leerDibujo(File f) throws IOException{
        
       return (ArrayList<String>) Files.readAllLines(f.toPath());


    }
}
