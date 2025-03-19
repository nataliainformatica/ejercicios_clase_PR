<<<<<<< HEAD
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class outputStreamWriter_buffered {
    public static void main(String[] args) {
        // Ejemplo de un objeto con distintos tipos de atributos
        String name = "Juan";
        int age = 25;
        boolean isStudent = true;
        double salary = 3000.50;

        // Intentamos escribir los atributos del objeto en un archivo
        try {
            // Creamos un flujo de salida hacia un archivo llamado "datos.txt"
            FileOutputStream outputStream = new FileOutputStream("datos.txt");

            // Creamos un objeto OutputStreamWriter que envuelve el flujo de salida
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

            // Creamos un objeto BufferedWriter que envuelve el OutputStreamWriter
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            // Escribimos los atributos del objeto en el archivo, separados por comas
            bufferedWriter.write("Nombre: " + name + ", ");
            bufferedWriter.write("Edad: " + age + ", ");
            bufferedWriter.write("Estudiante: " + isStudent + ", ");
            bufferedWriter.write("Salario: " + salary);

            // Agregamos un salto de línea al final para separar la siguiente escritura
            bufferedWriter.newLine();

            // Cerramos el BufferedWriter, que automáticamente cierra también el OutputStreamWriter
            bufferedWriter.close();

            System.out.println("Los datos del objeto han sido escritos en el archivo.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
=======
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class outputStreamWriter_buffered {
    public static void main(String[] args) {
        // Ejemplo de un objeto con distintos tipos de atributos
        String name = "Juan";
        int age = 25;
        boolean isStudent = true;
        double salary = 3000.50;

        // Intentamos escribir los atributos del objeto en un archivo
        try {
            // Creamos un flujo de salida hacia un archivo llamado "datos.txt"
            FileOutputStream outputStream = new FileOutputStream("datos.txt");

            // Creamos un objeto OutputStreamWriter que envuelve el flujo de salida
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

            // Creamos un objeto BufferedWriter que envuelve el OutputStreamWriter
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            // Escribimos los atributos del objeto en el archivo, separados por comas
            bufferedWriter.write("Nombre: " + name + ", ");
            bufferedWriter.write("Edad: " + age + ", ");
            bufferedWriter.write("Estudiante: " + isStudent + ", ");
            bufferedWriter.write("Salario: " + salary);

            // Agregamos un salto de línea al final para separar la siguiente escritura
            bufferedWriter.newLine();

            // Cerramos el BufferedWriter, que automáticamente cierra también el OutputStreamWriter
            bufferedWriter.close();

            System.out.println("Los datos del objeto han sido escritos en el archivo.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
>>>>>>> 64fdd31ea5eda85d3d0c6cc985be4734134e5a11
