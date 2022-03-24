package com.wore.diouf.memoirebackend.repositories;

import com.wore.diouf.memoirebackend.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}
