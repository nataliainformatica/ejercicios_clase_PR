package es.avellaneda;
/**
 * nombre (tipo String): el nombre del Pokémon.
 * 
 * tipo (tipo String): el tipo de Pokémon (por ejemplo, "Fuego", "Agua",
 * "Planta").
 * 
 * nivel (tipo int): el nivel actual del Pokémon.
 * 
 * puntosVida (tipo int): los puntos de vida del Pokémon.
 */

public class Pokemon {

    private String nombre;
    private String tipo;
    private int nivel;
    private int puntosVida;

    // CONSTRUCTOR
    // nos piden poder crear objetos con los siguientes
    // valores iniciales
    // ejemplo: Charmander (tipo Fuego, nivel 5, 100 puntos de vida)

     private String[] tipos; 
     private String[]  ataques;
 
    public Pokemon(String nombre, String tipo, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.tipos =  new String[3];
        this.tipos[0]="Fuego";
        this.tipos[1]="Agua";
        this.tipos[2]="Planta" ;
        this.ataques =  new String[3];
        this.tipos[0]="LLAMARADA";
        this.tipos[1]="HIDROBOMBA";
        this.tipos[2]="LÁTIGO CEPA" ;
    }

    

    /**
     * Muestra un mensaje indicando que el Pokémon ha usado su ataque
     * característico. El ataque se puede determinar en base al tipo (por ejemplo,
     * "Llamarada" si es de tipo "Fuego").
     * 
     * tipo es Fuego: ataque característico: "LLAMARADA"
     * tipo es Agua: ataque característico: "HIDROBOMBA"
     * tipo es Planta: atatque característico: "LÁTIGO CEPA"
     * 
     */
    public void atacar() {
        /*
        int tipoNumero; 
 
        for(int i=0; i< ataques.length; i++){
            if(tipo.equals(tipos[i])){
                System.out.println("el Pokémon ha usado su ataque característico "
                        + ataques[i]); 
            }
        }*/
        switch (tipo) {
            case "Fuego":

                // TODO modificar para usar variables dependiendo del tipo
                System.out.println("el Pokémon ha usado su ataque característico "
                        + "LLAMARADA");

                System.out.println("el Pokémon ha usado su ataque característico "
                        + "LLAMARADA");        
                break;
            case "Agua":
                System.out.println("el Pokémon ha usado su ataque característico "
                        + "HIDROBOMBA");

                break;
            case "Planta":
                System.out.println("el Pokémon ha usado su ataque característico "
                        + "LÁTIGO CEPA");
                break;

            default:
            System.out.println("EL POKÉMON NO ESTÁ CATALOGADO");
                break;
        }

    }
    // Muestra en consola el nombre, tipo, nivel y puntos de vida del Pokémon. 
    public void mostrarEstado() {
        System.out.println("POKEMON:  " + this.nombre +
        " TIPO: " + this.tipo +  "NIVEL " +  nivel + " PUNTOS DE VIDA "+ puntosVida);
    }


    

    @Override
    public String toString() {
        return "Pokemon [nombre=" + nombre + ", tipo=" + tipo + ", nivel=" + nivel + ", puntosVida=" + puntosVida + "]";
    }

    // entrenar(): Incrementa el nivel del Pokémon en 1
    // y aumenta sus puntos de vida en 10.
    public void entrenar() {

        this.puntosVida++;

    }

    // GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

}
