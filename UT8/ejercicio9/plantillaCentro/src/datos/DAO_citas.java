/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import model.Analisis;
import model.Citable;
import model.ConsultaMedica;
import model.Paciente;

/**
 *
 * @author idesadadaw
 */
public class DAO_citas {

    private static ArrayList<Citable> citas;
   

    public static ArrayList<Citable> selectCitasHoy() {
        Paciente[] lista;
        if (citas == null) {
            lista = listaPacientes();
            citas = new ArrayList();
            //public ConsultaMedica(Paciente paciente, String sala, String motivoCita, LocalDate horaCita) {
            Citable c = (Citable) new ConsultaMedica(lista[0], "A1", LocalDateTime.of(2022, 10, 2, 8, 0));
            citas.add(c);
            c = (Citable) new ConsultaMedica(lista[1], "A1", LocalDateTime.of(2022, 10, 2, 10, 0));
            citas.add(c);
            c = (Citable) new ConsultaMedica(lista[2], "A1", LocalDateTime.of(2022, 10, 2, 9, 0));
            // public Analisis(String numHistorial, String tipo, LocalDate horaAnalisis) {
            c = (Citable) new Analisis("NH000001", "", LocalDateTime.of(2022, 10, 2, 9, 0));
            citas.add(c);
            c = (Citable) new Analisis("NH000002", "", LocalDateTime.of(2022, 10, 2, 8, 0));
            citas.add(c);
             c = (Citable) new ConsultaMedica(lista[0], "A3", LocalDateTime.of(2022, 10, 2, 9, 0));
            citas.add(c);
             c = (Citable) new ConsultaMedica(lista[0], "A4", LocalDateTime.of(2022, 10, 2, 11, 0));
            citas.add(c);
        }
        return citas;

    }

    private static Paciente[] listaPacientes() {
        Paciente[] lista = new Paciente[3];
        lista[0] = new Paciente("NH000001", "nombreapellidos1", 21);
        lista[1] = new Paciente("NH000002", "nombreapellidos2", 30);
        lista[2] = new Paciente("NH000003", "nombreapellidos3", 18);
        return lista;

    }

}
