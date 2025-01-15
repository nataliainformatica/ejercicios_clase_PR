package es.avellaneda.ejercicio3;

public class Principal {

    public static void main(String[] args) {
        Modulo[] modulos = new Modulo[2];
        Nota[] notas = new Nota[2];
        notas[0] = new Nota(TipoNota.ORDINARIA, 5);
        String tipo = notas[0].getTipo();  
        notas[1]= new Nota(TipoNota.EXTRAORDINARIA, 5); 
        modulos[0] = new Modulo("Programación", "489",
            notas);
        modulos[1] = new Modulo("DOS", "489",
           notas);
        Alumno alumno1 = new Alumno("alumno1", 
            "1", modulos);
    

            System.out.println(alumno1.mostrarInformacion());

        
        
    
    }

}
