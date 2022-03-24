package com.wore.diouf.memoirebackend.services;

import com.wore.diouf.memoirebackend.entities.Cession;
import com.wore.diouf.memoirebackend.repositories.CessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@Service
@Transactional
public class CessionServiceImpl implements CessionService{

    @Autowired
    CessionRepository cessionRepository;

    @Override
    public Collection<Cession> getAll () {
        return cessionRepository.findAll();
    }

    @Override
    public Cession getById (long id) {
        return cessionRepository.findById(id).get();
    }

    @Override
    public void save (Cession cession) {
        cessionRepository.save(cession);
    }

    @Override
    public void update (Cession cession) {
        cessionRepository.save(cession);
    }

    @Override
    public void delete (Long id) {
        cessionRepository.deleteById(id);
    }
}
