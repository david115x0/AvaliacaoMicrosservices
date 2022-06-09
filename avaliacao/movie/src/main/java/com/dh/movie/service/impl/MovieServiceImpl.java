package com.dh.movie.service.impl;

import com.dh.movie.dto.MovieDTO;
import com.dh.movie.entity.Movie;
import com.dh.movie.repository.MovieRepository;
import com.dh.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MovieServiceImpl implements MovieService {


    @Autowired
    private MovieRepository repository;

    @Override
    public Movie save(MovieDTO dto) {
        Movie movie = new Movie();
        movie.setName(dto.getName());
        movie.setGenero(dto.getGenero());
        movie.setUrlStream(dto.getUrlStream());
        return repository.save(movie);
    }



    @Override
    public List<Movie> findByGenero(String genero) {
        return repository.findAllByGenero(genero);
    }
}
