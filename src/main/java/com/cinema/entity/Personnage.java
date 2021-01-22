package com.cinema.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

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
    private long noAct;

    @Basic
    @Column(name = "nom_pers", nullable = false, length = 100)
    private String nomPers;

    @ManyToOne
    @JsonIgnoreProperties("personnages")
    @JoinColumn(name = "no_film", insertable = false, updatable = false)
    private Film film;

    @ManyToOne
    @JsonIgnoreProperties("personnages")
    @JoinColumn(name = "no_act", insertable = false, updatable = false)
    private Acteur acteur;

}
