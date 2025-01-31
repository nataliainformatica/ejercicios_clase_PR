package es.avellaneda;

public class App2 {

    public static void main(String[] args) {
        String[] equipos = {"mesas","sillas", "equipo multimedia"};
        SalaConEquipamiento sala = 
        new SalaConEquipamiento(1,
         "sala2",     10);

         System.out.println(sala.mostrarInformacion());
         sala.reservarSala("123", equipos );
         System.out.println(sala.mostrarInformacion());
        
    }
}
