package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.masai.model.Student;
import com.masai.service.StudentService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class StudentController {

	@Autowired
	private StudentService stService;
	
	@GetMapping
	public ResponseEntity<List<Student>> getAllStudent(){
		
		List<Student> st=stService.getAllstudet();
		return new ResponseEntity<>(st,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable Integer id){
		Student st=stService.getStudentById(id);
		return new ResponseEntity<>(st,HttpStatus.ACCEPTED);
	}
	
	@PutMapping
	public ResponseEntity<Student> addStudent(@RequestBody Student st){
		Student saveStudent=stService.addStudent(st);
		return new ResponseEntity<>(saveStudent,HttpStatus.CREATED);
	}
	
	@DeleteMapping
	public ResponseEntity<Void> deleteStudent(int id){
		stService.deleteStudent(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
