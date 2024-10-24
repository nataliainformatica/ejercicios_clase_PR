package ejercicios_clase_PR.UT3.funciones;

import java.util.Scanner;

/*
 * 
 * Completa el código de una aplicación que podrá calcular el área o el volumen de un cilindro:

    Es requisito que la petición de datos al usuario (radio, altura, y la opción de área o volumen) se haga en el método main y el cálculo se haga en una función con la siguiente firma o declaración:

    static double areaVolumenCilindro(double radio, double altura, int opcion) { ......}
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca radio: ");
        double radio = sc.nextDouble();
        System.out.print("Introduzca altura: ");
        double alt = sc.nextDouble();
        System.out.print("Qué desea calcular (1 (área)/ 2 (volumen): ");
        int tipoCalculo = sc.nextInt();

        System.out.println(areaVolumenCilindro(radio, alt, tipoCalculo));

    }

    public static double areaVolumenCilindro(double radio, double altura, int opcion) {
        double resultado = 0.0;

        switch (opcion) {
            case 1 -> {
                resultado = Math.PI * Math.pow(radio, 2) * altura;
                // System.out.println("El volumen es de: " + resultado);
            }
            case 2 -> {
                resultado = 2 * Math.PI * radio * (altura + radio);
                // System.out.println("El área es de: " + resultado);
            }
            default -> System.out.println("Indicador del cálculo erróneo");
        }

        return resultado;

    }
}
