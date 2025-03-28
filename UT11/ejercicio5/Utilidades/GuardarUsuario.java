package ejercicio5.Utilidades;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import ejercicio5.principal.Usuario;

public class GuardarUsuario {
    private static final File fichero = new File("FichData.dat");

    /*
     * El juego tendrá una opción para mostrar las 10 mejores puntuaciones guardadas
     * en el fichero binario. Ordenadas de mayor a menor.
     */
    public static void escribirUsuario(Usuario usuario) throws IOException {

        DataOutputStream dataOS = new DataOutputStream(new FileOutputStream(fichero, true));

        // escribir los datos del usuario
        // necesitamos escribir - alias - year, month, day
        dataOS.writeUTF(usuario.getAlias()); // Guardar alias
        dataOS.writeInt(usuario.getFecha().getYear());  // Guardar año
        dataOS.writeInt(usuario.getFecha().getMonthValue()); // Guardar mes
        dataOS.writeInt(usuario.getFecha().getDayOfMonth()); // Guardar día
        dataOS.writeInt(usuario.getTotalPuntuacion()); // Guardar puntuación
        dataOS.close();

    }

}
