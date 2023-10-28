package com.eter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.eter.dto.EmployeeDto;
import com.eter.entites.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	@Query("select new com.eter.dto.EmployeeDto(e.id,e.name,e.phoneNumber,e.skill,e.gender,e.email,e.isActive) from Employee e INNER JOIN e.saloon s on e.saloon.id=s.id where e.saloon.id= :id")
	List<EmployeeDto> getAllEmployeeSOfSaloon(@Param("id") int id);

	@Transactional(propagation = Propagation.REQUIRED)  
	@Modifying 
	@Query("update Employee e set e.randNo= :randNo where e.id= :id")
	int updateRandom(@Param("randNo") String randNo,@Param("id") int id);
}
  