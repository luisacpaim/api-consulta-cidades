package com.github.luisacpaim.citiesapi.cities;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("cities")
public class CityResource {

    private final CityRepository repository;

    public CityResource(final CityRepository repository) {
        this.repository = repository;
    }

    // 1st -> exemplo sem paginação
      @GetMapping
      public List<City> cities() {
          return repository.findAll();
      }

    /*  2nd - Pageable -> exemplo de paginação, como pais
    @GetMapping
    public Page<City> cities(final Pageable page) {

        return repository.findAll(page);
    }*/
}