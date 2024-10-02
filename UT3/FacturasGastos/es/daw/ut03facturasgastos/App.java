/*
 * https://github.com/profeMelola/Programacion-03-2023-24/tree/main/EJERCICIOS/FacturasGastos
 */
package es.daw.ut03facturasgastos;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class App {

    static Scanner sc = new Scanner(System.in);
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declaración de variables
        int numFacturas = 0, numGastos = 0; 
        float importeTotalFacturas = 0.0f, importeTotalGastos = 0.0f;
        
        System.out.println("** Indica el número de facturas que vas a introducir:");
        numFacturas = sc.nextInt();
        
        // Primer bucle. Se ejecutará tantas veces como facturas introduzca el usuario
        for (int i = 0; i < numFacturas; i++) {
            
            System.out.println("\t* Indica el número de gastos de la factura ["+(i+1)+"]:");
            numGastos = sc.nextInt();
            
            // Segundo bucle. Se ejeuctará tantas veces como gastos tenga la factura
            for (int j = 1; j <= numGastos; j++) {
                System.out.println("\t* Indica el importe del gasto ["+j+"]:");
                // sumatorio de los gastos de una factura en concreto
                importeTotalGastos += sc.nextFloat();
            }
            
            System.out.println("** El importe total de gastos de la factura ["+(i+1)+"] es:");
            System.out.println(importeTotalGastos);
            
            importeTotalFacturas += importeTotalGastos;
            
            importeTotalGastos = 0.0f; //inicializao de nuevo el sumatorio de gastos de una factura 
            
        }
        
        System.out.println("**********************************************************************");
        System.out.println("** Importe total de gastos de todas las facturas: "+importeTotalFacturas);
        System.out.println("**********************************************************************");
        
        
    }
    
}
