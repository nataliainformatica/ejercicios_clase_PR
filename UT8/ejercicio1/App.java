package ejercicio1;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<SaldoException> miListaExcepciones = new ArrayList<>(); 
        CuentaBancaria cuentaBancaria = new CuentaBancaria(2000, "Nata","XXXX");

        try {
            cuentaBancaria.retirarSaldo(21000);
        } catch (SaldoException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getFecha());
            miListaExcepciones.add(e);
            
            //e.printStackTrace();
        }

        System.out.println("EL PROGRAMA CONTINUA");

        Persona persona = new Persona("xxxxy", "Nata");
        ArrayList<Registrable> activosBanco = new ArrayList<>(); 
        activosBanco.add(cuentaBancaria);
        activosBanco.add(persona); 


        for(Registrable r: activosBanco){
            System.out.println(r.mostrarRegistro());
        }
    }
    
    



}
