<<<<<<< HEAD
import java.io.*;

public class OutputStreamWriterExample {
   public static void main(String[] args) {
      try {
         // Abrir el archivo para escritura
         FileOutputStream outputStream = new FileOutputStream("archivo.txt");

         // Crear un OutputStreamWriter con el OutputStream
         OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

         // Escribir texto en el archivo
         outputStreamWriter.write("Este es un ejemplo de OutputStreamWriter.");

         // Vaciar el búfer de salida
         outputStreamWriter.flush();

         // Cerrar el OutputStreamWriter y el FileOutputStream
         outputStreamWriter.close();
         outputStream.close();
      } catch (IOException e) {
         System.out.println("Error al escribir en el archivo: " + e.getMessage());
      }
   }
}
=======
import java.io.*;

public class OutputStreamWriterExample {
   public static void main(String[] args) {
      try {
         // Abrir el archivo para escritura
         FileOutputStream outputStream = new FileOutputStream("archivo.txt");

         // Crear un OutputStreamWriter con el OutputStream
         OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

         // Escribir texto en el archivo
         outputStreamWriter.write("Este es un ejemplo de OutputStreamWriter.");

         // Vaciar el búfer de salida
         outputStreamWriter.flush();

         // Cerrar el OutputStreamWriter y el FileOutputStream
         outputStreamWriter.close();
         outputStream.close();
      } catch (IOException e) {
         System.out.println("Error al escribir en el archivo: " + e.getMessage());
      }
   }
}
>>>>>>> 64fdd31ea5eda85d3d0c6cc985be4734134e5a11
