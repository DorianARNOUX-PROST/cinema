package com.cinema.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "realisateur", schema = "cinema", catalog = "")
public class Realisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no_rea", nullable = false)
    private long noRea;

    @Basic
    @Column(name = "nom_rea", nullable = false, length = 100)
    private String nomRea;

    @Basic
    @Column(name = "pren_rea", nullable = false, length = 100)
    private String prenRea;

    @JsonIgnoreProperties("realisateur")
    @OneToMany(mappedBy="realisateur")
    private List<Film> films;
}
