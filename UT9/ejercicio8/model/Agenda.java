package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class Agenda {
    private TreeSet<Cita> citas;

    public Agenda() {
        this.citas = new TreeSet<>();
    }

    public void agregarCitas(Collection<Cita> nuevasCitas) {
        citas.addAll(nuevasCitas);
    }

    public void mostrarCitas() {
        for (Cita cita : citas) {
            System.out.println(cita);
        }
    }

    public TreeSet<Cita> devolverCitas(){
        return citas; 
    }
    public ArrayList<Cita> obtenerCitasPorCategoria(String categoria) {
        ArrayList<Cita> resultado = new ArrayList<>();
        for (Cita cita : citas) {
            if (cita.getCategoria().equalsIgnoreCase(categoria)) {
                resultado.add(cita);
            }
        }
        return resultado;
    }
}