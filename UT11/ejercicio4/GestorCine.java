package ejercicio4;

import java.util.Scanner;

/*
 * GestionCine, encargado de crear y gestionar el menú en pantalla y de la comunicación con la clase Cine. Recibirá un objeto de la clase Cine en su constructor, que será precisamente el Cine que deba gestionar. Al comenzar se encargará de que se lean las ventas desde el archivo “entradasVendidas.txt”.
 * Se mostrará un menú en pantalla que permita las siguientes opciones:

Mostrar butacas

Comprar entrada

Devolver una entrada

Salir


 */
public class GestorCine {

    private Scanner sc;
    private Cine cine;
    // podríamos cambiarlo para tomarlo de Cine
    // 
    private final int FILAS = 10;
    private final int ASIENTOS = 15;

    public GestorCine(Cine cine) {
        sc = new Scanner(System.in);
        this.cine = cine;
    }

    public void gestionarMenu() {

        String opcion;

        do {
            System.out.println("1. Mostrar butacas");
            System.out.println("2. Comprar entrada");
            System.out.println("3. Devolver una entrada");
            System.out.println("4.Salir");
            opcion = sc.nextLine();
            int fila,asiento;
            switch (opcion) {
                
                case "1":
                    // método para recorrer el array de cine y mostrar su contenido
                    mostrarButacas();
                    break;
                case "2":
                    /**
                     * Comprar la entrada de una fila y asiento concreto. Se muestra la entrada en
                     * pantalla y actualiza el array si está disponible o se comunica al cliente que
                     * ya está ocupada.
                     */
                    // pedir datos de la entrada al usuario
                   
                    System.out.println("Fila a comprar");
                    fila = pedirNumero(FILAS);

                    System.out.println("Asiento a comprar");
                    asiento = pedirNumero(ASIENTOS); 
                    if(cine.venderEntrada(fila, asiento)){
                        System.out.println("Su compra ha sido gestionada");
                    }else{
                        System.out.println("No es posible gestionar su compra");
                    }
                    break;
                case "3":
                    // pedir datos de la entrada al usuario
                    // Devolver una entrada, sólo si ha sido antes vendida.
                    // pedir datos de la entrada al usuario
                    
                    System.out.println("Fila a devolver");
                    fila = pedirNumero(FILAS);

                    System.out.println("Asiento a devolver");
                    asiento = pedirNumero(ASIENTOS); 
                    if(cine.devolverEntrada(fila, asiento)){
                        System.out.println("Su devolución ha sido gestionada");
                    }else{
                        System.out.println("No es posible gestionar su devolución");
                    }

                    break;
                case "4":
                    /*
                     * Al salir de la aplicación, se deberá guardar en el archivo
                     * “entradasVendidas.txt” los nuevos asientos vendidos
                     */

                    cine.guardarEntradas();
                    System.out.println("SALIR");
                    break;
                default:
                    break;
            }
        } while (!opcion.equals("4"));

    }

    private int pedirNumero(int max) {



        // 
        //private final int FILAS = 10;
        //private final int ASIENTOS = 15;
    
        int numero = -1;
        do {
            System.out.println("Introduce un valor entre 0 y "+ (max- 1));
            try {
                numero = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("El valor introducido no es válido");
            }
        } while (numero < 0 || numero >= max);
        return numero;
    }

    private void mostrarButacas() {

        System.out.println(cine.mostrarButacas());

    }

}
