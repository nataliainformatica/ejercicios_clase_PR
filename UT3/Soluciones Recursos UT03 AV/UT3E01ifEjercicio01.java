package estructurasDeControl;


/* 
 * Ejercicio 1: Escribe un programa que lea un número por el teclado y diga
 * si el número es par o impar.
 */ 
import java.util.Scanner;

public class UT3E01ifEjercicio01 {
 
    public static void main(String[] args) {
        int VALOR = 2;
        Scanner lectorTeclado = new Scanner(System.in);
        int num; 
               int resto; 
            // Pedimos al usuario que introduzca un número por teclado.
        System.out.print("Introduzca un número: ");
        num = lectorTeclado.nextInt();
        resto = num % VALOR;


        if(resto == 0){
            System.out.println("El número "+  num + " es par.");
        }
        else
            System.out.println("El número "+  num+  " es impar.");

       


        /* 
        // Creamos una ternaria que determine si el número es par o impar en función al resto de dividir el número entre 2.
        System.out.println("El número "+ ((num%2 == 0) ? (num + " es par."):(num + " es impar.")));
        */
         lectorTeclado.close();
        
    }}
    
 