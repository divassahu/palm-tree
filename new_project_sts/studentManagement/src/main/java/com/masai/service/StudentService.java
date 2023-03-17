package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Student;
import com.masai.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository stRepo;
	
	public List<Student> getAllstudet(){
		return stRepo.findAll();
	}
	
	public Student getStudentById(Integer id) {
		return stRepo.findById(id).orElseThrow(()->new EntityNotFoundException("student not found");
	}
	
	public Student addStudent(Student st) {
		return stRepo.save(st);
	}
	
	public void deleteStudent(Integer id) {
		stRepo.deleteById(id);
	}
	
	
	
	
	

}
