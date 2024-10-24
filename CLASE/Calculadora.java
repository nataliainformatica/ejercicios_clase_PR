package ejercicios_clase_PR.CLASE;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {


        Scanner lector = new Scanner(System.in);
        int numero1,numero2, opcion, resultado; 
        System.out.println(" Introduce número 1");
        numero1 = lector.nextInt();
        System.out.println(" Introduce número 2");
        numero2 = lector.nextInt();

        System.out.println("¿Qué operacion quieres realizar?: 
        1. suma 2.resta 3.multiplicación 4.");
        opcion = lector.nextInt();
        switch (opcion) {
            case 1:
                resultado = sumar(numero1,numero2);
                break;
            case 2:
                resultado = restar(numero1,numero2);
                break;
            case 3:
                resultado = multiplicar(numero1,numero2);
                break;
            case 4:
                resultado = dividir(numero1,numero2);
                break;
        
            default:
            System.out.println("NO ES UNA OPCIÓN VÁLIDA");
                break;
        }

        System.out.println("EL RESULTADO DE LA OPERACIÓN ES "+ resultado);





        
    }

    /// public static
    // valor de retorno
    // nombre de la función
    // () parámetros
    // en cada parámetro, el tipo y el nombre
//          resultado = sumar(numero1,numero2);
    public static int sumar(int numero1, int numero2) {

        return numero1 + numero2;

    }

    public static int restar(int numero1, int numero2) {

        return numero1 - numero2;

    }

    public static int multiplicar(int numero1, int numero2) {
// mucho código para hacer el resultado






        return numero1 * numero2;

    }

    public static int dividir(int numero1, int numero2) {

        return numero1 / numero2;

    }
}
