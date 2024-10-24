import java.util.Scanner;

public class OrdenarNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir nombres al usuario
        System.out.print("Ingresa el primer nombre: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Ingresa el segundo nombre: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Ingresa el tercer nombre: ");
        String nombre3 = scanner.nextLine();

        // Comparar y ordenar los nombres
        String primero, segundo, tercero;

        if (nombre1.compareTo(nombre2) <= 0 && nombre1.compareTo(nombre3) <= 0) {
            primero = nombre1;
            if (nombre2.compareTo(nombre3) <= 0) {
                segundo = nombre2;
                tercero = nombre3;
            } else {
                segundo = nombre3;
                tercero = nombre2;
            }
        } else if (nombre2.compareTo(nombre1) <= 0 && nombre2.compareTo(nombre3) <= 0) {
            primero = nombre2;
            if (nombre1.compareTo(nombre3) <= 0) {
                segundo = nombre1;
                tercero = nombre3;
            } else {
                segundo = nombre3;
                tercero = nombre1;
            }
        } else {
            primero = nombre3;
            if (nombre1.compareTo(nombre2) <= 0) {
                segundo = nombre1;
                tercero = nombre2;
            } else {
                segundo = nombre2;
                tercero = nombre1;
            }
        }

        // Imprimir los nombres en mayúsculas
        System.out.println(primero.toUpperCase());
        System.out.println(segundo.toUpperCase());
        System.out.println(tercero.toUpperCase());

        scanner.close();
    }
}

