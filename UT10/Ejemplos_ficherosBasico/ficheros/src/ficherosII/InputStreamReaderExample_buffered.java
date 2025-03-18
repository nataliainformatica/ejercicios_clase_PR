import java.io.*;

public class InputStreamReaderExample_buffered {
    public static void main(String[] args) {
        try {
            // Abrir el archivo para lectura
            FileInputStream inputStream = new FileInputStream("archivo.txt");
            
            // Crear un InputStreamReader con el InputStream y especificar el conjunto de caracteres a utilizar
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            
            // Crear un BufferedReader con el InputStreamReader
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            
            // Leer el archivo línea por línea y mostrarlo en la consola
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }
            
            // Cerrar el BufferedReader y el InputStreamReader
            bufferedReader.close();
            inputStreamReader.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
