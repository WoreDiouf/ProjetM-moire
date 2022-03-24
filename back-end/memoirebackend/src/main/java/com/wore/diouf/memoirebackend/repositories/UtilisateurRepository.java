package com.wore.diouf.memoirebackend.repositories;

import com.wore.diouf.memoirebackend.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

    Utilisateur findByUserName(String userName);
}
