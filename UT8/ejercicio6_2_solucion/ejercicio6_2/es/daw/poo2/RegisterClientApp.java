package ejercicio6_2.es.daw.poo2;

import java.util.ArrayList;

import ejercicio6_2.es.daw.poo2.model.PhoneNumberRegisterService;
import ejercicio6_2.es.daw.poo2.dao.ClientDAO;
import ejercicio6_2.es.daw.poo2.excepciones.PhoneNumberAlreadyExistsException;


public class RegisterClientApp {

    public static void main(String[] args) {
        ClientDAO dao = new ClientDAO(); 
        PhoneNumberRegisterService mRegisterClientApp= new  PhoneNumberRegisterService(); 

        ArrayList clientes = dao.select();
        try{
            mRegisterClientApp.validatePhone(clientes,"+34 111 111 111");

        }catch(PhoneNumberAlreadyExistsException ex){
            System.out.println(ex.getMessage());
        }


        try{
            mRegisterClientApp.validatePhone(clientes,"+34 111 111 112");

        }catch(PhoneNumberAlreadyExistsException ex){
            System.out.println(ex.getMessage());
        }



    }

}
