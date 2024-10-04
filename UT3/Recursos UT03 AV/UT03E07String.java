package ut03e07string;

// La clase String es la herramienta que empleamos en Java para trabajar
// con cadenas de texto, esto se debe a que no existe un tipo de dato 
// nativo para cadena de texto en el lenguaje Java.

// Cuando queremos almacenar texto en una variable podemos declarar una 
// instancia de este objeto (más adelante en el curso se habla en profundidad 
// de los objetos, es normal que no entiendas qué es un objeto o una 
// instancia aun) y trabajar con ella con normalidad como lo hacíamos 
// con el resto de variables de otros tipos, como int, double, boolean, etc.

// Una de las características más interesantes de las clases son los 
// métodos. Estos son funcionalidades que podemos usar con ello, que 
// están ya codificadas. En este ejemplo nos vamos a centrar en ver 
// algunos de los métodos más interesantes de la clase String, esta clase 
// tiene más de 50 métodos, pero no tendrás que memorizarlos, simplemente 
// entender cómo se usan algunos de los más comunes y saber cómo puedes 
// consultar la información del resto, para cuando los necesites en el futuro.

// String es una clase que se encuentra en java.lang.String y la empleamos 
// para almacenar una secuencia de caracteres.

public class UT03E07String {

    public static void main(String[] args) {
        // Inicializando cadenas
        System.out.println("-----Inicializando cadenas-----");
        String cadena1 = "Hola1";
        String cadena2 = new String("Hola2");
        String cadena3 = new String(cadena2);
        
        System.out.println(cadena1);
        System.out.println(cadena2);
        System.out.println(cadena3);
        
        // Usando secuencias de escape
        System.out.println("-----Usando secuencias de escape-----");
        String cadena4 = "Tabulador \t y \nnuevas \nlineas.";
        System.out.println(cadena4);
        
        // Referenciando cada letra dentro de una cadena
        System.out.println("-----Referenciando cada letra dentro de la cadena-----");
        String cadena5 = "Hola";
        System.out.println(cadena5.charAt(0) + " está en la posición 0");
        System.out.println(cadena5.charAt(1) + " está en la posición 1");
        System.out.println(cadena5.charAt(2) + " está en la posición 2");
        System.out.println(cadena5.charAt(3) + " está en la posición 3");
        
        // Conociendo el tamaño de una cadena
        System.out.println("-----Midiendo el tamó de una cadena-----");
        String cadena6 = "En un lugar de la Mancha de...";
        int tamanoCadena = cadena6.length();
        System.out.println(cadena6);
        System.out.println("Mi cadena tiene un tamaño de: " + tamanoCadena);
        
        // Cambiando mayúsculas y minúsculas
        System.out.println("-----Mayúsculas y minúsculas-----");
        String cadena7 = "HoLa AmIgO";
        System.out.println(cadena7);
        System.out.println(cadena7.toLowerCase());
        System.out.println(cadena7.toUpperCase());
        
        // Reemplazando
        System.out.println("-----Reemplazando caractertes o palabras-----");
        // Ten cuidado! existen dos métodos iguales, para caracter y para subcadenas
        String cadena8 = ":)";
        System.out.println(cadena8);
        System.out.println(cadena8.replace(')', '('));
        String cadena9 = "¿Hola Juan, qué tal estás?";
        System.out.println(cadena9);
        System.out.println(cadena9.replace("Juan", "María"));
        
        // Buscando dentro de nuestras cadenas
        System.out.println("-----Buscando dentro de nuestras cadenas-----");
        String cadena10 = "El martes entregaremos la práctica.";
        int palabraEncontrada = cadena10.indexOf("martes");
        System.out.println(cadena10);
        System.out.println("Palabra encontrada en: " + palabraEncontrada);
            // ¡OJO! Este método tiene 4 variantes, explóralas
            
        // Reemplazando dentro de nuestras cadenas
        System.out.println("-----Reemplazando dentro de nuestras cadenas-----");
        // El martes me parece pronto...
        System.out.println(cadena10.replace("martes", "viernes"));
            // Explora las variantes
            // Puedes usar el método replaceFirst si no quieres reemplazar 
            // todas las ocurrencias, solo la primera
            
        // Comparando cadenas
        System.out.println("-----Comparando cadenas-----");
        // ¡RECUERDA! Las cadenas no se pueden comparar con el operador de
        // comparación ==,  este está reselvado a los tipos de datos nativos
        // del lenguaje, para comparar cadenas debemos usar otras formas.
        String cadena11 = "hola";
        String cadena12 = "Hola";
        // equals devuelve true o false, lo usamos en condiciones
        // de if o como condiciones de salida para búcles habitualmente
        if(cadena11.equals(cadena12)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }
        cadena11 = "abc";
        cadena12 = "abc";
        String cadena13 = "def";
        // Con compare to tenemos un 0 si son iguales
        int compararCon = cadena11.compareTo(cadena12);
        System.out.println("abc compareTo abc resulta: " + compararCon);
        compararCon = cadena11.compareTo(cadena13);
        System.out.println("abc compareTo def resulta: " + compararCon);
        compararCon = cadena13.compareTo(cadena11);
        System.out.println("def compareTo abc resulta: " + compararCon);
            // Si son iguales retorna 0
            // Si son diferentes retorna la distancia a la cadena alfabéticamente
        // El método compareToIgnoreCase hace lo mismo pero sin ser sensible
        // a mayúsculas y minúsculas
        cadena11 = "abc";
        cadena12 = "ABC";
        compararCon = cadena11.compareTo(cadena12);
        System.out.println("abc compareTo ABC resulta: " + compararCon);
        compararCon = cadena11.compareToIgnoreCase(cadena12);
        System.out.println("abc compareToIgnoreCase ABC resulta: " + compararCon);
        
        // Formateo de cadenas
        System.out.println("-----Formateo de cadenas-----");
        int edad = 20;
        System.out.println("Hola tengo " + edad + " años.");
        System.out.println(String.format("Hola tengo %s años.", edad));
        
    }
    
}

// Ejercicio 1.
// Realiza un programa que pida por pantalla una contraseña y diga al 
// usuario si la contraseña introducida está en un rango correcto de 
// caracteres (de 5 a 8).

// Ejercicio 2.
// Realiza un programa que ordene alfabéticamente el nombre de tres 
// alumnos, que están en tres variables String.

// Ejercicio 3.
// Crea un programa que permita ver pasar un # por un campo de puntos. 
// El # debe avanzar un paso cada 100 milisegundos.
// Ejemplo de algunos pasos de la ejecución:
// “.................................”
// “#................................”
// “.........#.......................”
// “.....................#...........”
// “................................#”
// “.................................”

// Ejercicio 4.
// Crea un programa que inserte el nombre, primer apellido, segundo 
// apellido y edad de una persona, usando el formateo de cadena. El 
// nombre y los apellidos deben estar en variables String separadas 
// y la edad en una variable int.
// Ejemplo de ejecución:
// “Pepito Rodríguez García tiene 25 años.”

// Ejercicio 5.
// Crea un programa que limpie los espacios en blanco sobrantes de una 
// frase. Este debe eliminar los espacios en blanco al principio, los 
// espacios en blanco al final y todos los espacios en blanco juntos.
// Ejemplo:
// Cadena inicial:   “   Esta    es  mi frase     favorita     .   “
// Cadena resultado: “Esta es mi frase favorita.”

// Ejercicio 6.
// Explora los métodos de String y utiliza alguno que no hayamos 
// explicado en clase.

// Ejercicio 7.
// Existen otras clases que son similares a String, entre ellas clases 
// “espejo” de los tipos de datos nativos del lenguaje que ya conoces. 
// Explora los métodos de las clases Character e Integer. Dedica el tiempo 
// que consideres necesario a estos dos últimos ejercicios, son esenciales 
// para entender cómo funcionan las clases y cómo emplear esa funcionalidad.
