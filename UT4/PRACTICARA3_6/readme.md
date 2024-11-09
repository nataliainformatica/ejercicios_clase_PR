
_________________________________________________________________________________

RA3. Escribe y depura código, analizando y utilizando las estructuras de control del lenguaje.
RA6. Escribe programas que manipulen información seleccionando y utilizando tipos avanzados de datos.
_________________________________________________________________________________
Tienes que hacer una aplicación de adivinar palabras relacionadas  con el tema: Naturaleza. 
El juego tiene 3 rondas  y en cada ronda  el jugador tiene 5 intentos.  
En los 5 intentos, si adivina 2 palabras, gana la ronda.  
Cada palabra adivinada vale 5 puntos.  La puntuación  de aciertos se guarda por ronda. 
Antes de finalizar el juego se muestran las puntuaciones obtenidas en cada ronda. 
El juego de palabras  se facilita en la librería Palabras en la clase JuegoPalabras.  Encontrarás una función que devuelve un array con 50 palabras. 
IMPORTANTE: Si no sabes utilizar el array que se facilita, puedes hacer que todos los intentos utilicen la misma palabra:  “error”. 
Al arrancar la aplicación,  se muestra  información sobre rondas e intentos: 
ESTE JUEGO TIENE 3 RONDAS – EN CADA RONDA 5 INTENTOS
Comienza el juego 

RONDA 1
INTENTO 1
INTRODUCE UNA PALABRA

Si el jugador no adivina la palabra (**), se le informa y continúa con el siguiente intento, si no ha alcanzado el máximo de intentos: 
NO HAS ACERTADO LA PALABRA
INTENTO 2
INTRODUCE UNA PALABRA
Si el jugador adivina la palabra,  
Si el número de palabras acertadas es 2 gana la ronda, se informa al usuario : 
HAS ACERTADO LA PALABRA
ESTA RONDA SE HA ACABADO 
 y continúa el juego.
 	Si aún no ha acertado 2 palabras continúa la petición:
HAS ACERTADO LA PALABRA
INTENTO 3 
INTRODUCE UNA PALABRA
Si el jugador ha alcanzado el máximo de intentos (5), se informa al usuario y termina la ronda 
Al finalizar las tres rondas, se informará al usuario: 
FINALIZADO EL JUEGO
LAS PUNTUACIONES DE LAS RONDAS HAN SIDO
RONDA 1: xx
RONDA 2: xx
RONDA 3: xx
Las puntuaciones se mostrarán utilizando una función. 
   Public static void mostrarPuntuaciones(int[] puntuaciones) {…}


** Para saber si el jugador ha acertado con la palabra, deberás implementar la función: 
   public static boolean buscarPalabra(String palabra, String[] palabras) {..}

que comprobará si la palabra que recibe como parámetro forma parte del array  “palabras” 

Función extra: 
Implementa la función:  public static String esconderCaracteres(String palabra) {
Utilizando la función anterior, añade una ayuda al usuario, de forma que la aplicación muestre  en cada uno de los intentos una de las palabras de la colección,  la palabra tendrá  2 caracteres ocultos (el segundo y el cuarto). 
RONDA 1
INTENTO 1
INTRODUCE UNA PALABRA
AYUDA PARA RESOLVER LA PALABRA ar*m*
 

![image](https://github.com/user-attachments/assets/ddbf6658-415a-4742-8c07-30ef26f29763)



