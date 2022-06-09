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
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;



    @GetMapping("/{genero}")
    public ResponseEntity<List<Movie>> findAllByGenero(@PathVariable String genero){
        return ResponseEntity.ok(movieService.findByGenero(genero));
    }


    @PostMapping
    public ResponseEntity<Movie> salvar(@RequestBody MovieDTO dto) {
        Movie movie = movieService.save(dto);
        return ResponseEntity.ok(movie);
    }
}
