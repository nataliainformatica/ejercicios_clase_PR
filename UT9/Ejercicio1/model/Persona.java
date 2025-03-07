package ut9.Ejercicio1.model;

public abstract class Persona {

    private String nombreApellidos, DNI, telefono;

    public Persona(String nombreApellidos, String dNI, String telefono) {
        this.nombreApellidos = nombreApellidos;
        DNI = dNI;
        this.telefono = telefono;
    }


    public abstract String devuelveTipo();
    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (DNI == null) {
            if (other.DNI != null)
                return false;
        } else if (!DNI.equals(other.DNI))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Persona [nombreApellidos=" + nombreApellidos + ", DNI=" + DNI + ", telefono=" + telefono + "]";
    } 

    

}
