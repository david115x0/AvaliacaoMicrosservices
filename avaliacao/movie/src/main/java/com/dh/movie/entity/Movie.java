package com.dh.movie.entity;


import lombok.Data;

import javax.persistence.*;

@Table(name = "movie")
@Entity
@Data
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String genero;
    private String urlStream;

}
