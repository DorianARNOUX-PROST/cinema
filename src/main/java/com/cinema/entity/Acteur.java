package com.cinema.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "acteur", schema = "cinema", catalog = "")
public class Acteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NoAct", nullable = false)
    private long NoAct;

    @Basic
    @Column(name = "NomAct", nullable = false, length = 100)
    private String nomAct;

    @Basic
    @Column(name = "PrenAct", nullable = false, length = 200)
    private String prenAct;

    @Basic
    @Column(name = "DateNaiss", nullable = false, length = 200)
    private String dateNaiss;

    @Basic
    @Column(name = "DateDeces", nullable = true, length = 200)
    private String dateDeces;
}
