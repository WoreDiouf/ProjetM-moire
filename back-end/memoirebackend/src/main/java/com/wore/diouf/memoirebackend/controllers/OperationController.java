package com.wore.diouf.memoirebackend.controllers;

import com.wore.diouf.memoirebackend.entities.Operation;
import com.wore.diouf.memoirebackend.services.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin(origins = "*")
public class OperationController {

    @Autowired
    OperationService operationService;

    @GetMapping("/operation")
    public Collection<Operation> getAll(){
        return operationService.getAll();
    }

    @GetMapping("/operation/{id}")
    public Operation getById(@PathVariable Long id){
        return operationService.getById(id);
    }

    @PostMapping("/operation")
    public void save(@RequestBody Operation operation){
        operationService.save(operation);
    }

    @PutMapping("/operation")
    public void update(@RequestBody Operation operation){
        operationService.update(operation);
    }

    @DeleteMapping("/operation/{id}")
    public  void delete(@PathVariable Long id){
        operationService.delete(id);
    }
}
