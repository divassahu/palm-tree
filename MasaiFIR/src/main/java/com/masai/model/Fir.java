package com.masai.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Data;

@Entity
@Data
public class Fir {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer firId;
	
	private String crimeDetails;
	
	@DateTimeFormat(iso=ISO.DATE_TIME)
	private LocalDateTime tmeStamp;
	
	private String policeStation;
	
	@ElementCollection(targetClass=User.class)
	List<User> againstUser=new ArrayList<>();
	
	@ManyToOne(fetch=FetchType.LAZY,targetEntity=User.class)
	private User user;
	
}
