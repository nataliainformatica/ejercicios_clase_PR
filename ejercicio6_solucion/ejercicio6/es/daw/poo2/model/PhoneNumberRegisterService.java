package ejercicio6.es.daw.poo2.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ejercicio6.es.daw.poo2.excepciones.PhoneNumberAlreadyExistsException;

/*
 * Crea la excepción PhoneNumberAlreadyExistsException 
 * en el paquete es.daw.poo2.exceptions.
 */

public class PhoneNumberRegisterService {
     String[] phoneNumbers = {
               "+34 111 111 111",
               "+34 111 111 112",
               "+34 111 111 113",
               "+34 111 111 114" };

     List<String> registeredPhoneNumbers = new ArrayList(Arrays.asList(phoneNumbers));

     /*
      * 
      * En el método validatePhone de la clase PhoneNumberRegisterService implementa
      * el código para comprobar si el número existe en la lista de números
      * proporcionados. Observa cómo se crea el List.
      * NUEVO: método contains de
      * ArrayList, para comprobar si existe el número.
      * 
      * Cuando dicha lista contenga el número recibido como argumento, debe crear,
      * lanzar y propagar la excepción con el mensaje
      * "El número de teléfono XXXXX está en uso por otro cliente!"
      */

     public void validatePhone(String phoneNumber) throws PhoneNumberAlreadyExistsException{

          if (registeredPhoneNumbers.contains(phoneNumber)) {
               // como existe el número el método

              throw new PhoneNumberAlreadyExistsException(phoneNumber); 
          }

     }

     public  List<String> consultaLista(){
          return  registeredPhoneNumbers; 
     }

}