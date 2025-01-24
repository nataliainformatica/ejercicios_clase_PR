// Clase base Vehiculo
public class Vehiculo {
    private String marca;
    private String modelo;

    // Constructor
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Métodos para acceder a los atributos privados
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    protected String obtenerDescripcion() {
        return "Marca: " + marca + ", Modelo: " + modelo;
    }

    // Método que las subclases pueden sobrescribir
    public void mostrarInformacion() {
        System.out.println("Información del vehículo:");
        System.out.println(obtenerDescripcion());
    }
}

// Subclase Coche
class Coche extends Vehiculo {
    private int puertas;

    public Coche(String marca, String modelo, int puertas) {
        super(marca, modelo); // Llama al constructor de la superclase
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método de la superclase
        System.out.println("Número de puertas: " + puertas);
    }
}

// Subclase Moto
class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}


        System.out.println("Información de la moto:");
        moto.mostrarInformacion();
    }
}
