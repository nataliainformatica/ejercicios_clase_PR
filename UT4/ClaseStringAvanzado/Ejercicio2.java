package ejercicios_clase_PR.UT4.ClaseStringAvanzado;
public class Ejercicio2 {

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

        // Normalizar la cadena , quitar espacios, convertir a minúsculas y reemplazar vocales acentuadas
        String inputLower = input.toLowerCase()
        StringBuilder normalized = new StringBuilder();
        
        // Normalizar la cadena
        for (char lowerC : inputLower.toCharArray()) {
            // Convertir a minúscula un carácter
            //char c = Character.toLowerCase(lowerC);
            // Verificar si es una letra
            if (lowerC >= 'a' && lowerC <= 'z') {
                normalized.append(lowerC);
            }
        }

        // Comparar la cadena normalizada con su reverso
        String reversed = normalized.reverse().toString();
        
        return normalized.toString().equals(reversed);
    }
}