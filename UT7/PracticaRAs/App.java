package es.avellaneda;
public class App {
    public static void main(String[] args)  {
        
    Sala[] salas = {
        new Sala (1,"",4),
        null
    };

    muestraSalasDisponibles(salas);
    System.out.println(salas[0].reservarSala("123")); 
    System.out.println(salas[0].reservarSala("123")); 
    System.out.println(salas[0].liberarSala("1234"));
    System.out.println(salas[0].liberarSala("123"));


    }

    public static void  muestraSalasDisponibles(Sala[] salas){

        for(Sala s : salas){
           if(s!=null){
            if(s.isDisponible())
                System.out.println(s.mostrarInformacion());
            }}}


        }


