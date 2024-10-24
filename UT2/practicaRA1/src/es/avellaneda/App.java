package es.avellaneda;

import java.util.Scanner;

/**
 * • Crea un proyecto en java con nombre practica1
 * El objetivo de la aplicación contenida en este proyecto es recoger (usando la
 * consola) los datos para un envío y después mostrar (usando la consola) los
 * datos con un determinado formato .
 * Al arrancar la aplicación se piden al usuario los siguientes datos:
 * Nombre del remitente
 * Apellidos del remitente
 * Nombre del destinatario
 * Apellidos del destinatario
 * NIF del destinatario
 * Nombre de la calle para la entrega
 * Número
 * Planta
 * Letra
 * Kilos del envío
 * Envío asegurado (true o false)
 * Sabiendo que el precio por cada kilo son 3.026 euros se deberá calcular el
 * precio total del envío.
 * 
 * Los datos que se muestran del envío tendrán el siguiente formato: (lo que
 * aparece en minúscula debe sustituirse por los datos correspondientes)
 * 
 * REMITENTE : nombre y apellido
 *** DIRECCIÓN DE ENVÍO***********
 * DESTINATARIO: nombre y apellido
 * C/ calle, NÚMERO: nº, PLANTA: piso letra
 * NIF: nif
 * PRECIO DEL ENVÍO: precio total
 * EL ENVÍO ES ASEGURADO: true o false
 * 
 * Es muy importante elegir el tipo de datos que más se ajuste a los datos que
 * se van a introducir. Comenta la elección de cada tipo de datos en el código.
 * No hay una única solución, siempre que se argumente adecuadamente la elección
 * del tipo.
 * 
 * Sigue las buenas prácticas de orden de código, declaración e inicialización
 * de variables
 * 
 * ejemplo del resultado en consola
 * 
 * REMITENTE : nombreremitente apellidosremitente
 * DIRECCIÓN DE ENVÍO
 * DESTINATARIO: nombre destinatario apellidos destinatario
 * C/ calleentrega ,NÚMERO: 1, PLANTA: 1a
 * NIF: 08776554x
 * PRECIO DEL ENVÍO: 9.078
 * EL ENVÍO ES ASEGURADO: true
 * 
 * 
 */

public class App {
    public static void main(String[] args) {

        final double PRECIO_KILO = 3.026;
        String nombreRemitente, apellidosRemitente, nombreDestinatario, apellidosDestinatario, nombreCalle;
        // Tipo String porque son caracteres alfabeticos, suponemos que las calles son de 1 sola letra, poque
        
        String nifDestinatario; // Tipo String porque son caracteres alfanuméricos

        short numeroCalle = 0, planta = 0;// Tipo entero corto ,con el tipo byte no se podrían almacenar números
                                          // superiores a 127

        char letra; // Tipo char para almacenar una sola letra, suponemos que las letras de las
                    // plantas son de 1 sola letra
        double kilos = 0; // Resultado tipo double para permitir envíos en los que el peso no sean un entero

        boolean envioAsegurado = true; // Según los requisitos la respuesta solo puede ser 'true' o 'false'

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el NOMBRE del remitente: ");
        nombreRemitente = sc.nextLine();

        System.out.print("Introduce los APELLIDOS del remitente: ");
        apellidosRemitente = sc.nextLine();

        System.out.print("Introduce el nombre del DESTINATARIO: ");
        nombreDestinatario = sc.nextLine();

        System.out.print("Introduce los apellidos del DESTINATARIO: ");
        apellidosDestinatario = sc.next();
        sc.nextLine();

        System.out.print("Introduce el NIF del destinatario: ");
        nifDestinatario = sc.nextLine();
        System.out.println("A CONTINUACIÓN SE PEDIRÁN LOS DETALLES DE LA DIRECCIÓN DE ENTREGA");

        System.out.print("Introduce la CALLE : ");
        nombreCalle = sc.nextLine();

        System.out.print("Introduce el NÚMERO: ");
        numeroCalle = sc.nextShort();
        sc.nextLine();

        System.out.print("Introduce la PLANTA: ");
        planta = sc.nextShort();
        sc.nextLine();

        System.out.print("Introduce la LETRA : ");
        letra = sc.nextLine().charAt(0);

        System.out.print("Introduce el PESO del paquete en kilos: ");
        kilos = sc.nextDouble();
        sc.nextLine();

        System.out.print("¿El envio está asegurado?(escribe true o false para decir si o no): ");
        envioAsegurado = sc.nextBoolean();
        sc.nextLine();

        System.out.println("REMITENTE: " + nombreRemitente + " " + apellidosRemitente);
        System.out.println("***** DIRECCIÓN DE ENVÍO *****");
        System.out.println("DESTINATARIO: " + nombreDestinatario + " " + apellidosDestinatario);
        System.out.println("C/ " + nombreCalle + ", NÚMERO: " + numeroCalle + "º, Planta: " + planta + letra);
        System.out.println("NIF: " + nifDestinatario);
        System.out.println("PRECIO DEL ENVÍO: " + (kilos * PRECIO_KILO) + " €"); 
        System.out.println("EL ENVÍO ES ASEGURADO: " + envioAsegurado);
        sc.close();

    }
}
