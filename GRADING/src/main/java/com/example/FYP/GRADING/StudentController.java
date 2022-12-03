package com.example.FYP.GRADING;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/students")
public class StudentController {
    @Autowired
    private final StudentService service;

    public StudentController(StudentService service){
        this.service=service;
    }

    @GetMapping
    public List<Student> getstudents(){
        return service.getstudents();
    }
    @GetMapping(path="/{studentId}")
    public Optional<Student> getstudents1(@PathVariable("studentId") long studentId)
    {
        return service.getstudents(studentId);
    }

    @PostMapping("/addStudent")
    public String registerNewStudent( @RequestBody Student std){
        StudentService.addNewStudent(std);
        return "student added successfully";
    }
    @DeleteMapping(path="/{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId){
        StudentService.deleteStudent(studentId);

    }

}
