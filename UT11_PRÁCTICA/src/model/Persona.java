package model;

import java.io.Serializable;

public class Persona implements Serializable {

    private static final long serialVersionUID = 1L; 
    private String nombreApellidos; 
    private String numeroEmpleado; 
    private String password;
    public Persona(String nombreApellidos, String numeroEmpleado, String password) {
        
        this.nombreApellidos = nombreApellidos;
        this.numeroEmpleado = numeroEmpleado;
        this.password = password;
    }
    public String getNombreApellidos() {
        return nombreApellidos;
    }
    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }
    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }
    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numeroEmpleado == null) ? 0 : numeroEmpleado.hashCode());
        return result;
    }

    // compara por número de empleado
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (numeroEmpleado == null) {
            if (other.numeroEmpleado != null)
                return false;
        } else if (!numeroEmpleado.equals(other.numeroEmpleado))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Persona [nombreApellidos=" + nombreApellidos + ", numeroEmpleado=" + numeroEmpleado + ", password="
                + password + "]";
    } 

    // TODO - MÉTODOS PARA ORDENACIÓN 
    


}
