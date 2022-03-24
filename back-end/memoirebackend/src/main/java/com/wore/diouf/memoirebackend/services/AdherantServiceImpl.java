package com.wore.diouf.memoirebackend.services;

import com.wore.diouf.memoirebackend.entities.Adherant;
import com.wore.diouf.memoirebackend.repositories.AdherantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@Service
@Transactional
public class AdherantServiceImpl implements AdherantService {
    @Autowired
    AdherantRepository adherantRepository;

    @Override
    public Collection<Adherant> getAll () {
        return adherantRepository.findAll();
    }

    @Override
    public Adherant getById (long id) {
        return adherantRepository.findById(id).get();
    }

    @Override
    public void save (Adherant adherant) {
        adherantRepository.save(adherant);
    }

    @Override
    public void update (Adherant adherant) {
        adherantRepository.save(adherant);
    }

    @Override
    public void delete (Long id) {
        adherantRepository.deleteById(id);
    }
}
