package es.avellaneda.ejercicio3;

/**
 * clase Alumno:

Atributos:

nombre (String): Nombre completo del alumno.

matricula (String): Número de matrícula único del alumno.

modulos (Array de Módulos): Lista de módulos en los que está inscrito el alumno.
 */

public class Alumno {

    private String nombre; 
    private String matricula; 
    private Modulo[] modulos; 

    public Alumno(String nombre, 
        String matricula, Modulo[] modulos){
            this.nombre =  nombre; 
            this.matricula = matricula;
            this.modulos = modulos;            
    }

    /**
     * TODO: Métodos agregarModulo 
     * 
     */



     /*
      *El método mostrarInformacion devuelve 
      * el nombre, matrícula y lista de módulos matriculados 
      * para el alumno
      */
     public String mostrarInformacion(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre completo: ");
        sb.append(this.nombre);
        sb.append("\n Código de matrícula: ");
        sb.append(matricula);
        for(Modulo m: modulos){
            sb.append("\n Título del módulo: ");
            // añadimos el nombre del módulos
            sb.append(m.getNombre()); 
            
        }
        return sb.toString(); 
       

     }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Modulo[] getModulos() {
        return modulos;
    }

    public void setModulos(Modulo[] modulos) {
        this.modulos = modulos;
    }



}
