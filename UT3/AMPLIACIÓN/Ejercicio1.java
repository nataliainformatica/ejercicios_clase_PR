package ejercicios_clase_PR.UT3.AMPLIACIÓN;
import java.util.Scanner;

public class Ejercicio1 {

   public static void main(String[] args) {
      boolean capicua = false;
      
      System.out.println("Escriba un número:");
      int num = new Scanner(System.in).nextInt();
      
      int u = num % 10;
      num /= 10;
      int d = num %10;
      num /= 10;
      int c = num%10;
      num /= 10;
      int um = num;
      
      if (u == um && d==c) {
         capicua = true;
      } else if (um==0 && u==c) {
         capicua = true;
      } else if (um==0 && c==0 && d==u) {
         capicua = true;
      } else if (um==0 && c==0 && d==0) {
         capicua = true;
      }
      
      if (capicua) {
         System.out.println("El número es capicua");
      } else {
         System.out.println("No es capicua");
      }
      
   }
}
