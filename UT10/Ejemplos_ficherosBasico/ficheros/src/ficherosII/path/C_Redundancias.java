/**
 * 
 */
package ficherosII.path;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author 
 *
 */
public class C_Redundancias {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("User home: " + System.getProperty("user.home"));
		// System.getProperty(String clave) -
		// ejemplo user.dir (directorio de trabajo) - user.home(directorio de instalación de java) os-name
		// java.version - os.version- file.separator
		// se utiliza para obtener propiedades del sistem, que describen el entorno de ejecución
		Path path = Paths.get(System.getProperty("user.home"),"documents", "java", "..", "..", "temario.txt");		
		System.out.println(path.toString());
		
		Path normalized = path.normalize();
		System.out.println(normalized.toString());
		

	}

}
