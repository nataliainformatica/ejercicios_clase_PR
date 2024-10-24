/**
 * Ejercicio 4: Escribe un programa que calcule el coste de un parking. El programa
 * pedirá las horas y minutos que ha estado estacionado el vehículo.
 * El precio es: 
 * - 10 céntimos el minuto los primeros 60 minutos
 * - 7 céntimos el minuto los siguientes 120 minutos
 * - 5 céntimos los minutos restantes.
 * Si el tiempo total es mayor a 3000 minutos, en lugar de sacar el
 * précio sacará un mensaje diciendo "El coche se encuentra en el
 * depósito. Recibirá una multa en su domicilio.".
 */

package estructurasDeControl;

import java.util.Scanner;

public class UT3E01ifEjercicio04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int HORA_MINUTOS = 60;
        final int PRECIO_1 = 10;
        final int PRECIO_2 = 7;
        final int PRECIO_3 = 5;
        final int PRIMER_TRAMO = 60;
        final int SEGUNDO_TRAMO = 120;
        final int MULTA = 3000;

  

        // Pedimos al usuario que introduzca las horas y los minutos que ha estado
        // estacionado su vehículo.

        System.out.print("¿Cuántas horas ha estado estacionado su vehículo?: ");
        int horas = sc.nextInt();

        // Pedimos al usuario que introduzca las horas y los minutos que ha estado
        // estacionado su vehículo.

        System.out.print("¿Cuántos minutos ha estado estacionado su vehículo?: ");
        int minutos = sc.nextInt();

        // Creamos una variable auxiliar que calcule el tiempo total que ha estado el
        // vehículo estacionado en minutos.

        double totalMinutos = horas * HORA_MINUTOS + minutos;

        double precio = 0;

        if (totalMinutos <= PRIMER_TRAMO) { // Si el vehículo ha estado estacionado 1h o menos
            precio = (totalMinutos * PRECIO_1);
            System.out.println("El precio final por estacionar su vehículo " + horas + "h y " + minutos + "min es: "
                    + precio/100 + "€");
        } else if (totalMinutos > PRIMER_TRAMO && totalMinutos <= (PRIMER_TRAMO+SEGUNDO_TRAMO)) { 
            
            // Si el vehículo ha estado estacionado de 1h a 2h.

            precio = (HORA_MINUTOS*PRECIO_1) + ((totalMinutos - HORA_MINUTOS) * PRECIO_2);
            System.out.println("El precio final por estacionar su vehículo " + horas + "h y " + minutos + "min es: "
                    + precio/100 + "€");
        } else if (totalMinutos > (PRIMER_TRAMO+SEGUNDO_TRAMO) && totalMinutos < MULTA) { 
            // Si el vehículo ha estado estacionado 3h a 50h.
            // Debemos calcular los precios del primer tramo, del segundo y del tercero

            precio = (PRIMER_TRAMO*PRECIO_1+SEGUNDO_TRAMO*PRECIO_2) + ((totalMinutos - (PRIMER_TRAMO+SEGUNDO_TRAMO)) * PRECIO_3);
            System.out.println("El precio final por estacionar su vehículo " 
            + horas + "h y " + minutos + "min es: "
                    + precio/100 + "€");
        } else { // Si el vehículo ha estado estacionado más de 50h.
            System.out.println("Su coche se encuentra en el depósito. Recibirá una multa en su domicilio.");
        }

        sc.close();

    }

}
