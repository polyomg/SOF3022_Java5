package com.poly.slide4.controller;

import com.poly.slide4.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DataBindingController {
    @GetMapping("/student/form")
    public String showForm(Model model, @ModelAttribute("student") Student student) {
        model.addAttribute("message", "Enter student info please!");
        return "/demo/student";
    }

    @PostMapping("/student/save")
    public String saveStudent(Model model, @ModelAttribute("student") Student student) {
        model.addAttribute("message", student.getFullname() + "  Student saved successfully!");
        return "/demo/student";
    }
}