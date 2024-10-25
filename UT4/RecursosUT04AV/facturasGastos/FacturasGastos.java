
package es.avellaneda;

import java.util.Scanner;

public class FacturasGastos {

    /**
     * REQUISITOS:
     * 
     * Debe pedir el número de facturas del cliente.
     * Por cada factura debe pedir el número de gastos que tiene la factura.
     * Por cada gasto debe pedir el importe del mismo.
     * Debe mostrar el importe total de gastos de cada factura.
     * Finalmente debe mostrar el importe total de todas las facturas del usuario
     * 
     * @param args
     */
    public static void main(String[] args) {
        // número de facturas y gastos debe ser entero
        int numeroFacturas, numGastos;
        double gasto; 
        double totalFacturas=0, totalGastosFactura=0; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el número de faturas que vas introducir:");
        numeroFacturas = sc.nextInt();
        for (int i = 0; i < numeroFacturas; i++) {

            System.out.println("Indica el número de gastos de la factura "+ (i+1));
            numGastos = sc.nextInt();
            for(int j=0; j<numGastos; j++){
                System.out.println("     Indica el importe del gasto " +  (j+1));
                gasto = sc.nextDouble();
                totalGastosFactura += gasto; 

            }
            System.out.println("Factura ( " + (i+1) + ")" +  "total importe: "+ totalGastosFactura);
            totalFacturas += totalGastosFactura; 
            totalGastosFactura =0; 
          

            }
            System.out.println("***************************************************");
            System.out.println("Importe total de todas las facturas: "+ totalFacturas);
            System.out.println("***************************************************");


        }
      

    }
