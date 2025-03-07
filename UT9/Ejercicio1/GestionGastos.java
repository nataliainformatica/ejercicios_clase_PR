package ut9.Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

import javax.management.RuntimeErrorException;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import ut9.Ejercicio1.excepciones.GastoInvalidoException;
import ut9.Ejercicio1.excepciones.ImportePositivoException;
import ut9.Ejercicio1.model.Categoria;
import ut9.Ejercicio1.model.DAOparticipantes;
import ut9.Ejercicio1.model.Gasto;
import ut9.Ejercicio1.model.Ingreso;
import ut9.Ejercicio1.model.Participante;

public class GestionGastos {

    /**
     * Manejo de Excepciones TODAS LAS EXCEPCIONES SE MANEJAN EN LA CLASE
     * GestionGastos Se almacenarán las excepciones de ImportePositivoExcepcion en
     * una coleccion para en un futuro poder tratarlas.
     * 
     * @param args
     */
    private static ArrayList<Participante> participantes = DAOparticipantes.getParticipantes();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // se implementará un método calcularPendientes, que:
        // Determinará la cuota equitativa dividiendo el total de gastos
        // entre el número de participantes.
        // Indicará cuánto debe pagar o recibir cada participante.
        String opcion="";
        do {      
            try {
                

                opcion = menu();

            } catch (IllegalArgumentException ex) {
                System.out.println("El valor introducido no es válido");
            } catch (java.lang.IndexOutOfBoundsException ex1) {
                System.out.println("No existe ese participante");
            } catch (ImportePositivoException ex3) {
                // TODO - PENDIENTE DE DEFINIR EN EL ENUNCIADO QUÉ HACER CON LA EXCEPCIÓN
                System.out.println("EL participante " + ex3.getParticipante().getNombreApellidos() +
                        "tiene un saldo positivo");
            } catch (GastoInvalidoException ex4) {
                System.out.println(ex4.getMessage());
            }
        } while (!opcion.equals("4"));

    }

    private static String menu() {
        String opcion = null;

        System.out.println("1. Introducir gasto");
        System.out.println("2. Introducir ingreso");
        System.out.println("3. Mostrar cuánto debe pagar o recibir cada participante. ");
        System.out.println("4. Salir");

        opcion = sc.nextLine();
        switch (opcion) {
            case "1":
                int numero;
                double valor;
                String detalle, categoria;

                System.out.println("Introduce el número de participante ");
                // buscar el participante para añadirle el gasto - transaccion
                // se propagará la excepción si la hubiese
                Participante p = participantes.get((Integer.valueOf(sc.nextLine())) - 1);
                if (p != null) {
                    System.out.println("Anota el importe del gasto");
                    valor = Double.parseDouble(sc.nextLine());// se propagará la excepción si la hubiese
                    // Categoria categoria =
                    System.out.println("Introduce la categoría del gasto");
                    System.out.println(devolverCategorias());
                    categoria = sc.nextLine().toUpperCase();

                    System.out.println("Introduce el detalle del gasto");
                    detalle = sc.nextLine();
                    p.agregarTransaccion(new Gasto(valor, Categoria.valueOf(categoria), detalle));
                }

                // traza para pruebas
                mostrarParticipantes();

                break;
            case "2":
                System.out.println("Introduce el número de participante ");
                // buscar el participante para añadirle el gasto - transaccion
                // se propagará la excepción si la hubiese
                Participante p1 = participantes.get((Integer.valueOf(sc.nextLine())) - 1);
                if (p1 != null) {
                    System.out.println("Anota el importe del ingreso");
                    valor = Double.parseDouble(sc.nextLine());// se propagará la excepción si la hubiese
                    // Categoria categoria =

                    System.out.println("Introduce el detalle del ingreso");
                    detalle = sc.nextLine();
                    p1.agregarTransaccion(new Ingreso(valor, detalle));// posible envío de excepciones
                }
                // traza para pruebas
                mostrarParticipantes();
                break;
            case "3":
                calculoDeudas();
                break;
            default:
                break;
        }
        return opcion;

    }

    private static void calculoDeudas() {
        // tiene que recorrer el array de participantes
        // mostrando cuánto debe pagar o recibir cada participante
        // necesito saber el total de ingresos - gastos de cada participante
        // para dividirlo entre todos los participantes

        double total = 0, cuotaParticipante;
        for (Participante p : participantes) {
            total = total + p.devolverTotal();
            // estamos sumando gastos en negativo

        }

        cuotaParticipante = Math.abs(total / participantes.size());
        // ahora mostrará lo que ha pagado el participante y lo que tiene que pagar, y
        // el saldo pendiente

        for (Participante p : participantes) {
            System.out.println("Participante " + p.getNombreApellidos());
            System.out.print("PAGADO  " + (-p.devolverTotal()));
            System.out.print(" CUOTA " + cuotaParticipante);
            double importe = (-p.devolverTotal() - cuotaParticipante);
            if (importe > 0)
                System.out.println(" DEBE RECIBIR " + Math.abs(importe));
            else
                System.out.println(" DEBE ABONAR " + Math.abs(importe));
        }

    }

    private static String devolverCategorias() {
        StringBuilder sb = new StringBuilder();
        // String[] valores =
        Categoria[] valores = Categoria.values();
        for (Categoria c : valores) {
            sb.append(c.toString());
            sb.append("-");
        }
        return sb.toString();

    }

    private static void mostrarParticipantes() {
        for (Participante p : participantes) {
            System.out.print(p);
            System.out.println("Saldo  " + p.devolverTotal());
        }
    }

}
