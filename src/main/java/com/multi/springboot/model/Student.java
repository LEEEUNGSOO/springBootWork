package com.multi.springboot.model;



import java.time.LocalDate;

import lombok.Data;

@Data
public class Student {
    private int studNo;
    private String name;
    private String serId;
    private int grade;
    private String idNum;
    private LocalDate birthDate;
    private String tel;
    private double height;
    private double weight;
    private int deptNo;
    private int profNo;

}
