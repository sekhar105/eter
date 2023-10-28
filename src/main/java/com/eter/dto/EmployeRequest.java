package com.eter.dto;

import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.eter.entites.Saloon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class EmployeRequest {



	private int id;
	
	private String name;
	
	private String gender;
	
	private String phoneNumber; 
	
	private Saloon saloon;
	
	private String email;
	
	private String[] skill;
	
	private String isActive;  

	private String randNo;
	

  
	
}
