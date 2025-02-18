package ejercicio6_2.es.daw.poo2.model;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ejercicio6_2.es.daw.poo2.excepciones.PhoneNumberAlreadyExistsException;



/*
 * Crea la excepción PhoneNumberAlreadyExistsException 
 * en el paquete es.daw.poo2.exceptions.
 */

public class PhoneNumberRegisterService {
     
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

      // TODO CAMBIAR A LA NUEVA FIRMA

      public void validatePhone(ArrayList<Client> clients, String phoneNumber) throws PhoneNumberAlreadyExistsException{
         

          // NO SE PUEDE UTILIZAR CONTAIS, PQ CON EL NÚMERO NO TENEMOS UNA INSTANCIA DEL OBJETO

          for(Client c: clients){
               if(c.getNumeroTelefono().equals(phoneNumber)){
                    // si existe el número 
                    // lanza la excepción
                    throw new PhoneNumberAlreadyExistsException(phoneNumber); 


               }
          }
      }


}