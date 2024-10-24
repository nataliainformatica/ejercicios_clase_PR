package ejercicios_clase_PR.UT3.funciones;

import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {

        // Ejercicio .

        /*
         * Vamos a realizar un ejercicio que use varias funciones.
         * La primera será la responsable de mostrar por consola un menú con opciones
         * que el usuario puede elegir. La segunda es la responsable de pedir al usuario
         * la opción
         * que elija y devolver el resultado correspondiente. En esta función haremos el
         * control de errores
         * para evitar que el usuario introduzca valores que no puedan ser procesados.
         */
        // Ejercicio 4
        /*
         * Programa que muestre los números, descendiendo de dos en dos desde un número
         * introducido por teclado mayor al 1
         * hasta el número 1 utilizando la instrucción do-while.
         * 
         * Realizar el ejercicio mostrando los números cada uno en una línea.
         */
        /*
         * Ejercicio 5
         * Programa que muestre los números desde un número mayor introducido por
         * teclado hasta otro número menor introducido por teclado, utilizando la
         * instrucción for.
         * Comprobar que el 1er número es mayor que el 2º.
         * Si no es así, indicarlo mediante un mensaje, y no hacer nada más.
         */

        int opcion;

        menu();
        opcion = pedirOpcion();

        switch (opcion) {
            case 1:
                ejercicio4();
                break;
            case 2:
                ejercicio5();
                break;
            default:
                break;
        }

        System.out.println("FIN DEL PROGRAMA");

    }

    public static void menu() {
        System.out.println("****** MENU ******");
        System.out.println("1. Ejecutar Ejercicio 4");
        System.out.println("2. Ejecutar Ejercicio 5");
        System.out.println("******************");
    }


    public static int pedirOpcion() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Introduce una Opcion entre 1 y 2.");
        opcion = sc.nextInt();
        while (opcion < 1 || opcion > 2) {
            System.out.println("Opción incorrecta. Introduce una Opción entre 1 y 2.");
            System.out.println("Introduce una Opción:");
            opcion = sc.nextInt();
        }

        return opcion;
    }

    public static void ejercicio4() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número mayor que 1.");

        System.out.println("MOSTRAREMOS LOS NÚMEROS QUE HAY ENTRE ESE NUMERO Y EL 1:");
        System.out.println("PERO CONTANDO DE DOS EN DOS");

        int num = sc.nextInt();
        while (num < 1) {
            System.out.println("No has introducido un número mayor que 1.");
            System.out.println("Introduce un número:");
            num = sc.nextInt();
        }

        for (int i = num; i >= 1; i -= 2) {
            System.out.println(i);
        }

    }

    public static void ejercicio5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("VAS A TENER QUE INTRODUCIR DOS NUMEROS");
        System.out.println("Introduce el  número mayor.");
        int num = sc.nextInt();
        System.out.println("Introduce el  número menor.");
        int num2 = sc.nextInt();


        System.out.println("MOSTRAREMOS LOS NÚMEROS QUE HAY ENTRE EL" + num  + " Y EL " + num2);
              System.out.println("DE FORMA DECRECIENTE");

        while (num >= num2) {
            System.out.println(num);
            num--;
        }

    }
}