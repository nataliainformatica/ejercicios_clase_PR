package ejercicioa2;

/**
 *
 * Crea un programa con una clase llamada Persona que representará los datos principales
 * de una persona: dni, nombre, apellidos y edad.

En el main de la clase principal instancia dos objetos de la clase Persona. 
* Luego, pide por teclado los datos de ambas personas (guárdalos en los objetos).
* Por último, imprime dos mensajes por pantalla (uno por objeto) 
* con un mensaje del estilo “Azucena Luján García con DNI … es / no es mayor de edad”.


 */
public class Persona {
    // dni, nombre, apellidos y edad.
    
    private String dni; 
    private String nombre;
    private String apellidos;
    private int edad;
    
    public Persona(){
         this.dni="";
        this.nombre="";
        this.apellidos = "";
        this.edad = 0;
    }
    public Persona(String dni, String nombre, String apellidos, int edad ){
        
        this.dni=dni;
        this.nombre=nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + '}';
    }

    
    
    
    
    
    
    
}
