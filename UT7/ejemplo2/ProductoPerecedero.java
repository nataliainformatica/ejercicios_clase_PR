
// Subclase ProductoPerecedero
public class ProductoPerecedero extends Producto {
    private LocalDate fechaCaducidad;

    public ProductoPerecedero(String nombre, double precio, LocalDate fechaCaducidad) {
        super(nombre, precio);
        this.fechaCaducidad = fechaCaducidad;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public long calcularDiasParaCaducar() {
        LocalDate hoy = LocalDate.now();
        return ChronoUnit.DAYS.between(hoy, fechaCaducidad);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Fecha de caducidad: " + fechaCaducidad);
        System.out.println("Días para caducar: " + calcularDiasParaCaducar());
    }

    public double calcularPrecioFinal() {
        long diasParaCaducar = calcularDiasParaCaducar();
        if (diasParaCaducar <= 0) {
            return 0; // Producto caducado
        } else if (diasParaCaducar <= 1) {
            return getPrecio() * 0.25; // 75% de descuento
        } else if (diasParaCaducar <= 3) {
            return getPrecio() * 0.50; // 50% de descuento
        }
        return getPrecio(); // Precio sin descuento
    }
}
