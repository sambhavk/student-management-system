package com.project2.studentmanagementsystem.service;

import java.util.List;

import com.project2.studentmanagementsystem.entity.Student;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById(Long id);
    void deleteStudent(Long id);
}
