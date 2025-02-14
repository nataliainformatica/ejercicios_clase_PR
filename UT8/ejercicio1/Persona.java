package ejercicio1;

public class Persona implements Registrable{

    private String DNI;
    private String nombre;

    public Persona(String DNI, String nombre) {
        this.nombre = nombre;
        this.DNI = DNI;

    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String mostrarRegistro() {
        return "REG2_"+DNI; 
       
    }

    

}
