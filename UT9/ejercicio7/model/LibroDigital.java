<<<<<<< HEAD
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
=======
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
>>>>>>> 64fdd31ea5eda85d3d0c6cc985be4734134e5a11
}