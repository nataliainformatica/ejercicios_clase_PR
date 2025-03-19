package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class CalendarioCompartidoDAO  {
   
    public ArrayList<Cita> cargarCitas() {
        ArrayList<Cita> citas = new ArrayList<>();
        citas.add(new Cita(LocalDate.of(2025, 3, 15), LocalTime.of(10, 0), "Reunión con equipo", "Trabajo"));
        citas.add(new Cita(LocalDate.of(2025, 3, 16), LocalTime.of(14, 0), "Cita médica", "Salud"));
        return citas;
    }
}
