package com.dh.catalago.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "catalago")
@Data
public class Catalago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long idGenero;
    private String urlStream;
}
