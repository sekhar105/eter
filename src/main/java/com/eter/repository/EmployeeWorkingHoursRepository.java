package com.eter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eter.entites.EmployeeWorkingHours;
@Repository
public interface EmployeeWorkingHoursRepository extends JpaRepository<EmployeeWorkingHours, Integer>{

}
