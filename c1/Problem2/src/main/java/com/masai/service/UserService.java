package com.masai.service;

import java.util.List;

import com.masai.exceptions.UserNotFoundException;
import com.masai.model.Email;
import com.masai.model.User;

public interface UserService {

	public List<User> getUsers();//

	public User createUser(User user);//
	
	public User getUserById(Integer userId) throws UserNotFoundException;//
	
	public User deleteUser(Integer userId) throws UserNotFoundException;//
	
	public Email getEmailByUserId(Integer userId) throws UserNotFoundException;//
	
	public Email createEmailForUser(Integer userId,Email email) throws UserNotFoundException;//
	
	
	
	
	
	
	
}
