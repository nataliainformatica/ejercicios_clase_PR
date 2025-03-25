package bytes.ejemplosFilexStream;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author 
 *
 */
public class EjemploFileOutputStream {

	public static void main(String[] args) {
		
		OutputStream fOut = null;
		
		try {
			fOut = new FileOutputStream("primero.dat");
			for(int i = 0; i < 1000; i++) {
				fOut.write(i);
                                
			}			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fOut != null)
				try {
					fOut.close();
				} catch (IOException e) {					
					e.printStackTrace();
				}
		}
		
		

	}

}
/*
 * 
 *  Leer Bytes y Convertirlos a Datos
 * 
 * Como FileInputStream solo lee bytes, debemos interpretar los datos manualmente.
 * Un int en Java ocupa 4 bytes en memoria, por lo que debemos leer 4 bytes y reconstruir el número:
 * Un double ocupa 8 bytes, por lo que lo reconstruimos con ByteBuffer:
 Leer una String de longitud fija (Ejemplo: 30 bytes)


 */