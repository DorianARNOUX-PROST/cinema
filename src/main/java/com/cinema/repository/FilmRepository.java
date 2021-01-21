package com.cinema.repository;

import com.cinema.entity.Film;
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

    List<Film> findByNoFilm(int id);

    /*@Query("SELECT f.titre,COUNT(*) FROM Film f GROUP BY commune")
    public List<Object[]> countTrashesByCommune();*/

}
