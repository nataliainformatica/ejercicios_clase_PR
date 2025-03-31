package ejercicio5.Utilidades;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.time.LocalDate;
import java.util.ArrayList;

import ejercicio5.principal.Usuario;

public class LeerUsuarios {
    private static final File fichero = new File("FichData.dat");

    public static ArrayList<Usuario> getUsuarios() throws IOException {

        ArrayList<Usuario> usuarios = new ArrayList<>();
        /* alternativa con Files
       if( Files.exists(Path.of("FichData.dat"))){
         //   
       }
        
        */

        // leer el fichero
        if(fichero.exists()){

        DataInputStream dataIS = new DataInputStream(new FileInputStream(fichero));
        boolean continua = true; 
        String alias;
        int year, month, day;
        int puntuacion;
        try {
            while (continua) {
                // escribir los datos del usuario
                // necesitamos escribir - alias - year, month, day
                alias = dataIS.readUTF(); // Leer alias
                year = dataIS.readInt(); // leer año
                month = dataIS.readInt(); // Leer mes
                day = dataIS.readInt(); // Leer día
                puntuacion = dataIS.readInt(); // Leer puntuación

                usuarios.add(new Usuario(alias, LocalDate.of(year, month, day), puntuacion));

            }
        } catch (EOFException eo) {
            continua = false; 
        }

        dataIS.close();
    }else
        throw new IOException(); 
        return usuarios;

    }

}
