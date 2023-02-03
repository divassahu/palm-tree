package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.UserNotFoundException;
import com.masai.model.Email;
import com.masai.model.User;
import com.masai.repository.EmailRepository;
import com.masai.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;

	@Autowired
	private EmailRepository emailRepo;

	@Override
	public List<User> getUsers() {
		return userRepo.findAll();
	}

	@Override
	public User createUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public User getUserById(Integer userId) throws UserNotFoundException {
		Optional<User> userOpt = userRepo.findById(userId);
		
		if(userOpt.isPresent()) {
			return userOpt.get();
		}else {
			throw new UserNotFoundException("User Not Found With ID: "+userId);
		}
	}

	@Override
	public User deleteUser(Integer userId) throws UserNotFoundException {
		
		Optional<User> userOpt = userRepo.findById(userId);
		
		if(userOpt.isPresent()) {
			User deleted = userOpt.get();
			userRepo.delete(deleted);
			
			return deleted;
		}else {
			throw new UserNotFoundException("User Not Found With ID: "+userId);
		}	
	}

	@Override
	public Email getEmailByUserId(Integer userId) throws UserNotFoundException {
		
		Optional<User> userOpt = userRepo.findById(userId);
		
		if(userOpt.isPresent()) {
			User saved = userOpt.get();
			return saved.getEmail();

		}else {
			throw new UserNotFoundException("User Not Found With ID: "+userId);
		}	
	}

	@Override
	public Email createEmailForUser(Integer userId, Email email) throws UserNotFoundException {
		
		
		Optional<User> userOpt = userRepo.findById(userId);
		
		if(userOpt.isPresent()) {
			Email savedMail = emailRepo.save(email);
			User savedUser = userOpt.get();
			savedUser.setEmail(savedMail);
			savedMail.setUser(savedUser);
			
			userRepo.save(savedUser);
			return emailRepo.save(savedMail);

		}else {
			throw new UserNotFoundException("User Not Found With ID: "+userId);
		}	
		
		
		
	}

}
