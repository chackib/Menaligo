package com.dana.menalingo.repositories;

import com.dana.menalingo.entities.LanguageLevel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageLevelRepository extends JpaRepository<LanguageLevel, Long> {
    // Add any additional repository methods if needed
}
