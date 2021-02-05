package com.example;

import static org.junit.jupiter.api.Assertions.*;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.model.Student;
import com.example.repository.IStudentRepository;

@Transactional
@SpringBootTest
class StudentRepositoryTest {
	
	@Autowired
	IStudentRepository studentRepository;

	
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddStudent() {
		Student student = new Student("Kumar", "kumar@gmail.com");
		assertNotNull(studentRepository.save(student));
	}
}
