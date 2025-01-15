public class DAOtareas{

// Método estático para obtener un array de 10 tareas
    public static Tarea[] getTareas() {
        Tarea[] tareas = new Tarea[10];
        for (int i = 0; i < 10; i++) {
            tareas[i] = new Tarea(
                "Tarea " + (i + 1),
                Categoria.values()[i % Categoria.values().length],
                Estado.values()[i % Estado.values().length],
                LocalDate.now().plusDays(i),
                LocalTime.of(9 + i, 0)
            );
        }
        return tareas;
    }
  
}
