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
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iduser;
    @Column(unique = true)
    private String userName;
    private String password;

    @ManyToMany(mappedBy = "utilisateurs", fetch = FetchType.EAGER)
    private List<Role> roles = new ArrayList<>();
}
