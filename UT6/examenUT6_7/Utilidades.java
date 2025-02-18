import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

import javax.imageio.spi.RegisterableService;

import java.time.DayOfWeek;


public class Utilidades implements Registrable {

    public static int contarDiasLaborables(int year, int month) {
        YearMonth yearMonth = YearMonth.of(year, month);
        int diasLaborables = 0;

        for (int day = 1; day <= yearMonth.lengthOfMonth(); day++) {
            LocalDate fecha = yearMonth.atDay(day);
            DayOfWeek diaSemana = fecha.getDayOfWeek();

            if (diaSemana != DayOfWeek.SATURDAY && diaSemana != DayOfWeek.SUNDAY) {
                diasLaborables++;
            }
        }

        return diasLaborables;
    }

    
     public static  int calcularEdad(LocalDate fechaNacimiento) {
        return (int) ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now());
    }

}
