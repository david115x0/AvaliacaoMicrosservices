package com.dh.catalago.service.impl;

import com.dh.catalago.entity.Catalago;
import com.dh.catalago.feing.MovieFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalagoServiceImpl {

    @Autowired
    private MovieFeign movieFeign;


    public List<Catalago> find(String genero) {
        return movieFeign.findMovie(genero);
    }
}
