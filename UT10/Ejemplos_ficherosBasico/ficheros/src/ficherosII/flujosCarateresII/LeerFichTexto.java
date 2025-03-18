package flujosCarateresII;


import java.io.*;

public class LeerFichTexto {
  public static void main(String[] args) throws IOException {
    File fichero = new 
    	File("Fichero1.txt");
                //declarar fichero
    FileReader fic = new FileReader(fichero); //crear el flujo de entrada  
    
    //FileReader fic = new FileReader("D:\\ADAT_CLASE\\ANTIGUO\\UNI1\\LeerFichTexto.java"); //crear el flujo de entrada  
        
    int i;
    while ((i = fic.read()) != -1) //se va leyendo un car�cter
      System.out.println( (char) i + "==>"+ i);
    
  /*  char b[]= new char[5]; 
    while ((i = fic.read(b)) != -1)	    
		System.out.println(b); 
*/
    
    
    fic.close(); //cerrar fichero  
    
    
    
  }
}
