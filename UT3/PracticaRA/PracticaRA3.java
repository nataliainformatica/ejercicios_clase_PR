package ejercicios_clase_PR.UT3.PracticaRA;

import java.util.Scanner;

/**
 * Crea una aplicación que tendrá un menú con las siguientes opciones:
 * 1. Calcular nota media
 * 2. Ver el último resultado
 * 3. Salir
 * OPCIÓN1.
 * Se piden por consola los siguientes datos:
 * ¿Cuántos módulos tienes?
 * Se pedirán las notas de cada uno de los módulos …
 * ¿Qué nota has sacado en el módulo 1?
 * ¿Qué nota has sacado en el módulo 2? ….
 * Las notas pueden ser mínimo un 1 y máximo un 10, si se introduce cualquier
 * otra nota se debe mostrar un mensaje “esta nota no es válida” y volver a
 * pedir al usuario que introduzca la nota.
 * Al finalizar se mostrará:
 * La nota más alta introducida
 * La nota más baja introducida
 * La nota media en el siguiente formato:
 * De 0 a 4 No superado
 * Mayor o igual a 5 y menor que 6 : Aprobado
 * Mayor que 6 y menor que 8: Notable
 * Mayor que 8 hasta 10: Sobresaliente
 * OPCIÓN2.
 * Mostrará la última nota media calculada.
 * OPCIÓN3:
 * Finaliza el programa y se muestra FIN DE PROGRAMA
 * 
 */
public class PracticaRA3 {
    public static void main(String[] args) {
        String opcion;
        Scanner sc = new Scanner(System.in);
        int nModulos = 0;
        int nota = 0;
        int notaAlta = 0;
        int notaBaja = 100;
        float notaMedia = 0;
        int sumaNotas=0; 

        opcion = pedirOpcion(sc);
        switch (opcion) {
            case "1":
                System.out.println("Opcion 1");
                System.out.println("INTRODUCE EL NÚMERO DE MÓDULOS");
                nModulos = sc.nextInt();
                for (int i = 0; i < nModulos; i++) {
                    System.out.println("INTRODUCE LA NOTA " + (i + 1));
                    nota = pedirNota(sc);
                    if (nota > notaAlta) {
                        notaAlta = nota;
                    }
                    if (nota < notaBaja) {
                        notaBaja = nota;
                    }
                    sumaNotas += nota;                
                }
                notaMedia = sumaNotas / nModulos;
                System.out.println("LA NOTA MEDIA ES: " + notaMedia);
                System.out.println("LA NOTA MAS ALTA ES: " + notaAlta);
                System.out.println("LA NOTA MAS BAJA ES: " + notaBaja);

                break;
            case "2":
                System.out.println("Opcion 2");
                System.out.println("NOTA MEDIA: " + notaMedia);
                break;
            case "3":
                System.out.println("Opcion 3");
              
                break;

            default:
                break;
        }
        System.out.println("FIN DE PROGRAMA");

    }

    public static String pedirOpcion(Scanner sc) {
        boolean continua = true;

        String opcion = 0;
        while (continua) {
            System.out.println("*********MENU*********");
            System.out.println("1. Calcular nota media");
            System.out.println("2. Ver el resultado");
            System.out.println("3. Salir");
            System.out.println("Introduce una opcion");
            opcion = sc.nextLine();

            if (opcion .equals("1") || opcion .equals("2") || opcion .equals("3") )  {
                continua = false;
            } else {
                System.out.println("Opcion incorrecta");
            }d

        }
        return opcion;
    }
    public static int pedirNota(Scanner sc) {
        int nota = 0;
        boolean notaValida = false;
    
        while (!notaValida) {
            try {
                System.out.println("Introduce una nota entre 1 y 10: ");
                nota = sc.nextInt();
    
                // Validar que la nota esté entre 1 y 10
                if (nota >= 1 && nota <= 10) {
                    notaValida = true;
                } else {
                }
            } catch (Exception e) {
                // Capturar excepción si el usuario introduce algo que no sea un número entero
                System.out.println("Error: Debes introducir un número entero.");
                sc.next(); // Limpiar el scanner para evitar un bucle infinito
            }
        }
    
        return nota;
    }
    

}
