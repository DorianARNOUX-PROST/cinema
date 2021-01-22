package com.cinema.controller;
import com.cinema.entity.Personnage;
import com.cinema.entity.request.AddPersonnageRequest;
import com.cinema.entity.request.DeletePersonnageRequest;
import com.cinema.entity.request.UpdatePersonnageRequest;
import com.cinema.service.PersonnageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personnage")
@CrossOrigin(origins = "*")
public class PersonnageController {

    private PersonnageService ps;

    @Autowired
    public PersonnageController(PersonnageService personnageService){this.ps = personnageService;}

    @GetMapping("/list")
    public List<Personnage> getPersonnages(){
        return ps.getPersonnages();
    }

    @PostMapping("/add")
    public ResponseEntity<String> addPersonnage(@RequestBody AddPersonnageRequest addPersonnageRequest){
        Personnage personnage = ps.addPersonnage(addPersonnageRequest);
        return ResponseEntity.ok().body( "{\"nom\" : \"" +personnage.getNomPers()+ "\"}");
    }

    @PostMapping("/delete")
    public ResponseEntity<Object> deletePersonnage(@RequestBody DeletePersonnageRequest deletePersonnageRequest){
        Personnage personnage = ps.deletePersonnage(deletePersonnageRequest.getNoPers());
        return ResponseEntity.ok().body("{\"id\" : \"" + personnage.getNoPers() + "\",\"nom\" : \""+personnage.getNomPers() + "\"}");
    }

    @PostMapping("/update")
    public ResponseEntity<String> updatePersonnage(@RequestBody UpdatePersonnageRequest updatePersonnageRequest){
        ps.updatePersonnage(updatePersonnageRequest);
        return ResponseEntity.ok().body( "{\"nom\" : \"" +ps.updatePersonnage(updatePersonnageRequest).getNomPers()+ "\"}");
    }
}
