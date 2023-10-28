package com.eter.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.eter.dto.EmployeeDto;
import com.eter.dto.FieldBean;
import com.eter.entites.Employee;
import com.eter.entites.Saloon;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);
	
	List<EmployeeDto> getAllEmpsForSaloon(int id);
	
	EmployeeDto updateEmployee(Employee employee);
	
	void employeeWHRS(List<FieldBean> fieldBeans,HttpServletRequest request);
	
}
