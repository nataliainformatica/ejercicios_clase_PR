package ejercicio5.principal;

import java.time.LocalDate;


public class Usuario implements Comparable<Usuario>{
    private String alias; 
    private LocalDate fecha; 
    private int totalPuntuacion; 


    public Usuario(String alias){
        this.alias = alias; 
        this.fecha = LocalDate.now(); 

    }
    public Usuario(String alias, LocalDate fecha, int totalPuntuacion){
        this.alias = alias; 
        this.fecha = fecha; 
        this.totalPuntuacion = totalPuntuacion; 

    }
    public void setPuntuacion(int puntos){
        totalPuntuacion += puntos; 
    }


    public String getAlias() {
        return alias;
    }


    public void setAlias(String alias) {
        this.alias = alias;
    }
   
    public int getTotalPuntuacion() {
        return totalPuntuacion;
    }
    public LocalDate getFecha() {
        return fecha;
    }


    @Override
    public int compareTo(Usuario otroUsuario) {
        //se mostrarán los usuarios ordenados por puntuación
        
        return Integer.compare(otroUsuario.getTotalPuntuacion(),totalPuntuacion );
    }
  
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((alias == null) ? 0 : alias.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (alias == null) {
            if (other.alias != null)
                return false;
        } else if (!alias.equals(other.alias))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Alias=" + alias + ", fecha=" + fecha + ", totalPuntuacion=" + totalPuntuacion + "-";
    }
  
  

    

}
