package com.masai.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.FirException;
import com.masai.model.Fir;
import com.masai.model.FirDTO;
import com.masai.security.jwt.JwtUtils;
import com.masai.service.FirService;

@RestController
public class FirController {

	@Autowired
	private FirService firService;
	
	@Autowired
	JwtUtils jwtUtils;
  
	
	@PreAuthorize("#id == #principal.subject")
	@GetMapping("/fir")
	public ResponseEntity<List<Fir>> getFIRsByUser(@AuthenticationPrincipal JwtUtils principal) throws FirException{
		
		ResponseCookie cookie = jwtUtils.getCleanJwtCookie();
		String username = principal.getUserNameFromJwtToken(cookie.toString());
		List<Fir> filed = firService.getAllFirByUser(username);
		
		return new ResponseEntity<List<Fir>>(filed,HttpStatus.OK);
		
	}
	
	@PostMapping("/fir")
	public ResponseEntity<Fir> fileFIR(@RequestBody FirDTO dto) throws FirException{
		
		Fir filed = firService.FileAnFire(dto);
		
		return new ResponseEntity<Fir>(filed,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/fir/{id}")
	public ResponseEntity<Fir> searchFIR(@PathVariable(name = "id") Integer firId) throws FirException{
		
		Fir saved = firService.serchFirByUser(firId);
		
		return new ResponseEntity<Fir>(saved,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/fir/{id}")
	public ResponseEntity<Fir> deleteFIR(@PathVariable(name = "id") Integer firId) throws FirException{
		
		Fir deleted = firService.deleteFirByUser(firId);
		
		return new ResponseEntity<Fir>(deleted,HttpStatus.OK);
		
	}
	
	
}
