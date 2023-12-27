package com.dana.menalingo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository<Country> extends JpaRepository<Country, Long> {
    // Add any additional repository methods if needed
}
