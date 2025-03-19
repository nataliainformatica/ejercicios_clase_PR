package model;

public class LibroDigital extends Libro {
    private double tamanoMB;

    public LibroDigital(String titulo, String autor, String isbn, double tamanoMB, String categoriaDewey) {
        super(titulo, autor, isbn, categoriaDewey);
        this.tamanoMB = tamanoMB;
    }

    @Override
    public String toString() {
        return super.toString() + "  (Tamaño: " + tamanoMB + "MB)";
    }
}