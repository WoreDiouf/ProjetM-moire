package com.wore.diouf.memoirebackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Cession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcession;
    private Double Montant;

    @OneToMany(mappedBy = "cession")
    private List<Historique_cession> historique_cessions;


}
