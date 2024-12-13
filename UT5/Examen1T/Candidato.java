public class Candidato {

 private String nombre; 
 private int numeroVotos; 
 private boolean esDelegado;

 



public Candidato(String nombre, int numeroVotos) {
    this.nombre = nombre;
    this.numeroVotos = numeroVotos;
    this.esDelegado = false;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public int getNumeroVotos() {
    return numeroVotos;
}
public void setNumeroVotos(int numeroVotos) {
    this.numeroVotos = numeroVotos;
}
public boolean isEsDelegado() {
    return esDelegado;
}
public void setEsDelegado(boolean esDelegado) {
    this.esDelegado = esDelegado;
}

/* 
@Override
public String toString() {
String valor = "NO"; 
    if(isEsDelegado()){
        valor = "SI"; 
    }
    return "El candidato con nombre "   +
     nombre  + " ha obtenido " + numeroVotos + " votos " + valor + " es delegado";
} 
*/


 

}
