package bucles;

import java.util.Scanner;

/*
 * *** MENÚ DE USUARIO *** ELIGE UNA OPCIÓN

Introduce tu nombre
Introduce tu dirección
Introduce DNI
Salir comprobando campos
Salir sin comprobar
Para las opciones del 1 al 3, aparecerá el mensaje correspondiente para que el usuario introduzca, nombre, dirección o dni. Si el usuario pulsa la opción 4. el programa comprobará que el usuario ha introducido todos los datos. Si no los ha introducido, le pedirá que continúe. "te falta algún dato por introducir, continúa por favor"

Si el usuario pulsa la opción 5, el programa saldrá sin comprobar que se han introducido todos los datos.

Si al salir del menú, se disponen de todos los datos del usuario, se mostrará un mensaje:

DATOS CONFIRMADOS DEL USUARIO: "NOMBRE" , "DIRECCION", "DNI"

Si no se disponen de todos los datos, no mostrará el mensaje anterior.
 * 
 * 
 */
public class Ejercicio11Clase {
    public static void main(String[] args) {

        String nombre="", direccion="", dni="";
        String opcion;

        Scanner lectorTeclado = new Scanner(System.in);

        boolean continua = true;
        boolean datosCompletos= false;
        while (continua) {

            System.out.println("1. Introduce tu nombre");
            System.out.println("2. Introduce tu dirección");

            System.out.println("3. Introduce DNI\n" + //
                    "        4. Salir comprobando campos\n" + //
                    "        5.  Salir sin comprobar");

            opcion = lectorTeclado.nextLine();

            switch (opcion) {
                case "1":
                System.out.println(" Introduce tu nombre");
                nombre = lectorTeclado.nextLine();
                    break;
                case "2":
                System.out.println(" Introduce tu dirección");
                direccion = lectorTeclado.nextLine();
                    break;
                case "3":
                System.out.println(" Introduce tu dni");
                dni = lectorTeclado.nextLine();
                    break;
                case "4":

                System.out.println("CONDICIÓN " + (!nombre.equals("")
                || !direccion.equals("")
                || !dni.equals("")));


                if(!nombre.equals("") &&  !direccion.equals("")&& !dni.equals("")){
                  

                    System.out.println("SE HAN COMPLETADO TODOS LOS CAMPOS");
                    datosCompletos= true; 
                    continua =  false; 
                }else {
                    System.out.println("FALTAN CAMPOS POR COMPLETAR - CONTINÚA POR FAVOR");
                    continua = true; 

                   
                }
                    break;
                case "5":
                    System.out.println("SALIENDO SIN COMPROBAR CAMPOS");
                    continua = false; 
                    break;

                default:
                    break;
            }

        }


        // mostrar el mensaje de los datos del usuario

        
        if(datosCompletos){

        }
        System.out.println("FIN DE PROGRAMA");
    }
}
