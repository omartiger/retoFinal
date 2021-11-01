package com.reto3.reto3.repositorio;

import com.reto3.reto3.interfaces.InterfaceCliente;
import com.reto3.reto3.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RepositorioCliente {
    @Autowired
    private InterfaceCliente crud1;


    public List<Cliente> getAll(){
        return (List<Cliente>) crud1.findAll();
    }

    public Optional<Cliente> getCliente(int id){
        return crud1.findById(id);
    }

    public Cliente save(Cliente cliente){
        return crud1.save(cliente);
    }
    public void delete(Cliente cliente){
        crud1.delete(cliente);
    }
}
