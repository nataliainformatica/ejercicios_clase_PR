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
  for(int i=0; i< 3; i++){}
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