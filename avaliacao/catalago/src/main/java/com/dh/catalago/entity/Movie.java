package com.dh.catalago.entity;


import lombok.Data;

import javax.persistence.*;


@Data
public class Movie {

    private Long id;
    private String name;
    private String genero;
    private String urlStream;

}
