package bucles;

import java.util.Scanner;

public class TresBucles {

    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);

        int numVeces;
        System.out.print("¿cuántas veces te saludo? ");
        numVeces = lectorTeclado.nextInt();
    
        System.out.println("PRIMERA FORMA FOR");
        for (int i = 0; i < numVeces; i++) {
            System.out.println("ECHO");
        }
        System.out.println("SEGUNDA FORMA WHILE");
        // SEGUNDA FORMA WHILE
        int i = 0;
        while (i < numVeces) {
            System.out.println("ECHO");
            i++;
        }
        // TERCERA FORMA DO-WHILE
        System.out.println("TERCERA FORMA DO-WHILE");
        i = 0;

        do {
            System.out.println("ECHO");
            i++;
        } while (i < numVeces);

    }
}
