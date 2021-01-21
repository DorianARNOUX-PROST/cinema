package com.cinema.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "acteur", schema = "cinema", catalog = "")
public class Acteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no_act", nullable = false)
    private long NoAct;

    @Basic
    @Column(name = "nom_act", nullable = false, length = 100)
    private String nomAct;

    @Basic
    @Column(name = "pren_act", nullable = false, length = 200)
    private String prenAct;

    @Basic
    @Column(name = "date_naiss", nullable = false, length = 200)
    private String dateNaiss;

    @Basic
    @Column(name = "date_deces", nullable = true, length = 200)
    private String dateDeces;
}
