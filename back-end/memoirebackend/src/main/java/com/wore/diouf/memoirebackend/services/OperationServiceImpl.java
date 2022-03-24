package com.wore.diouf.memoirebackend.services;

import com.wore.diouf.memoirebackend.entities.Operation;
import com.wore.diouf.memoirebackend.repositories.OperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@Service
@Transactional
public class OperationServiceImpl implements OperationService{

    @Autowired
    OperationRepository operationRepository;

    @Override
    public Collection<Operation> getAll () {
        return operationRepository.findAll();
    }

    @Override
    public Operation getById (long id) {
        return operationRepository.findById(id).get();
    }

    @Override
    public void save (Operation operation) {
        operationRepository.save(operation);
    }

    @Override
    public void update (Operation operation) {
        operationRepository.save(operation);
    }

    @Override
    public void delete (Long id) {
        operationRepository.deleteById(id);
    }
}
