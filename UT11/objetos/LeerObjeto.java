package objetos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeerObjeto {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.dat"))) {
            Persona p = (Persona) ois.readObject();
            System.out.println("Objeto leído: " + p);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
