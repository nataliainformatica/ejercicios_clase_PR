import java.io.*;
import java.nio.file.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import javax.swing.JFileChooser;

/**
 * CABECERA DEL FICHERO CSV
 * 
 * Dia;Dia_semana;laborable / festivo / domingo festivo;Tipo de
 * Festivo;Festividad
 * 
 * Dia_semana = [lunes,martes,miércoles,jueves,viernes,sábado,domingo]
 * laborable =[laborable,festivo, sábado, domingo, domingo_festivo]
 * Tipo de Festivo =[Festivo nacional, Festivo de la Comunidad]
 * Festividad =*
 */
/* Clase base Dia*/
/* No es posible hacer herencia de LocalDate, ya que es final
 * Por eso usaremos fecha como atributo LocalDate
 */


class Dia {
    protected LocalDate fecha;
    protected String diaSemana;

    public Dia(LocalDate fecha, String diaSemana) {
        this.fecha = fecha;
        this.diaSemana = diaSemana;
    }

    @Override
    public String toString() {
        return fecha + " (" + diaSemana + ")";
    }
}

// Subclases para los distintos tipos de días
class DiaLaborable extends Dia {
    public DiaLaborable(LocalDate fecha, String diaSemana) {
        super(fecha, diaSemana);
    }
}

class DiaFestivo extends Dia {
    private String tipoFestivo;
    private String festividad;

    public DiaFestivo(LocalDate fecha, String diaSemana, String tipoFestivo, String festividad) {
        super(fecha, diaSemana);
        this.tipoFestivo = tipoFestivo;
        this.festividad = festividad;
    }

    @Override
    public String toString() {
        return super.toString() + " - Festivo: " + tipoFestivo + " - " + festividad;
    }
}

class DiaSabado extends Dia {
    public DiaSabado(LocalDate fecha, String diaSemana) {
        super(fecha, diaSemana);
    }
}

class DiaDomingo extends Dia {
    public DiaDomingo(LocalDate fecha, String diaSemana) {
        super(fecha, diaSemana);
    }
}

public class Calendario {
    private List<Dia> dias;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Calendario() {
        dias = new ArrayList<>();
    }

    public void cargarDesdeCSV(File archivo) {
        /*
         * El uso de Files.newBufferedReader() (de java.nio.file.Files) en comparación
         * con BufferedReader de java.io no tiene diferencias significativas en
         * rendimiento, ya que internamente Files.newBufferedReader() crea un
         * BufferedReader usando un InputStreamReader.
         */
        try (BufferedReader br = Files.newBufferedReader(archivo.toPath())) {
            String linea;
            br.readLine(); // Saltar la cabeceras
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
              

                    LocalDate fecha = LocalDate.parse(datos[0], formatter);
                    // si el año es !0 a 2025 no importamos la fecha
                    if(fecha.getYear() == 2025){

                        // si quisiéramos importar solamente los festivos
                        // podemos añadir el condicional if(datos.length >3)
                    String diaSemana = datos[1];
                    String tipo = datos.length > 2? datos[2] : "";
                   
                    String tipoFestivo = datos.length > 3 ? datos[3] : "";
                    String festividad = datos.length > 4 ? datos[4] : "";
                    
                    switch (tipo.toLowerCase()) {
                        case "laborable":
                            dias.add(new DiaLaborable(fecha, diaSemana));
                            break;
                        case "festivo":
                            dias.add(new DiaFestivo(fecha, diaSemana, tipoFestivo, festividad));
                            break;
                        case "sabado":
                            dias.add(new DiaSabado(fecha, diaSemana));
                            break;
                        case "domingo":
                            dias.add(new DiaDomingo(fecha, diaSemana));
                            break;
                        default:
                            dias.add(new Dia(fecha, diaSemana));
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public void mostrarCalendario() {
        for (Dia dia : dias) {
            System.out.println(dia);
        }
    }

    public static void main(String[] args) {

        Calendario calendario = new Calendario();

        JFileChooser fileChooser = new JFileChooser(System.getProperty("user.dir"));
        int seleccion = fileChooser.showOpenDialog(null); // Abre el diálogo de selección
        File f = null;
        if (seleccion == JFileChooser.APPROVE_OPTION) { // Si el usuario seleccionó un archivo
            f = fileChooser.getSelectedFile();
            System.out.println("Archivo seleccionado: " + f.getAbsolutePath());
            calendario.cargarDesdeCSV(f); // Ruta del archivo CSV
            calendario.mostrarCalendario();
        } else {
            System.out.println("Selección cancelada.");
        }

    }
}
