package es.daw.poo2.model;

import java.util.Arrays;
import java.util.List;


public class PhoneNumberRegisterService {
    String[] phoneNumbers = {"+34 111 111 111", "+34 111 111 112", "+34 111 111 113", "+34 111 111 114"};
    //List<String> registeredPhoneNumbers = Arrays.asList("+34 111 111 111", "+34 111 111 112", "+34 111 111 113", "+34 111 111 114");
     //List<String>  registeredPhoneNumbers = new ArrayList( Arrays.asList("+34 111 111 111", "+34 111 111 112", "+34 111 111 113", "+34 111 111 114"));
    List<String> registeredPhoneNumbers =  new ArrayList((Arrays.asList(phoneNumbers));
    //List<String> registeredPhoneNumbers = Arrays.asList(phoneNumbers);
   public void validatePhone(String phoneNumber) {
        // PENDIENTE COMPLETAR...
   }
}
