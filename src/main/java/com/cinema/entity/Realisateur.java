package com.cinema.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "realisateur", schema = "cinema", catalog = "")
public class Realisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NoRea", nullable = false)
    private long noRea;

    @Basic
    @Column(name = "NomRea", nullable = false, length = 100)
    private String nomRea;

    @Basic
    @Column(name = "PrenRea", nullable = false, length = 100)
    private String prenRea;
}
