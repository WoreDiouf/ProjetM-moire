package com.wore.diouf.memoirebackend.services;

import com.wore.diouf.memoirebackend.entities.Role;
import com.wore.diouf.memoirebackend.entities.Utilisateur;
import com.wore.diouf.memoirebackend.repositories.RoleRepository;
import com.wore.diouf.memoirebackend.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@Service
@Transactional
public class UtilisateurServiceImpl implements UtilisateurService {

    @Autowired
    UtilisateurRepository utilisateurRepository;

    @Autowired
    RoleRepository roleRepository;

    @Override
    public Collection<Utilisateur> getAll () {
        return utilisateurRepository.findAll();
    }

    @Override
    public Utilisateur getById (long id) {
        return utilisateurRepository.findById(id).get();
    }

    @Override
    public void save (Utilisateur utilisateur) {
        utilisateurRepository.save(utilisateur);
    }

    @Override
    public void addRoleToUser (String userName, String roleName) {
        Role role = roleRepository.findByRoleName(roleName);
        Utilisateur utilisateur = utilisateurRepository.findByUserName(userName);
        utilisateur.getRoles().add(role);
    }

    @Override
    public Utilisateur findByUserName (String userName) {
        return utilisateurRepository.findByUserName(userName);
    }

    @Override
    public void update (Utilisateur utilisateur) {
        utilisateurRepository.save(utilisateur);
    }

    @Override
    public void delete (Long id) {
        utilisateurRepository.deleteById(id);
    }
}
