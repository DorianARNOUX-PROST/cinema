package com.cinema.controller;
import com.cinema.entity.Film;
import com.cinema.entity.request.AddFilmRequest;
import com.cinema.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/film")
public class FilmController {

    private FilmService fs;

    @Autowired
    public FilmController(FilmService filmService){this.fs = filmService;}

    @GetMapping("/list")
    public List<Film> getFilms(){
        return fs.getFilms();
    }

    @PostMapping("/add")
    public ResponseEntity<String> addFilm(@RequestBody AddFilmRequest addFilmRequest){
        fs.addFilm(addFilmRequest);
        return ResponseEntity.ok().body( "{\"titre\" : \"" +fs.addFilm(addFilmRequest).getTitre()+ "\"}");
    }

    @PostMapping("/delete")
    public ResponseEntity<Object> deleteFilm(@RequestBody int idFilm){
        Film film = fs.deleteFilm(idFilm);
        return ResponseEntity.ok().body("{\"id\" : \"" + film.getNoFilm() + "\",\"titre\" : \""+film.getTitre() + "\"}");
    }
}
