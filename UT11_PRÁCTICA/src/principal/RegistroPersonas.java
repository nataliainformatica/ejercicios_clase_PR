package principal;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

import excepciones.NoEncontradoException;
import model.Persona;
import model.ComparadorEntrada;
import model.Entrada;
import model.Salida;
import persistenciaFicheros.UtilidadesFicheros;


/*
Para los registros, se dispone de una colección HashMap, <Entrada,Salida>

No se permite registrar una nueva entrada si no ha registrado antes una salida.
No se permite la salida, si no hay una Entrada. 
Si se trata de registrar una salida, cuando no hay entrada, se lanzará una excepción controlada (checked), que capturará los datos de la persona y la fecha y hora. En el tratamiento de esta excepción, se guardarán los datos en el siguiente formato:

Fecha – hora – usuario: xxxx – “intento de salida sin registro de entrada”

ejemplo:

2025-04-02 – 18:00:00 – Juán Pérez – 8765334 –intento de salida sin registro de entrada

 */
public class RegistroPersonas {

    private HashMap<Entrada, Salida> registro;

    public RegistroPersonas() {
        // ejemplo para probar la clase registro

     
        try {
            registro = UtilidadesFicheros.leerRegistro();
        } catch (Exception e) {
           registro = new HashMap<>(); 
        }
   
    }

    public Entrada comprobarRegistroSalida(Persona persona){
        boolean permitido = true;
        for (Map.Entry<Entrada, Salida> entry : registro.entrySet()) {
            Entrada entrada = entry.getKey();
            Salida salida = entry.getValue();
            if (entrada.getPersona().getNumeroEmpleado().equalsIgnoreCase(persona.getNumeroEmpleado())) {
                // la entrada pertenece a la persona que queremos registrar
                if (salida == null) {
                    // existe un registro de entrada sin salida, esta es la Entrada que utilizaremos en el registro
                    return entrada;
                }
            }
        }

        throw new NoEncontradoException(persona.getNumeroEmpleado()); 

    }
    public boolean comprobarRegistroEntrada(Persona persona) {
        // No se permite registrar una nueva entrada si no ha registrado antes una
        // salida.
        // es necesario recorrer el HashMap buscando la clave = Entrada
        // para el usuario o persona
        boolean permitido = true;
        for (Map.Entry<Entrada, Salida> entry : registro.entrySet()) {
            Entrada entrada = entry.getKey();
            Salida salida = entry.getValue();
            if (entrada.getPersona().getNumeroEmpleado().equalsIgnoreCase(persona.getNumeroEmpleado())) {
                // la entrada pertenece a la persona que queremos registrar
                if (salida == null) {
                    // no se puede registrar la entrada, ni permitir el acceso
                    return false;
                }
            }
        }
        // termino la comprobacion y no encuentro ningún registro de entrada
        // que no tenga salida
        return permitido;

    }
    public void registrarSalida(Entrada entrada){
        Salida salida = new Salida(LocalDate.now(), LocalTime.now(), entrada.getPersona(), entrada.getFecha(), entrada.getHora());
        registro.put(entrada,salida);
        UtilidadesFicheros.escribirRegistro(registro);


    }

    public void registrarEntrada(Persona persona, String motivoEntrada) {
        registro.put(new Entrada(LocalDate.now(), LocalTime.now(),
                persona, motivoEntrada), null);
                UtilidadesFicheros.escribirRegistro(registro);
    }

    /*
     * Ver registros de Entrada ordenados por fecha y hora
     * 
     */
    public String mostrarRegistrosPersona(Persona persona) {
        // recorrer el hashMap para conseguir registros de la persona
        // Creo un Comparator para fecha y hora
        TreeSet<Entrada> registrosEntrada = new TreeSet(new ComparadorEntrada()); 
        
       
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Entrada, Salida> entry : registro.entrySet()) {
            Entrada entrada = entry.getKey();
            Salida salida = entry.getValue();
            if (entrada.getPersona().getNumeroEmpleado().equalsIgnoreCase(persona.getNumeroEmpleado())) {
                registrosEntrada.add(entrada); 
             
            }

            // registrosEntrada es un conjunto ordenado por el criterio del Comparator
        }
        for(Entrada e: registrosEntrada){
            sb.append(e);
            sb.append("\n");
        }


        return sb.toString();
    }

}
