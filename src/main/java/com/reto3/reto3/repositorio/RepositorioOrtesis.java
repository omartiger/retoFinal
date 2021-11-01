package com.reto3.reto3.repositorio;

import com.reto3.reto3.interfaces.InterfaceOrtesis;
import com.reto3.reto3.modelo.Ortesis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RepositorioOrtesis {
    @Autowired
    private InterfaceOrtesis crud;


    public List<Ortesis> getAll(){
        return (List<Ortesis>) crud.findAll();
    }

    public Optional<Ortesis> getOrthesis(int id){
        return crud.findById(id);
    }

    public Ortesis save(Ortesis ortesis){
        return crud.save(ortesis);
    }
    public void delete(Ortesis ortesis){
        crud.delete(ortesis);
    }


}