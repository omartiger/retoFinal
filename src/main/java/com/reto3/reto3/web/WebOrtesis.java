package com.reto3.reto3.web;

import com.reto3.reto3.modelo.Ortesis;
import com.reto3.reto3.servicios.ServiciosOrtesis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Ortopedic")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class WebOrtesis {

    @GetMapping("/holaMundo")
    public String saludad(){
        return "Hola Mundo Tutoria";
    }


    @Autowired
    private ServiciosOrtesis servicio;
    @GetMapping("all")
    public List<Ortesis> getOrthesis(){
        return servicio.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Ortesis> getOrthesis(@PathVariable("id") int idOrthesis) {
        return servicio.getOrthesis(idOrthesis);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Ortesis save(@RequestBody Ortesis orthesis) {
        return servicio.save(orthesis);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Ortesis update(@RequestBody Ortesis ortesis) {
        return servicio.update(ortesis);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int ortesisId) {
        return servicio.deleteOrtesis(ortesisId);
    }

}
