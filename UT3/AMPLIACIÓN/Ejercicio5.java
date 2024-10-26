package ejercicios_clase_PR.UT3.AMPLIACIÓN;


import java.util.Scanner;

public class Ejercicio5 {

   public static void main(String[] args) {      
      System.out.println("Cantidad de comida:");
      double cantidadComida = new Scanner(System.in).nextDouble();
      System.out.println("Número de animales:");
      int numAnimales = new Scanner(System.in).nextInt();
      System.out.println("Kilos por animal:");
      double kilosPorAnimal = new Scanner(System.in).nextDouble();
      
      
      if (cantidadComida >= numAnimales*kilosPorAnimal) {
         System.out.println("Hay suficiente comida");
      } else {
         System.out.println("No hay suficiente comida.");
         
         if (numAnimales == 0) {
            System.out.println("Hay 0 animales en la granja");
         } else {
            double racion = cantidadComida / numAnimales;
            System.out.println("La ración por animal es: " + racion);
         }
      }
   }
}
