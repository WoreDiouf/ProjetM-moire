package com.wore.diouf.memoirebackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idrole;
    @Column(unique = true)
    private String roleName;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Utilisateur> utilisateurs = new ArrayList<>();
}


