package com.eter.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.eter.dto.EmployeeDto;
import com.eter.dto.FieldBean;
import com.eter.entites.Employee;
import com.eter.entites.EmployeeWorkingHours;
import com.eter.repository.EmployeeRepository;
import com.eter.repository.EmployeeWorkingHoursRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;
	
	private EmployeeWorkingHoursRepository employeeWorkingHoursRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		
		
		return employeeRepository.save(employee);
	}

	@Override
	public List<EmployeeDto> getAllEmpsForSaloon(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.getAllEmployeeSOfSaloon(id);
	}

	@Override
	public EmployeeDto updateEmployee(Employee employee) {
		
		employeeRepository.save(employee);
		return null;
	}

	@Override
	public void employeeWHRS(List<FieldBean> fieldBeans,HttpServletRequest request) {
		EmployeeWorkingHours employeeWorkingHours = new EmployeeWorkingHours();
		
fieldBeans.forEach(t->{
	
	switch (t.getName().substring(0, 2)){
	case "mon": 
		employeeWorkingHours.setMonday_st(request.getParameter(t.getStarttime()));
		employeeWorkingHours.setMonday_et(request.getParameter(t.getEndtime()));
	case "tue": 
		employeeWorkingHours.setTuesday_st(request.getParameter(t.getStarttime()));
		employeeWorkingHours.setTuesday_et(request.getParameter(t.getEndtime()));
	case "wed":
		employeeWorkingHours.setWebnesday_st(request.getParameter(t.getStarttime()));
		employeeWorkingHours.setWebnesday_et(request.getParameter(t.getEndtime()));
	case "thr":
		employeeWorkingHours.setThrusday_st(request.getParameter(t.getStarttime()));
		employeeWorkingHours.setThrusday_et(request.getParameter(t.getStarttime()));
	case "fri":
		employeeWorkingHours.setFriday_st(request.getParameter(t.getStarttime()));
		employeeWorkingHours.setFriday_et(request.getParameter(t.getEndtime()));
	case "sat":
		employeeWorkingHours.setSaturday_st(t.getStarttime());
		employeeWorkingHours.setSaturday_et(t.getEndtime());
	case "sun":
		employeeWorkingHours.setSunday_st(t.getStarttime());
		employeeWorkingHours.setSunday_et(t.getEndtime());
	break;
	}
});	

employeeWorkingHoursRepository.save(employeeWorkingHours);
		
System.out.println(employeeWorkingHours);
}
}
