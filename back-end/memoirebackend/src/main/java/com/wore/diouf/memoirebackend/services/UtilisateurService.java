package com.wore.diouf.memoirebackend.services;


import com.wore.diouf.memoirebackend.entities.Utilisateur;

import java.util.Collection;

public interface UtilisateurService {

    Collection<Utilisateur > getAll();

    Utilisateur getById(long id);

    void save(Utilisateur utilisateur);

    void addRoleToUser(String userName, String roleName);

    Utilisateur findByUserName(String userName);

    void update(Utilisateur utilisateur);

    void delete(Long id);
}
