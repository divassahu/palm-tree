package com.demoMail.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {
	
	 @Value("${spring.mail.username}")
	    private String fromEmail;

	    private JavaMailSender javaMailSender;

	    public MailController(JavaMailSender javaMailSender) {
	        this.javaMailSender = javaMailSender;
	    }

	    @PostMapping("/emailAPI")
	    public String sendEmail(@RequestParam("to") String toEmail) {
	        SimpleMailMessage message = new SimpleMailMessage();
	        message.setFrom(fromEmail);
	        message.setTo(toEmail);
	        message.setSubject("Test Email from DemoMailApplication");
	        message.setText("This is a test email sent from Demo Mail.");

	        javaMailSender.send(message);

	        return "Email sent successfully to " + toEmail;
	    }

}
