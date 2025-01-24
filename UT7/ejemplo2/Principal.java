
// Clase principal para probar el ejemplo
public class Principal {
    public static void main(String[] args) {
        // Fecha de caducidad: 2 días a partir de hoy
        ProductoPerecedero leche = new ProductoPerecedero("Leche", 1.20, LocalDate.now().plusDays(2));

        // Producto no perecedero
        ProductoNoPerecedero libro = new ProductoNoPerecedero("Libro", 15.00, "Educativo");

        System.out.println("Información del producto perecedero:");
        leche.mostrarInformacion();
        System.out.println("Precio final: $" + leche.calcularPrecioFinal());
        System.out.println();

        System.out.println("Información del producto no perecedero:");
        libro.mostrarInformacion();
        libro.aplicarPromocion();
    }
}
