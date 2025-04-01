
package ejercicio6.model;

import java.util.ArrayList;



public class DAOpersonas {

    public static ArrayList<Persona> getPersonas(){

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Ana", 25));
        personas.add(new Persona("Luis", 30));
        personas.add(new Persona("Marta", 22));

        return personas; 

    }



}