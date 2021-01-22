package com.cinema.repository;

import com.cinema.entity.Acteur;
import com.cinema.entity.Film;
import com.cinema.entity.Personnage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {

    List<Film> findByNoFilm(long id);

    @Query("SELECT DISTINCT p FROM Personnage p, Film f WHERE p.noFilm = f.noFilm")
    List<Personnage> getPersonnagesFromFilm(Film f);

    @Query("SELECT DISTINCT a FROM Acteur a, Personnage p, Film f WHERE a.noAct = p.noAct AND p.noFilm = f.noFilm")
    List<Acteur> getActeursFromPersonnagesFromFilm(Film f);

}
