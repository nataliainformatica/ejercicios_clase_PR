package ejercicio6.principal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import ejercicio6.model.DAOpersonas;
import ejercicio6.model.Persona;

/**
 * Completa el código de la carpeta ejercicio6_base, modifica el programa para
 * que permita agregar nuevas personas a la lista sin borrar las anteriores.
 * Añade un menú para que permita mostrar las personas de la lista, y una opción
 * para añadir personas. Modifica el código, de forma que la primera vez que se
 * ejecuta la aplicación, muestre un mensaje de que no se pueden mostrar ningún
 * dato (en lugar de guardar los datos del DAO)
 */

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String RUTA = "personas.dat";

        File fichero = new File(RUTA);
        ArrayList<Persona> personas= new ArrayList<>();
        String opcion;

        if (fichero.exists()) {
            personas = leer();
           
        }

        do {
            System.out.println("1.Mostrar las personas");
            System.out.println("2.Agregar Personas");
            opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    if(personas.isEmpty()){
                        System.out.println("No es posible mostrar ningún dato");
                    }else{
                        System.out.println("Lista de personas leída:");
                        for (Persona p : personas) {
                            System.out.println(p);
                        }
                    }

                    break;
                case "2":
                    // AGREGAR
                    // se lee el arraylist para actualizarlo
                    String nombre;
                    int edad;
                    Persona persona;
                    System.out.println("Introduce el nombre");
                    nombre = sc.nextLine();
                    System.out.println("Introduce la edad");
                    // TODO - tratar la posible exepción en el parse
                    edad = Integer.parseInt(sc.nextLine());
                    persona = new Persona(nombre, edad);
                    personas.add(persona);

                    break;
                case "s":
                // guardar los datos 
                    escribir(personas, fichero);
                    System.out.println("SALIR");
                    break;
                default:
                    System.out.println("OPCIÓN NO VÁLIDA");
                    break;
            }

        } while (!opcion.equalsIgnoreCase("S"));

    }

    private static ArrayList<Persona> leer() {
        ArrayList<Persona> personas = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("personas.dat"))) {
            personas = (ArrayList<Persona>) ois.readObject();

        } catch (ClassCastException ex) {

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        // TODO - modificar las excepciones locales y propagarlas
        return personas;
    }

    private static void escribir(ArrayList<Persona> personas, File fichero) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oos.writeObject(personas);
            System.out.println("Lista de personas guardada correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // TODO - modificar las excepciones locales y propagarlas

    }
}