/*
 * https://github.com/profeMelola/Programacion-03-2023-24/tree/main/billetesTren#escribir-el-programa-que-tenga-en-cuenta-las-siguientes-especificaciones
 */
package es.daw.billetestren;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class App {

    // ÁMBITO GLOBAL A LA CLASE
    static final int PRECIO_BILLETE = 3;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declarando variables
        // VARIABLES DE ÁMBITO AL MÉTODO MAIN
        int edad = 0;
        //int precioFinalBillete = 0;
        double precioFinalBillete = 0;
        

        Scanner sc = new Scanner(System.in);

        //Pedir la edad al usuario
        System.out.print("Introduce tu edad: ");
        edad = sc.nextInt();

        //Comprobando condiciones para aplicar precio final al billete
        /*
        // OPCIÓN QUE FUNCIONA PERO NO TIENE UNA LÓGICA CORRECTA
        if (edad < 8) {
            System.out.println("Menor de 8");
            precioFinalBillete = 0;
            
            // KK
            //System.out.println("El precio final de tu billete es: " + precioFinalBillete);        
        }
        if (edad >= 8 && edad <= 17) {
            System.out.println("Entre 8 y 17");
            precioFinalBillete = PRECIO_BILLETE / 2;
            
            // KK
            //System.out.println("El precio final de tu billete es: " + precioFinalBillete);        
        }
        if (edad >= 18 && edad <= 64) {
            System.out.println("Entre 18 y 64");
            precioFinalBillete = PRECIO_BILLETE;
            
            // KK
            //System.out.println("El precio final de tu billete es: " + precioFinalBillete);        
        }
        if (edad > 64) {
            System.out.println("Mayor de 64");
            precioFinalBillete = 0;
            
            // KK
            //System.out.println("El precio final de tu billete es: " + precioFinalBillete);        
        }*/
        
        /*
        // VERSIÓN OPTIMIZADA CON IF ELSE IF
        if (edad < 8 || edad > 64) {
            precioFinalBillete = 0;
        } else if (edad >= 8 && edad <= 17) {
            precioFinalBillete = precioBillete / 2;
        } else if (edad >= 18 && edad <= 64) {
            precioFinalBillete = precioBillete;
        } */       
        
        
        //Comprobando condiciones para aplicar precio final al billete
        // VERSIÓN SUPER REDUCIDA
        if (edad >= 8 && edad <= 17) {
            // mitad del billete
            //precioFinalBillete = PRECIO_BILLETE / 2;
            //precioFinalBillete = (int)(PRECIO_BILLETE * 0.5);
            precioFinalBillete = PRECIO_BILLETE * 0.5;
        } else if (edad >= 18 && edad <= 64) {
            precioFinalBillete = PRECIO_BILLETE;
        }
        
        System.out.println("El precio final de tu billete es: " + precioFinalBillete);        
    }
    
}
