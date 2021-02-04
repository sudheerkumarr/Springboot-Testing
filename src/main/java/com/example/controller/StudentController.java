package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.IStudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	IStudentService studentService;
	
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable("id") Long studentId) {
		return studentService.getStudent(studentId);
	}

	@PostMapping("/student/add")
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
}
