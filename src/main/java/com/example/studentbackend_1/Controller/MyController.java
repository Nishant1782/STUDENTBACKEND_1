package com.example.studentbackend_1.Controller;
import com.example.studentbackend_1.Models.Student;
import com.example.studentbackend_1.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MyController {
    @Autowired
    StudentRepository studentRepository;
    @GetMapping("/students")
    public List<Student> getListOfStudents(){
        return studentRepository.findAll();
    }
    @PostMapping("/student")
    public String addStudent(@RequestBody Student student)
    {
        boolean recordExist = studentRepository.existsById(student.getId());
        if(!recordExist)
        {
            studentRepository.save(student);
            return "Record Added";
        }
        else {
            return "Record Already Exists";
        }


    }
}
