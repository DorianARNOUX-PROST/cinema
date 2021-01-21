package com.cinema.entity.request;

import lombok.Data;

@Data
public class AddFilmRequest {

    private String titre;
    private int duree;
    private String dateSortie;
    private int budget;
    private int montantRecette;
    private int noRea;
    private String codeCat;
}
