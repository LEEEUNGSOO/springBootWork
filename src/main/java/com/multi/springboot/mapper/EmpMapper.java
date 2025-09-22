package com.multi.springboot.mapper;


import com.multi.springboot.model.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;

@Mapper
public interface EmpMapper {

    @Select("SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO FROM EMP")
    List<Emp> getAllEmployees();
}
