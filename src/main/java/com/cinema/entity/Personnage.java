package com.cinema.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "personnage", schema = "cinema", catalog = "")
public class Personnage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no_pers", nullable = false)
    private long noPers;

    @Basic
    @Column(name = "no_film", nullable = false)
    private long noFilm;

    @Basic
    @Column(name = "no_act", nullable = false, length = 100)
    private int noAct;

    @Basic
    @Column(name = "nom_pers", nullable = false, length = 100)
    private String nomPers;

    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "no_film")
    private Film film;*/
}
