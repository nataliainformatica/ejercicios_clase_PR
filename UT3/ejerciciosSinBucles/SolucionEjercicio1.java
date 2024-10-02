import java.util.Scanner;

public class SolucionEjercicio1{
    /*Un biólogo está realizando un estudio de distintas especies de invertebrados y necesita una aplicación que le ayude a contabilizar el número de patas que tienen en total todos los animales capturados durante una jornada de trabajo.

    Para ello, te ha solicitado que escribas una aplicación a la que hay que proporcionar.
    
    El número de hormigas capturadas (6 patas)
    
    El número de arañas capturadas (8 patas)
    
    El número de cochinillas capturadas (14 patas)
    
    La aplicación debe mostrar el número tota de patas.*/
    public static void main(String[] args) {
        
        // COMENZAMOS DEFINIENDO LAS VARIABLES
        int numHormigas; 
        int numAranias; 
        int numCochinillas;
        int total=0;  
        
        final int PATAS_HORMIGA= 6; 
        final int PATAS_ARANIA = 8;
        final int PATAS_COCHINILLA = 14; 
        final int MAX = 32; 

        Scanner lectorTeclado = new Scanner(System.in);

        // PEDIMOS LOS DATOS AL USUARIO


        
        System.out.print("¿Cúantas hormigas has capturado hoy? ");
        numHormigas = lectorTeclado.nextInt();
        System.out.print("¿Cúantas arañas has capturado hoy? ");
        numAranias = lectorTeclado.nextInt();
        System.out.print("¿Cúantas cochinillas has capturado hoy? ");
        numCochinillas = lectorTeclado.nextInt();
         
        total = numHormigas*PATAS_HORMIGA + numAranias * PATAS_ARANIA + numCochinillas * PATAS_COCHINILLA;
        System.out.println("****************************************************");
        System.out.println("HOY HAS CAPTURADO UN TOTAL DE PATAS" + total);
          

        if(total >= MAX ){
            System.out.println("FELICIDADES!!!!! HAS CAPTURADO " + total );
        }else{
            System.out.println("SIGUE TRABAJANDO ... " );
        }


        System.out.println("FIN");



        



    }
}