package com.cinema.service;

import com.cinema.entity.Acteur;
import com.cinema.entity.Film;
import com.cinema.entity.Personnage;
import com.cinema.entity.request.AddFilmRequest;
import com.cinema.repository.FilmRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {

    private FilmRepository filmRepository;

    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public List<Film> getFilms(){
        return filmRepository.findAll();
    }

    public List<Personnage> getPersonnagesFromFilm(long id){
        Film film = filmRepository.findByNoFilm(id).get(0);
        return filmRepository.getPersonnagesFromFilm(film);
    }

    public List<Acteur> getActeursFromPersonnagesFromFilm(long id){
        Film film = filmRepository.findByNoFilm(id).get(0);
        return filmRepository.getActeursFromPersonnagesFromFilm(film);
    }

    public Film addFilm(AddFilmRequest addFilmRequest) {
        Film film = new Film();
        film.setTitre(addFilmRequest.getTitre());
        film.setDuree(addFilmRequest.getDuree());
        film.setDateSortie(addFilmRequest.getDateSortie());
        film.setBudget(addFilmRequest.getBudget());
        film.setMontantRecette(addFilmRequest.getMontantRecette());
        film.setNoRea(addFilmRequest.getNoRea());
        film.setCodeCat(addFilmRequest.getCodeCat());
        return filmRepository.save(film);
    }

    public Film deleteFilm(int idFilm) {
        List<Film> films =  filmRepository.findByNoFilm(idFilm);
        Film film =  films.isEmpty() ? null : films.get(0);
        filmRepository.delete(film);
        return film;
    }
}
