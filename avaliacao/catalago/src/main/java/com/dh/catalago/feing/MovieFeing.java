package com.dh.catalago.feing;


import com.dh.catalago.entity.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "movie")
public interface MovieFeing {

    @RequestMapping(method = RequestMethod.GET, value = "/{genero}")
    List<Movie> findByGenero(@PathVariable(value = "genero") String genero);
}
