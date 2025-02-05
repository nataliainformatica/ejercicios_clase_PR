package es.avellaneda.ejemploAnimales;

public class Perro implements DevolverSonido{

    private String atributo1; 
    public Perro(String atributo1){
        this.atributo1 = atributo1; 
    }
    @Override
    public String hacerSonido() {
        return "GUAU";
    }

}
