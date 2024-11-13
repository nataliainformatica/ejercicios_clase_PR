package ejercicios_clase_PR.UT4.expresionesRegulares;
public class Ejercicio1 {

    public static void main(String[] args) {
        // Pruebas
        System.out.println(isPalindrome("Ana")); // true
        System.out.println(isPalindrome("salas")); // true
        System.out.println(isPalindrome("rajar")); // true
        System.out.println(isPalindrome("Dábale arroz a la zorra el abad")); // true
        System.out.println(isPalindrome("A luna ese anula")); // true
        System.out.println(isPalindrome("Allí ves a Sevilla")); // true
        System.out.println(isPalindrome("Hello")); // false
    }

    public static boolean isPalindrome(String input) {
        // Normalizar la cadena: quitar espacios, convertir a minúsculas y reemplazar vocales acentuadas
        String normalized = input.toLowerCase()
                .replaceAll("[ áéíóúÁÉÍÓÚ]", "") // Eliminar espacios y vocales acentuadas
                .replaceAll("[^a-z]", ""); // Eliminar caracteres que no son letras

        // Verificar si la cadena normalizada es igual a su reverso
   