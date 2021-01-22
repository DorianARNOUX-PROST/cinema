package com.cinema.controller;
import com.cinema.entity.Acteur;
import com.cinema.entity.Personnage;
import com.cinema.service.ActeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/acteur")
@CrossOrigin(origins = "*")
public class ActeurController {

    private ActeurService as;

    @Autowired
    public ActeurController(ActeurService acteurService){this.as = acteurService;}

    @GetMapping("/list")
    public List<Acteur> getActeurs(){
        return as.getActeurs();
    }

    @GetMapping("/personnages/{id}")
    public List<Personnage> getPersonnagesFromActeur(@PathVariable long id){
        return as.getPersonnagesFromActeur(id);
    }

    @GetMapping("/films/{id}")
    public List<Acteur> getFilmsFromActeur(@PathVariable long id){
        return as.getFilmsFromActeur(id);
    }
}
