package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.masai.model.Student;
import com.masai.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		List<Student> studentList=studentService.getAllStudent();
		model.addAttribute("ListOfStudents",studentList);
		System.out.println("Get / ");
		return "index";
	}
	
	@GetMapping("/new")
	public String addNew(Model model) {
		model.addAttribute("Students",new Student());
		return "new";
	}
	
	@RequestMapping(value = "/save", method= RequestMethod.POST)
	public String saveStudent(@ModelAttribute("students") Student student) {
		studentService.saveStudent(student);
		return "redirected";
	}
	
	@RequestMapping(value="/edit/(studentId")
	public ModelAndView showEditStudentPage(@PathVariable(name="studentId")Integer stId) {
		ModelAndView mav=new ModelAndView("new");
		Student std=studentService.getStudentByID(stId);
		mav.addObject("student",std);
		return mav;
	}
}
