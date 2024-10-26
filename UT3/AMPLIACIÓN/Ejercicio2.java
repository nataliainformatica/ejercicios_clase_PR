package ejercicios_clase_PR.UT3.AMPLIACIÓN;


import java.util.Scanner;

/**
 * Pediremos por teclado el número del mes en el que estamos
 *
 * Si se introduce un número de mes que no sea válido mostraremos el mensaje
 * "ESE MES NO EXISTE" y después "FIN DE PROGRAMA"
 *
 * Si se introduce un número válido, le mostraremos al usuario los días que
 * tiene ese mes. * Y después "FIN DE PROGRAMA"
 *
 * 
 */
public class Ejercicio2{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mes;
        int dias=0;
        /*

        do {
            System.out.println("Introduce el mes");
            mes = sc.nextInt();
        } while (mes < 1 || mes > 12);
        
         */

        System.out.println("Introduce el mes");
        mes = sc.nextInt();
        if (!(mes < 1 || mes > 12)) {
            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    dias = 31;
                    break;
                case 2:
                    dias = 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    dias = 30;
                    break;

            }
            
            System.out.println("El MES " + mes + " tiene " + dias + " dias");

        }
        else{
            System.out.println("EL MES NO EXISTE");
        }

        System.out.println("FIN DE PROGRAMA");
    }
}
