package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Sara",
                        "svespinosag@correo.com",
                        LocalDate.of(2017, Month.MARCH,10),
                        5
                )
        );
    }

}
