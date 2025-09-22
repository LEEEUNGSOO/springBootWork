package com.multi.springboot.model;



import java.time.LocalDate;

import lombok.Data;
@Data
public class Emp {
    private Integer empNo;
    private String eName;
    private String job;
    private Integer mgr;
    private LocalDate hireDate;
    private Double sal;
    private Double comm;
    private Integer deptNo;
}
