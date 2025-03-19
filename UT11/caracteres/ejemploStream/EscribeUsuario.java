package ejemploStream;

import java.io.*;

public class EscribeUsuario {
    private final String USUARIO = "USUARIO:";
    private final String EMAIL = "EMAIL:";
    private final String COLOR = "COLOR:";
    private final String nombreFichero = "usuario.txt";

    public void escribirUsuario() {
        File fichero = new File(nombreFichero);

        String usuario = "usuario1";
        String email = "usuario1@email.com";
        String color = "azul";
        /**
         * OutputStreamWriter es una clase en Java que convierte un OutputStream en un
         * Writer.
         * 
         * Esto permite escribir caracteres en flujos de salida que normalmente
         * manejan bytes, como archivos o sockets de red.
         * 
         * 
         * OutputStream maneja bytes.
         * 
         * Writer maneja caracteres (texto).
         * 
         * OutputStreamWriter actúa como un puente entre ambos.
         * 
         * Cuando escribes datos en un OutputStream, lo haces en bytes. Sin embargo, si
         * trabajas con texto (cadenas de caracteres), necesitas un Writer. 
         * Ahí es donde  entra OutputStreamWriter, que convierte caracteres en bytes usando una
         * codificación específica (ejemplo: UTF-8, ISO-8859-1, etc.).
         * 
         */
        try (OutputStream os = new FileOutputStream(fichero);
                OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
                BufferedWriter bw = new BufferedWriter(osw)) {
            bw.write(USUARIO + usuario);
            bw.newLine();
            bw.write(EMAIL + email);
            bw.newLine();
            bw.write(COLOR + color);
            bw.newLine();

            System.out.println("Usuario guardado correctamente en el archivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
