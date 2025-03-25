package bytes.ejemplosFilexStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream es una clase de Java que permite leer archivos binarios en
 * forma de flujo de bytes. Es parte del paquete java.io y se usa principalmente
 * para leer archivos de cualquier tipo (texto, imágenes, datos binarios, etc.).
 *
 */
public class EjemploFileInputStream {

	/**
	 * try (FileInputStream fis = new FileInputStream("productos.dat")) {
    int byteLeido;
    while ((byteLeido = fis.read()) != -1) {
        System.out.print((char) byteLeido); // Imprime los bytes como caracteres
    }
}
	 */
	public static void main(String[] args) {

		FileInputStream fIn = null;

		try {
			fIn = new FileInputStream("primero.dat");
			int c;
			// cada llamada a read() lee 1 byte.
			while ((c = fIn.read()) != -1)
				System.out.println(c);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fIn != null)
				try {
					fIn.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

}