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
