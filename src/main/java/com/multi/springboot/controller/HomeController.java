package com.multi.springboot.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/index")
    public String index() {
        return "index";
    } // /WEB-INF/views/index.jsp

    @GetMapping("/restbase")
    public String restbaseView(){
        return "restbase";
    }
}
