package com.poly.slide4.controller;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Page17Controller {

    @GetMapping("/page17")
    public String index() {
        return "page17/index";
    }

    @GetMapping("/page17/template1")
    public String template1() {
        return "page17/template1";
    }

    @GetMapping("/page17/template2")
    public String template2() {
        return "page17/template2";
    }
}