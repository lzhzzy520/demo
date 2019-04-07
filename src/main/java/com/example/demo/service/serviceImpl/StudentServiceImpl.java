package com.example.demo.service.serviceImpl;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> queryStudent() {
        return studentMapper.queryStudent();
    }
}
