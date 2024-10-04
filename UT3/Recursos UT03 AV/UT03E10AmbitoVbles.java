package ut03e10ambitovbles;

// Ahora que hemos comenzado a usar las funciones en Java, es importante 
// consolidar el concepto del ámbito o ciclo de vida de las variables, esto 
// es, entender donde nuestras variables declaradas pueden usarse y donde 
// no, donde nacen y donde mueren.

// En general podemos pensar que una variable nace y muere en el nivel de 
// paréntesis {} en el que ha sido creada y en todos los {} que tenga por 
// debajo.

// Entendiendo esto sabremos si una de nuestras variables es visible en 
// diferentes puntos del programa, en caso de serlo, podremos usarla, en 
// caso de no serlo, podremos declarar una variable con el mismo nombre 
// y usarla en ese ámbito nuevo sin que suponga un problema.

// Además veremos cómo declarar variables con un valor final (constantes), 
// que podremos usar en nuestros programas, aunque parezcan inútiles, estas 
// variables tienen muchas ventajas respecto al uso de sus valores 
// directamente en nuestro código.

public class UT03E10AmbitoVbles {

    static int variableFueraMain = 2;
    static final int variableFinal = 10;
    
    public static void main(String[] args) {
        
        // Ámbito de variables en {}
        System.out.println("-----Ámbitos de variables en diferentes {}-----");
        int i = 1;
        int v1 = 10;
        
        if (i==1) {
            //int v1 = 2; //esto da error!
            int w1 = 15;
            System.out.println("El valor de w1 en el bucle es: " + w1);
        }
        //System.out.println("El valor de w1 fuera del bucle es: " + w1); //esto da error!
        int w1 = 30;
        System.out.println("Mi nuevo w1: " + w1);
        
        while(i > 0) {
            //int v1 = 5; //esto da error!
            i++;
        }
        
        // Esta tambien da error
        //for(int v1 = 20; v1 < 18; v1--){} //esto da error!
        
        System.out.println("El valor de v1 es: " + v1);
        
        
        // Ámbito de las variables declaradas en for
        System.out.println("-----Ámbitos de variables declaradas en for-----");
        
        for(int v2 = 1; v2 < 5; v2++){
            // esta v2 nace y muere en este bucle
        }
        
        for(int v2 = 20; v2 < 25; v2++){
            // esta v2 nace y muere en este bucle
            // no interfiere con la anterior
        }
        
        int v2 = 100;
        System.out.println("El valor de v2 es: " + v2);
        
        // Ámbito de variables en funciones
        System.out.println("-----Ámbito de variables en funciones-----");
        int v3 = 5;
        funcionVariables();
        System.out.println("El valor de v3 en el main es: " + v3);
        
        // Variables que puedes usar dentro y fuera de las funciones
        System.out.println("-----Ámbito de variables fuera y dentro de funciones-----");
        System.out.println("Variable fuera del main llamada desde main: "+ variableFueraMain);
        variableFueraMain = 3;
        System.out.println("Variable fuera del main llamada desde main: "+ variableFueraMain);
        funcionVariables2();
        
        // Variables final
        System.out.println("-----Variables final-----");
        System.out.println("Variable final: " + variableFinal);
        //variablefinal = 11; // esto da error!
        
    }
    
    public static void funcionVariables(){
        int v3 = 10;
        System.out.println("El valor de v3 dentro de la función es: " + v3);               
    }
    
    public static void funcionVariables2(){
        System.out.println("Variable fuera del main llamada desde función: "+ variableFueraMain);
        variableFueraMain = 4;
        System.out.println("Variable fuera del main llamada desde función: "+ variableFueraMain);               
    }
    
}

// Venga, que vas bien! Vas muy bien! Hoy te dejo sin ejercicios.
// Puedes hacer los ejercicios que tengas pendiente de ejemplos anteriores o
// trabajar en la práctica entregable durante la clase.
