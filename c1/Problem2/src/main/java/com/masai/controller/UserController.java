package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.UserNotFoundException;
import com.masai.model.Email;
import com.masai.model.User;
import com.masai.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@RequestBody User user){
		return new ResponseEntity<User>(userService.createUser(user),HttpStatus.CREATED);	
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getUsers(){
		return new ResponseEntity<List<User>>(userService.getUsers(),HttpStatus.OK);	
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUserById(@PathVariable(value="id",required = true) Integer userId) throws UserNotFoundException{
		
		User user = userService.getUserById(userId);
		return new ResponseEntity<User>(user,HttpStatus.OK);	
	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable(value="id",required = true) Integer userId) throws UserNotFoundException{
		User user = userService.deleteUser(userId);
		return new ResponseEntity<User>(user,HttpStatus.OK);	
	}
	
	@GetMapping("/users/{id}/mail")
	public ResponseEntity<Email> getEmailByUserId(@PathVariable(value="id",required = true) Integer userId) throws UserNotFoundException{
		Email email = userService.getEmailByUserId(userId);
		return new ResponseEntity<Email>(email,HttpStatus.OK);	
	}
	
	@PostMapping("/user/{id}/mail")
	public ResponseEntity<Email> createEmailForUserId(@PathVariable(value="id",required = true)Integer userId, @RequestBody Email email) throws UserNotFoundException{
		Email newEmail = userService.createEmailForUser(userId, email);
		return new ResponseEntity<Email>(newEmail,HttpStatus.OK);	
	}
	
	
	
}
