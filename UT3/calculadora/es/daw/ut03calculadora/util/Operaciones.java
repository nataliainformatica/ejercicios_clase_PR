package es.daw.ut03calculadora.util;

/**
 * Clase con las operaciones de la calculadora
 * @author melola
 */
public class Operaciones {
    
    /**
     * Método que realiza la suma de dos operandos
     * @param op1
     * @param op2
     * @return 
     */
    public static float sumar(float op1, float op2){
        return op1+op2;        
    }

    public static float restar(float op1, float op2){
        return op1-op2;        
    }

    public static float multiplicar(float op1, float op2){
        return op1*op2;        
    }

    public static float dividir(float op1, float op2){
        return op1/op2;        
    }
    
    public static float modulo(float op1, float op2){
        return op1 % op2;
    }
    
    public static void prueba(){
        System.out.println("Esto es una prueba");
    }
    
}
