package caracteres.ejemploBufferedReaderWriter;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeerUsuarioBuffered {

    private final String USUARIO = "USUARIO:";
    private final String EMAIL = "EMAIL:";
    private final String COLOR = "COLOR:";
    private final String nombreFichero = "ejemploBuffer.txt";

    private String leer() {
        Path currentDir = Paths.get("");
        String ruta = currentDir.toAbsolutePath().toString();
        System.out.println("RUTA: " + ruta);
        File fichero = new File(ruta + "/" + nombreFichero);
        StringBuilder sb = new StringBuilder();

        // TRY-WITH-RESOURCES para cerrar el flujo automáticamente
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                sb.append(linea).append("\n");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("EL FICHERO NO EXISTE");
            return null;
        } catch (IOException ex) {
            Logger.getLogger(LeerUsuarioBuffered.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

        return sb.toString();
    }

    public Usuario devolver() {
        String texto = leer();
        if (texto == null || texto.isEmpty()) {
            System.out.println("No se pudo leer el archivo.");
            return null;
        }

        Pattern patronUsuario = Pattern.compile("USUARIO:(.*?)\\s*EMAIL:");
        Pattern patronEmail = Pattern.compile("EMAIL:(.*?)\\s*COLOR:");
        Pattern patronColor = Pattern.compile("COLOR:(\\S+)");

        Matcher matcherUsuario = patronUsuario.matcher(texto);
        Matcher matcherEmail = patronEmail.matcher(texto);
        Matcher matcherColor = patronColor.matcher(texto);

        String usuario = matcherUsuario.find() ? matcherUsuario.group(1).trim() : "No enviado";
        String email = matcherEmail.find() ? matcherEmail.group(1).trim() : "No enviado";
        String color = matcherColor.find() ? matcherColor.group(1).trim() : "No enviado";

        if (!usuario.equals("No enviado")) {
            return new Usuario(usuario, email, color);
        } else {
            System.out.println("No se encontró ningún usuario.");
            return null;
        }
    }

    /**
     * Para probar el funcionamiento
     * @param args
     */
    public static void main(String[] args) {
        LeerUsuarioBuffered leerUsuario = new LeerUsuarioBuffered();
        Usuario usuario = leerUsuario.devolver();

        if (usuario != null) {
            System.out.println("Usuario leído: " + usuario);
        } else {
            System.out.println("Error al leer el usuario.");
        }
    }
}
