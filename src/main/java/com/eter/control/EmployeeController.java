package com.eter.control;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eter.dto.EmployeRequest;
import com.eter.dto.EmployeeDto;
import com.eter.dto.FieldBean;
import com.eter.entites.Employee;
import com.eter.entites.EmployeeWorkingHours;
import com.eter.repository.EmployeeRepository;
import com.eter.repository.EmployeeWorkingHoursRepository;
import com.eter.service.EmployeeService;
import com.eter.util.AtoB;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping("/empControl")
@CrossOrigin("http://127.0.0.1:5500/")
public class EmployeeController {

	private EmployeeService employeeService;
	
	private EmployeeWorkingHoursRepository employeeWorkingHoursRepository;
	
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/emps-saloon/{id}")
	@ResponseBody
	public List<EmployeeDto> getAllEmployeeForSaloon(@PathVariable int id){
		return employeeService.getAllEmpsForSaloon(id);
	}
	@PostMapping("/add")
	@ResponseBody
	public EmployeeWorkingHours addEmployeeworking(@RequestBody EmployeeWorkingHours employeeWorkingHours) {
//		return	employeeWorkingHoursRepository.save(employeeWorkingHours);
		return employeeWorkingHours;
		
	}
	
	public EmployeeDto updateEmployeeData(@RequestBody Employee employee){
	
		return null;
		
	}
	
	@GetMapping("/allEmp")
	public String getAllEmployes(Model model) {
		List<EmployeeDto> allEmpsForSaloon = employeeService.getAllEmpsForSaloon(1);
		model.addAttribute("emplist", allEmpsForSaloon);
		return "allemp";
	}
	
	@GetMapping("/addemp")
	public String getEmpForm(Model model) {
//		Employee employee2 =null;
		model.addAttribute("emp",new EmployeRequest());
		return "addEmployee";
	}
	
	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST, 
			consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
	public String addEmployee(@ModelAttribute("emp") EmployeRequest re,HttpServletRequest req) {
//		Employee em =new Employee();
		Employee e =AtoB.convertEmpReqToEmp(re,new Employee());
		Integer empid =(int) req.getSession().getAttribute("empid");
		if(empid != null) {
		e.setId(empid);
		}
		req.getSession().removeAttribute("empid");
		
//		e.setEmployeeWorkingHours(employeeWorkingHours);
//		employeeWorkingHours.setEmployee(e);
		
		employeeService.saveEmployee(e);
		return "redirect:/empControl/allEmp";
	}
	@ResponseBody
	@PostMapping("/updateRandNo/{id}/{randno}")
	public ResponseEntity<?> updateRandNo(@PathVariable("id") Integer id,@PathVariable("randno") Integer randNo) {
		int updateRandom = employeeRepository.updateRandom(String.valueOf(randNo), id);
		System.out.println("success  "+updateRandom);
		String msg= updateRandom==1?"success":"fail";
		 int status=updateRandom==1?200:500;
		 return ResponseEntity.status(status).body(msg);
	}
	@GetMapping("/getUpdate/{id}")
	public String updateEmp(@PathVariable("id") int id,Model model,HttpServletRequest req) {
		Employee byId = employeeRepository.getById(id);
		req.getSession().setAttribute("empid", id);
		EmployeRequest convertEmpToEmpReq = AtoB.convertEmpToEmpReq(byId);
		model.addAttribute("emp",convertEmpToEmpReq);
		return "addEmployee";
	}
	@GetMapping("/empWrHrs/{id}")
	public String getEmpWorkingHrs(@PathVariable("id") int id,Model model,HttpServletRequest request) {
		Employee emp = employeeRepository.getById(id);
//		EmployeeWorkingHours employeeWorkingHours = emp.getEmployeeWorkingHours();
		List<String> days =new ArrayList<String>();
		days.add("sunday");
		days.add("monday");
		days.add("tuesday");
		days.add("wednesday");
		List<FieldBean> li = new ArrayList<FieldBean>();
		for(String f :days) {
			String[] ar = {"st","et"};
		FieldBean fi = new FieldBean();
		fi.setStarttime(f+"_"+"s");
		fi.setEndtime(f+"_"+"e");
		fi.setId(1);
		fi.setName(f);
		li.add(fi);
		}
		model.addAttribute("empWrHrs", li);
		request.getSession().setAttribute("listFields",li);
		List<FieldBean> libean = (List<FieldBean>) request.getSession().getAttribute("listFields");

		System.out.println(libean);
		return "employeeWorkingHrs";
		
	}
	@PostMapping("/savetiming")
	public String saveEmpWrHrs(HttpServletRequest request) {
		List<FieldBean> libean = (List<FieldBean>) request.getSession().getAttribute("listFields");
		System.out.println("filed beans"+libean);
		System.out.println(request.getParameter(libean.get(0).getStarttime()));
//		employeeService.employeeWHRS(libean,request);
		System.out.println("timee");
		return "";
	}
	
}
