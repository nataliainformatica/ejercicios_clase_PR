package ejercicio6.es.daw.poo2.excepciones;

public class PhoneNumberAlreadyExistsException extends Exception{

    // no hace falta definir el atributo message pq se hereda

    public PhoneNumberAlreadyExistsException(String numero){
          super("El número de teléfono "
        +numero +  " está en uso por otro cliente!"); 
    }

}
