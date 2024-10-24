package ut03e05breakcontinue;

// En la sentencia condicional switch empleabamos la instrucción break 
// para salir del switch en el momento en el que ejecutabamos las líneas 
// de codigo de cada caso. Esta instrucción la podemos emplear en los 
// tres tipos de bucles (for, while y do while) para salir fuera del 
// bucle. Su uso no es muy recomendable, ya que genera código propenso 
// a errores y difícil de leer.
//
// La sentencia continue, la podemos emplear para volver al inicio del 
// bloque del bucle, sin necesidad de terminar de ejecutar la totalidad 
// del bloque para dicha iteración.
//
// Ten en cuenta: break sale de la iteración actual y de la totalidad del 
// bucle, continue sale de la iteración actual del bucle, pero continua 
// con la siguiente.
//
// Estas dos sentencias no se usan habitualmente en los bucles, ya que 
// reducen la legibilidad del código y se desaconseja en diferentes guías 
// de estilo frecuentes, pero es útil que conozcas su funcionalidad.

public class UT03E05BreakContinue {

    public static void main(String[] args) {
        // Ejemplo básico de break en un bucle while
        System.out.println("-----Ejemplo básico de break en while-----");
        int i = 0;
        while(i < 5) {
            System.out.println("El valor de i es: " + i);
            break;
        }
        
        // Ejemplo básico de break en un bucle for
        System.out.println("-----Ejemplo básico de break en for-----");
        for(i = 0; i < 5; i++) {
            System.out.println("El valor de i es: " + i);
            break;
        }
        
        // Saliendo de un bucle infinito
        System.out.println("----Ejemplo saliendo de un bucle infinito-----");
        while(true) {
            System.out.println("Oh! No! Estamos encerrados!");
            break;
        }
        
        // Ejemplo básico de continue
        System.out.println("-----Ejemplo continue-----");
        i = 0;
        while(i < 10) {
            i++;
            if (i == 5) {
                System.out.println("No me vas a pillar con es rima!");
                continue;
            }
            System.out.println("El valor de i es: " + i);
        }
    }
    
}


//Ejercicio 1.
//Crear un algoritmo que cuente y muestre por pantalla el nº de dígitos 
//de un nº introducido por pantalla, pero solamente hasta llegar a 5 dígitos, 
//en caso de que tenga más dejaremos de contarlos

//Ejercicio 2.
//Rediseña el ejercicio del coste del parquímetro pero recorriendo todos los 
//minutos que ha estado y sumando el precio de cada minuto. Emplea un tipo 
//de bucle diferente para cada franja de precios y usa las instrucciones 
//break y continue para saltar bucles o iteraciones.