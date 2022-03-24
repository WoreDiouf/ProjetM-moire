package com.wore.diouf.memoirebackend.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Adherant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idadherant;
    private String nom;
    private String prenom;
    private String sexe;
    private String telephone;
    private String email;
    private String etablissement;
    @Column(unique=true)
    private String matricule;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date date_adhesion;
//    private Boolean etat;

//    @ManyToOne
//    private Cession cession;

    @OneToOne(mappedBy = "adherant")
    private Compte compte;

    @OneToMany(mappedBy = "adherant")
    private List<Historique_cession> historique_cessions;
}
