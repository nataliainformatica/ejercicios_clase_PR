/**
 * Ejercicio 2: Escribe un programa que solicite una contraseña (con mayusculas, minúsculas,
 * signos de puntuación y números), si la contraseña es correcta tendrá 
 * acceso al sistema, si es incorrecta no.
 */

package estructurasDeControl;

import java.util.Scanner;

public class UT3E01ifEjercicio02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Creamos una variable que almacene la contraseña que acceda al sistema.
        final String  PW = "#Zub4t_M0l4";

        // Pedimos al usuario que introduzca la contraseña.
        System.out.print("Contraseña: ");
        String pwUsuario = sc.nextLine();

        // Si la contraseña introducida por el usuario coincide con la contraseña
        // establecida, permitiremos el acceso al sistema.
        if (PW.equals(pwUsuario)) {
            System.out.println("ACCESO CONCEDIDO.");
        } else {
            System.out.println("ACCESO DENEGADO.");
        }

        sc.close();
    }

}
