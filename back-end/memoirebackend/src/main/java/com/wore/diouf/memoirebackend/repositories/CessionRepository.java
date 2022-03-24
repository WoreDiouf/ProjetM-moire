package com.wore.diouf.memoirebackend.repositories;

import com.wore.diouf.memoirebackend.entities.Cession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CessionRepository extends JpaRepository<Cession, Long> {
}
