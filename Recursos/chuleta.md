## Estructura de una clase: 

package paquete; 
// imports
public class Clase{

     public static void main(String[] args) {
        // código que se ejecuta en la app
     }
}

## Estructuras repetitivas

//for( inicialización; condición;incremento){
  for(int i=0; i< 3; i++){
    // bloque de código
}


while(condicion){
    // bloque de código
}

do{
    // bloque de código
}while(condicion);

## Sintaxis de Scanner
Scanner lectorTeclado = new Scanner(System.in);

lectorTeclado.nextInt();

lectorTeclado.nextLine();

lectorTeclado.nextDouble();

## String - métodos para conocer

int length():  Retorna la longitud de la cadena.

boolean isEmpty(): Retorna true si la cadena está vacía (longitud cero), de lo contrario retorna false.

char charAt(int index): Devuelve el carácter en la posición especificada.

int indexOf(String str): Devuelve el índice de la primera aparición de una subcadena. Si no se encuentra, devuelve -1.

int lastIndexOf(String str): Devuelve el índice de la última aparición de una subcadena.

boolean equals(Object obj):Compara el valor de dos cadenas, respetando las mayúsculas y minúsculas.

boolean equalsIgnoreCase(String anotherString):Compara dos cadenas ignorando diferencias entre mayúsculas y minúsculas.

int compareTo(String anotherString):Compara dos cadenas lexicográficamente. Retorna un valor negativo, cero o positivo si esta cadena es menor, igual o mayor que anotherString.

boolean startsWith(String prefix):Verifica si la cadena comienza con el prefijo especificado.

boolean endsWith(String suffix):Verifica si la cadena termina con el sufijo especificado.
String substring(int beginIndex):Retorna una subcadena que comienza en el índice beginIndex hasta el final de la cadena.

String substring(int beginIndex, int endIndex):Retorna una subcadena desde beginIndex hasta endIndex.

String toLowerCase():Convierte todos los caracteres a minúsculas.

String toUpperCase():Convierte todos los caracteres a mayúsculas.

String trim():Elimina los espacios en blanco iniciales y finales de la cadena.

String replace(char oldChar, char newChar):Reemplaza todas las ocurrencias de oldChar por newChar.

String replaceAll(String regex, String replacement):Reemplaza todas las ocurrencias que coincidan con una expresión regular por la cadena dada.

String[] split(String regex):Divide la cadena en un arreglo usando el delimitador basado en una expresión regular.
char[] toCharArray():Convierte la cadena en un arreglo de caracteres.

static String valueOf(Object obj):Convierte varios tipos de datos, como enteros o caracteres, en una cadena. También funciona para objetos.

Math. Métodos para conocer

int abs(int a)  Devuelve el valor absoluto de un número entero.

double abs(double a)  Devuelve el valor absoluto de un número de punto flotante.

int max(int a, int b) Devuelve el mayor de dos números enteros.

int min(int a, int b) evuelve el menor de dos números enteros.

double max(double a, double b) Devuelve el mayor de dos números de punto flotante.

double min(double a, double b)  Devuelve el menor de dos números de punto flotante.

long round(double a) Redondea el valor de punto flotante al entero más cercano.

double pow(double a, double b) Devuelve el resultado de elevar a a la potencia de b.

 double sqrt(double a) Devuelve la raíz cuadrada de un número.
 
double cbrt(double a) Devuelve la raíz cúbica de un número.

double exp(double a) Devuelve el número de Euler elevado a la potencia de a.

double log(double a) Devuelve el logaritmo natural (base e) de un número.

double log10(double a) Devuelve el logaritmo en base 10 de un número.

double log1p(double x) Devuelve el logaritmo natural de (1 + x) con precisión para valores pequeños de x.

double sin(double a) Devuelve el seno de un ángulo en radianes.

double cos(double a) Devuelve el coseno de un ángulo en radianes.

double tan(double a) Devuelve la tangente de un ángulo en radianes.

double asin(double a) Devuelve el arco seno (en radianes) de un número. 

double acos(double a) Devuelve el arco coseno (en radianes) de un número.

double atan(double a)  Devuelve el arco tangente (en radianes) de un número.

double atan2(double y, double x) Calcula el arco tangente de la relación y/x. 

double random()  Devuelve un número aleatorio en el rango [0.0, 1.0).

double ceil(double a) Devuelve el menor número entero mayor o igual a a.

double floor(double a) Devuelve el mayor número entero menor o igual a a. 

double rint(double a) Devuelve el número entero más cercano a a, como un valor de punto flotante.

double signum(double a)  Devuelve el signo de un número: 1.0 para positivo, -1.0 para negativo, y 0.0 para cero. 

double hypot(double x, double y) Calcula sqrt(x² + y²) sin desbordamiento intermedio. 

double toRadians(double angdeg) Convierte un ángulo de grados a radianes.

double toDegrees(double angrad) Convierte un ángulo de radianes a grados.

