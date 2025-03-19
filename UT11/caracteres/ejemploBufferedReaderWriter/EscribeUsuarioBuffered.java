package caracteres.ejemploBufferedReaderWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EscribeUsuarioBuffered {

    private final String USUARIO = "USUARIO:";
    private final String EMAIL = "EMAIL:";
    private final String COLOR = "COLOR:";
    private final String nombreFichero = "ejemploBuffer.txt";

    public void escribirUsuario() {

        File fichero = Paths.get(nombreFichero).toFile();
        // con una ruta específica
        // File fichero = Paths.get("", nombreFichero).toFile();

        // Recibiríamos los datos del usuario como objeto
        String usuario = "uno_distinto";
        String email = "dos";
        String color = "tres";

        /**
         * BufferedWriter puede ser más eficiente que FileWriter cuando se escriben
         * muchos datos, ya que escribe en el archivo en bloques en lugar de carácter
         * por carácter. Esto reduce la cantidad de operaciones de escritura que realiza
         * el sistema, lo que generalmente mejora el rendimiento.
         */
        // TRY-WITH-RESOURCES - cierra automáticamente el flujo
        try (BufferedWriter fic = new BufferedWriter(new FileWriter(fichero))) {
            /*
             * BufferedWriter no tiene un método 'append()' como FileWriter,
             * pero puedes usar write() para escribir en el archivo.
             */
            fic.write(USUARIO);
            fic.write(usuario);
            fic.newLine(); // Añade un salto de línea
            fic.write(EMAIL);
            fic.write(email);
            fic.newLine(); // Añade un salto de línea
            fic.write(COLOR);
            fic.write(color);

        } catch (IOException ex) {
            Logger.getLogger(EscribeUsuarioBuffered.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
