package com.masai.service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.masai.model.ERole;
import com.masai.model.Role;
import com.masai.model.User;
import com.masai.repository.RoleRepository;
import com.masai.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	
	  @Autowired
	  private UserRepository userRepository;
	  
	  @Autowired
	  private RoleRepository roleRepository;

	  @Override
	  @Transactional
	  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	    User user = userRepository.findByUsername(username)
	        .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

	    return UserDetailsImpl.build(user);
	  }
	  
	  @PostConstruct
	  private void postConstruct() {
		  Role user = new Role(1,ERole.ROLE_USER);
		  Role admin = new Role(2,ERole.ROLE_ADMIN);
		  Role mod = new Role(3,ERole.ROLE_MODERATOR);
		  
		  roleRepository.save(user);
		  roleRepository.save(admin);
		  roleRepository.save(mod);
	  }
	
}
