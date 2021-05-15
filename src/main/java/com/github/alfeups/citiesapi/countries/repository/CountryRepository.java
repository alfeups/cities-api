package com.github.alfeups.citiesapi.countries.repository;

import com.github.alfeups.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
