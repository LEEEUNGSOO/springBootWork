package com.multi.springboot.controller;



import java.util.List;

import com.multi.springboot.mapper.EmpMapper;
import com.multi.springboot.model.Emp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EmpRestController {

    private final EmpMapper empMapper;

    public EmpRestController(EmpMapper empMapper) {
        this.empMapper = empMapper;
    }

    @GetMapping("/api/employees")
    public List<Emp> getAllEmployees() {
        return empMapper.getAllEmployees();
    }
}
