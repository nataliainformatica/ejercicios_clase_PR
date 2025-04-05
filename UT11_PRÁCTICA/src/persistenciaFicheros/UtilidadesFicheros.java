package persistenciaFicheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import model.Entrada;
import model.Persona;
import model.Salida;

public class UtilidadesFicheros {
    private static final File ficheroRegistro = new File("ficheroRegistro.dat");
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
    public static void escribirRegistro(HashMap<Entrada,Salida> registro) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ficheroRegistro))) {
            oos.writeObject(registro);
            System.out.println("Se ha guardado el registro correctamente");
        } catch (IOException e) {
            e.printStackTrace();
        }
       

    }
    public static HashMap<Entrada,Salida> leerRegistro() throws Exception{
        HashMap<Entrada,Salida> registro = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ficheroRegistro))) {
            registro = (HashMap<Entrada,Salida>) ois.readObject();

        } catch (Exception ex ) {
            throw  ex; 
        } 
      
        return registro;
    }
    public static ArrayList<Persona> leer() throws Exception{
        ArrayList<Persona> personas = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("personasRegistradas.dat"))) {
            personas = (ArrayList<Persona>) ois.readObject();

        } catch (Exception ex ) {
            throw  ex; 
        } 
      
        return personas;
    }

}
