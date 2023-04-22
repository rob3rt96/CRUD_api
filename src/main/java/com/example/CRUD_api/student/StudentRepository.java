package com.example.CRUD_api.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
