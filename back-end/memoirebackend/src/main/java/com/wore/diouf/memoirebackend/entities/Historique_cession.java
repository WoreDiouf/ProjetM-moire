package com.wore.diouf.memoirebackend.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.wore.diouf.memoirebackend.enums.EtatCessions;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Historique_cession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idhist;
    private Double montant;
    @Enumerated(EnumType.STRING)
    private EtatCessions etatCession;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date date_debut;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date date_fin;

    @ManyToOne
    private Adherant adherant;

    @ManyToOne
    private Cession cession;
}
