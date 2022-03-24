package com.wore.diouf.memoirebackend.services;

import com.wore.diouf.memoirebackend.entities.Historique_cession;

import java.util.Collection;

public interface Historique_cessionService {

    Collection<Historique_cession> getAll();

    Historique_cession getById(long id);

    void save(Historique_cession historique_cession);

    void update(Historique_cession historique_cession);

    void delete(Long id);
}
