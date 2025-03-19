package ejemploStream;

import java.io.*;
import java.util.regex.*;

public class LeerUsuario {
    private final String USUARIO = "USUARIO:";
    private final String EMAIL = "EMAIL:";
    private final String COLOR = "COLOR:";
    private final String nombreFichero = "usuario.txt";

    private String leer() {
        File fichero = new File(nombreFichero);
        StringBuilder sb = new StringBuilder();

        try (InputStream is = new FileInputStream(fichero);
             InputStreamReader isr = new InputStreamReader(is, "UTF-8");
             BufferedReader br = new BufferedReader(isr)) {

            String linea;
            while ((linea = br.readLine()) != null) {
                sb.append(linea).append("\n");
            }

        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }

    public Usuario devolver() {
        String texto = leer();

        Pattern patronUsuario = Pattern.compile("USUARIO:(.*?)\\n");
        Pattern patronEmail = Pattern.compile("EMAIL:(.*?)\\n");
        Pattern patronColor = Pattern.compile("COLOR:(.*?)\\n");

        Matcher matcherUsuario = patronUsuario.matcher(texto);
        Matcher matcherEmail = patronEmail.matcher(texto);
        Matcher matcherColor = patronColor.matcher(texto);

        String usuario = matcherUsuario.find() ? matcherUsuario.group(1).trim() : "No encontrado";
        String email = matcherEmail.find() ? matcherEmail.group(1).trim() : "No encontrado";
        String color = matcherColor.find() ? matcherColor.group(1).trim() : "No encontrado";

        return new Usuario(usuario, email, color);
    }

    public static void main(String[] args) {
        LeerUsuario lector = new LeerUsuario();
        Usuario usuario = lector.devolver();
        System.out.println("Usuario leído: " + usuario);
    }
}
