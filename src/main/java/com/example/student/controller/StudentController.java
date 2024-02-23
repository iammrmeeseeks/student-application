package com.example.student.controller;

import com.example.student.model.Student;
import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Display the form
    @GetMapping("/students/new")
    public String showStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "studentForm";
    }

    // Process the form submission
    @PostMapping("/students")
    public String submitStudentForm(Student student, RedirectAttributes redirectAttributes) {
        Student savedStudent = studentService.saveStudent(student);
        redirectAttributes.addFlashAttribute("student", savedStudent);
        return "redirect:/students/info";
    }

    // Display submitted information
    @GetMapping("/students/info")
    public String showStudentInfo(Model model) {
        return "studentInfo";
    }

    @GetMapping("/students")
    public String listStudents(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "studentsList";
    }
}
