package com.cinema.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "personnage", schema = "cinema", catalog = "")
public class Personnage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NoPers", nullable = false)
    private long noPers;

    @Basic
    @Column(name = "NoFilm", nullable = false)
    private long noFilm;

    @Basic
    @Column(name = "NoAct", nullable = false, length = 100)
    private int noAct;

    @Basic
    @Column(name = "NomPers", nullable = false, length = 100)
    private String nomPers;
}
