
public class ejemplo {
    public enum DiaSemana {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }

    public static void main(String[] args) {
        String input = "MARTES";

        try {
            DiaSemana dia = DiaSemana.valueOf(input);
            System.out.println("Día seleccionado: " + dia);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: El valor ingresado no es un día válido.");
        }
    }
}