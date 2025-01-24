
public class EjemploHerencia {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 4);
        Moto moto = new Moto("Yamaha", "MT-07", 689);

        System.out.println("Información del coche:");
        coche.mostrarInformacion();
        System.out.println();
    }}
