package ejercicioa2;

import java.util.Scanner;

/**
 *
 * @author natali
 */
public class TestMain2 {

    public static void main(String[] args) {

        Persona persona1 = null;
        Persona persona2;
        crearObjetoPersona(persona1);
        persona2 = crearObjetoPersona();
        System.out.println(persona1);
        System.out.println(persona2);

    }

    public static void crearObjetoPersona(Persona persona) {
        persona = new Persona();

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el dni ");
        persona.setDni(sc.nextLine());

        System.out.println("Introduce el nombre ");
        persona.setNombre(sc.nextLine());

        System.out.println("Introduce el apellido ");
        persona.setApellidos(sc.nextLine());

        System.out.println("Introduce la edad");
        persona.setEdad(sc.nextInt());
        sc.nextLine();
    }

    public static Persona crearObjetoPersona() {
        Persona persona = new Persona();

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el dni ");
        persona.setDni(sc.nextLine());

        System.out.println("Introduce el nombre ");
        persona.setNombre(sc.nextLine());

        System.out.println("Introduce el apellido ");
        persona.setApellidos(sc.nextLine());

        System.out.println("Introduce la edad");
        persona.setEdad(sc.nextInt());
        sc.nextLine();
        return persona;

    }

}
