Supongamos que estás desarrollando un método que calcula el área de un círculo y quieres asegurarte de que los valores que se pasan como parámetros sean válidos
(como que el radio no sea negativo). 
Aquí utilizaremos la palabra clave assert para realizar verificaciones durante el desarrollo.

Ejemplo: Cálculo del área de un círculo con aserciones

Supongamos que tenemos una clase llamada Círculo con un método que calcula el área, y queremos asegurarnos de que el radio sea válido (es decir, mayor que cero).

public class Circulo {

    // Método que calcula el área del círculo
    public double calcularArea(double radio) {
        // Aserción para verificar que el radio es positivo
        assert radio > 0 : "El radio debe ser mayor que cero. Valor recibido: " + radio;
        
        // Cálculo del área (pi * r^2)
        return Math.PI * radio * radio;
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        
        // Prueba con un radio válido
        double area = circulo.calcularArea(5);
        System.out.println("Área del círculo con radio 5: " + area);

        // Prueba con un radio no válido (esto lanzará un AssertionError si las aserciones están habilitadas)
        // double areaInvalida = circulo.calcularArea(-3);  // Descomentar esta línea para probar el error
    }
}


#RECORDATORIO 
Aserciones en Java son útiles para verificar condiciones internas durante el desarrollo, pero deben habilitarse explícitamente en tiempo de ejecución.

Son ideales para asegurarse de que ciertos valores o estados sean correctos antes de continuar con la ejecución del código.

No se deben usar para validar entradas de usuario o situaciones que ocurren en producción; para eso se prefieren excepciones y validaciones más robustas.
