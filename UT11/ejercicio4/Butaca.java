package ejercicio4;

public class Butaca {
    private int asiento, fila;
    private boolean ocupado; 

    public Butaca(int f, int a) {
        asiento = a;
        fila = f;
        ocupado = false; 
    }

    /**
     * Sobrecarga de constructor
     * Permite pasar el asiento en formato String fila:asiento
     * @param s
     */
    public Butaca(String s) {
        String[] b = s.split(":");
        fila = Integer.parseInt(b[0]);
        asiento = Integer.parseInt(b[1]);
        ocupado = false; 
    }

    // getter y setters
    public int getAsiento() {
        return asiento;
    }
W
    public int getFila() {
        return fila;
    }

    public String toString() {
        return fila + ":" + asiento;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + asiento;
        result = prime * result + fila;
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
        Butaca other = (Butaca) obj;
        if (asiento != other.asiento)
            return false;
        if (fila != other.fila)
            return false;
        return true;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    

    
}