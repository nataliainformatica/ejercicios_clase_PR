package ejercicio6_2.es.daw.poo2.dao;

import java.time.LocalDate;
import java.util.ArrayList;

import ejercicio6_2.es.daw.poo2.model.Client;



public class ClientDAO {
    private ArrayList<Client> clients;

    public ClientDAO() {
        clients = new ArrayList<>();
        clients.add(new Client("2A", "Cliente2", "+34 111 111 112",LocalDate.parse("2024-02-28")));
        clients.add(new Client("1A", "Cliente1", LocalDate.parse("2024-02-27")));
        clients.add(new Client("3A", "Cliente3", "+34 111 111 113",LocalDate.parse("2024-02-29")));
        clients.add(new Client("4B", "Cliente4", "+34 111 111 114",LocalDate.parse("2024-02-29")));
    }

    public ArrayList<Client> select(){
        //return (ArrayList<Cliente>)clientes.clone();
        return new ArrayList<>(clients);
    }
    
}