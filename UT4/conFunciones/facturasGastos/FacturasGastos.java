
package ejercicios_clase_PR.UT4.conFunciones.facturasGastos;

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
        double[] totalFactura;
        double totalFacturas = 0, totalGastosFactura = 0;
        Scanner sc = new Scanner(System.in);
        boolean continua = true;
        String opcion;
        System.out.println("Indica el número de faturas que vas introducir:");
        numeroFacturas = sc.nextInt();

        // creamos el array estático, una vez que conocemos el tamaño
        totalFactura = new double[numeroFacturas];

        for (int i = 0; i < numeroFacturas; i++) {

            System.out.println("Indica el número de gastos de la factura " + (i + 1));
            numGastos = sc.nextInt();
            for (int j = 0; j < numGastos; j++) {
                System.out.println("     Indica el importe del gasto " + (j + 1));
                gasto = sc.nextDouble();
                totalGastosFactura += gasto;

            }
            System.out.println("Factura ( " + (i + 1) + ")" + "total importe: " + totalGastosFactura);
            totalFactura[i] = totalGastosFactura;

            // totalFacturas += totalGastosFactura;
            // no lo necesito
            totalGastosFactura = 0;

        }
        System.out.println("***************************************************");
        System.out.println("Importe total de todas las facturas: " + totalFacturas);
        System.out.println("***************************************************");

        // aquí ya tenemos los datos de las facturas

        while (continua) {
            System.out.println("1. Mostrar todos los importes totales de las facturas");
            System.out.println("2. Mostrar el total de todas las facturas");
            System.out.println("3. Muestra el importe más alta.");
            System.out.println("4. Muestra el importe más bajo");
            System.out.println("5. Salir");

            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    mostrarTotales(totalFactura);
                    break;
                case "2":
                    mostrarTotal(totalFactura);
                    break;
                case "3":
                    devolverAlto(totalFactura);
                    break;
                    // TODO  - FINALIZAR LAS OPCIONES DEL SWITCH
                    
                default:
                    System.out.println("Opción no válida");
                    continua = false;
                    break;
            }

        }
    }

    // función que muestra todos los importes totales de las facturas
    public static void mostrarTotales(double[] valores) {

        // aquí en "valores" ya tengo el array con los totales de las facturas
        System.out.println("MUESTRA TODOS LOS IMPORTES DE LAS FACTURAS GUARDADAS");
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Factura num " + (i + 1) + valores[i]);
        }
    }

    public static void mostrarTotal(double[] totalFactura) {

        System.out.println("MUESTRA EL TOTAL DE TODAS LAS FACTURAS");
        double total = 0;
        for (int i = 0; i < totalFactura.length; i++) {
            total += totalFactura[i];

        }
        System.out.println("El total de " + totalFactura.length + "es: " + total);
    }
/**
 * Muestra el importe más alto.
 *  Es requisito que este cálculo se efectúe como función que devolverá  el valor del importe. 
 * @param totalFactura
 * @return
 */
    public static double devolverAlto(double[] totalFactura){

        // 5, 2,10,2, 50
        double alto=0; 
        for(int i=0; i<totalFactura.length;i++){
            if(totalFactura[i]> alto){
                alto = totalFactura[i];
            }        
        }
        return alto; 

    }

    public static double devolverBajo(double[] totalFactura){

        double bajo=Double.MAX_VALUE; 
        for(int i=0; i<totalFactura.length;i++){
            if(totalFactura[i]< bajo){
                bajo = totalFactura[i];
            }        
        }
        return bajo; 

    }


    // TODO FUNCIONES PARA LAS OPCIONES 5 
}

