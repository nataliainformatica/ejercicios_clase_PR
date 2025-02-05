package es.avellaneda.ejemploAnimales;

public class Principal {

    public static void main(String[] args) {

        DevolverSonido[] animales = new  DevolverSonido[3]; 
   
        animales[0] = new Gato("1");
        animales[1] = new Perro("1");
        animales[2]= new Pajaro(); 

        for(DevolverSonido d: animales){
            System.out.println(d.hacerSonido());
        }
    }

}
