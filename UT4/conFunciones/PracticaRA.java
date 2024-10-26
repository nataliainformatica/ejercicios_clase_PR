package ejercicios_clase_PR.UT4.conFunciones;
import java.util.Scanner; 
/**
 * 
/**
 * Crea una aplicación que tendrá un menú con las siguientes opciones:
 * 
 * // el menú debe ir en una función : 
 * public static String pedirOpcion(Scanner sc){..}
 * * 
 * 1. Calcular nota media
 * 2. Ver el último resultado
 * 3. Salir
 * 
 * 
 * OPCIÓN1.
 * Se piden por consola los siguientes datos:
 * ¿Cuántos módulos tienes?
 * Se pedirán las notas de cada uno de los módulos …
 * ¿Qué nota has sacado en el módulo 1?
 * ¿Qué nota has sacado en el módulo 2? ….
 * Las notas pueden ser mínimo un 1 y máximo un 10, si se introduce cualquier
 * otra nota se debe mostrar un mensaje “esta nota no es válida” y volver a
 * pedir al usuario que introduzca la nota.
 * Al finalizar se mostrará:
 * La nota más alta introducida
 * La nota más baja introducida
 * La nota media en el siguiente formato: (ésto se debe hacer en una función):
 * 
 * De 0 a 4 No superado
 * Mayor o igual a 5 y menor que 6 : Aprobado
 * Mayor que 6 y menor que 8: Notable
 * Mayor que 8 hasta 10: Sobresaliente
 * OPCIÓN2.
 * Mostrará la última nota media calculada.
 * Si no hay datos, debe informar al usuario
 * OPCIÓN3:
 * Finaliza el programa y se muestra FIN DE PROGRAMA
 * 
 */

public class PracticaRA {
    public static Scanner sc = new Scanner(System.in);
  
    public static String opcion; 
    public static void main(String[] args) {

       
        String opcion; 
        int numModulos=0; 
        int nota=0, sumaNotas=0, notaAlta=0, notaBaja=100; 
        double notaMedia=0;   // suma de todas las notas / número módulos
        boolean continua= true; 
        int[] notasModulos;


        // establecemos que la nota solo puede ser un entero como en los módulos de FP
        while(continua){
        opcion = pedirOpcion(sc);

        switch (opcion) {
            case "1":
                boolean sigueNota=true; 
                nota=0; sumaNotas=0; notaAlta=0; notaBaja=100; 
                System.out.println("Cuántos módulos tienes? ");
                numModulos = sc.nextInt();
                notasModulos = new int[numModulos];

                for(int i=0; i<numModulos; i++){

                    while(sigueNota){
                    // TODO PONER MÁXIMOS Y MÍNIMOS A LAS NOTAS
                    System.out.println("Dime la nota del módulo " +(i  + 1 ));
                    nota = sc.nextInt(); 
                    notasModulos[i]= nota; 

                    if(nota >= 1 && nota <=10){
                        sigueNota = false; 
                       // System.out.println("esta nota no es válida" );
                    }
                    }
                    sigueNota= true; 

                    if(nota >notaAlta){
                        notaAlta=nota;
                    }
                    if(nota<notaBaja){
                        notaBaja=nota; 
                    }
                    sumaNotas += nota; 
                }

                notaMedia = sumaNotas / numModulos; 
                System.out.println("Nota media: " + ajustarNota(notaMedia));
                System.out.println("Nota más alta: " + notaAlta);
                System.out.println("Nota más baja: " + notaBaja);           
                
                // queremos mostrar todas las notas de cada no de los módulos
                for(int i=0;i<numModulos ; i++){
                    System.out.println("La nota del módulo " + (i+1) + " es "+ notasModulos[i] );
                }
                
                break;
            case "2":
                    if(notaMedia==0){
                        System.out.println("NO HAY DATOS PREVIOS");
                    }
                    System.out.println("Nota media: " + ajustarNota(notaMedia));

                break; 
            case "3":
                continua = false; 
                System.out.println("FIN DE PROGRAMA ");
                break; 
            default:
                break;
        }
    }

        System.out.println("FIN DE PROGRAMA ");
        


    }
    public static String ajustarNota(double notaMedia){
/** La nota media en el siguiente formato:
 * De 0 a a menor que 5  No superado
 * Mayor o igual a 5 y menor que 6 : Aprobado
 * Mayor que 6 y menor que 8: Notable
 * Mayor que 8 hasta 10: Sobresaliente */
        String nota=""; 
        if(notaMedia <5 ){
            nota = "No superado";  
        }else if(notaMedia>= 5 && notaMedia<6){
           
            nota = "Aprobado";  
        }else if(notaMedia>=6 && notaMedia<8){
            nota = "Notable"; 
        }else if(notaMedia>=8 && notaMedia<=10){
            nota = "Sobresaliente"; 
        }/*else{
            nota = "Sobresaliente"; 
        }*/


        
        return nota; 


    }
    public static String pedirOpcion(Scanner sc){

        boolean continua  =true; 
        String opcion =""; 
        while(continua){
            System.out.println("OPCION 1. Calcular nota media");
            System.out.println("OPCION 2. Ver último resultado");
            System.out.println("OPCION 3. Salir");
            opcion = sc.nextLine(); 

            if(opcion.equals("1") ||opcion.equals("2") | opcion.equals("3")){
                continua = false; 
            }else{
                System.out.println("No es una opción válida");
            }

        }
        return opcion; 

    }

    
}
