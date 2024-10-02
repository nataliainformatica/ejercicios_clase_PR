/*
 * https://github.com/profeMelola/Programacion-03-2023-24/tree/main/EJERCICIOS/calculadora
 */
package es.daw.ut03calculadora;

import es.daw.ut03calculadora.util.Operaciones;
import java.util.Scanner;

/**
 *
 * @author melola
 */
public class App {

    // DE ÁMBITO GLOBAL A LA CLASE
    // de ámbito global para poder utilizarlo en cualquier parte del program
    static Scanner scNum = new Scanner(System.in);
    static Scanner scTexto = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Variables 
        int opcion;
        float operando1, operando2, resultado = 0.0f;
        
        // Llamo a la función una única vez para que me pinte el título
        pintaTitulo();
        
        do{
            opcion = gestionarMenu();

            if (opcion == 0 ){
                System.out.println("Vas a salir de la calculadora");
            }else if (opcion < 0 || opcion > 5){
                System.out.println("Elige una opción correcta");
            }
            else{

                System.out.println("Escribe el valor del operando 1:");
                operando1 = scNum.nextFloat();

                System.out.println("Escribe el valor del operando 2:");
                operando2 = scNum.nextFloat();


                // Depediendo de la opción se ejecutará una función u otra
                switch (opcion) {
                    case 1:
                        resultado = Operaciones.sumar(operando1,operando2);
                        break;
                    case 2:
                        resultado = Operaciones.restar(operando1,operando2);
                        break;
                    case 3:
                        resultado = Operaciones.multiplicar(operando1,operando2);
                        break;
                    case 4:
                        resultado = Operaciones.dividir(operando1,operando2);
                        break;
                    case 5:
                        resultado = Operaciones.modulo(operando1,operando2);
                        break;
                    default:
                        System.out.println("Has elegido una opción incorrecta!!!");
                }

                System.out.println("El resultado es :"+resultado);
            }
        }while(opcion != 0);
        
        //Indicamos que no vamos a leer ningún valor más por teclado.
        scNum.close();
        scTexto.close();

        Operaciones.prueba();
        System.out.println("Finalizando la ejecución de la calculadora");
        
    }

    /**
     * Método que pinta por consola el título del programa
     */
    public static void pintaTitulo() {
        System.out.println("    __   ____  _        __  __ __  _       ____  ___     ___   ____    ____ \n"
                + "   /  ] /    || |      /  ]|  |  || |     /    ||   \\   /   \\ |    \\  /    |\n"
                + "  /  / |  o  || |     /  / |  |  || |    |  o  ||    \\ |     ||  D  )|  o  |\n"
                + " /  /  |     || |___ /  /  |  |  || |___ |     ||  D  ||  O  ||    / |     |\n"
                + "/   \\_ |  _  ||     /   \\_ |  :  ||     ||  _  ||     ||     ||    \\ |  _  |\n"
                + "\\     ||  |  ||     \\     ||     ||     ||  |  ||     ||     ||  .  \\|  |  |\n"
                + " \\____||__|__||_____|\\____| \\__,_||_____||__|__||_____| \\___/ |__|\\_||__|__|\n"
                + "                                                                            \n"
                + "");
    }

    /**
     * Método que muestra el menú de la calculadora y devuelve la opción elegida por el usuario
     * @return opción elegida por el usuario
     */
    public static int gestionarMenu() {
        System.out.println("\033[35m ***** MENÚ ******");
        System.out.println("\033[34m 1. Sumar");
        System.out.println("\033[34m 2. Restar");
        System.out.println("\033[34m 3. Multiplicar");
        System.out.println("\033[34m 4. Dividir");
        System.out.println("\033[34m 5. Resto");
        System.out.println("\033[34m 0. Salir del programa");
        System.out.println("******************************");
        System.out.println("Introduce una opción:");
        
        /*
        // Forma 1
        int opcion = sc.nextInt();
        return opcion;
        */
        
        // Forma 2
        //return sc.nextInt();
        
        // Forma 3
        // Leer del teclado transformar el valor leído de String a int
        // 1) Recoger el valor escrito en el teclado
        // 2) Transformar esa cadena de caracteres en un valor entero
        int opcion = 0;
        opcion = Integer.parseInt(scTexto.nextLine());
        return opcion;
        
        //return Integer.parseInt(scTexto.nextLine());

    }
    
    
//    /**
//     * Método que realiza la suma de dos operandos
//     * @param op1
//     * @param op2
//     * @return 
//     */
//    public static float sumar(float op1, float op2){
//        return op1+op2;        
//    }
//
//    public static float restar(float op1, float op2){
//        return op1-op2;        
//    }
//
//    public static float multiplicar(float op1, float op2){
//        return op1*op2;        
//    }
//
//    public static float dividir(float op1, float op2){
//        return op1/op2;        
//    }
//    
//    public static float modulo(float op1, float op2){
//        return op1 % op2;
//    }

}
