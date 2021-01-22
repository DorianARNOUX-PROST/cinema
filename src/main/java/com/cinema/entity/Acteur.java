package com.cinema.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "acteur", schema = "cinema", catalog = "")
public class Acteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no_act", nullable = false)
    private long noAct;

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
    @Column(name = "date_deces", length = 200)
    private String dateDeces;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "acteur")
    @JsonIgnoreProperties("acteur")
    private List<Personnage> personnages;
}
