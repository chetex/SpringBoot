package com.chetex.studentmanagement.controller;

import com.chetex.studentmanagement.service.StudentService;
import com.chetex.studentmanagement.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Class needed to perform
 */
@Controller
public class StudentController {

    @Autowired
    private final StudentServiceImpl studentServiceImpl;

    public StudentController(StudentServiceImpl studentServiceImpl) {
        this.studentServiceImpl = studentServiceImpl;
    }

    // Handle list students and return
    @GetMapping("/students")
    public String getAllStudents(Model model) {
        model.addAttribute("students", studentServiceImpl.getAllStudents());
        return "students";
    }
}
