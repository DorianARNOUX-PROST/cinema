package com.cinema.repository;
import com.cinema.entity.Acteur;
import com.cinema.entity.Personnage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActeurRepository extends JpaRepository<Acteur, Long> {

    List<Acteur> findByNoAct(long id);

    @Query("SELECT DISTINCT p FROM Personnage p, Acteur act WHERE p.noAct = act.noAct AND act.noAct = ?1")
    List<Personnage> getPersonnagesFromActeur(long id);

    @Query("SELECT DISTINCT f FROM Film f, Personnage p, Acteur a WHERE a.noAct = p.noAct AND p.noFilm = f.noFilm")
    List<Acteur> getFilmsFromActeur(Acteur a);

}
