package com.cinema.repository;

import com.cinema.entity.Acteur;
import com.cinema.entity.Film;
import com.cinema.entity.Personnage;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {

    List<Film> findByNoFilm(long id);

    @Query("SELECT DISTINCT p FROM Personnage p, Film f WHERE p.noFilm = f.noFilm")
    List<Personnage> getPersonnagesFromFilm(Film f);

    @Query("SELECT DISTINCT a FROM Acteur a, Personnage p, Film f WHERE a.NoAct = p.noAct AND p.noFilm = f.noFilm")
    List<Acteur> getActeursFromPersonnagesFromFilm(Film f);

}
