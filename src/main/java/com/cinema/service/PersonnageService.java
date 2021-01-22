package com.cinema.service;

import com.cinema.entity.Personnage;
import com.cinema.entity.request.AddPersonnageRequest;
import com.cinema.entity.request.UpdatePersonnageRequest;
import com.cinema.repository.PersonnageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonnageService {

    private PersonnageRepository personnageRepository;

    public PersonnageService(PersonnageRepository personnageRepository) {
        this.personnageRepository = personnageRepository;
    }

    public List<Personnage> getPersonnages(){
        return personnageRepository.findAll();
    }

    public Personnage addPersonnage(AddPersonnageRequest addPersonnageRequest) {
        Personnage personnage = new Personnage();
        personnage.setNoAct(addPersonnageRequest.getNoAct());
        personnage.setNoFilm(addPersonnageRequest.getNoFilm());
        personnage.setNomPers(addPersonnageRequest.getNomPers());
        return personnageRepository.save(personnage);
    }

    public Personnage deletePersonnage(long idPersonnage) {
        System.out.println(idPersonnage);
        List<Personnage> personnages =  personnageRepository.findByNoPers(idPersonnage);
        Personnage personnage =  personnages.isEmpty() ? null : personnages.get(0);
        personnageRepository.delete(personnage);
        return personnage;
    }

    public Personnage updatePersonnage(UpdatePersonnageRequest updatePersonnageRequest) {
        List<Personnage> personnages =  personnageRepository.findByNoPers(updatePersonnageRequest.getNoPers());
        Personnage personnage =  personnages.isEmpty() ? null : personnages.get(0);
        personnage.setNoAct(updatePersonnageRequest.getNoAct());
        personnage.setNoFilm(updatePersonnageRequest.getNoFilm());
        personnage.setNomPers(updatePersonnageRequest.getNomPers());
        return personnageRepository.save(personnage);
    }
}
