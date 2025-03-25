package bytes.ejemploProductos;
import java.io.*;

public class EscribirProductos {
    private static final String FILE_NAME = "productos.dat";

    public static void guardarProductos(Producto[] productos) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME))) {
            dos.writeInt(productos.length); // Guardamos el número de productos
            for (Producto p : productos) {
                dos.writeInt(p.id);
                dos.writeUTF(p.nombre);
                dos.writeDouble(p.precio);
                dos.writeInt(p.stock);
            }
        }
    }

   
}
