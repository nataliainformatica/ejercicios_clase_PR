package es.avellaneda.ejemploAnimales;

public class Gato implements DevolverSonido{

    private String atributo1; 

    public Gato(String atributo1){
        this.atributo1 = atributo1; 
    }

    @Override
    public String hacerSonido() {
      return "MIAU"; 
    }



}
