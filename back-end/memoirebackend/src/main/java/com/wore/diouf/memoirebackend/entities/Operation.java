package com.wore.diouf.memoirebackend.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.wore.diouf.memoirebackend.enums.TypeOperations;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idop;
    private Double montant;
    @Enumerated(EnumType.STRING)
    private TypeOperations typeOperation;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date date;

    @ManyToOne
    private Compte compte;
}
