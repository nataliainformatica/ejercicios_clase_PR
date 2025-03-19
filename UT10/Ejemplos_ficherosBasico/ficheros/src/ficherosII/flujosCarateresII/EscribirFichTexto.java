package flujosCarateresII;

import java.io.*;

public class EscribirFichTexto {

    public static void main(String[] args) throws IOException {
        File fichero = new File("FichTexto.txt");//declara fichero          
        FileWriter fic = new FileWriter(fichero); //crear el flujo de salida       
        String cadena = "Esto es una prueba con FileWriter";
        char[] cad = cadena.toCharArray();//convierte un String en array de caracteres

        for (int i = 0; i < cad.length; i++) {
            fic.write(cad[i]);  //se va escribiendo un carácter
        }
        fic.append('*'); //añado al final un *   
        fic.write(cad);//escribir un array de caracteres   
        String c = "\n*esto es lo ultimo*";
        fic.write(c);//escribir un String   

        String prov[] = {"Albacete", "Avila", "Badajoz",
            "Cáceres", "Huelva", "Jaén",
            "Madrid", "Segovia", "Soria", "Toledo",
            "Valladolid", "Zamora"};

        fic.write("\n");
        for (int i = 0; i < prov.length; i++) {
            fic.write(prov[i]);
            fic.write("\n");
        }

        fic.close();    //cerrar fichero

    }
}
