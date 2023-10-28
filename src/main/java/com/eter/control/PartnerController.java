package com.eter.control;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eter.dto.SaloonDto;
import com.eter.entites.Employee;
import com.eter.entites.Saloon;
import com.eter.service.EmployeeService;
import com.eter.service.PartnerService;
import com.eter.service.SaloonService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping(value = "partnerCon")
public class PartnerController {
	
//	private PartnerService partnerService;
	
	private EmployeeService employeeService;
	
	private SaloonService saloonService;

	public List<Saloon> getAllSaloons(){
		
		
		return null;
	}
	@ResponseBody
	@RequestMapping(value = "/addEmp" ,method = RequestMethod.POST)
	public Employee addEmployee(@RequestBody Employee employee) {
		
		Saloon saloon =new Saloon();
		saloon.setName("sri");
		employee.setSaloon(saloon);
		
		return employeeService.saveEmployee(employee);
	}
	
	@ResponseBody
	@RequestMapping(value = "/addSaloon" ,method = RequestMethod.POST)
	public Saloon addSaloon(@RequestBody Saloon saloon) {
		return saloonService.addSaloon(saloon);
	}
	
	@ResponseBody
	@GetMapping(value = "/getPartSaloons/{sid}")
	public List<SaloonDto> getAllSaloons(@PathVariable int sid) {

	List<SaloonDto> saloonsForPartners = saloonService.getSaloonsForPartners(sid);
		return saloonsForPartners;
	}
	
	
}
