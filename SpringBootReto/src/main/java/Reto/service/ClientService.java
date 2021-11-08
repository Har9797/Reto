/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto.service;

import Reto.entity.Client;
import Reto.repository.ClientRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

/**
 *
 * @author Har
 */
public class ClientService {
    @Autowired
    private ClientRepository repository;
    
    public Client saveClientAll(Client client){
        return repository.save(client);
    }
    
    public List<Client> getClientAll(){
        return repository.findAll();
    }
    
    public Client updateClient(Client client){
        Client existeClient=repository.findById(client.getIdClient()).orElse(null);
        existeClient.setName(client.getName());
        existeClient.setEmail(client.getEmail());
        existeClient.setPassword(client.getPassword());
        existeClient.setAge(client.getAge());      
        return repository.save(existeClient);
    }
    
    public String deleteClient(int id){
        repository.deleteById(id);
        return "Item Removido"+id;
    }
}
