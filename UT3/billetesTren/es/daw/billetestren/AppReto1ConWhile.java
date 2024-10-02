/*
 * https://github.com/profeMelola/Programacion-03-2023-24/tree/main/billetesTren#escribir-el-programa-que-tenga-en-cuenta-las-siguientes-especificaciones
 */
package es.daw.billetestren;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class AppReto1ConWhile {

    // ÁMBITO GLOBAL A LA CLASE
    static final int PRECIO_BILLETE = 3;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declarando variables
        // VARIABLES DE ÁMBITO AL MÉTODO MAIN
        int edad = 0;
        double precioFinalBillete = 0;
        
        // La profe me ha obligado a hacer un while
        // aunque con un for estaría mejor :-)
        int contador = 1;
        int limite = 5;

        // El scanner lo declaro fuera del bucle
        Scanner sc = new Scanner(System.in);

        
        while (contador <= limite){
            System.out.println("*************************");
            System.out.println("* Billete número <"+contador+">");
            
            if (contador != limite){
                //Pedir la edad al usuario
                System.out.print("Introduce tu edad: ");
                edad = sc.nextInt();

                if (edad >= 8 && edad <= 17) {
                    // mitad del billete
                    precioFinalBillete = PRECIO_BILLETE * 0.5;
                } else if (edad >= 18 && edad <= 64) {
                    precioFinalBillete = PRECIO_BILLETE;
                } else{
                    precioFinalBillete = 0;
                }
            }
            else{
                System.out.println("Qué suerte, promoción especial!!!!");
                precioFinalBillete = 0;
            }
            
            System.out.println("El precio final de tu billete es: " + precioFinalBillete);        
            
            // No podemos olvidar incrementar el contador para que no se produzca un bucle infinito
            contador++;
        }
        
    }
    
}
