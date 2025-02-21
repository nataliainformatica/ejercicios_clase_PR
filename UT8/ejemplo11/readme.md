class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public int compareTo(Persona otra) {
        // Primero ordenamos por edad
        int comparacionEdad = Integer.compare(this.edad, otra.edad);
        if (comparacionEdad != 0) {
            return comparacionEdad;
        }
        // Si las edades son iguales, ordenamos por nombre alfabéticamente
        return this.nombre.compareTo(otra.nombre);
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }

    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Carlos", 30));
        personas.add(new Persona("Ana", 25));
        personas.add(new Persona("Beatriz", 25));
        personas.add(new Persona("David", 35));

        Collections.sort(personas); 
        // Ordena según el criterio de orden natural

        for (Persona p : personas) {
            System.out.println(p);
        }
    }
}
