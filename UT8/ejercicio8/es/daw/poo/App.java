package ejercicio8.es.daw.poo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

import ejercicio8.es.daw.poo.excepciones.MesLargoException;

import java.time.Month;

public class App {

    public static void main(String[] args) {
        /*
         * DiaSemana dia = DiaSemana.valueOf(("MIERCOLES"));
         * int resultado = calcularNumero(dia, 2, 2025);
         * System.out.println(resultado);
         */
        DiaSemana dia;
        int resultado;
        try {
            dia = introducirDia();
            // SIGUIENTE CÓDIGO
            // CALCULAR DIAS
            resultado = calcularNumero(dia, 02, 2025);

        } catch (IllegalArgumentException ex) {
            System.out.println("NO VALE EL DIA");
        }

    }

    public static void pruebas() {
        // pruebas para conocer los métodos de LocalDate
        // y YearMonth
        DiaSemana dia = DiaSemana.valueOf("LUNES");
        DiaSemana diaIgual = DiaSemana.valueOf("LUNES");
        DiaSemana dia2 = DiaSemana.valueOf("MARTES");

        System.out.println("VALOR DEL ENUM: " + dia);

        LocalDate fecha = LocalDate.of(2025, 2, 19);
        System.out.println("Valor de la fecha actual " + fecha);
        YearMonth mes = YearMonth.of(2025, 2);

        System.out.println("Valor del mes " + mes);

        int diasMes = mes.lengthOfMonth();
        System.out.println("Cuenta del número de días que tiene el mes " + diasMes);

        DayOfWeek dayEnum = fecha.getDayOfWeek();
        System.out.println(" Valor de getDayOfWeeb que es un enum" + dayEnum);
        // éste método me devuelve un enum DayOfWeek

        // voy a ver sus valores
        System.out.println(" **** MOSTRAMOS TODOS LOS VALORES DEL ENUM");

        for (DayOfWeek d : DayOfWeek.values()) {
            System.out.println(d);
        }

        System.out.println(" DIA DEL MES  TRADUCIDO " + traducir(dayEnum));

        // comparar enumerados // COMPARACIÓN DE ENUMERADOS
        System.out.println(dia == diaIgual);
        System.out.println(dia == dia2);

        // LocalDate atDay(int dayOfMonth)
        // Combines this year-month with a day-of-month to create a LocalDate.

        LocalDate fechaActual = mes.atDay(19);
        System.out.println("fecha actual con el número de día " + fechaActual);

    }

    public static DiaSemana traducir(DayOfWeek dia) {
        int indice = dia.ordinal();

        // quiero devolver la instancia de DiaSemana del ordinal que he conseguido
        DiaSemana[] dias = DiaSemana.values();

        return dias[indice];

    }

    public static int calcularNumero(DiaSemana diaSemana, int mes, int anio) {

        YearMonth mesClase = YearMonth.of(anio, mes);
        int diasMes = mesClase.lengthOfMonth();
        int contadorDias = 0;

        // recorrer los días del mes

        for (int i = 1; i < diasMes; i++) {
            // comprobar si el día actual es igual a diaSemana
            DayOfWeek day = mesClase.atDay(i).getDayOfWeek();
            DiaSemana dia = traducir(day);
            System.out.println("DiaSemana actual " + dia);
            System.out.println("dia buscado = " + diaSemana);
            if (dia == diaSemana) {
                contadorDias++;
            }

        }

        //
        // SABIENDO LA LONGITUD QUE TIENE EL MES
        // RECORRERÉ CADA UNO DE SUS DÍAS
        // SI EL DÍA DEL ÍNDICE ES IGUAL AL
        // DiaSemana (utilizando el valor del enum )

        return contadorDias;
    }

    /**
     * Pide un día de la semana al usuario. Ésta funcionalidad deberás completarla
     * en un método aparte, en el caso de que el valor introducido no sea un valor
     * válido (LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES), el método propagará la
     * excepción.
     */

    public static DiaSemana introducirDia() throws IllegalArgumentException {

        Scanner sc = new Scanner(System.in);
        String dia;

        System.out.println("INTRODUCE UN DÍA DE LA SEMANA ");
        dia = sc.nextLine();

        DiaSemana diaSemana = DiaSemana.valueOf(dia.toUpperCase());

        // TODO CAMBIAR NULL
        return diaSemana;
    }
    /**
     * Completa una función que recibiendo el día de la semana, devolverá el número
     * de días que tiene el mes de la fecha actual. Si el mes tiene más de 4 días
     * del día de la semana facilitado (por ejemplo, abril tiene 5 martes), el
     * método creará una excepción MesLargoException, que capturará el mes y dia de
     * la semana, la lanzará y la propagará.
     * 
     * La excepción MesLargoException extiende de RunTimeException.
     */

     public static int calcularNumeroConExcepcion(DiaSemana diaSemana){
        // sacar el mes y dia de la fecha de hoy

        int mes, dia; 
        int numero ; 
        
        
        numero = calcularNumero(diaSemana, 0, 0);
        if(numero >4 ){
            throw new MesLargoException(mes, dia); 
        }




        return 0;


     }

}
