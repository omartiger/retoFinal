package com.reto3.reto3.interfaces;

import com.reto3.reto3.modelo.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceCliente extends CrudRepository<Cliente,Integer> {

}
