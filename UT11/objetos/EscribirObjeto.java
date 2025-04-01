package objetos;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscribirObjeto {
    public static void main(String[] args) {
        Persona p = new Persona("Ana", 25);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persona.dat"))) {
            oos.writeObject(p);
            System.out.println("Objeto guardado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
