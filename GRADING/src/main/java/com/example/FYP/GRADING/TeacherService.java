package com.example.FYP.GRADING;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    private static TeacherRepository repository=null;
    @Autowired
    public TeacherService(TeacherRepository repository){
        this.repository=repository;

    }

    public static void addTeacher(Teacher std) {
        repository.save(std);

    }

    public static void deleteTeacher(long TeacherId) {
        boolean exists=repository.existsById( TeacherId);
        if(!exists){
            throw new IllegalStateException("agent with id"+TeacherId+"does not exists");
        }
        repository.deleteById(TeacherId);
    }


    @GetMapping
    public List<Teacher> getteachers() {
        return repository.findAll();

    }
    public Optional<Teacher> getteacher(long teacherId)
    {
        return repository.findById(teacherId);

    }
}



