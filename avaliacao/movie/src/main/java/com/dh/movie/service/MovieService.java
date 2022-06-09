package com.dh.movie.service;

import com.dh.movie.dto.MovieDTO;
import com.dh.movie.entity.Movie;

import java.util.List;

public interface MovieService {

    Movie save(MovieDTO dto);
    List<Movie> findByGenero(String genero);

}
