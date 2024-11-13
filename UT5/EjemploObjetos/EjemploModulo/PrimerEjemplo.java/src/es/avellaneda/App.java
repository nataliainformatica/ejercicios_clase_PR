package es.avellaneda;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // SABEMOS QUE EL ALUMNO TIENE TRES MÓDULOS
// EN LA APP VAMOS A PEDIR LA INFORMACION DE LOS NOMBRES DE LOS 
//MÓDULOS
// LA NOTA DE CADA MÓDULO
// CURSO DE CADA MÓDULO   

// SE PODRÁ CONSULTAR SI EL MÓDULO  ESTÁ APROBADO O NO
    Scanner scLetras = new Scanner(System.in);
    Scanner scNumeros = new Scanner(System.in);
      Modulo modulo1, modulo2, modulo3; //
    String nombre; 
    int notaNumerica; 
    String curso; 

      System.out.println("DIME EL NOMBRE DEL MÓDULO ");
      nombre = scLetras.nextLine();
      System.out.println("DIME LA NOTA  DEL MÓDULO ");
        notaNumerica = scNumeros.nextInt();
      System.out.println("DIME EL CURSO DEL MÓDULO ");
      curso = scLetras.nextLine(); 

      //public Modulo(String nombre, int notaNumerica, String curso) {

     modulo1 = new Modulo(nombre, notaNumerica, curso); 


     System.out.println("DIME EL NOMBRE DEL MÓDULO 2 ");
     nombre = scLetras.nextLine();
     System.out.println("DIME LA NOTA  DEL MÓDULO 2 ");
       notaNumerica = scNumeros.nextInt();
     System.out.println("DIME EL CURSO DEL MÓDULO 2 ");
     curso = scLetras.nextLine(); 
        modulo2 = new Modulo(nombre, notaNumerica, curso); 

    }
}
