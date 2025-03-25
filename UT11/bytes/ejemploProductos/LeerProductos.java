package bytes.ejemploProductos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LeerProductos {
    private static final String FILE_NAME = "productos.dat";

    public static List<Producto> leerProductos() throws IOException {
        List<Producto> productos = new ArrayList<>();
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            int cantidad = dis.readInt(); // Leemos el número de productos
            for (int i = 0; i < cantidad; i++) {
                int id = dis.readInt();
                String nombre = dis.readUTF();
                double precio = dis.readDouble();
                int stock = dis.readInt();
                productos.add(new Producto(id, nombre, precio, stock));
            }
        }
        return productos;
    }

    /**
     * Es posible leer los datos en un bucle hasta alcanzar el final del archivo. Como
     * DataInputStream no tiene un método directo para detectar el final del
     * archivo, puedes usar un try-catch para manejar la excepción EOFException (End
     * Of File Exception), que se lanza cuando se intenta leer más allá del archivo.
     * 
     * @return
     * @throws IOException
     */
    public static List<Producto> leerProductosEOF() throws IOException {
        List<Producto> productos = new ArrayList<>();

        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            while (true) { // Bucle infinito, salimos cuando haya EOFException
                try {
                    int id = dis.readInt();
                    String nombre = dis.readUTF();
                    double precio = dis.readDouble();
                    int stock = dis.readInt();
                    productos.add(new Producto(id, nombre, precio, stock));
                } catch (EOFException e) {
                    break; // Rompe el bucle cuando se alcanza el final del archivo
                }
            }
        }
        return productos;
    }
}
