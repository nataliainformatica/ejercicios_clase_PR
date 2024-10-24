package ejercicios_clase_PR.CLASE;

import java.util.Scanner;

public class TablaMultiplicar {

    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);

  

        // voy a ahacer un bucle que recorra los números del 1 al 10


 

        int valorInferior=0;
        int valorSuperior=0;
        boolean continua = true;

        while (continua) {
            System.out.println(" Dime el valor inferior");
            valorInferior = lectorTeclado.nextInt();
            

            System.out.println(" Dime el valor superior");
            valorSuperior = lectorTeclado.nextInt();

         
            // SUPERIOR > INFERIOR
            // superior <= 20
            // inferior >=1
            // si no se cumplen, volvemos a empezar

            if (valorSuperior > valorInferior) {
                if (valorSuperior <= 20) {
                    if (valorInferior >= 1) {
                        continua = false;
                    }
                }
            }

        } // salgo de la petición de datos

        // preguntamos al usuario
        // qué tablas quiere que le mostremos

        // solamente son válidos números en orden
        //
        // es decir el segundo mayor que el primero

        // solo números entre el rango del 1 al 20
        int numero;
        System.out.println("TABLA DE MULTIPLICAR DEL " + valorInferior 
        + " AL "+   valorSuperior);
        System.out.println("RESUTADO ");

        // para hacer la tabla, es necesario repetir
        // multiplicando número por 1,2,3,4,5....10

        for (numero = valorInferior; numero <= valorSuperior; numero++) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + numero * i);

            }
        }

    }

}
