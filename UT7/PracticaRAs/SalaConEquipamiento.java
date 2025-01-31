package es.avellaneda;

public class SalaConEquipamiento extends Sala {

    private String[] equiposExtra;

    public SalaConEquipamiento(int id, String nombre, int capacidad) {
        super(id, nombre, capacidad);
        // si habéis inicializado la instancia lo acepto

    }

    public String mostrarEquipos() {
        // asegurar que equiposExtra no es null
        // si una posición del array fuese null
        StringBuilder sb = new StringBuilder(); 

        if (equiposExtra != null) {

            for (String s : equiposExtra) {
                if (s != null) {
                    sb.append(s); 
                    sb.append("-"); 
                }

            }
        }

        return sb.toString();

    }
   
    public String mostrarInformacion(){     
        return super.mostrarInformacion() +  " Equipos: " + mostrarEquipos(); 
    }
    public boolean reservarSala(String propietario , 
                            String[]equipos){
        if(super.reservarSala(propietario)){
            this.equiposExtra = equipos; 
            return true; 
        }
       return false; 
    }

}
