package com.masai.model;

import java.sql.Date;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
	@EmbeddedId
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer studentId;
	
	private String name;
	
	private Date dateOfBirth;
	
	private String city;
	
	private Double grade;
	
	

}
