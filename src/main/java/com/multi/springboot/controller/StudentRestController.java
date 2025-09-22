package com.multi.springboot.controller;





import java.util.List;

import com.multi.springboot.mapper.StudentMapper;
import com.multi.springboot.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class StudentRestController {

    private final StudentMapper studentMapper;

    public StudentRestController(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @GetMapping("/api/students")
    public List<Student> getAllStudents() {
        return studentMapper.getAllStudents();
    }
}
