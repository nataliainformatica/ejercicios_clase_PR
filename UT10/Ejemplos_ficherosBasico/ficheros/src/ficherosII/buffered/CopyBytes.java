/**
 * 
 */
package buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Openwebinars
 *
 */
public class CopyBytes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String fichero1 = "imagen.jpeg"; 
                String fichero2 ="imagen2.jpeg";
                File file = new File(fichero1);
                System.out.println(file.getAbsolutePath());
                
		BufferedInputStream bin = null;
		BufferedOutputStream bout = null;

		final int TAM = 1024 * 16;
		try {
		
			bin = new BufferedInputStream(new FileInputStream(fichero1));
			bout = new BufferedOutputStream(new FileOutputStream(fichero2));

			int cantidadBytes = 0;
			byte[] buffer = new byte[TAM];

			while ((cantidadBytes = bin.read(buffer, 0, TAM)) != -1) {
				bout.write(buffer, 0, cantidadBytes);
			}
			
			System.out.println("El fichero se ha copiado correctamente");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bin != null)
				try {
					bin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			if (bout != null)
				try {
					bout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		

	}}

}
