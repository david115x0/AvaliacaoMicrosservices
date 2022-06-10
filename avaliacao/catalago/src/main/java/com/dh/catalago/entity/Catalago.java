package com.dh.catalago.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Catalago")
@Data
public class Catalago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String genero;
    private String urlStream;
}
