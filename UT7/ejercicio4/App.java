package es.avellaneda; 
import es.avellaneda.model.Electrodomestico;
import es.avellaneda.model.Material;
import es.avellaneda.model.Mueble;
import es.avellaneda.model.Producto;
import es.avellaneda.model.Tipo;


public class App {
    public static void main(String[] args) throws Exception {
     

        Mueble mueble = new Mueble("MESA",
         5.0, 2.0, 2.0,
          2.0, Material.Madera,false);

        Electrodomestico electrodomestico =
        new Electrodomestico("FRIGO", 50.0, 1.5, 0.6, 0.7, Tipo.Refrigerador, false); 
        /*
        System.out.println(mueble);
        System.out.println(mueble.calcularCosteEnvio());
        System.out.println(electrodomestico);

        System.out.println(electrodomestico.calcularCosteEnvio());
 */

        Producto[] productos =  new Producto[2]; 
        productos[0] = mueble; 
        productos[1] = electrodomestico; 
        Mueble[] muebles = new Mueble[5];

        for(Producto p : productos){
            System.out.println(p);
            System.out.println(p.calcularCosteEnvio());


            if(p instanceof Electrodomestico){
                ((Electrodomestico)p).calcularConsumo(); 
            }else if (p instanceof Mueble){
                muebles[0]= (Mueble)p; 
            }
        }


    
    }

      
}
