package ejercicios_clase_PR.UT3.condicionales;

public class ejemploSwitch {
    public static void main(String[] args) {
        int num = 5;
        String result = switch (num) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> {
                System.out.println("Processing number 5");
                yield "Five";
            }
            default -> "Unknown";
        };
        System.out.println(result);  // Imprime "Five"
        
}
}