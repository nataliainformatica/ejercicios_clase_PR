package excepciones;

public class NoEncontradoException extends RuntimeException{

    public NoEncontradoException(String numEmpleado) {
        super(numEmpleado); 
    }

}
