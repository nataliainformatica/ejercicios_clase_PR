<<<<<<< HEAD
import java.io.*;

public class PrintWriterExample {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("output.txt");

        // Escribiendo tipos básicos
        writer.println("Escribiendo tipos básicos:");
        int num = 10;
        double dbl = 3.14;
        boolean bool = true;
        writer.println("Número entero: " + num);
        writer.println("Número decimal: " + dbl);
        writer.println("Booleano: " + bool);

        // Escribiendo arrays
        writer.println("\nEscribiendo arrays:");
        int[] nums = {1, 2, 3, 4, 5};
        double[] dbls = {1.1, 2.2, 3.3, 4.4, 5.5};
        boolean[] bools = {true, false, true};
        writer.println("Array de enteros: " + java.util.Arrays.toString(nums));
        writer.println("Array de decimales: " + java.util.Arrays.toString(dbls));
        writer.println("Array de booleanos: " + java.util.Arrays.toString(bools));

        writer.close();
    }
}
=======
import java.io.*;

public class PrintWriterExample {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("output.txt");

        // Escribiendo tipos básicos
        writer.println("Escribiendo tipos básicos:");
        int num = 10;
        double dbl = 3.14;
        boolean bool = true;
        writer.println("Número entero: " + num);
        writer.println("Número decimal: " + dbl);
        writer.println("Booleano: " + bool);

        // Escribiendo arrays
        writer.println("\nEscribiendo arrays:");
        int[] nums = {1, 2, 3, 4, 5};
        double[] dbls = {1.1, 2.2, 3.3, 4.4, 5.5};
        boolean[] bools = {true, false, true};
        writer.println("Array de enteros: " + java.util.Arrays.toString(nums));
        writer.println("Array de decimales: " + java.util.Arrays.toString(dbls));
        writer.println("Array de booleanos: " + java.util.Arrays.toString(bools));

        writer.close();
    }
}
>>>>>>> 64fdd31ea5eda85d3d0c6cc985be4734134e5a11
