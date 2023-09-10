package com.springtutorial.studentsystem.controller;

import com.springtutorial.studentsystem.model.Student;
import com.springtutorial.studentsystem.service.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/add")
	public String add(@RequestBody Student student) {
		studentService.saveStudent(student);
		return "A new student was added.";
	}
	
	@GetMapping("/getAll")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
}
