package com.cinema.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "categorie", schema = "cinema", catalog = "")
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code_cat", nullable = false)
    private String codeCat;

    @Basic
    @Column(name = "libelle_cat", nullable = false, length = 100)
    private String libelleCat;

    @Basic
    @Column(name = "image", nullable = false, length = 100)
    private String image;

    @JsonIgnoreProperties("categorie")
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "categorie")
    private List<Film> films;
}
