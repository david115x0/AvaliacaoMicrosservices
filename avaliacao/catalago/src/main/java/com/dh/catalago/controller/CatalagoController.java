package com.dh.catalago.controller;

import com.dh.catalago.entity.Catalago;
import com.dh.catalago.service.impl.CatalagoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/catalago")
public class CatalagoController {

    @Autowired
    private CatalagoServiceImpl catalagoService;

    @GetMapping("/{genero}")
    public List<Catalago> encontrarGenero(@PathVariable String genero){
        return catalagoService.find(genero);
    }
}
