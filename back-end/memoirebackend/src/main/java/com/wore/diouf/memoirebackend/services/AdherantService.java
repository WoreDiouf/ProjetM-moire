package com.wore.diouf.memoirebackend.services;

import com.wore.diouf.memoirebackend.entities.Adherant;

import java.util.Collection;

public interface AdherantService {

    Collection<Adherant> getAll();

    Adherant getById(long id);

    void save(Adherant adherant);

    void update(Adherant adherant);

    void delete(Long id);
}
