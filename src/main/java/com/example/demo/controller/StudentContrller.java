package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentContrller {

    @Autowired
    private StudentService studentService;

    @PostMapping("/queryStudent")
    public List<Student> queryStudent()
    {
        return studentService.queryStudent();
    }

}
