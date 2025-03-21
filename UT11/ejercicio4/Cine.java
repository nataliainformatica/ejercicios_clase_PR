package ejercicio4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * El cine se representa como un array de 2 dimensiones, cada posición con dos
 * únicos valores posibles y con tantos elementos como indican las constantes
 * FILAS y ASIENTOS. En principio tendrá 10 filas con 15 asientos cada una
 * (columnas) y cuando se crean se ponen a libre todos los asientos.
 * mostrar el cine en pantalla
 * 
 * ○ vender una entrada
 * 
 * ○ devolver una entrada
 * 
 * ○ leer las ventas desde el archivo y actualizar el array
 * 
 * ○ guardar las ventas en el archivo a través de objetos de la clase Butaca
 * 
 * ○ cualquier otro método que creas oportuno.
 */
public class Cine {

    private final int FILAS = 10;
    private final int ASIENTOS = 15;
    private Butaca[][] butacas;
    private final String RUTA = "entradasVendidas.txt";

    public Cine() {

        // inicilizar el arrayList
        butacas = new Butaca[FILAS][ASIENTOS];
        crearPatio();

        // leer el fichero, y cambiar los valores a ocupado

    }

    private void crearPatio() {
        Path ruta = Path.of(RUTA);

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < ASIENTOS; j++) {
                butacas[i][j] = new Butaca(i, j);
            }
        }
        try {
            List<String> ocupados = Files.readAllLines(ruta);
            // leer fichero
            // marcar las coincidencias a ocupado
            // uno por línea, con un formato fila:asiento.

            for (String linea : ocupados) {
                String[] valores = linea.split(":");
                // TODO revisar si esta conversión pueda dar una excepción
                int fila = Integer.parseInt(valores[0]);
                int asiento = Integer.parseInt(valores[1]);
                // fila es: valores[0]
                // asiento es: valores[1]
                butacas[fila][asiento].setOcupado(true);
            }
        } catch (IOException ex) {
            // si no es posible leer el fichero
            // nos dejará todas las butacas libres

        }

    }

    /*
     * En un fichero de texto, “entradasVendidas.txt”, se guarda la relación de
     * filas y asientos que están ya ocupados y por tanto ya vendidos, uno por
     * línea, con un formato fila:asiento.
     */

    // vender una entrada
    public boolean venderEntrada(int fila, int asiento) {
        // recuperar la butaca de la posición fila,asiento

        return true;
    }

    /**
     * Mostrar el cine en pantalla (la visualización consistirá en un doble X (“XX”)
     * para los asientos ocupados y un doble _ (“__”) para los que todavía se
     * encuentren libres. Separa cada asiento al menos con 2 espacios.
     * 
     * @return
     */

    public String mostrarButacas() {
        StringBuilder sb = new StringBuilder();

        // recorrer el array, y añadir la info al sb
        // es bidimensional
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < ASIENTOS; j++) {
                Butaca b = butacas[i][j];
                if (b.isOcupado()) {
                    sb.append("XX ");
                } else {
                    sb.append("__  ");
                }
            }
            sb.append("\n");

        }
        return sb.toString();
    }

    /**
     * Comprar la entrada de una fila y asiento concreto. Se muestra la entrada en
     * pantalla y actualiza el array si está disponible o se comunica al cliente que
     * ya está ocupada. Formato de salida, si la compra se efectúa
     */


     public boolean comprarEntrada(int fila, int asiento){
        // podríamos haber incluido en el enunciado
        // propagar una excepción, en el caso de que la entrada ya esté ocupada

        if(butacas[fila][asiento].isOcupado()){
            return false;
        }
        butacas[fila][asiento].setOcupado(true);
        return true; 

     }

     /**
      * Devolver una entrada, sólo si ha sido antes vendida.
      */
    public boolean devoverEntrada(int fila, int asiento){

        if(!butacas[fila][asiento].isOcupado()){
            return false;
        }
        butacas[fila][asiento].setOcupado(false);
        return true; 
    }
}
