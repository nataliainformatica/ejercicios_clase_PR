import java.util.Scanner;

public class Ejercicio3 {

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    Candidato candidato1, candidato2, candidato3;
    Candidato candidato; 
    String nombre; 
    int votos; 
    boolean esDelegado; 
    int max; 


    System.out.println("Dime el nombre del candidato 1");
    nombre = sc.nextLine(); 
    System.out.println("Dime cuántos votos tiene:  ");
    try{
    votos = Integer.parseInt(sc.nextLine());
    }catch(Exception ex){
        System.out.println("EL NÚMERO NO ES VÁLIDO LO DEJAMOS EN CERO");
        votos =0; 
    }

    candidato1 = new Candidato(nombre, votos); 

    System.out.println("Dime el nombre del candidato 2"); 
    nombre = sc.nextLine(); 
    System.out.println("Dime cuántos votos tiene:  ");
    try{
    votos = Integer.parseInt(sc.nextLine());
    }catch(Exception ex){
        System.out.println("EL NÚMERO NO ES VÁLIDO LO DEJAMOS EN CERO");
        votos =0; 
    }

    candidato2= new Candidato(nombre, votos); 
      System.out.println("Dime el nombre del candidato 3");
    nombre = sc.nextLine(); 
    System.out.println("Dime cuántos votos tiene:  ");
    try{
    votos = Integer.parseInt(sc.nextLine());
    }catch(Exception ex){
        System.out.println("EL NÚMERO NO ES VÁLIDO LO DEJAMOS EN CERO");
        votos =0; 
    }

    candidato3= new Candidato(nombre, votos); 



    // calcular quién tiene más votos
    max = Math.max(candidato1.getNumeroVotos(), candidato2.getNumeroVotos());
    max = Math.max(candidato3.getNumeroVotos(), max); 
     // cuál es mayor valor de votos, 
    if(candidato1.getNumeroVotos()> candidato2.getNumeroVotos()){
        if(candidato1.getNumeroVotos()> candidato3.getNumeroVotos())
                candidato1.setEsDelegado(true); 
    }
    else if(candidato2.getNumeroVotos()> candidato1.getNumeroVotos()){
        if(candidato2.getNumeroVotos()> candidato3.getNumeroVotos())
                candidato2.setEsDelegado(true); 
    }else{
        candidato3.setEsDelegado(true);
    }

    // muestra los datos

    System.out.println(candidato1.toString());
    System.out.println(candidato2);
    System.out.println(candidato3);

   





 }

}
