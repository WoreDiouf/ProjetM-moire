package com.wore.diouf.memoirebackend.controllers;

import com.wore.diouf.memoirebackend.entities.Historique_cession;
import com.wore.diouf.memoirebackend.services.Historique_cessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin(origins = "*")
public class Historique_cessionController {

    @Autowired
    Historique_cessionService historique_cessionService;

    @GetMapping("/historiqueCession")
    public Collection<Historique_cession> getAll(){
        return historique_cessionService.getAll();
    }

    @GetMapping("/historiqueCession/{id}")
    public Historique_cession getById(@PathVariable Long id){
        return historique_cessionService.getById(id);
    }

    @PostMapping("/historiqueCession")
    public void save(@RequestBody Historique_cession historique_cession){
        historique_cessionService.save(historique_cession);
    }

    @PutMapping("/historiqueCession")
    public void update(@RequestBody Historique_cession historique_cession){
        historique_cessionService.update(historique_cession);
    }

    @DeleteMapping("/historiqueCession/{id}")
    public  void delete(@PathVariable Long id){
        historique_cessionService.delete(id);
    }
}
