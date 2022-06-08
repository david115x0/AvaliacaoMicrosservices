package com.dh.catalago.service.impl;

import com.dh.catalago.entity.Movie;
import com.dh.catalago.feing.MovieFeing;
import com.dh.catalago.repository.CatalagoRepository;
import com.dh.catalago.service.CatalagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalagoServiceImpl implements CatalagoService {

    @Autowired
    private MovieFeing movieFeing;

    @Autowired
    private CatalagoRepository catalagoRepository;


    @Override
    public List<Movie> findByGenero(String nomeGenero) {
        return movieFeing.findByGenero(nomeGenero);
    }

}
