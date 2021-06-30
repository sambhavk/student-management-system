package com.project2.studentmanagementsystem.repository;

import com.project2.studentmanagementsystem.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
