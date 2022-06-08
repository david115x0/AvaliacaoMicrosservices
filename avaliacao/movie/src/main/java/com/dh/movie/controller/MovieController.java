package com.dh.movie.controller;


import com.dh.movie.dto.MovieDTO;
import com.dh.movie.entity.Movie;
import com.dh.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;



    @GetMapping("/{genero}")
    public List<Movie> find(@PathVariable String genero){
        return movieService.findByGenero(genero);
    }


    @PostMapping
    public ResponseEntity<Void> save(@RequestBody MovieDTO dto){
        movieService.save(dto);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
