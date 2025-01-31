package es.avellaneda;

public class Sala {


    private int id; 
    private String nombre; 
    private int capacidad; 
    private boolean disponible; 
    private String propietario;
    public Sala(int id, String nombre, int capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.disponible = true; 
        this.propietario = "";
    } 

      public boolean reservarSala(String propietario){
        boolean success = false; 
         if(disponible){
            this.propietario = propietario; 
            disponible = false; 
            success=  true; 
         }

        return success;
      }

      public boolean liberarSala(String propietario){
        if(!disponible && this.propietario.equals(propietario)){
            propietario="";
            disponible = true; 
            // he podido liberar la sala 
            return true; 
        }
    
        return false;
      }

      
      @Override
    public String toString() {
        return "Sala id=" + id + 
        ", nombre=" + nombre + 
        ", capacidad=" + capacidad + ", disponible=" 
        + disponible
                + ", propietario=" + propietario ;
    }

    public String mostrarInformacion(){

        // esta es una posiblidad
        String resultado = "Sala id=" + id + 
        ", nombre=" + nombre + 
        ", capacidad=" + capacidad + ", disponible=" 
        + disponible
                + ", propietario=" + propietario; 

        return  this.toString() ; 
      }

    public boolean isDisponible() {
        return disponible;
    }

   






      






    // no tengo que recibir los valors de propietario
    // o de disponbile, porque tienen un valor por 
    // defecto


    


    

}
