package com.dh.movie.dto;


import lombok.Data;

@Data
public class MovieDTO {

    private Long id;
    private String name;
    private String genero;
    private String urlStream;
}
