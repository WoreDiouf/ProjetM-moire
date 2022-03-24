package com.wore.diouf.memoirebackend.services;

import com.wore.diouf.memoirebackend.entities.Compte;

import java.util.Collection;

public interface CompteService {

    Collection<Compte> getAll();

    Compte getById(long id);

    void save(Compte compte);

    void update(Compte compte);

    void delete(Long id);
}
