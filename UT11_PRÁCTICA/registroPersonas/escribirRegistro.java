package registroPersonas;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.Persona;

public class escribirRegistro {

    public static void main(String[] args) {
        File fichero =  new File("personasRegistradas.dat");
        escribir(getPersonas(), fichero);
    }


    private static ArrayList<Persona> getPersonas(){

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Uno Uno ", "1","01234"));
        personas.add(new Persona("Dos Dos", "2","01234"));
        personas.add(new Persona("Tres Tres", "3","01234"));
        return personas; 

    }
private static void escribir(ArrayList<Persona> personas, File fichero) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oos.writeObject(personas);
            System.out.println("Lista de personas guardada correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
       

    }


}
