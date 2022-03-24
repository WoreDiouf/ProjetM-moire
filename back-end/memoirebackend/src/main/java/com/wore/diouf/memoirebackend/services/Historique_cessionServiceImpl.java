package com.wore.diouf.memoirebackend.services;

import com.wore.diouf.memoirebackend.entities.Historique_cession;
import com.wore.diouf.memoirebackend.repositories.Historique_cessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@Service
@Transactional
public class Historique_cessionServiceImpl implements Historique_cessionService{

    @Autowired
    Historique_cessionRepository historique_cessionRepository;

    @Override
    public Collection<Historique_cession> getAll () {
        return historique_cessionRepository.findAll();
    }

    @Override
    public Historique_cession getById (long id) {
        return historique_cessionRepository.findById(id).get();
    }

    @Override
    public void save (Historique_cession historique_cession) {
        historique_cessionRepository.save(historique_cession);
    }

    @Override
    public void update (Historique_cession historique_cession) {
        historique_cessionRepository.save(historique_cession);
    }

    @Override
    public void delete (Long id) {
        historique_cessionRepository.deleteById(id);
    }
}
