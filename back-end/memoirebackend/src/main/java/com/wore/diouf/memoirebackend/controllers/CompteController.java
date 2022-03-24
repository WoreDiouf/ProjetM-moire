package com.wore.diouf.memoirebackend.controllers;

import com.wore.diouf.memoirebackend.entities.Compte;
import com.wore.diouf.memoirebackend.services.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin(origins = "*")
public class CompteController {

    @Autowired
    CompteService compteService;

    @GetMapping("/compte")
    public Collection<Compte> getAll(){
        return compteService.getAll();
    }

    @GetMapping("/compte/{id}")
    public Compte getById(@PathVariable(name = "id") Long code){
        return compteService.getById(code);
    }

    @PostMapping("/compte")
    public void save(@RequestBody Compte compte){
        compteService.save(compte);
    }

    @PutMapping("/compte")
    public void update(@RequestBody Compte compte){
        compteService.update(compte);
    }

    @DeleteMapping("/compte/{id}")
    public  void delete(@PathVariable(name = "id") Long code){
        compteService.delete(code);
    }
}
