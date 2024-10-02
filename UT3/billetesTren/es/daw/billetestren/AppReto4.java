package es.daw.billetestren;

import java.util.Scanner;

/**
 *
 * @author melol
 */
public class AppReto4 {

    static final int PRECIO_BILLETE = 2; //constante con el precio del billete sin descuento
    static final int LIMITE_OPERACIONES = 10;

    static Scanner sc = new Scanner(System.in);

    /**
     * MAIN
     *
     * @param args
     */
    public static void main(String[] args) {

        // VARIABLES
        int contador = 1;
        int numOperaciones = 0; //numero de veces que se ejecuta la maq expendedoraa
        float precioTotalBilletes = 0.0f; //precio total de todos los billetes comprados por operacion
        float dineroRecaudado = 0.0f; // precio total recaudado

        System.out.println("* ************************ *");
        System.out.println("* BILLETES TREN RETO 4!!!! *");

        // Pidiendo el número de operaciones que va a realizar la máquina expendedora de billetes
        numOperaciones = obtenerNumOperaciones(sc);

        // Buble de la máquina expendora
        while (contador <= numOperaciones) {
            precioTotalBilletes = gestionarBilletesPorOperacion(contador);
            System.out.println("El precio total de los billetes: " + precioTotalBilletes);
            dineroRecaudado += precioTotalBilletes;

            contador++;
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("[FIN] EL PRECIO TOTAL RECAUDADO: " + dineroRecaudado);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        
    }

    /**
     * obtenerNumOperaciones
     *
     * @param sc Lector
     * @return
     */
    public static int obtenerNumOperaciones(Scanner sc) {
        int numOperaciones = 0;
        do {
            System.out.println("[INIT] \nIntroduce cuantas veces se va a ejecutar la máquina expendedora:");
            //if (sc.hasNextInt()){
            numOperaciones = sc.nextInt();

            if (numOperaciones < 0 || numOperaciones > LIMITE_OPERACIONES) {
                System.out.println("El número de operaciones tiene que ser mayor qwue cero y menor que " + LIMITE_OPERACIONES);
            }
            //}
        } while (numOperaciones <= 0);

        return numOperaciones;
    }

    /**
     * Método que por cada operación gestiona el número de billetes comprados
     * @param numOperacion número de la operación
     * @return precio total de los billetes comprados en la operación
     */
    public static float gestionarBilletesPorOperacion(int numOperacion) {
        // Variables
        int edad = 0;
        float precioFinalBillete = 0.0f;
        float precioTotalBilletes = 0.0f; //precio de los billetes de un usuario
        int numBilletes = 0;

        System.out.println("*Operación número <" + numOperacion + ">");

        //Pedir el número de billetes
        System.out.print("\tIntroduce el número de billetes que quieres comprar: ");
        numBilletes = sc.nextInt();

        //bucle para recorrer el número de billetes
        for (int i = 1; i <= numBilletes; i++) {
            //Pedir la edad al usuario
            System.out.print("\tBillete número (" + i + ")");
            System.out.print("\tIntroduce tu edad: ");
            edad = sc.nextInt();
            precioFinalBillete = obtenerPrecioConDescuento(edad);
            System.out.println("\tEl precio del billete es: " + precioFinalBillete);
            //precioTotalBilletes = precioTotalBilletes + precioFinalBillete;
            precioTotalBilletes += precioFinalBillete;

        }//end for

        
        return precioTotalBilletes;

    }

    /**
     * Devuelve el precio final del billete gestionando si tiene descuento o es gratis
     *
     * @param edad
     * @return precio final billete
     */
    public static float obtenerPrecioConDescuento(int edad) {
        float precioFinalBillete = 0;

        //Comprobando condiciones para aplicar precio final al billete
        if (edad < 8) {
            precioFinalBillete = 0;
        } else if (edad >= 8 && edad <= 17) {
            precioFinalBillete = PRECIO_BILLETE / 2;
        } else if (edad >= 18 && edad <= 64) {
            precioFinalBillete = PRECIO_BILLETE;
        } else if (edad > 64) {
            precioFinalBillete = 0;
        }

        return precioFinalBillete;
    }
}
