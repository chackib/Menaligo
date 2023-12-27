package com.dana.menalingo.repositories;

import com.dana.menalingo.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LanguageRepository extends JpaRepository<Language, Long> {
    // Add any additional repository methods if needed
}
