package com.example.FYP.GRADING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/teachers")
public class TeacherController {
    @Autowired
    private final TeacherService service;

    public TeacherController(TeacherService service){
        this.service=service;
    }

    @GetMapping
    public List<Teacher> getteachers(){
        return service.getteachers();
    }
    @GetMapping(path="/{teacherId}")
    public Optional<Teacher> getteachers(@PathVariable("teacherId") long teacherId)
    {
        return service.getteacher(teacherId);
    }

    @PostMapping("/addTeacher")
    public String registerTeacher( @RequestBody Teacher std){
        TeacherService.addTeacher(std);
        return "teacher added successfully";
    }
    @DeleteMapping(path="/{teacherId}")
    public void deleteTeacher(@PathVariable("teacherId") Long teacherId){
        TeacherService.deleteTeacher(teacherId);

    }

}


