package com.wore.diouf.memoirebackend.controllers;

import com.wore.diouf.memoirebackend.entities.Cession;
import com.wore.diouf.memoirebackend.services.CessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin(origins = "*")
public class CessionControlller {

    @Autowired
    CessionService cessionService;

    @GetMapping("/cession")
    public Collection<Cession> getAll(){
        return cessionService.getAll();
    }

    @GetMapping("/cession/{id}")
    public Cession getById(@PathVariable Long id){
        return cessionService.getById(id);
    }

    @PostMapping("/cession")
    public void save(@RequestBody Cession cession){
        cessionService.save(cession);
    }

    @PutMapping("/cession")
    public void update(@RequestBody Cession cession){
        cessionService.update(cession);
    }

    @DeleteMapping("/cession/{id}")
    public  void delete(@PathVariable Long id){
        cessionService.delete(id);
    }
}
