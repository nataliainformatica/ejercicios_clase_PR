<<<<<<< HEAD
package flujosBytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ntgra
 */
public class EjemploFileInputStream_buffer {

    public static void main(String[] args) {

        byte[] buffer = new byte[1024];
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("nombreDelArchivo.txt");
            int cantidadLeida = fis.read(buffer);
            while (cantidadLeida != -1) {
                // procesar los datos leídos
                // ...

                cantidadLeida = fis.read(buffer);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjemploFileInputStream_buffer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EjemploFileInputStream_buffer.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                // manejar la excepción
            }
        }
    }
}
=======
package flujosBytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ntgra
 */
public class EjemploFileInputStream_buffer {

    public static void main(String[] args) {

        byte[] buffer = new byte[1024];
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("nombreDelArchivo.txt");
            int cantidadLeida = fis.read(buffer);
            while (cantidadLeida != -1) {
                // procesar los datos leídos
                // ...

                cantidadLeida = fis.read(buffer);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjemploFileInputStream_buffer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EjemploFileInputStream_buffer.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                // manejar la excepción
            }
        }
    }
}
>>>>>>> 64fdd31ea5eda85d3d0c6cc985be4734134e5a11
