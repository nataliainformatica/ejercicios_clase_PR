
public class ProductoNoPerecedero extends Producto {
    private String tipo;

    public ProductoNoPerecedero(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: " + tipo);
    }

    public void aplicarPromocion() {
        System.out.println("Promoción aplicada: 10% de descuento.");
        System.out.println("Nuevo precio: $" + (getPrecio() * 0.90));
    }
}
