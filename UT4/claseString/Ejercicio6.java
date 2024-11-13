package es.avellaneda;

import java.util.Scanner;

/**
 * validador de contraseñas
 * Implementa un validador de contraseñas. Ésta se debe leer por teclado y
 * debemos comprobar que cumple determinadas características. Implementa un
 * método que devuelva true o false para indicar si se cumplen los requisitos de
 * contraseña válida o no. La contraseña debe enviarse al método como parámetro.
 * 
 * Implementa una función que comprobará si la contraseña tiene entre 8 y 20
 * caracteres.
 * 
 * Implementa una función que comprobará si la contraseña tiene alguna letra
 * mayúscula. Esta función debe implementarse utilizando array de caracteres.
 * 
 * Implementa una función que comprobará si la contraseña tiene alguna letra
 * minúscula. Esta función debe implementarse utilizando array de caracteres.
 * 
 * Implementa una función que comprobará si la constraseña tiene algún carácter
 * raro entre $ % _ *. Esta función debe implementarse utilizando array de
 * caracteres.
 * 
 * Implementa una función que comprobará si la constraseña tiene algún número
 */
public class Ejercicio6 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

             char[] contraseniaArray;
       
        contraseniaArray = devolverContrasenia(); 
        if(comprobarContrasenia(contraseniaArray)) {

            System.out.println("LA CONTRASEÑA ES FUERTE Y CUMPLE LOS REQUISITOS");

        }else{
            System.out.println("LA CONTRASEÑA NO  ES FUERTE Y NO CUMPLE LOS REQUISITOS");
        }
        /// equivalente al método toCharArray();
        /* contraseniaArray = new char[contrasenia.lenght()];
         * for(int i= 0; i<contrasenia.length(); i++){
         * 
         * 
         * contraseniaArray[i]= contrasenia.charAt(i);
         * }
         */

    }

    public static char[] devolverContrasenia(){
        String contrasenia; 
        char[] contraseniaArray; 
        System.out.println("Introduce la contraseña: ");
        contrasenia = sc.nextLine();

        // convertir un string a array de caracteres
        contraseniaArray = contrasenia.toCharArray();
        return contraseniaArray;
    }

    public static boolean comprobarContrasenia(char[] contraseniaArray) {
        boolean valido = false; 
        // invocar a todas las funciones de comprobación


        if(comprobarLongitud(contraseniaArray)&& comprobarMayuscula(contraseniaArray)&&
        comprobarMinuscula(contraseniaArray)&&
        comprobarNumero(contraseniaArray)&&compruebaEspeciales(contraseniaArray)){
            valido = true; 
            }
            System.out.println("");


        /*
        if(comprobarLongitud(contraseniaArray)) {
            if(comprobarMayuscula(contraseniaArray)){
                if(comprobarMinuscula(contraseniaArray)){
                    if(comprobarNumero(contraseniaArray)){
                        if(compruebaEspeciales(contraseniaArray)){
                            valido = true;
                           
                        }
                    }
                }
            }

        }*/
        return valido;
    }

    // Implementa una función que comprobará si la contraseña tiene entre 8 y 20
    // caracteres.
    public static boolean comprobarLongitud(char[] contraseniaArray) {
        boolean valido = false;
        if (contraseniaArray.length >= 8 && contraseniaArray.length <= 20) {
            valido = true;
        }

        return valido;

    }

    public static boolean comprobarMayuscula(char[] contraseniaArray) {
        boolean valido = false;

        // letras Mayúsculas como son caracteres
        // A tiene el valor 65 y Z tiene el valor 90 (letras mayúsculas son consecutivas
        // en la tabla ASCII)
        // puedo comprobar "carácter">= A && "carácter"<="Z"
        for (int i = 0; i < contraseniaArray.length; i++) {
            if (contraseniaArray[i] >= 'A' && contraseniaArray[i] <= 'Z')
            {
                valido = true;
            }
            // TODO añadir después la posibilidad de salir de la función sin terminar de
            // comprobar

        }

        return valido;
    }

    public static boolean comprobarMinuscula(char[] contraseniaArray) {
        boolean valido = false;

        // letras Minúsculas como son caracteres
        // a tiene el valor 97 y z tiene el valor 122 (letras minúsculas  son
        // consecutivas
        // en la tabla ASCII)
        // puedo comprobar "carácter">= a && "carácter"<=z 
        for (int i = 0; i < contraseniaArray.length; i++) {
            if (contraseniaArray[i] >= 'a' && contraseniaArray[i] <= 'z')
            {
                valido = true;
            }
            // TODO añadir después la posibilidad de salir de la función sin terminar de
            // comprobar

        }

        return valido;

    }

    /**
     *  TABLA ASCII con los valores de los caracteres 
     *  42	*	Asterisco
        43	+	Signo mas
        95	_	Guion bajo
        36	$	Signo de dolar
        37	%	Porcentaje
     * 
     */
/**
 *  * Implementa una función que comprobará si la constraseña tiene algún carácter
 * raro entre $ % _ *. Esta función debe implementarse utilizando array de
 * caracteres.
 * @return
 */
     public static boolean compruebaEspeciales(char[] contraseniaArray){
        boolean valido = false; 

        for (int i = 0; i < contraseniaArray.length; i++) {
            if (contraseniaArray[i] == 36||  contraseniaArray[i] == '%' 
            || contraseniaArray[i] == '_' || contraseniaArray[i] == '*'  )
            {
            // hemos añadido   la posibilidad de salir de la función sin terminar de
            // comprobar
                valido = true; 
                return valido;
            }

        }

        return valido; 
     }

     public static boolean comprobarNumero(char[] contraseniaArray){
        boolean valido = false; 

        for (int i = 0; i < contraseniaArray.length; i++) {
            if (contraseniaArray[i] >= 48  &&  contraseniaArray[i]<= '9' )
            {
            // hemos añadido   la posibilidad de salir de la función sin terminar de
            // comprobar
                valido = true; 
                return valido;
            }
        }

        return valido; 
     }

/**
48	'0'
49	1	
50	2	
51	3	
52	4	
53	5	
54	6	
55	7	
56	8	
57	9	

 */


}
