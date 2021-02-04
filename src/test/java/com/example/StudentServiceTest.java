package com.example;

import static org.junit.jupiter.api.Assertions.*;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.model.Student;
import com.example.service.IStudentService;

@SpringBootTest
//@Transactional
class StudentServiceTest {
	@Autowired
	IStudentService studentService;
	@Test
	void testAddStudent() {
		Student student = new Student("Sam", "Sam@gmail.com");
		Student std = studentService.addStudent(student);
		assertEquals("Sam", std.getName());
	}
	@Test
	void testGetStudent() {
		Student std = studentService.getStudent(41l);
		assertNotNull(std);
	}
}
