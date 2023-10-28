package com.eter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

	private int id;
	private String name;
	private String phoneNumber;
	private String skill;
	private String gender;
	private String email;
	private String isActive;
}
