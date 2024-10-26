package ejercicios_clase_PR.UT3.AMPLIACIÓN;

public class Ejercicio3 {
    
     /*Vamos a realizar el cálculo de la nota de un examen 
     * de tipo test. Para ello, tendremos en cuenta el número
     * total de preguntas, los aciertos y los errores. Dos errores
     * anulan una respuesta correcta.
     * 
     * La nota que vamos a obtener será un número entero.
     * 
     * Finalmente, se muestra por pantalla la nota obtenida, así
     * como su calificación no numérica. 
     * 
     * La obtención de la calificación no numérica se ha realizado
     * utilizando la estructura condicional múltiple o switch. 
     * 
     */
    public static void main(String[] args) {
         // Declaración e inicialización de variables
        int num_aciertos = 17;
        int num_errores = 3;
        int num_preguntas = 20;
        int nota = 0;
        String calificacion="";
    
        //Procesamiento de datos
        nota = ((num_aciertos - (num_errores/2))*10)/num_preguntas;
    
        switch (nota) {
            case 5: calificacion="SUFICIENTE"; 
                    break;
            case 6: calificacion="BIEN"; 
                    break;
            case 7:  case 8:  
                calificacion="NOTABLE";
                    break;
            case 9:  case 10:
                calificacion="SOBRESALIENTE"; 
                    break;
            
            default: calificacion="INSUFICIENTE";            
        }
        
        //Salida de información
        System.out.println ("La nota obtenida es: " + nota);
        System.out.println ("y la calificación obtenida es: " + calificacion);
    }
}