
package flujosBytes;

import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author ntgra
 */
public class EjemploFileOutputStream_buffer {
    
    public static void main(String[] args) {
        try {
            // Abrir el archivo de destino
            FileOutputStream fos = new FileOutputStream("archivo.txt");
            //Crear un buffer de bytes
            byte[] buffer = new byte[1024];
            // Escribir en el archivo usando el buffer de bytes
            String texto = "Hola, mundo!";
            buffer = texto.getBytes();
            fos.write(buffer, 0, buffer.length);
            // Cerrar el archivo
            fos.close();
            System.out.println("El archivo se ha escrito correctamente.");
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo: " + ex.getMessage());
        }
    }
}

    

