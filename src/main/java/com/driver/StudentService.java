package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student student)
    {
        studentRepository.addStudent(student);
    }

    public Student getStudentByName(String name)
    {
        return studentRepository.getStudentByName(name);
    }
}