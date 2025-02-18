package ejercicio6.es.daw.poo2;

import java.util.ArrayList;

import ejercicio6.es.daw.poo2.excepciones.PhoneNumberAlreadyExistsException;
import ejercicio6.es.daw.poo2.model.PhoneNumberRegisterService;

public class RegisterClientApp {
    public static void main(String[] args) {
        PhoneNumberRegisterService mRegisterService = new PhoneNumberRegisterService();

        try {
            mRegisterService.validatePhone("+34 222 222 222");
        } catch (PhoneNumberAlreadyExistsException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            mRegisterService.validatePhone("+34 111 111 113");

        } catch (PhoneNumberAlreadyExistsException ex) {
            System.out.println(ex.getMessage());

        }

        // de forma automática
        // recorro un array con los números de teléfono
        String[] numeros = { "+34 222 222 222", "+34 111 111 113" };

        for (String s : numeros) {

            try {
                mRegisterService.validatePhone(s);
            } catch (PhoneNumberAlreadyExistsException ex) {
                System.out.println(ex.getMessage());

            }
        }

        ArrayList<String> lista = (ArrayList<String>) mRegisterService.consultaLista();
        for(String s: lista){
            System.out.println(s);
        }
    

    }
}