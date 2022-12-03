package com.example.FYP.GRADING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

        private static Repository repository=null;
        @Autowired
        public StudentService(Repository repository){
            this.repository=repository;

        }

        public static void addNewStudent(Student std) {
            repository.save(std);

        }

        public static void deleteStudent(long StudentId) {
            boolean exists=repository.existsById( StudentId);
            if(!exists){
                throw new IllegalStateException("agent with id"+StudentId+"does not exists");
            }
            repository.deleteById(StudentId);
        }


        @GetMapping
        public List<Student> getstudents() {
            return repository.findAll();

        }
        public Optional<Student> getstudents(long studentId)
        {
            return repository.findById(studentId);

        }
    }


