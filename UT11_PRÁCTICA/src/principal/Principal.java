package principal;


import java.util.ArrayList;
import java.util.Scanner;

import excepciones.NoEncontradoException;

import model.Persona;
import persistenciaFicheros.UtilidadesFicheros;

public class Principal {
    private static Scanner sc = new Scanner((System.in));
    private static final RegistroPersonas registroPersonas=new RegistroPersonas();
    public static void main(String[] args) {     
        boolean infinito = true;
        String motivoVisita; 

        String opcion;
        while (infinito) {
            Persona persona = null; 
            try{
            borrarConsola();
            System.out.println("1. Acceso al registro de entrada ");
            System.out.println("2. Acceso al registro de salida");
            opcion = sc.nextLine();
           
            switch (opcion) {
                case "1":
                    borrarConsola();
                    System.out.println("MENÚ DE AUTENTICACIÓN");
                  
                    persona = autenticarPersona(); 
                    System.out.println("MOTIVO DE LA VISTA");
                    motivoVisita=sc.nextLine(); 

                    if(registroPersonas.comprobarRegistroEntrada(persona)){
                        // autorizado para entrar
                        menuUsuario(persona,motivoVisita);
                        borrarConsola();
                    }else{  
                        System.out.println("ERROR - HAY UN REGISTRO DE ENTRADA ");
                        System.out.println("PULSA ENTER PARA CONTINUAR");
                        sc.nextLine();
                    }                 
                                  
                    break;
                case "2":
                    borrarConsola();
                
                    System.out.println("MENÚ DE AUTENTICACIÓN");
                   
                        persona = autenticarPersona(); 
                        registroPersonas.registrarSalida(registroPersonas.comprobarRegistroSalida(persona));
                        System.out.println("PUEDES SALIR");
                        System.out.println("PULSA ENTER PARA CONTINUAR");
                        sc.nextLine(); 
                        borrarConsola();
                         
                    break;
                default:
                    System.out.println("VALOR INCORRECTO");

                    break;
            }}catch(NoEncontradoException ex){
                System.out.println("ERROR - NO HAY REGISTRO");
                System.out.println("PULSA ENTER PARA CONTINUAR");
                sc.nextLine(); 
            } catch  (Exception ex2){
                infinito = false; 
            }
        }
    }
    private static void menuUsuario(Persona persona,String motivoEntrada){

        String opcion; 
        boolean continua = true; 
        while(continua){
        System.out.println("1. Mostrar historial de registros");
        System.out.println("2. Entrar al edificio");
        opcion = sc.nextLine(); 

        switch (opcion) {
            case "1":
              
                System.out.println( registroPersonas.mostrarRegistrosPersona(persona));
                System.out.println("PULSA ENTER PARA CONTINUAR");
                sc.nextLine(); 

                borrarConsola();
                break;
            case "2":
                // entrar al edificio
                // salir del menú del usuario
                System.out.println("PUEDES ENTRAR AL EDIFICIO");
                System.out.println("PULSA ENTER PARA CONTINUAR");
                registroPersonas.registrarEntrada(persona, motivoEntrada);
                sc.nextLine(); 
                persona = null; 
                continua = false; 
                borrarConsola();
                break;
        
            default:
                System.out.println("OPCIÓN NO VÁLIDA - pulsa 1 ó 2");
                break;
        }}

    }
    private static void borrarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static Persona autenticarPersona(){
        String numEmpleado="", password="";
        try {
            ArrayList<Persona> personas = UtilidadesFicheros.leer();      
            System.out.println("NÚMERO DE EMPLEADO: ");
            numEmpleado = sc.nextLine();
            System.out.println("PASSORD");
            password = sc.nextLine();
            // buscar si está registrado

            for(Persona p: personas){
                if(p.getNumeroEmpleado().equalsIgnoreCase(numEmpleado)&& 
                    p.getPassword().equals(password)){
                        // DEVUELVE LA INSTANCIA DE LA PERSONA REGISTRADA
                        return p;                    
                }
            }
        } catch (Exception ex) {
            System.out.println("No hay conexión al registro en estos momentos");
        }
        throw new NoEncontradoException(numEmpleado); 

    }



}
