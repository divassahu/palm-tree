package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Student;
import com.masai.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepo;
	
	public List<Student> getAllStudent(){
		return studentRepo.findAll();
		
	}
	
	public String saveStudent(Student student) {
		studentRepo.save(student);
		return "Student saved Successfully";
	}
	
	public Student getStudentByID(Integer studentID) {
		return studentRepo.findById(studentID).get();
	}
	
	public String deleteStudent(Integer studentID) {
		studentRepo.deleteById(studentID);
		return "one record deleted";
	}
	
	

}
