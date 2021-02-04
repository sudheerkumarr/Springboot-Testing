package com.example.service;

import java.util.List;

import com.example.model.Student;

public interface IStudentService {
	public Student addStudent(Student student);
	public void deleteStudent(Long studentId);
	public Student updateStudent(Student student);
	public Student getStudent(Long studentId);
	public List<Student> getAllStudent();
}
