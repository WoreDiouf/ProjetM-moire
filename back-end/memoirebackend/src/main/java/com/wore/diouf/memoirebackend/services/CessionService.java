package com.wore.diouf.memoirebackend.services;

import com.wore.diouf.memoirebackend.entities.Cession;

import java.util.Collection;

public interface CessionService {

    Collection<Cession> getAll();

    Cession getById(long id);

    void save(Cession cession);

    void update(Cession cession);

    void delete(Long id);
}
