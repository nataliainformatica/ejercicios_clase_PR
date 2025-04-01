package ejercicio6_base.principal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import ejercicio6_base.model.DAOpersonas;
import ejercicio6_base.model.Persona;


public class Principal {
    public static void main(String[] args) {

        File fichero = new File("personas.dat");
        ArrayList<Persona> personas;
        if (!fichero.exists()) {
            personas = DAOpersonas.getPersonas();
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
                oos.writeObject(personas);
                System.out.println("Lista de personas guardada correctamente.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("personas.dat"))) {

                personas = (ArrayList<Persona>) ois.readObject();

                System.out.println("Lista de personas leída:");
                for (Persona p : personas) {
                    System.out.println(p);
                }

            } catch (ClassCastException ex) {

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

    }
}
