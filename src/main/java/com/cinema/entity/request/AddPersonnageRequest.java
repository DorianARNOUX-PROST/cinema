package com.cinema.entity.request;

import lombok.Data;

@Data
public class AddPersonnageRequest {

    private long noFilm;
    private long noAct;
    private String nomPers;
}
