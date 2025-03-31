package ejercicio5.principal;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.lang.model.util.ElementScanner14;

import ejercicio5.Utilidades.GuardarUsuario;
import ejercicio5.Utilidades.LeerDibujo;
import ejercicio5.Utilidades.LeerUsuarios;

public class Principal {

    private static Scanner sc = new Scanner(System.in);
    private static final String RUTA_DIBUJOS = "dibujos";
    private static final String RUTA_PALABRAS = "recursos";
    private static final String PALABRAS = "palabras.txt";
    private static final String ROJO = "\u001B[31m";
    private static final String RESET = "\u001B[0m"; // Restablecer color
    private static final String AZUL = "\u001B[34m";
    private static final String VERDE = "\u001B[32m";
    private static final String ROSA = "\u001B[35m";
    private static final int MAX_PUNTUACION = 100; 

    private static ArrayList<String> dibujo;
    private static int nJugadas;
    private static Usuario usuario; 
  
    private static ArrayList<Integer> puntuaciones;  
    public static void main(String[] args) {
        String opcion;

        Path ruta = Paths.get(RUTA_PALABRAS, PALABRAS);

        String palabraJugada = null;
        ArrayList<String> palabras=null;
        puntuaciones = new ArrayList<>(); 
        // TODO - revisar para ordenar el código
        try {
            palabras = LeerDibujo.leerDibujo(ruta.toFile());
            // desordeno el array de palabras
            Collections.shuffle(palabras);
            //

            // traza de prueba
            /*
             * for(String s: palabras){
             * System.out.println(s);
             * }
             */
        } catch (IOException ex) {

            System.out.println("No es posible leer el fichero de palabras");
        }
        /**
         * 2. Gestión de palabras
         * 
         * Las palabras estarán almacenadas en un fichero de texto (palabras.txt).
         * 
         * Se seleccionará una palabra al azar al inicio de la partida.
         */

    

        // pedir los datos al usuario

        System.out.println("INTRODUCE TU ALIAS");
        usuario = new Usuario(sc.nextLine());


    // mostrar menú
        do {

            System.out.println("1.Selección del dibujo del ahorcado");
            System.out.println("2. Jugar");
            System.out.println("3. Mostrar Puntuaciones");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    /**
                     * Al inicio del juego, el usuario podrá elegir entre diferentes estilos de
                     * dibujos del ahorcado. (los dibujos, estarán en un fichero en la carpeta
                     * dibujos, en la ruta de la aplicación, de forma que se mostrará el nombre de
                     * todos los ficheros que haya en esta carpeta, para que el usuario elija uno),
                     * por ejemplo
                     */
                    File f = mostrarOpciones();
                    // cargar los datos del fichero en el array del ahorcado
                    try {
                        dibujo = LeerDibujo.leerDibujo(f);
                        // prueba
                        System.out.println(AZUL);
                        mostrarDibujo(dibujo, dibujo.size());
                        System.out.println(RESET);
                    } catch (IOException ex) {
                        System.out.println("No ha sido posible cargar el dibujo");
                    }
                    break;
                case "2":
                    // jugar
                    // si no se ha seleccionado el dibujo, volver al menu
                    if(dibujo!= null){
                       
                   
                    try {
                        palabraJugada = palabras.get(nJugadas);
                        jugar(palabraJugada);
                    } catch (NullPointerException ex) {
                        System.out.println("NO ES POSIBLE JUGAR PORQUE NO HAY PALABRAS");
                    } }else{
                        System.out.println("DEBES ELEGIR PRIMERO EL DIBUJO");
                    }
                    break; 
                case "3": 
                        // leer puntuaciones
                        // ordenar el array - 
                        // mostrar array (solamente las 10 primeras posiciones)
                     
                    try {
                        ArrayList<Usuario> usuarios = LeerUsuarios.getUsuarios();
                        Collections.sort(usuarios);
                        mostrarPuntuaciones(usuarios); 

                    } catch (IOException e) {
                        
                       System.out.println( ROJO + "NO HAY PUNTUACIONES PARA MOSTRAR" + RESET);
                    } 
                    break; 
                case "s","S":
                // GUARDAR LOS DATOS DEL USUARIO 

                  usuario.setPuntuacion(Collections.max(puntuaciones));
                    try {
                        GuardarUsuario.escribirUsuario(usuario);
                    } catch (IOException e) {
                       System.out.println("NO HA SIDO POSIBLE GUARDAR LOS DATOS");
                    }
                    break;
                default:
                    break;
            }
        } while (!opcion.equalsIgnoreCase("S"));

    }

    private static void mostrarPuntuaciones(ArrayList<Usuario> usuarios){
        Iterator<Usuario> it = usuarios.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }
    private static void mostrarDibujo(ArrayList<String> dibujo, int valor) {
        for (int i = 0; i < valor; i++) {
            System.out.println(dibujo.get(i));
        }
    }

    /**
     *
     * @param palabra
     */
    private static void jugar(String palabra) {
        boolean solucion = true;
        int intentos = 0;
        String palabraOculta = crearPalabraOculta(palabra);
        // colección que no permite duplicados
        HashSet<Character> letrasProbadas = new HashSet();
        HashSet<Character> letrasAcertadas = new HashSet();
        StringBuilder palabraAdivinada = new StringBuilder(palabraOculta);
        char letra;
        int aciertos;
        int valor; 
         int puntuacion=0;
     

        do {
            System.out.print(VERDE);
            System.out.print("LETRAS QUE HAS INTENTADO : ");
            System.out.println(letrasProbadas);
            System.out.print(RESET);
            System.out.println("ESTA ES LA PALABRA QUE DEBES ADIVINAR");
            System.out.println(palabraOculta);
            valor = MAX_PUNTUACION/palabraOculta.length(); 

            System.out.println("Introduce una letra");
            letra = sc.nextLine().toLowerCase().charAt(0);
            if (esVocal(letra)) {
                System.out.println("Las vocales son gratis, prueba con otra letra");
            } else if (letrasProbadas.contains(letra)) {
                System.out.println("Esta letra ya la has intentado antes, prueba con otra letra");
            } 
            else if (letrasAcertadas.contains(letra)) {
                // TODO - MOSTRAR LAS LETRAS ACERTADAS

                System.out.println("Esta letra ya la has intentado antes, prueba con otra letra");
                System.out.println("LETRAS ACERTADAS" + letrasAcertadas);
            }else {

                // comprobar si la letra está en palabra
                // TODO - con aciertos habrá que actualizar la puntuación
                aciertos = contarLetra(palabra, letra);


                if (aciertos > 0) {
                    puntuacion += valor* aciertos; 
                    letrasAcertadas.add(letra);
                    System.out.println("La palabra contiene " + letra + " " + aciertos + " veces");
                    palabraOculta = sustituirLetra(palabra, palabraOculta, letra);
                    if (palabra.equals(palabraOculta.toString())) {
                        // ACIERTO
                        solucion = false;
                        System.out.println(ROSA);
                        System.out.println("HAS GANADO ");
                        System.out.println("PUNTUACIÓN ALCANZADA: " + puntuacion  + RESET);
                        puntuaciones.add(puntuacion);
                    }
                } else {
                    // Por cada error, se resta un tercio de la puntuación obtenida hasta el momento. 
                    
                    puntuacion -= (puntuacion/3);
                    intentos++;
                    if (intentos >= dibujo.size()) {

                        // guardar los datos de la puntuación obtenida
                        System.out.println("PUNTUACIÓN ALCANZADA: " + puntuacion);
                        System.out.println(ROJO + "NO HAS ACERTADO, Y HAS PERDIDO!!!!" + RESET);
                    } else {
                        System.out.println(ROJO + "NO HAS ACERTADO, CONTINÚA JUGANDO" + RESET);
                        letrasProbadas.add(letra);

                    }
                    System.out.println("PUNTUACIÓN ALCANZADA: " + puntuacion);
                    mostrarDibujo(dibujo, intentos);
                }
          
            }

        } while (intentos < dibujo.size() && solucion);
        nJugadas++;

    }

    private static File mostrarOpciones() {
        File directorio = new File(RUTA_DIBUJOS);
        boolean continua = false;
        File[] archivos;
        File f = null;
        int contador = 1;
        int opcion;
        if (directorio.exists() && directorio.isDirectory()) {
            archivos = directorio.listFiles();
            do {
                contador = 1;

                System.out.println("DIBUJOS DISPONIBLES PARA ELEGIR");
                for (File archivo : archivos) {
                    System.out.print(contador + ".-");
                    System.out.println(archivo.getName());
                    contador++;
                }

                System.out.println("Elige un número de opción");
                // tratar la excepción de que no sea número o que sea un número no permitido
                try {
                    opcion = Integer.parseInt(sc.nextLine());
                    f = archivos[opcion - 1];
                    contador = 1;
                    continua = false;
                } catch (NumberFormatException ex) {
                    System.out.println("Debes introducir un número");
                    continua = true;

                } catch (IndexOutOfBoundsException ex) {
                    System.out.println("Debes introducir un número entre 1 y " + archivos.length);
                    continua = true;
                }

            } while (continua);

        }
        return f;// TODO - comprobar posibles nulos

    }

    /**
     * Se mostrará la palabra oculta con guiones (_) representando las letras.
     */
    private static String crearPalabraOculta(String palabra) {
        String palabraOculta;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < palabra.length(); i++) {

            if (esVocal(palabra.charAt(i))) {
                sb.append(palabra.charAt(i));
            } else
                sb.append("_");

        }

        // recorrer cada una de las letras, y si es vocal se muestra, si es consonante
        // se muestra "_"

        return sb.toString();

    }

    private static boolean esVocal(Character caracter) {
        switch (Character.toLowerCase(caracter)) {
            case 'a', 'e', 'i', 'o', 'u':
                return true;
            default:
                return false;
        }

    }

    public static String sustituirLetra(String palabra, String palabraOculta, char letra) {
        String regex = Character.toString(letra); // Expresión regular para la letra
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(palabra);

        StringBuilder resultado = new StringBuilder(palabraOculta);
        while (matcher.find()) {
            int start = matcher.start(); // Obtener la posición de la letra encontrada
            resultado.setCharAt(start, letra); // Sustituir la letra
        }

        return resultado.toString();
    }

    public static int contarLetra(String palabra, char letra) {
        String regex = Character.toString(letra); // Crear expresión regular para la letra
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(palabra);

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}