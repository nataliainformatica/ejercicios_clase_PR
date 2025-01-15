package es.avellaneda.ejercicio3;

import java.util.Arrays;

/**
 * Atributos:

nombre (String): Nombre del módulo (por ejemplo, "Programación").

codigo (String): Código único del módulo.

notas (Array de Notas): Lista de las evaluaciones (primera, segunda, tercera, ordinaria y extradinaria) del módulo.

Métodos: Constructor para inicializar los atributos. 
Métodos para agregar una nota y calcular la nota media.


 */
public class Modulo {

    private String nombre; 
    private String codigo; 
    private Nota[] notas; 

    public Modulo(String nombre, String codigo, Nota[] notas){
        this.nombre =nombre; 
        this.codigo = codigo; 
        this.notas = notas; 
    }

    @Override
    public String toString() {
        return "Modulo [nombre=" + 
        nombre + ", codigo=" + codigo + ", notas=" + Arrays.toString(notas) + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Nota[] getNotas() {
        return notas;
    }

    public void setNotas(Nota[] notas) {
        this.notas = notas;
    }
    

    
    







}
