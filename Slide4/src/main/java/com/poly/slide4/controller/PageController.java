package com.poly.slide4.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("title", "Home");
        model.addAttribute("content", "TRANG CHỦ");
        return "home";
    }

    @GetMapping("/home/index")
    public String index(Model model) {
        model.addAttribute("title", "Index");
        model.addAttribute("content", "Trang Index");
        return "home/index";
    }

    @GetMapping("/home/about")
    public String about(Model model) {
        model.addAttribute("title", "About Us");
        model.addAttribute("content", "GIỚI THIỆU");
        return "home/about";
    }

    @GetMapping("/home/contact")
    public String contact(Model model) {
        model.addAttribute("title", "Contact Us");
        model.addAttribute("content", "LIÊN HỆ");
        return "home/contact";
    }
}
