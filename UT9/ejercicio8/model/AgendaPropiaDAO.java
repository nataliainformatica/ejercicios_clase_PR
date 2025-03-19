package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;

public class AgendaPropiaDAO  {

    public HashSet<Cita> cargarCitas() {
        HashSet<Cita> citas = new HashSet<>();
        citas.add(new Cita(LocalDate.of(2025, 3, 17), LocalTime.of(9, 0), "Clase de inglés", "Educación"));
        citas.add(new Cita(LocalDate.of(2025, 3, 18), LocalTime.of(11, 0), "Gimnasio", "Salud"));
        return citas;
    }
}