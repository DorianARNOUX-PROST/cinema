package com.cinema.service;

import com.cinema.entity.Acteur;
import com.cinema.entity.Personnage;
import com.cinema.repository.ActeurRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActeurService {

    private ActeurRepository acteurRepository;

    public ActeurService(ActeurRepository acteurRepository) {
        this.acteurRepository = acteurRepository;
    }

    public List<Acteur> getActeurs(){
        return acteurRepository.findAll();
    }

    public List<Personnage> getPersonnagesFromActeur(long id){
        Acteur acteur = acteurRepository.findByNoAct(id).get(0);
        return acteurRepository.getPersonnagesFromActeur(acteur);
    }

    public List<Acteur> getFilmsFromActeur(long id){
        Acteur acteur = acteurRepository.findByNoAct(id).get(0);
        return acteurRepository.getFilmsFromActeur(acteur);
    }
}
