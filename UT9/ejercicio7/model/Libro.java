<<<<<<< HEAD
package model;

import java.util.*;

// Clase base que implementa Comparable
public class Libro implements Comparable<Libro> {
    protected String titulo;
    protected String autor;
    protected String isbn;
    protected String codigoBiblioteca;

    public Libro(String titulo, String autor, String isbn, String categoriaDewey) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.codigoBiblioteca = generarCodigo(categoriaDewey);
    }

    private String generarCodigo(String categoriaDewey) {
        String inicialesTitulo = titulo.length() >= 3 ? titulo.substring(0, 3).toUpperCase() : titulo.toUpperCase();
        return categoriaDewey + " " + inicialesTitulo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public int compareTo(Libro otro) {
        // Como el código está dentro de Libro, Java permite acceder a los atributos
        // private de cualquier objeto Libro, aunque sea una instancia diferente.
        int comparacionCodigo = this.codigoBiblioteca.compareTo(otro.codigoBiblioteca);
        return (comparacionCodigo != 0) ? comparacionCodigo : this.titulo.compareTo(otro.titulo);
    }

    @Override
    public String toString() {
        // https://symbl.cc/es/unicode/blocks/emoticons/
        // CONVERTIR UNICODE  A STRING new String(Character.toChars(0x1F4D6))

        return new String(Character.toChars(0x1F4D6)) + " "+  titulo + " - " + autor + " (ISBN: " + isbn + ") [Código: " + codigoBiblioteca + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Libro libro = (Libro) obj;
        return isbn.equals(libro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCodigoBiblioteca() {
        return codigoBiblioteca;
    }

    public void setCodigoBiblioteca(String codigoBiblioteca) {
        this.codigoBiblioteca = codigoBiblioteca;
    }

    
}
=======
package model;

import java.util.*;

// Clase base que implementa Comparable
public class Libro implements Comparable<Libro> {
    //Libro es la clase base con los atributos 
    //titulo, autor y isbn, número de clasificación (codigoBiblioteca). 
    protected String titulo;
    protected String autor;
    protected String isbn;
    protected String codigoBiblioteca;

    public Libro(String titulo, String autor, String isbn, String categoriaDewey) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.codigoBiblioteca = generarCodigo(categoriaDewey);
    }

    private String generarCodigo(String categoriaDewey) {
        String inicialesTitulo = titulo.length() >= 3 ? titulo.substring(0, 3).toUpperCase() : titulo.toUpperCase();
        return categoriaDewey + " " + inicialesTitulo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public int compareTo(Libro otro) {
        // Como el código está dentro de Libro, Java permite acceder a los atributos
        // private de cualquier objeto Libro, aunque sea una instancia diferente.
        int comparacionCodigo = this.codigoBiblioteca.compareTo(otro.codigoBiblioteca);
        return (comparacionCodigo != 0) ? comparacionCodigo : this.titulo.compareTo(otro.titulo);
    }

    @Override
    public String toString() {
        // https://symbl.cc/es/unicode/blocks/emoticons/
        // CONVERTIR UNICODE  A STRING new String(Character.toChars(0x1F4D6))

        return new String(Character.toChars(0x1F4D6)) + " "+  titulo + " - " + autor + " (ISBN: " + isbn + ") [Código: " + codigoBiblioteca + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Libro libro = (Libro) obj;
        return isbn.equals(libro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCodigoBiblioteca() {
        return codigoBiblioteca;
    }

    public void setCodigoBiblioteca(String codigoBiblioteca) {
        this.codigoBiblioteca = codigoBiblioteca;
    }

    
}
>>>>>>> 64fdd31ea5eda85d3d0c6cc985be4734134e5a11
