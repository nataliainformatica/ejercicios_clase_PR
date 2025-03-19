package caracteres.ejemploNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LeerUsuario {
    private final String USUARIO = "USUARIO:";
    private final String EMAIL = "EMAIL:";
    private final String COLOR = "COLOR:";
    private final String nombreFichero = "usuarioNIO.txt";

    private String leer() {
        Path rutaFichero = Path.of(nombreFichero);
        StringBuilder sb = new StringBuilder();

        try {
            List<String> lineas = Files.readAllLines(rutaFichero);
            for (String linea : lineas) {
                sb.append(linea).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
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
