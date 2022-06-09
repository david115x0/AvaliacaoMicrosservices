package com.dh.catalago.feing;


import com.dh.catalago.entity.Catalago;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@FeignClient(value = "MOVIE")
public interface MovieFeign {
    @RequestMapping(method = RequestMethod.GET, value = "/movies/{genero}")
    List<Catalago> findMovie(@PathVariable String genero);
}
