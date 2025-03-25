package bytes.ejemploProductos;

import java.io.IOException;
import java.util.List;

public class TestMain {
 public static void main(String[] args) throws IOException {
        Producto[] productos = {
            new Producto(1, "Laptop", 1200.99, 10),
            new Producto(2, "Teclado", 25.50, 50),
            new Producto(3, "Monitor", 200.75, 30)
        };
        EscribirProductos.guardarProductos(productos);
        System.out.println("Productos guardados exitosamente.");


        List<Producto> productosLeidos = LeerProductos.leerProductos();
        for (Producto p : productosLeidos) {
            System.out.println("ID: " + p.id + ", Nombre: " + p.nombre + 
                               ", Precio: $" + p.precio + ", Stock: " + p.stock);
        }
    }
}
