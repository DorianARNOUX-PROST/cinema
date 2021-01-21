package com.cinema.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "film", schema = "cinema", catalog = "")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no_film", nullable = false)
    private long noFilm;

    @Basic
    @Column(name = "titre", nullable = false, length = 100)
    private String titre;

    @Basic
    @Column(name = "duree", nullable = false, length = 100)
    private int duree;

    @Basic
    @Column(name = "date_sortie", nullable = false, length = 100)
    private String dateSortie;

    @Basic
    @Column(name = "budget", nullable = false, length = 100)
    private int budget;

    @Basic
    @Column(name = "montant_recette", nullable = false, length = 100)
    private int montantRecette;

    @Basic
    @Column(name = "no_rea", nullable = false, length = 100)
    private int noRea;

    @Basic
    @Column(name = "code_cat", nullable = false, length = 100)
    private String codeCat;

    /*@OneToMany(fetch = FetchType.LAZY, mappedBy = "film")
    private List<Personnage> personnages;*/

}
