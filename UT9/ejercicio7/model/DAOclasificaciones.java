package model;

import java.util.*;

public class DAOclasificaciones {
    private final Map<String, String> clasificaciones;

    public DAOclasificaciones() {
        clasificaciones = new HashMap<>();
        cargarClasificaciones();
    }

    private void cargarClasificaciones() {
        clasificaciones.put("000", "Obras generales");
        clasificaciones.put("100", "Filosofía y psicología");
        clasificaciones.put("200", "Religión");
        clasificaciones.put("300", "Ciencias sociales");
        clasificaciones.put("400", "Lenguas");
        clasificaciones.put("500", "Ciencia pura");
        clasificaciones.put("600", "Tecnología y ciencias aplicadas");
        clasificaciones.put("700", "Artes y recreación");
        clasificaciones.put("800", "Literatura");
        clasificaciones.put("900", "Historia y geografía");
        clasificaciones.put("005.133", "Lenguajes de programación");
        clasificaciones.put("823", "Literatura inglesa");
        clasificaciones.put("840","Literatura en francés");
        clasificaciones.put("860", "Literatura en español");
        clasificaciones.put("863", "Novela española");
        clasificaciones.put("891", "Literatura rusa");
    }

    public String getClasificacion(String codigo) {
        return clasificaciones.getOrDefault(codigo, "Código no encontrado");
    }

    public Map<String, String> getTodasLasClasificaciones() {
        return clasificaciones;
    }
}
