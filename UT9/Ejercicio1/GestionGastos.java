package ut9.Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

import ut9.Ejercicio1.model.DAOparticipantes;
import ut9.Ejercicio1.model.Participante;

public class GestionGastos {

    /**
     * Manejo de Excepciones TODAS LAS EXCEPCIONES SE MANEJAN EN LA CLASE
     * GestionGastos Se almacenarán las excepciones de ImportePositivoExcepcion en
     * una coleccion para en un futuro poder tratarlas.
     * 
     * @param args
     */

     private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        // se implementará un método calcularPendientes, que:
        // Determinará la cuota equitativa dividiendo el total de gastos 
        // entre el número de participantes.
        //  Indicará cuánto debe pagar o recibir cada participante.

        ArrayList<Participante> participantes = DAOparticipantes.getParticipantes(); 

               

    }
    private void menu(){
        String opcion= null; 
        
        do{
            System.out.println("1. Introducir gasto");
            System.out.println("2. Introducir ingreso");
            System.out.println("3. Mostrar cuánto debe pagar o recibir cada participante. ");
    
            opcion = sc.nextLine(); 
            switch (opcion) {
                case "1":
                    System.out.println("Introduce el número de participante");
                    
                    break;
                case "2":
                    
                    break;
                case "3":
                    
                    break;
                default:
                    break;
            }
    

        }while(!opcion.equals("3"));

        

    }

}
