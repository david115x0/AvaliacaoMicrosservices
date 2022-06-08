package com.dh.catalago.controller;


import com.dh.catalago.entity.Movie;
import com.dh.catalago.service.CatalagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/catalogo")
public class CatalagoController {

    @Autowired
    private CatalagoService service;

    @GetMapping("/{genero}")
    public List<Movie> findGenero(@PathVariable String genero){
        return service.findByGenero(genero);
    }
}
