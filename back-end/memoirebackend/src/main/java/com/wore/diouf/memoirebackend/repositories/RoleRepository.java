package com.wore.diouf.memoirebackend.repositories;

import com.wore.diouf.memoirebackend.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByRoleName(String roleName);
}
