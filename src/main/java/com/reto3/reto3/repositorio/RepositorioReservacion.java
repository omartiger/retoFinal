package com.reto3.reto3.repositorio;

import com.reto3.reto3.interfaces.InterfaceReservacion;
import com.reto3.reto3.modelo.Cliente;
import com.reto3.reto3.modelo.Reservacion;
import com.reto3.reto3.reto5.ContadorCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public class RepositorioReservacion {
    @Autowired
    private InterfaceReservacion crud4;

    public List<Reservacion> getAll(){
        return (List<Reservacion>) crud4.findAll();
    }
    public Optional<Reservacion> getReservation(int id){
        return crud4.findById(id);
    }
    public Reservacion save(Reservacion reservacion){
        return crud4.save(reservacion);
    }
    public void delete(Reservacion reservacion){
        crud4.delete(reservacion);
    }

    public  List<ContadorCliente> getTopClients(){
        List<ContadorCliente>res=new ArrayList<>();
        List<Object[]>report=crud4.countTotalReservationsByClient();
        for(int i=0;i<report.size();i++){
            res.add(new ContadorCliente((Long)report.get(i)[1],(Cliente) report.get(i)[0]));
        }
        return res;
    }

    public List<Reservacion> getReservationPeriod(Date a, Date b){
        return crud4.findAllByStartDateAfterAndStartDateBefore(a,b);
    }

    public List<Reservacion> getReservationsByStatus(String status){
        return crud4.findAllByStatus(status);
    }

}