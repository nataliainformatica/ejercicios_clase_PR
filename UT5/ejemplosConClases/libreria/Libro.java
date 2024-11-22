public class Libro {

    private String titulo;
    private String autor;
    private String sinopsis;
    private String isbn;
    private double precio;
    private int stock;
    private int valoracion;

    /**
     * Título , autor, Sinopsis, ISBN, precio, stock,
     * valoración (son datos imprescindibles en el momento de crear el libro en la
     * librería,
     * la valoración inicial es cero).
     */
    public Libro(String titulo, String autor, String sinopsis, String isbn, double precio, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.sinopsis = sinopsis;
        this.isbn = isbn;
        this.precio = precio;
        this.stock = stock;
        // valor por defecto definido en el enunciado
        this.valoracion = 0;
    }

    // OJO CON LOS GETTER Y SETTERS
    // GETTERS LOS PONEMOS TODOS,
    // SETTERS NINGUNO, PORQUE :
    // "Una vez creado el libro, no es posible modificar sus atributos,
    // si se crea con un valor erróneo, sería necesario eliminarlo y volver a
    // crearlo."
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public int getValoracion() {
        return valoracion;
    }

    /**
     * Valoración, es como en la reseñas de una web,
     * son votos positivos o negativos, y se almacena el total.
     * Por lo tanto, la clase libro tendrá un método que recibirá el valor
     * "POSITIVO" O "NEGATIVO"
     * que modificará la calificación del libro.
     * 
     * @param valor
     */
    public void valorarLibro(String valor) {
        switch (valor.toUpperCase()) {
            case "POSITIVO":
                valoracion++;

                break;
            case "NEGATIVO":
                valoracion--;
                break;

        }    
    }

    public boolean venderLibro(){
        // venta, significa stock - 1
        boolean resultado = false; 

        if(this.stock >0){
            this.stock--; 
             resultado = true; 
        }

        return resultado; 


    }
}
