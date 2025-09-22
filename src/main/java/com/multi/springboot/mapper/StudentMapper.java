package com.multi.springboot.mapper;
import java.util.List;

import com.multi.springboot.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentMapper {

    @Select("SELECT STUDNO, NAME, SERID, GRADE, IDNUM, BIRTHDATE, TEL, HEIGHT, WEIGHT, DEPTNO, PROFNO FROM STUDENT")
    List<Student> getAllStudents();
}
