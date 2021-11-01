package com.reto3.reto3.interfaces;

import com.reto3.reto3.modelo.Mensaje;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceMensaje extends CrudRepository<Mensaje,Integer> {
}
