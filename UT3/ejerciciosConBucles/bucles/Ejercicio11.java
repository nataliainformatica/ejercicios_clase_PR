import java.util.Scanner;

public class Ejercicio11 {
    /**
     * Haz un menú de usuario:
     *** 
     * MENÚ DE USUARIO *** ELIGE UNA OPCIÓN
     * 
     * Introduce tu nombre
     * Introduce tu dirección
     * Introduce DNI
     * Salir comprobando campos
     * Salir sin comprobar
     * Para las opciones del 1 al 3, aparecerá el mensaje correspondiente para que
     * el usuario introduzca, nombre, dirección o dni. Si el usuario pulsa la opción
     * 4. el programa comprobará que el usuario ha introducido todos los datos. Si
     * no los ha introducido, le pedirá que continúe. "te falta algún dato por
     * introducir, continúa por favor"
     * 
     * Si el usuario pulsa la opción 5, el programa saldrá sin comprobar que se han
     * introducido todos los datos.
     * 
     * Si al salir del menú, se disponen de todos los datos del usuario, se mostrará
     * un mensaje:
     * 
     * DATOS CONFIRMADOS DEL USUARIO: "NOMBRE" , "DIRECCION", "DNI"
     * 
     * Si no se disponen de todos los datos, no mostrará el mensaje anterior.
     * 
     * @param args
     */
    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);
        String nombre = "";
        String dni = "";
        String direccion = "";
        boolean continua = true;
        boolean datosCompletos = false;
        do {
            System.out.println("1.Introduce tu nombre");
            System.out.println("2. Introduce tu direccion");
            System.out.println("3. Introduce tu dni");
            System.out.println("4. Salir comprobando campos");
            System.out.println("5. Salir sin comprobar");

            switch (lectorTeclado.nextLine()) {
                case "1":
                    System.out.println("1.Introduce tu nombre");
                    nombre = lectorTeclado.nextLine();

                    break;
                case "2":
                    System.out.println("2. Introduce tu direccion");
                    direccion = lectorTeclado.nextLine();
                    break;
                case "3":
                    System.out.println("3. Introduce tu dni");
                    dni = lectorTeclado.nextLine();
                    break;
                case "4":
                    System.out.println("COMPROBANDO CAMPOS");
                    if (nombre.isEmpty() && dni.isEmpty() && direccion.isEmpty()) {
                        System.out.println("DATOS INCOMPLETOS");
                        System.out.println("DATOS CONFIRMADOS DEL USUARIO: Nombre " + nombre + ", Dirección:  "
                                + direccion + ", DNI:  " + dni);
                        System.out.println("TE FALTAN  DATOS POR INTRODUCIR, CONTINUA POR FAVOR");
                        continua = true;

                        break;
                    } else {
                        System.out.println("DATOS COMPLETOS");
                        System.out.println("DATOS CONFIRMADOS DEL USUARIO: Nombre " + nombre + ", Dirección:  "
                                + direccion + ", DNI:  " + dni);
                        continua = true;
                        datosCompletos = true;
                        break;
                    }
                case "5":
                    System.out.println("SALIENDO SIN COMPROBAR DATOS");
                    continua = false;
                    break;

                default:
                    System.out.println("Introduce una opción válida");
                    break;
            }

        } while (continua);

        if (datosCompletos) {
            System.out.println("DATOS COMPLETOS");
            System.out.println("DATOS CONFIRMADOS DEL USUARIO: Nombre " + nombre + ", Dirección:  " + direccion
                    + ", DNI:  " + dni);
        }


        System.out.println("FIN");

    }
}
