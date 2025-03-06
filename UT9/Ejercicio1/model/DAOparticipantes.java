package ut9.Ejercicio1.model;

import java.util.ArrayList;

public class DAOparticipantes {

    private static ArrayList<Participante> participantes;
    
    public static ArrayList<Participante>  getParticipantes(){

        if(participantes == null){
            participantes = new ArrayList<>(); 
//Participante(String nombreApellidos, String dNI, String telefono)
            participantes.add(new Participante("UNO","DNI1","TELEFONO1")); 
            participantes.add(new Participante("DO2","DNI2","TELEFONO2")); 
            participantes.add(new Participante("TRES","DNI3","TELEFONO3")); 
            participantes.add(new Participante("CUATRO","DNI4","TELEFONO4")); 
        return participantes; 

    }

}
