package facturasyGastos;

import java.util.Scanner;

public class TestMain {
    /**
     * Desde la clase TestMain, realizaremos las siguientes pruebas:
     * 
     * Pedir el número de gastos y crear la instancia de Factura. Pedir los gastos
     * de la factura y almacenarlos en el objeto.
     * 
     * Mostrar el total de la factura. Mostrar el gasto 2, Mostrar un número de
     * gasto que no exista.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numGastos; 
        double gasto; 
        Factura factura ; 
        System.out.println("¿Cuántos gastos tiene la factura?");
        numGastos = sc.nextInt();                  
        factura= new Factura(numGastos);
        for(int i =0; i<numGastos; i++){
            System.out.println("DIME EL GASTO " + i  );
            gasto = sc.nextDouble();
            factura.aniadirGasto(gasto, i);

        }
        // Mostrar el total de la factura. 
        System.out.println("El total de la factura es "+ 
        factura.devolverTotal());

        //Mostrar el gasto 2, 
        System.out.println("El gasto 2 es: " + factura.devolverGasto(2)); 


        //Mostrar un número de gasto que no exista.

        System.out.println("El gasto 10 es "+ factura.devolverGasto(10) );
        

    }
}
