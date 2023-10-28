package com.eter.util;

import java.util.Arrays;
import java.util.stream.Collectors;

import com.eter.dto.EmployeRequest;
import com.eter.entites.Employee;

public class AtoB {

	public static Employee convertEmpReqToEmp(EmployeRequest empreq,Employee emp) {
		emp.setEmail(empreq.getEmail());
		emp.setGender(empreq.getGender());
		emp.setIsActive(empreq.getIsActive());
		emp.setName(empreq.getName());
		emp.setPhoneNumber(empreq.getPhoneNumber());
		emp.setRandNo(empreq.getRandNo());
		emp.setSaloon(empreq.getSaloon());
		emp.setId(empreq.getId());
		emp.setSkill(Arrays.stream(empreq.getSkill()).collect(Collectors.joining(",")));
		return emp;
	}

	public static EmployeRequest convertEmpToEmpReq(Employee em) {
		EmployeRequest emReq =new EmployeRequest();
		emReq.setEmail(em.getEmail());
		emReq.setGender(em.getGender());
		emReq.setId(em.getId());
		emReq.setIsActive(em.getIsActive());
		emReq.setName(em.getName());
		emReq.setPhoneNumber(em.getPhoneNumber());
		emReq.setRandNo(em.getRandNo());
		emReq.setSaloon(em.getSaloon());
		emReq.setSkill(em.getSkill().split(","));
		return emReq;
	}
}
