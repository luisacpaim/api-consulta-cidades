package com.github.luisacpaim.citiesapi.countries;

import com.github.luisacpaim.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
