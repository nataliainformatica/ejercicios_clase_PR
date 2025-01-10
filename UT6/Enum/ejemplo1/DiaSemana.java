// Definimos el Enum
public enum DiaSemana {
    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES,
    SABADO,
    DOMINGO
}

// Clase principal para trabajar con el Enum
public class HorarioSemanal {

    // Método que asigna actividades según el día de la semana
    public static String actividadDelDia(DiaSemana dia) {
        switch (dia) {
            case LUNES:
                return "Ir al gimnasio.";
            case MARTES:
                return "Clase de inglés.";
            case MIERCOLES:
                return "Reunión de trabajo.";
            case JUEVES:
                return "Comprar comida.";
            case VIERNES:
                return "Salir con amigos.";
            case SABADO:
                return "Día de descanso.";
            case DOMINGO:
                return "Planificar la semana.";
            default:
                return "Sin actividad.";
        }
    }

    // Método principal
    public static void main(String[] args) {
        // Usamos el Enum
        DiaSemana dia = DiaSemana.LUNES;

        System.out.println("Actividad para el " + dia + ": " + actividadDelDia(dia));

        // Iterar sobre todos los valores del Enum
        System.out.println("\nLista de actividades semanales:");
        for (DiaSemana d : DiaSemana.values()) {
            System.out.println(d + ": " + actividadDelDia(d));
        }
    }
}
