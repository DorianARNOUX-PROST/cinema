package com.cinema.entity.request;

import lombok.Data;

@Data
public class UpdatePersonnageRequest {

    private long noPers;
    private long noFilm;
    private long noAct;
    private String nomPers;
}
