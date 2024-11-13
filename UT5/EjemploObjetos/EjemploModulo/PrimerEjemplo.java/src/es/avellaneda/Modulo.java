package es.avellaneda;

public class Modulo {
    // ATRIBUTOS

    private String nombre; 
    private int notaNumerica; 
    private String curso;


    public Modulo(String nombre, int notaNumerica, String curso) {
        this.nombre = nombre;
        this.notaNumerica = notaNumerica;
        this.curso = curso;
    }

     public boolean estaAprobado(){
        boolean aprobado = false; 

        if(notaNumerica>=5){
            aprobado = true; 
            
        }
        return aprobado; 
     }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNotaNumerica() {
        return notaNumerica;
    }
    public void setNotaNumerica(int notaNumerica) {
        this.notaNumerica = notaNumerica;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    } 



    // COMPORTAMIENTOS



    



}
