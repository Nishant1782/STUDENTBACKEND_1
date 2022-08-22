package com.example.studentbackend_1.Repositories;

import com.example.studentbackend_1.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
