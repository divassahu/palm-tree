package com.masai.model;

import java.util.List;

import lombok.Data;

@Data
public class FirDTO {
	
	private String crimeDetails;
	
	private String policeStation;
	
	private String userName;
	
	private List<Long> userIds;
}
