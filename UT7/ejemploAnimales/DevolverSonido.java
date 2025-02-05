package es.avellaneda.ejemploAnimales;

public interface DevolverSonido {

    //public String hacerSonido();
    default public  String hacerSonido(){
        return " sonido"; 

    }


}
