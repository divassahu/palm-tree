package com.masai.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;


@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException manv,
			WebRequest wr) {
		String message = manv.getBindingResult().getFieldError().getDefaultMessage();
		LocalDateTime timestamp = LocalDateTime.now();
		MyErrorDetails err = new MyErrorDetails(message, wr.getDescription(false), timestamp);
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.FORBIDDEN);
	}
	
	@ExceptionHandler
	public ResponseEntity<MyErrorDetails> userNotFoundException(UserNotFoundException bkn,WebRequest wr){
		LocalDateTime timestamp = LocalDateTime.now();
		MyErrorDetails err = new MyErrorDetails(bkn.getMessage(), wr.getDescription(false), timestamp);
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> myExpHandlerMain(Exception ie, WebRequest wr) {
		System.out.println("inside myHandler method...EXP");
		MyErrorDetails err = new MyErrorDetails(ie.getMessage(), wr.getDescription(false),LocalDateTime.now());
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);

	}
	
}
