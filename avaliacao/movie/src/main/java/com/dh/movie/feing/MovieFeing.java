package com.dh.movie.feing;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "catalago")
public interface MovieFeing {

    @RequestMapping(method = RequestMethod.GET, value = "/movies/{genero}")
    String findByGenero(@PathVariable(value = "genero") String nomeGenero);
}
