package ut03e04whiledowhile;

// En este ejemplo aprenderemos a usar la intrucción iterativa (while).
// Esta instrucción nos permite ejecutar un grupo de instrucciones, 
// de forma repetida, mientras una condición lógica (true/false) tenga 
// el valor true.
//
// Por ejemplo, queremos hacer una llamada telefónica para pedir una 
// cita médica. La condición que nos interesa cumplir es la de ser 
// atendidos. Si no nos atienden por teléfono volveremos a llamar 
// hasta que lo consigamos. Así, repetiremos la llamada tantas veces 
// como sea necesario hasta que finalmente consigamos la cita, en ese 
// momento dejaremos de hacer llamadas al centro de salud.
//
// El bucle do…while es muy similar, pero tiene una estructura 
// ligeramente distinta. Este bucle, nos asegura que, al menos, su 
// contenido se ejecutará una vez, independientemente del valor de 
// la condición lógica, para el resto de iteraciones se evaluará la 
// condición del mismo modo que en un bucle while.
public class UT03E04WhileDoWhile {

    public static void main(String[] args) {
        
        // Ejemplo básico de bucle while
        System.out.println("-----Ejemplo básico de while---");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        
        // Otro ejemplo de while
        i = 0;
        System.out.println("-----Ejemplo flag-----");
        boolean flag = true;
        while(flag) {
            if (i > 3) {
                flag = false;
            } else {
                System.out.println("i no es mayor de 3, debemos esperar. " + i);
                i++;
            }
        }
        
        // Ejemplo básico de do while
        System.out.println("-----Ejemplo básico de do...while-----");
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while(i < 5);
        
        // Otro ejemplo de do...while
        System.out.println("----Llamando al médico con do...while-----");
        boolean tengoCita = false;
        do {
            System.out.println("Llamando...");
            System.out.println("Me han dado cita!");
            tengoCita = true;
        } while (!tengoCita);
        
        
        // Debemos tener cuidado con los bucles while, si hacemos mal
        // la condición de salida nos podemos quedar en un bucle infinito

    }
    
}


// Ejercicio 1.
// Rediseña el programa de escribir un menú y que el usuario seleccione 
// una opción, para que si el usuario introduce un valor que no existe 
// en el menú lo pueda intentar de nuevo.

// Ejercicio 2.
// Escribe un programa que imprima por pantalla un tablero de ajedrez 
// con los caracteres X y 0, el usuario debe introducir por el teclado 
// el tamaño del tablero. Ejemplo para tamaño 5:
// x0x0x
// 0x0x0
// x0x0x
// 0x0x0
// x0x0x

// Ejercicio 3. 
// Si uso un bucle puedo crear una secuencia de números:
// 1 2 3 4 5
// Si uso un bucle dentro de otro puedo crear una tabla:
// 11 12 13 14 15
// 21 22 23 24 25
// 31 32 33 34 35
// 41 42 43 44 45
// 51 52 53 54 55
// Realiza el programa que genere esta tabla.

// Ejercicio 4.
// ¿Tienes el programa del ejercicio exterior? Era sencillo, ¿eh?
// ¿Qué pasa si tengo un bucle dentro de un bucle dentro de un bucle?
// Tendríamos un cubo en lugar de un cuadrado.
// Modifica el programa del ejercicio anterior para que genere un 
// cubo de números. ¿Cómo te las apañaras para sacarlo por pantalla?

// Ejercicio 5.
// Realiza un programa que vaya pidiendo números hasta que se introduzca 
// un número negativo y nos diga cuántos números se han introducido, 
// la media de los impares y el mayor de los pares. El número negativo 
// sólo se utiliza para indicar el final de la introducción de datos 
// pero no se incluye en el cómputo.
