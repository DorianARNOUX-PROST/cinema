package com.cinema.repository;

import com.cinema.entity.Personnage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonnageRepository extends JpaRepository<Personnage, Long> {

    List<Personnage> findByNoPers(long id);


}
