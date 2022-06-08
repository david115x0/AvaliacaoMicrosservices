package com.dh.catalago.service;

import com.dh.catalago.entity.Movie;

import java.util.List;

public interface CatalagoService {


    List<Movie> findByGenero(String nomeGenero);
}
