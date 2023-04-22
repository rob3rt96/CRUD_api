package com.example.CRUD_api.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.AUGUST;
import static java.time.Month.DECEMBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student marian = new Student(
                    "Marian",
                    LocalDate.of(2000, AUGUST, 10),
                    "marian.gheorghe@gmail.com"
            );

            Student alex = new Student(
                    "Alex",
                    LocalDate.of(1995, DECEMBER, 22),
                    "alex.manolache@gmail.com"
            );

            studentRepository.saveAll(List.of(marian, alex));
        };
    }
}
