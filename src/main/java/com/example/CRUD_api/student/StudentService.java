package com.example.CRUD_api.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service                            // Tells that this class has to be a Spring Bean, and that it needs to be instantiated
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudents() {
        return studentRepository.findAll();

//        return List.of(
//                new Student(
//                        1L,
//                        "Marian",
//                        23,
//                        LocalDate.of(2000, Month.AUGUST, 10),
//                        "marian.gheorghe@gmail.com"
//                )
//        );
    }
}
