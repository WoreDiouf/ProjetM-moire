package com.wore.diouf.memoirebackend.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import com.wore.diouf.memoirebackend.enums.TypeComptes;
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
public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    private Double solde;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date date_creation;
    @Enumerated(EnumType.STRING)
    private TypeComptes type;

    @OneToOne
    private Adherant adherant;

    @OneToMany(mappedBy = "compte")
    private List<Operation> operations;
}


