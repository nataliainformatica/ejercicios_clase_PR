package ut9.ejercicio2.modelo;

/*
 * 
Se ordenará por criterio natural por el atributo de nombre.
Es posible crear un Producto con el nombre, de forma que las medidas 
por defecto son las mínimas expresadas a continuación.
Los datos del paquete no podrán ser modificados una vez creados.
Todos los productos están empaquetados en cajas con medidas que no superan los siguientes límites:
Alto: desde 2 cm hasta 30 cm 

Ancho: desde 2 cm hasta 10 cm 

Largo: desde 2 cm hasta 10 cm 
 */
public class Producto implements Comparable<Producto> {

    private double alto, ancho, largo;
    private String nombre;
    private final double MAXLARGO =10,  MAXANCHO=10,  MAXALTO=30; 

    public Producto(String nombre) {
        this.nombre = nombre;
        // inicializamos alto, ancho y largo a los valores por defecto
        this.ancho = 2;
        this.largo = 2;
        this.alto = 2;
    }

    public Producto(double alto, double ancho, double largo, String nombre) {
        this.ancho = ancho;
        this.largo = largo;
        //this.alto = alto;
        // alto desde 2 cm hasta 30 cm
        if (alto < 2) {
            this.alto = 2;
        }
        else if (alto > 30) {
            this.alto = 30;
        }else
            this.alto = alto;

        // Ancho: desde 2 cm hasta 10 cm 
        if (ancho < 2) {
            this.ancho = 2;
        }
        else if (ancho > 10) {
            this.ancho = 10;
        }
      // Largo: desde 2 cm hasta 10 cm  
      if (largo < 2) {
        this.largo = 2;
    }
    else if (largo > MAXLARGO) {
        this.largo = MAXLARGO;
    }
        this.nombre = nombre;

    }

    @Override
    public int compareTo(Producto productoOtro) {
        return nombre.compareTo(productoOtro.getNombre());
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
        Producto other = (Producto) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Producto [alto=" + alto + ", ancho=" + ancho + ", largo=" + largo + ", nombre=" + nombre + "]";
    }

   

    

}
