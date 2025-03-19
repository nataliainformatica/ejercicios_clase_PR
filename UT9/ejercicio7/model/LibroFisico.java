<<<<<<< HEAD
package model;

public class LibroFisico extends Libro {
    private int numPaginas;

    public LibroFisico(String titulo, String autor, String isbn, int numPaginas, String categoriaDewey) {
        super(titulo, autor, isbn, categoriaDewey);
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return super.toString() + " (Páginas: " + numPaginas + ")";
    }
}
=======
package model;

public class LibroFisico extends Libro {
    private int numPaginas;
//     public LibroFisico(String titulo, String autor, String isbn, int numPaginas, String categoriaDewey) {

    public LibroFisico(String titulo, String autor, String isbn, int numPaginas, String categoriaDewey) {
        super(titulo, autor, isbn, categoriaDewey);
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return super.toString() + " (Páginas: " + numPaginas + ")";
    }
}
>>>>>>> 64fdd31ea5eda85d3d0c6cc985be4734134e5a11
