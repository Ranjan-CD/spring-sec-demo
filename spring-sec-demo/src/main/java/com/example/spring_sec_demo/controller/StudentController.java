package com.example.spring_sec_demo.controller;

import com.example.spring_sec_demo.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students= new ArrayList<>(List.of(
            new Student(1,"ranjan","java"),
            new Student(2,"osho","sanatan")
    ));

    @GetMapping("getStudents")
    public List<Student> getStudents(){
        return students;
    }

    @PostMapping("addStudent")
    public void addStudents(@RequestBody Student s){
        students.add(s);
    }
}
