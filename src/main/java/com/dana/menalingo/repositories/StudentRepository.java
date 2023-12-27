package com.dana.menalingo.repositories;

import com.dana.menalingo.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {
}
