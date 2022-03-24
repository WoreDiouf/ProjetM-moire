package com.wore.diouf.memoirebackend.services;

import com.wore.diouf.memoirebackend.entities.Operation;

import java.util.Collection;

public interface OperationService {

    Collection<Operation> getAll();

    Operation getById(long id);

    void save(Operation operation);

    void update(Operation operation);

    void delete(Long id);
}
