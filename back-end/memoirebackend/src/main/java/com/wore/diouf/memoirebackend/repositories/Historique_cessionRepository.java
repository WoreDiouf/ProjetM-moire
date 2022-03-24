package com.wore.diouf.memoirebackend.repositories;

import com.wore.diouf.memoirebackend.entities.Cession;
import com.wore.diouf.memoirebackend.entities.Historique_cession;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Historique_cessionRepository extends JpaRepository<Historique_cession, Long> {
    List<Historique_cession> findByCession(Cession cession);
}
