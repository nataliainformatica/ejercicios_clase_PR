package es.avellaneda.EjercicioA1;

/**
 * Crea un programa con una clase llamada Punto que representará un punto de dos
 * dimensiones en un plano. Solo contendrá dos atributos enteros llamadas x e y
 * (coordenadas).
 */


 //MÉTODOS DE COMPORTAMIENTO
 //  INCREMENTAR COORDENADAS X E Y en una unidad
 //  public void incrementarUnidadXY(){...}

 // MODIFICAR LAS DOS COORDENADAS
 // public void modificarCoordenadasXY(int X, int Y){....}

 // RESETEAR COORDENADAS - PONER A CERO X E Y
 // public void resetearCoordenadasXY(){...}



 // 
public class Punto {

private int coordenadaX; 
private int coordenadaY; 

// CONSTRUCTOR
public Punto(int coordenadaX, int coordenadaY){
    this.coordenadaX = coordenadaX;
    this.coordenadaY = coordenadaY;
}


public void incrementarUnidadXY(){
   this.coordenadaX++;
   this.coordenadaY++;

}

public int getCoordenadaX() {
    return coordenadaX;
}

public void setCoordenadaX(int coordenadaX) {
    this.coordenadaX = coordenadaX;
}

public int getCoordenadaY() {
    return coordenadaY;
}

public void setCoordenadaY(int coordenadaY) {
    this.coordenadaY = coordenadaY;
}

// GETTERS Y SETTERS



}
