package com.chetex.studentmanagement.controller;

import com.chetex.studentmanagement.entity.Student;
import com.chetex.studentmanagement.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

    /**
     * getAllStudents
     *
     * Get all students from database
     * @return
     */
    @GetMapping("/students")
    public String getAllStudents(Model model) {
        model.addAttribute("students", studentServiceImpl.getAllStudents());
        return "students";
    }

    /**
     * Add New Student used to add new student in database.
     *
     * @param model org.springframework.ui to add new model.
     * @return String with data
     */
    @GetMapping("/students/new")
    public String goToStudentForm (Model model) {
        // Create new student.
        Student student = new Student();

        // Add current student created to model.
        model.addAttribute("students", student);
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentServiceImpl.saveStudent(student);
        return "redirect:/students";
    }
}
