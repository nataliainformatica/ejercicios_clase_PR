/**
 * Ejercicio 3: Escribe un programa que solicite la edad del comprador de un billete
 * de autobús y le muestre el precio del billete. Si es menor de 7 años 
 * el precio será gratuito, menor de 26 será un euro, hasta 65 años 2 euros 
 * y mayor de 65 gratuito.
 */


import java.util.Scanner;

public class UT3E01ifEjercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario que introduzca su edad.
        System.out.print("Introzca su edad: ");
        int edad = sc.nextInt();

        if (edad < 7 || edad > 64) {
            System.out.println("Precio del billete: GRATIS.");

        } else if (edad > 6 && edad < 26) {

            System.out.println("Precio del billete: 1€.");

        } else if (edad > 25 && edad < 65) {

            System.out.println("Precio del billete: 2€.");

        }

        sc.close();
    }
}