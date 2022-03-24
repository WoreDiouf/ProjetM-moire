package com.wore.diouf.memoirebackend.services;

import com.wore.diouf.memoirebackend.entities.Compte;
import com.wore.diouf.memoirebackend.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@Service
@Transactional
public class CompteServiceImpl implements CompteService{

    @Autowired
    CompteRepository compteRepository;

    @Override
    public Collection<Compte> getAll () {
        return compteRepository.findAll();
    }

    @Override
    public Compte getById (long id) {
        return compteRepository.findById(id).get();
    }

    @Override
    public void save (Compte compte) {
        compteRepository.save(compte);
    }

    @Override
    public void update (Compte compte) {
        compteRepository.save(compte);
    }

    @Override
    public void delete (Long id) {
        compteRepository.deleteById(id);
    }
}
