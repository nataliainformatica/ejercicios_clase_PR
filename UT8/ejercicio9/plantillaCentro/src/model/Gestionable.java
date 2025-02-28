
package model;

import java.util.ArrayList;

public interface Gestionable {

    public ArrayList<ConsultaMedica> devolverListaConsultasMedico();

    public ArrayList<ConsultaMedica> devolverConsultasMedicoOrdenadas();

    public String mostrarDetallesConsultaMedica(String numHistorial);

    public String imprimirTicket(String numHistorial);

    public ArrayList<ConsultaMedica> buscarCitas(Paciente paciente);
    public Analisis buscarAnalisis(String numHistorial);

}
