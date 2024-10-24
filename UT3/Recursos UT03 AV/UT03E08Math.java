package ut03e08math;

// Desarrollando nuestros programas es habitual que nos surja la 
// necesidad de hacer cálculos matemáticos más avanzados que los 
// que nos ofrecen los operadores + - * / %. Muchas de estas necesidades, 
// tienen solución en la clase Math. Esta clase nos va a permitir hacer 
// operaciones como una raíz cuadrada, una función trigonométrica, un 
// logaritmos, buscar el máximo o el mínimo, redondeos, etc.

// Pero...¡Cuidado! A diferencia de la clase String, no vamos a emplear 
// variables del tipo Math, no usaremos la clase para invocar a sus 
// métodos y que estos nos resuelvan ciertos problemas, pero lo haremos 
// empleando y recibiendo las variables que ya conocemos. De esta forma: 
// resultado = Math.método(parámetro), donde Math es fijo, método es la 
// función que deseamos emplear y parámetro son los datos o variables que 
// nosotros facilitamos, y en resultado almacenaremos lo que esta función 
// nos devuelva en caso de que devuelva algo.

// La clase Math se encuentra en java.lang.Math.

// En este ejemplo nos familiarizaremos con algunos métodos útiles de la 
// clase Math y su forma de uso, entre ellos uno muy interesante que nos 
// permite generar números aleatorios.

public class UT03E08Math {

    public static void main(String[] args) {

        // Raíz cuadrada de un número
        System.out.println("-----Raíz cuadrada-----");
        double resultado = Math.sqrt(800);
        System.out.println("La raíz cuadrada de 800 es: " + resultado);
        
        // Valores almacenados en Math
        System.out.println("-----Valores de PI y E-----");
        resultado = Math.PI;
        System.out.println("El valor de PI es: " + resultado);
        resultado = Math.E;
        System.out.println("El valor de E es: " + resultado);
        
        // Trigonometría
        System.out.println("-----Trigonometría-----");
        resultado = Math.sin(60);
        System.out.println("El seno de 60 es: " + resultado);
        resultado = Math.cos(60);
        System.out.println("El coseno de 60 es: " + resultado);
        resultado = Math.tan(60);
        System.out.println("La tangente de 60 es: " + resultado);
        
        // Máximos y mínimos
        System.out.println("-----Máximos y mínimos-----");
        resultado = Math.max(10, 8);
        System.out.println("El mayor es: " + resultado);
        resultado = Math.min(10, 8);
        System.out.println("El mayor es: " + resultado);
        
        // Redondeos
        System.out.println("-----Redondeos-----");
        resultado = Math.ceil(3.7);
        System.out.println("Redondeo al alza de 3,7: " + resultado);
        resultado = Math.floor(3.7);
        System.out.println("Redondeo a la baja de 3,7: " + resultado);
        resultado = Math.round(3.7);
        System.out.println("Redondeo al natural más cercano de 3,7: " + resultado);
        
        // Potenciación
        System.out.println("-----Potenciación-----");
        resultado = Math.pow(5, 3);
        System.out.println("5 elevado a 3 es: "+ resultado);
        
        // Número absoluto
        System.out.println("-----Número absoluto-----");
        resultado = Math.abs(-14);
        System.out.println("El valor absoluto de -14 es: " + resultado);
        
        // Generación de números aleatorios
        System.out.println("-----Generación de números aleatorios-----");
        double numeroAleatorio = Math.random();
        System.out.println("Número aleatorio de 0 a 1: " + numeroAleatorio);
        // Siempre genera un número aleatorio entre 0 y 1
        for(int i = 0; i < 10; i++){
            System.out.println("Número aleatorio: " + Math.random());
        }
        // ¿Y si quiero otro rango diferente? ¡Matemáticas!
        // Los números que genera van de 0,000000... a 0,9999999...
        // Multipliucando y sumando desplazamientos podremos adaptarlos rangos
        System.out.println("Número del 1 al 10: " + Math.random()*10+1);
        // ¡Pero lo quiero sin decimales!
        System.out.println("Número del 1 al 10 in decimales: " + (int)(Math.random()*10+1));
        // Ahora del 80 al 100 (multiplicar y desplazar)
        System.out.println("Número del 80 al 100: " + (int)(Math.random()*21+80));
        // rango de min a max: (int)((Math.random() * (max - min + 1) + min)
    
    }
    
}

// Ejercicio 1.
// Crea un programa que calcule la nota entera (sin decimales) que irá al 
// boletín de calificaciones, la nota será calculada en base a las prácticas 
// y el exámen como un float de 0 a 10, con decimales. La nota final del 
// boletín irá de 1 a 10 y se calculará con redondeo natural, salvo 
// en la franja de 4.0 a 4.99 que será por truncamiento.

// Ejercicio 2.
// Crea un programa que calcule el perímetro y el área de un círculo a partir 
// del radio del mismo.

// Ejercicio 3.
// Crea un programa que resuelva el siguiente problema. Zubat, Golbat y Crobat 
// están en una cueva, formando un triángulo. Entre Zubat y Golbat hay 25 
// metros, entre Golbat y Crobat hay 12 metros, el ángulo formado en la 
// esquina de Crobat es de 20º. ¿Cuál es la distancia entre Zubat y Crobat?

// Ejercicio 4.
// Crea un programa que genere tiradas de un dado de seis caras. El usuario 
// puede lanzar tres dados al mismo tiempo.

// Ejercicio 5.
// Crea un programa que juegue con el usuario a piedra papel tijera.

