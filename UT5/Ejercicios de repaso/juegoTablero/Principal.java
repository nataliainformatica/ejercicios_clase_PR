
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * Vamos a escribir un juego en el que nos mostrará un tablero de 5 x 5 posiciones 
 * 
 * Avatares disponibles: (?, *, ¿, +, %) 
 */

public class Principal {
    private static final int FIL = 5;
    private static final int COL = 5;
    private static final int MAX = 5;
    private static Personaje[][] tablero = new Personaje[FIL][COL];
    private static final char[] AVATARES = { '?', '*', '¿', '+', '%' };
    private static Scanner sc = new Scanner(System.in);
    private static int contador =0; 
    private static final int ENEMIGOS =3;
    public static void main(String[] args) {
        boolean continua = true;
        Personaje miPersonaje;
        Random rd = new Random();
        String opcion; 
        // crear los tres personajes
        // tablero está relleno de null
        // TODO , hacer el mismo caso utilizando un Personaje '-' que significa vacío
        int x, y, contador = 1;

        do {
            x = rd.nextInt(tablero.length);
            // es un tablero regular, es decir todas las filas tienen las mismas columnas
            y = rd.nextInt(tablero[0].length);

            if (tablero[x][y] == null) {
                // crear personaje aleatorio
                tablero[x][y] = crearPersonaje();
                // TODO, si gestionamos posiciones debemos actualizarlas
                contador++;
            }
        } while (contador <= ENEMIGOS);

        // TODO añadir el menú para pedir al usuario qué avatar quiere.
        // de momento vamos a usar '*'

        tablero[0][0] = miPersonaje = new Personaje('*');
        mostrarTablero();
        //mostrarTableroTrazas();
        do {
            System.out.println("1. Mover");
            System.out.println("2. Cambiar avatar");
            System.out.println("Cualquier otra tecla. SALIR");
            opcion = sc.nextLine(); 
            switch (opcion) {
                case "1":
                System.out.println("Indica la direccion: derecha o abajo");
                if(moverPersonaje(miPersonaje, sc.nextLine().toLowerCase())){
                    continua = false;
                }else{
                   mostrarTablero();
                   //  mostrarTableroTrazas();
                }
                break;
                case "2":
                   System.out.println("Indica el avatar");
                   System.out.println(Arrays.toString(AVATARES)); Arrays.toString(AVATARES);
                    if(miPersonaje.cambiarAvatar(sc.nextLine().charAt(0))){
                        System.out.println("Cambiado");
                        mostrarTablero();
                    }
                    break; 
              
                default:
                    System.out.println("Otra opción - SALIR");
                     continua = false;

                    break;
            }
         
        } while (continua);

    }

    public static boolean moverPersonaje(Personaje miPersonaje, String direccion) {
        int x = miPersonaje.getX();
        int y = miPersonaje.getY();
        Personaje enemigo = null;
        boolean finJuego= false; 
        tablero[x][y] = null;
        // mueve el personaje, derecha o abajo
        try{
        switch (direccion) {
            case "derecha":
                // debe incrementar la columna             
                y=y+1;
                
                // falta gestionar indexOutofBounds, finaliza el juego
                break;
                case "izquierda":
                // debe incrementar la columna             
                y=y-1;
                
                // falta gestionar indexOutofBounds, finaliza el juego
                break;
            case "abajo":
                // debe incrementar la fila
               x = x+1; 
                // falta gestionar indexOutofBounds, finaliza el juego
                break;
                case "arriba":
                // debe incrementar la fila
               x = x-1; 
                // falta gestionar indexOutofBounds, finaliza el juego
                break;
            default:
            System.out.println("No se puede mover- direccion incorrecta");
                break;
        }
        enemigo = tablero[x][y];
        if (enemigo != null) {
            if ( miPersonaje.comer(enemigo)) {
                // pongo mi personaje en esa posición y null en la anterior
                tablero[x][y] = miPersonaje;   
                miPersonaje.mover(x, y);
                if(++contador>=ENEMIGOS){
                    finJuego = true;
                    mostrarTablero();
                    System.out.println("HAS GANADO  ");
                }

              
            } else  {
                miPersonaje.setY(y);
                finJuego = true; 
                // falta gestionar fin de juego
                System.out.println("EL ENEMIGO ES MÁS FUERTE");
            }
        }
        else{
            tablero[x][y] = miPersonaje;   
            miPersonaje.mover(x, y);
        }  
    }catch (Exception e) {
       // indexoutofbounds , finaliza el juego
        finJuego = true;
        System.out.println("FIN DEL JUEGO, TE HAS SALIDO DEL TABLERO");
    } 

     return finJuego; 
    }

    public static void mostrarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] != null)
                    System.out.print(tablero[i][j] + " ");
                else
                    System.out.print("-" + " ");

            }
            System.out.println();
        }
    }
    
    public static void mostrarTableroTrazas() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] != null)
                    System.out.print(tablero[i][j].toString() + tablero[i][j].getFuerza() + " ");
                else
                    System.out.print("--" + " ");

            }
            System.out.println();
        }
    }

    public static Personaje crearPersonaje(char avatar) {
        // personaje con avatar, fuerza 0, y posición 0,0

        return new Personaje(avatar);
    }

    public static Personaje crearPersonaje() {
        // avatar aleatorio
        // fuerza aleatoria
        return new Personaje(AVATARES, MAX);
    }

}
