package com.dh.movie.service.impl;

import com.dh.movie.dto.MovieDTO;
import com.dh.movie.entity.Movie;
import com.dh.movie.feing.MovieFeing;
import com.dh.movie.repository.MovieRepository;
import com.dh.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MovieServiceImpl implements MovieService {


    @Autowired
    private MovieFeing movieFeing;

    @Autowired
    private MovieRepository repository;

    @Override
    public void save(MovieDTO dto) {
        Movie movie = new Movie();
        movie.setName(dto.getName());
        movie.setGenero(dto.getGenero());
        repository.save(movie);
    }


    @Override
    public List<Movie> findByGenero(String genero) {
        var movie = repository.findByGenero(genero);
        return movie;
    }
}
