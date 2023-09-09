package com.springtutorial.studentsystem.service;

import java.util.List;

import com.springtutorial.studentsystem.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public List<Student> getAllStudents();
}
