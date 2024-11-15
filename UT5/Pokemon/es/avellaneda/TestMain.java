package es.avellaneda;
/**
 * Charmander (tipo Fuego, nivel 5, 100 puntos de vida) 
 * Squirtle (tipo Agua, * nivel 7, 120 puntos de vida) 
 * Bulbasaur (tipo Planta, nivel 6, 110 puntos de
 * vida)
 * 
 * Prueba los métodos de la clase con cada Pokémon:
 * 
 * Entrena a uno de los Pokémon varias veces y muestra su estado después de cada
 * entrenamiento.
 * 
 * Haz que cada Pokémon ataque y muestra el mensaje correspondiente.
 */
public class TestMain {
    public static void main(String[] args) {
        Pokemon charmander = new Pokemon("Charmander",
        "Fuego", 5, 100);
        Pokemon squirtle = new Pokemon("Squirtle",
        "Agua", 7, 120);
        Pokemon bulbasaur = new Pokemon("Bulbasaur",
        "Planta", 6, 110);
      
        charmander.mostrarEstado();
        charmander.entrenar();
        charmander.entrenar();
        charmander.mostrarEstado();
        charmander.atacar();


    }

}
