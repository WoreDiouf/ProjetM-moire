package com.wore.diouf.memoirebackend.controllers;

import com.wore.diouf.memoirebackend.entities.Adherant;
import com.wore.diouf.memoirebackend.services.AdherantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin(origins = "*")
public class AdherantController {

    @Autowired
    AdherantService adherantService;

    @GetMapping("/adherant")
    public Collection<Adherant> getAll(){
        return adherantService.getAll();
    }

    @GetMapping("/adherant/{id}")
    public Adherant getById(@PathVariable Long id){
        return adherantService.getById(id);
    }

    @PostMapping("/adherant")
    public void save(@RequestBody Adherant adherant){
        adherantService.save(adherant);
    }

    @PutMapping("/adherant")
    public void update(@RequestBody Adherant adherant){
        adherantService.update(adherant);
    }

    @DeleteMapping("/adherant/{id}")
    public  void delete(@PathVariable Long id){
        adherantService.delete(id);
    }
}
