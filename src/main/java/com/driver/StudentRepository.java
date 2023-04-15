package com.driver;


import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {
    Map <String,Student> studentDB = new HashMap<>();

    public void addStudent(Student student)
    {
        String key = student.getName();
        studentDB.put(key,student);
    }

    public Student getStudentByName(String name)
    {
        if(studentDB.containsKey(name))
        {
            return studentDB.get(name);
        }
        return null;
    }
}
