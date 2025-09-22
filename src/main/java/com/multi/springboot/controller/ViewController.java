package com.multi.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    // index.jsp를 렌더링하는 메소드
    @GetMapping("/emp")
    public String showIndexPage() {
        return "emp"; // src/main/webapp/WEB-INF/views/index.jsp
    }
    @GetMapping("/script")
    public String showIndexPage2() {
        return "script"; // src/main/webapp/WEB-INF/views/script.jsp
    }

    // student.jsp를 렌더링하는 메소드
    @GetMapping("/students")
    public String showStudentPage() {
        return "student"; // src/main/webapp/WEB-INF/views/student.jsp
    }
    @GetMapping("/view")
    public String showViewPage() {
        return "view"; // src/main/webapp/WEB-INF/views/student.jsp
    }
}
